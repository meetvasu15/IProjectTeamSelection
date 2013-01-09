package com.asu.poly.teams.randomCreate;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.asu.poly.teams.randomCreate.slayer.model.Faculty;
import com.asu.poly.teams.randomCreate.slayer.model.Student;
import com.asu.poly.teams.randomCreate.slayer.model.impl.TeamImpl;
import com.asu.poly.teams.randomCreate.slayer.service.FacultyLocalServiceUtil;
import com.asu.poly.teams.randomCreate.slayer.service.StudentLocalServiceUtil;
import com.asu.poly.teams.randomCreate.slayer.service.TeamLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class RandomCreation
 */
public class RandomCreation extends MVCPortlet {
	public void createTeams(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws IOException, PortletException {
			String project = ParamUtil.getString(actionRequest, "project");
			String ctr =  ParamUtil.getString(actionRequest, "numofStudents");
			int studentCount, facultyCount;
			List<Faculty> faculty;
			List<Student> students;
			Random rand = new Random();
			TeamImpl team = new TeamImpl();
				// set primary key
				long teamID = 0L;
				try {
					teamID = CounterLocalServiceUtil.increment(this.getClass().getName());
				} catch (SystemException e) {
				e.printStackTrace();
				}
				team.setTeamID(teamID );
				team.setProjectTitle(project);
				// set UI fields
			try {
				studentCount = StudentLocalServiceUtil.getStudentsCount();
				students = StudentLocalServiceUtil.getStudents(0,	studentCount);
				facultyCount = FacultyLocalServiceUtil.getFacultiesCount();
				faculty = FacultyLocalServiceUtil.getFaculties(0,	facultyCount);
				String fac= (faculty.get(rand.nextInt(faculty.size()))).getAsuid();
				team.setFaculty0(fac);
				for (int i = 0; i<=Integer.parseInt(ctr); i++){
					int choice = rand.nextInt(students.size());
					switch(i){
					case 0:
						team.setStudent0((students.get(choice).getAsuid()));
						break;
					case 1:
						team.setStudent1((students.get(choice).getAsuid()));
						break;
					case 2:
						team.setStudent2((students.get(choice).getAsuid()));
						break;
					case 3:
						team.setStudent3((students.get(choice).getAsuid()));
						break;
					case 4:
						team.setStudent4((students.get(choice).getAsuid()));
						break;
					case 5:
						team.setStudent5(students.get(choice).getAsuid());
						break;
					case 6:
						team.setStudent6(students.get(choice).getAsuid());
						break;
					case 7:
						team.setStudent7((students.get(choice).getAsuid()));
						break;
					default:
						team.setStudent0((students.get(choice).getAsuid()));
						break;
						
					}
					
				}
					
			} catch (SystemException e) {
				e.printStackTrace();
			}
			team.setDateAdded(new Date());
			team.setDateModified(new Date());
			
			try {
				TeamLocalServiceUtil.addTeam(team);
			} catch (SystemException e) {
			e.printStackTrace();
			}
			
			System.out.println("Your inputs ==> " + project+ctr);
	}

}
