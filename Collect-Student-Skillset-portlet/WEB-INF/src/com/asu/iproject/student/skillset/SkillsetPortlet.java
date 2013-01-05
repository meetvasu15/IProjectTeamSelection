package com.asu.iproject.student.skillset;


import java.io.IOException;
import java.util.Date;


import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;


import com.asu.iproject.student.skillset.model.Skillset;
import com.asu.iproject.student.skillset.model.impl.SkillsetImpl;
import com.asu.iproject.student.skillset.service.SkillsetLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AddProject
 */
public class SkillsetPortlet extends MVCPortlet 
{
	
	public void updateproject(ActionRequest actionRequest,ActionResponse actionResponse)
			throws IOException, PortletException {
			String asuid = ParamUtil.getString(actionRequest, "asuid");
			String email = ParamUtil.getString(actionRequest, "email");
			String skill1 = ParamUtil.getString(actionRequest, "skill1");
			System.out.println("Your inputs ==> " + asuid + ", " + email + "," + skill1);
			
			SkillsetImpl project = new SkillsetImpl();
			// set primary key
			long studentID = 0L;
			try {
				studentID =
			CounterLocalServiceUtil.increment(
			this.getClass().getName());
			} catch (SystemException e) {
			e.printStackTrace();
			}
			project.setStudentID(studentID);
			// set UI fields
			project.setAsuid(asuid);
			project.setEmail(email);
			project.setSkill1(skill1);
			// set audit field(s)
			project.setDateAdded(new Date());
			
			// insert the book using persistence api
			try {
				SkillsetLocalServiceUtil.addSkillset(project);
			} catch (SystemException e) {
			e.printStackTrace();
			}
			
			

			}
 

}