package com.asu.poly.iproject.teams.Manual;

 
import com.asu.poly.teams.manualSelect.slayer.service.FacultyLocalServiceUtil;
import com.asu.poly.teams.manualSelect.slayer.service.StudentLocalServiceUtil;
import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.asu.poly.teams.manualSelect.slayer.model.Faculty;
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
					
								
			String student =  ParamUtil.getString(actionRequest, "student");
			
						
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
				
				 
				 if(faculty.length == 3){
					 
					team.setFaculty1(faculty[0]);
					team.setFaculty2(faculty[1]);
					 team.setFaculty3(faculty[2]);
					 
				
				 }
					
			team.setStudent0(student);
			
			team.setDateAdded(new Date());
			team.setDateModified(new Date());
			
			try {
				TeamLocalServiceUtil.addTeam(team);
			} catch (SystemException e) {
			e.printStackTrace();
			}
			
	}	
 

}


