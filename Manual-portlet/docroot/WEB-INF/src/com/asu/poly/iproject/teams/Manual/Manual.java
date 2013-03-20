package com.asu.poly.iproject.teams.Manual;

 
import com.asu.poly.teams.manualSelect.slayer.service.FacultyLocalServiceUtil;
import com.asu.poly.teams.manualSelect.slayer.service.StudentLocalServiceUtil;
import com.asu.poly.teams.manualSelect.slayer.model.Faculty;
import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;


import com.asu.poly.teams.manualSelect.slayer.model.impl.TeamImpl;
import com.asu.poly.teams.manualSelect.slayer.service.TeamLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Manual
 */
public class Manual extends MVCPortlet {
	public void createTeams(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws IOException, PortletException {
			String project = ParamUtil.getString(actionRequest, "project");
		//	String faculty =  ParamUtil.getString(actionRequest, "faculty");
						
						
			//String student =  ParamUtil.getString(actionRequest, "student");
			//System.out.println(student);
			
						
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
				
				 String [] faculty = actionRequest.getParameterValues("faculty");
				
				// System.out.println(faculty [0]+faculty.length);
				if (faculty.length == 0){
					team.setFaculty1("-");
					 team.setFaculty2("-");
					 team.setFaculty3("-");
					 team.setFaculty4("-");
				}
		
				else if(faculty.length == 1){
					 
					team.setFaculty1(faculty[0]);
				 }else if(faculty.length == 2){
					 team.setFaculty1(faculty[0]);
					 team.setFaculty2(faculty[1]);
				 }else if(faculty.length == 3){
					 team.setFaculty1(faculty[0]);
					 team.setFaculty2(faculty[1]);
					 team.setFaculty3(faculty[2]);
				 }else if(faculty.length == 3){
					 team.setFaculty1(faculty[0]);
					 team.setFaculty2(faculty[1]);
					 team.setFaculty3(faculty[2]);
					 team.setFaculty4(faculty[3]);
					 
				 }
				 		
			String [] student = actionRequest.getParameterValues("student");
			//System.out.println(student [0]+ student.length);
			if(student.length == 0){
				String blnk = "-";
			    team.setStudent0(blnk);
				team.setStudent1(blnk);
				team.setStudent2(blnk);
				team.setStudent3(blnk);
				
				}
			else if(student.length == 4){
			
		    team.setStudent0(student[0]);
			team.setStudent1(student[1]);
			team.setStudent2(student[2]);
			team.setStudent3(student[3]);
			
			}
				 
		//    team.setStudent0(student);
		    
			team.setDateAdded(new Date());
			team.setDateModified(new Date());
			
			
			try {
				TeamLocalServiceUtil.addTeam(team);
			} catch (SystemException e) {
			e.printStackTrace();
			}
			
	}	
 

}
