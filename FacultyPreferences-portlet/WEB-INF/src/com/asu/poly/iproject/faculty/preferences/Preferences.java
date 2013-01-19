package com.asu.poly.iproject.faculty.preferences;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.asu.poly.iproject.faculty.preferences.model.impl.preferencesImpl;
import com.asu.poly.iproject.faculty.preferences.service.preferencesLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Preferences
 */
public class Preferences extends MVCPortlet {
 
	public void updatePreferences(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws IOException, PortletException {

			String preference1 = ParamUtil.getString(actionRequest, "preference1");
			String preference2 = ParamUtil.getString(actionRequest, "preference2");
			String preference3 = ParamUtil.getString(actionRequest, "preference3");
			String preference4 = ParamUtil.getString(actionRequest, "preference4");
			String preference5 = ParamUtil.getString(actionRequest, "preference5");
			
			
			preferencesImpl preference = new preferencesImpl();
			// set primary key
			long preferenceID = 0L;
			try {
				preferenceID = CounterLocalServiceUtil.increment(this.getClass().getName());
			} catch (SystemException e) {
			e.printStackTrace();
			}

			// set UI fields
			preference.setPreference1(preference1);
			preference.setPreference2(preference2);
			preference.setPreference3(preference3);
			
			
			preference.setDateAdded(new Date());
			preference.setDateModified(new Date());
			
			try {
			preferencesLocalServiceUtil.addpreferences(preference);
			} catch (SystemException e) {
			e.printStackTrace();
			}
		}
}
