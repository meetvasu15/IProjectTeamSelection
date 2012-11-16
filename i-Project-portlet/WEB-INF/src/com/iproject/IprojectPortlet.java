package com.iproject;

import java.io.IOException;
import java.util.Date;


import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;


import com.iproject.slayer.model.Projectdetail;
import com.iproject.slayer.model.impl.ProjectdetailImpl;
import com.iproject.slayer.service.ProjectdetailLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class IprojectPortlet
 */
public class IprojectPortlet extends MVCPortlet {
	
	public void updateproject(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws IOException, PortletException {
			String projectTitle = ParamUtil.getString(actionRequest, "projectTitle");
			String projectdescription = ParamUtil.getString(actionRequest, "projectdescription");
			String contact = ParamUtil.getString(actionRequest, "contact");
			System.out.println("Your inputs ==> " + projectTitle + ", " + projectdescription + "," + contact);
			
			Projectdetail project = new ProjectdetailImpl();
			// set primary key
			long projectID = 0L;
			try {
				projectID =
			CounterLocalServiceUtil.increment(
			this.getClass().getName());
			} catch (SystemException e) {
			e.printStackTrace();
			}
			project.setProjectID(projectID);
			// set UI fields
			project.setProjectTitle(projectTitle);
			project.setProjectdescription(projectdescription);
			project.setContact(contact);
			// set audit field(s)
			project.setDateAdded(new Date());
			
			// insert the book using persistence api
			try {
				ProjectdetailLocalServiceUtil.addProjectdetail(project);
			} catch (SystemException e) {
			e.printStackTrace();
			}
			
			

			}
 

}
