package com.asu.poly.student.geninfo;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.poly.asu.student.model.studentgeninfo;
import com.poly.asu.student.model.impl.studentgeninfoImpl;
import com.poly.asu.student.service.studentgeninfoLocalServiceUtil;

/**
 * Portlet implementation class GeninfoPortlet
 */
public class GeninfoPortlet extends MVCPortlet {
	
	public void updateproject(ActionRequest actionRequest,ActionResponse actionResponse)
			throws IOException, PortletException 
	{
		
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		User user = themeDisplay.getRealUser(); // it gives you the actual Logged in User
		
		long userId = user.getUserId();  //gives the id of the logged in user
		
		//String userName = user.getEmailAddress();
		
		//System.out.println(userId);
		//System.out.println(userName);	
			
		
		String studentname = ParamUtil.getString(actionRequest, "studentname");
		Long asuriteID = Long.parseLong(ParamUtil.getString(actionRequest, "asuriteid"));
		String Department = ParamUtil.getString(actionRequest, "department");		
		Long Level = Long.parseLong(ParamUtil.getString(actionRequest, "level"));
		Float GPA = Float.parseFloat(ParamUtil.getString(actionRequest, "gpa"));
		//Long GPA = Long.parseLong(ParamUtil.getString(actionRequest, "gpa"));		
		Long studentgeninfoId = ParamUtil.getLong(actionRequest, "studentgeninfo");
		
		System.out.println(asuriteID);
		System.out.println(Level);
		
		studentgeninfo studentinfo = null;	
		
		if (studentgeninfoId > 0L) {
			try {
				studentinfo = studentgeninfoLocalServiceUtil.getstudentgeninfo(studentgeninfoId);
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
		} else {
			studentinfo = new studentgeninfoImpl();
		}
			
				
		// set UI fields
		studentinfo.setName(studentname);
		studentinfo.setAsuid(asuriteID);
		studentinfo.setDepartment(Department);
		studentinfo.setLevel(Level);
		studentinfo.setCummulativegpa(GPA);
		studentinfo.setLoggedinuserId(userId);
		
		
		addinfo(studentinfo);
		
		// gracefully redirecting to the default portlet view
		//String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
		//actionResponse.sendRedirect(redirectURL);
	}
	
	private void addinfo(studentgeninfo studentinfo) 
	{
		// set primary key
		long studentinfoID = 0L;
		try 
		{
			studentinfoID =
				CounterLocalServiceUtil.increment(
				this.getClass().getName());
			System.out.println(studentinfoID);
		}
		catch (SystemException e) 
		{
			e.printStackTrace();
		}
		studentinfo.setStudentgeninfoid(studentinfoID);
		// set audit field(s)
		studentinfo.setCreateDate(new Date());
		studentinfo.setModifiedDate(new Date());
		
		
		// insert the info
		try 
		{
			studentgeninfoLocalServiceUtil.addstudentgeninfo(studentinfo);
		} catch (SystemException e) 
		{
			e.printStackTrace();
		}
	}

 

}
