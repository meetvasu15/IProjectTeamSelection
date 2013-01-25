package com.asu.poly.iproject.teams.addProject;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import com.asu.poly.iproject.teams.addProject.model.Projectdetail;
import com.asu.poly.iproject.teams.addProject.model.impl.ProjectdetailImpl;
import com.asu.poly.iproject.teams.addProject.service.ProjectdetailLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;


/**
 * Portlet implementation class AddProject
 */
public class AddProject {
	@ProcessAction(name="updateproject")
	public void updateproject(ActionRequest actionRequest,ActionResponse actionResponse)
throws IOException, PortletException
{

		
		
		String projectTitle = ParamUtil.getString(actionRequest, "projectTitle");
		String projectdescription = ParamUtil.getString(actionRequest, "projectdescription");
		String projectsponsor = ParamUtil.getString(actionRequest, "sponsor");
		String contact = ParamUtil.getString(actionRequest, "contact");
		String requiredskill = ParamUtil.getString(actionRequest, "projectrequiredskill");
		
		long projectId = ParamUtil.getLong(actionRequest, "projectId");
		
		Projectdetail project = null;
		if (projectId > 0L) {
		try {
		project = ProjectdetailLocalServiceUtil.getProjectdetail(projectId);
		} catch (PortalException e) {
		e.printStackTrace();
		} catch (SystemException e) {
		e.printStackTrace();
		}
		} else {
		project = new ProjectdetailImpl();
		}
		
		
		// set UI fields
		project.setProjectTitle(projectTitle);
		project.setProjectdescription(projectdescription);
		project.setProjectrequiredskill(requiredskill);
		project.setContact(contact);
		project.setSponsor(projectsponsor);
		
		if (projectId > 0L) {
		modifyproject(project);
		} else {
		addproject(project);
		}
		
		// gracefully redirecting to the default portlet view
		String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
		actionResponse.sendRedirect(redirectURL);
		}
		
		private void addproject(Projectdetail project)
		{
		// set primary key
		long projectID = 0L;
		try
		{
		projectID =
		CounterLocalServiceUtil.increment(
		this.getClass().getName());
		}
		catch (SystemException e)
		{
		e.printStackTrace();
		}
		project.setProjectID(projectID);
		// set audit field(s)
		project.setDateAdded(new Date());
		project.setDateModified(new Date());
		
		// insert the project using persistence api
		try
		{
		ProjectdetailLocalServiceUtil.addProjectdetail(project);
		} catch (SystemException e)
		{
		e.printStackTrace();
		}
		}
		
		private void modifyproject(Projectdetail project) {
		
		project.setDateModified(new Date());
		
		try {
		ProjectdetailLocalServiceUtil.updateProjectdetail(project);
		} catch (SystemException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
		
		public void deleteProject(ActionRequest actionRequest,
		            ActionResponse actionResponse) throws IOException, PortletException
		    {
		
		    long projectId = ParamUtil.getLong(actionRequest, "projectID");
		   
		    if (projectId > 0L) {
		            try {
		             ProjectdetailLocalServiceUtil.deleteProjectdetail(projectId);
		            } catch (PortalException e) {
		                    // TODO Auto-generated catch block
		                    e.printStackTrace();
		            } catch (SystemException e) {
		                    // TODO Auto-generated catch block
		                    e.printStackTrace();
		            }
		    }
		   
		    // gracefully redirecting to the default portlet view
		    String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
		    actionResponse.sendRedirect(redirectURL);
		}
		
		
		
		/*public void uploadFile(ActionRequest actionRequest,
		ActionResponse actionResponse) throws IOException, PortletException
		{
		}
		}*/
		
		 
		
}

