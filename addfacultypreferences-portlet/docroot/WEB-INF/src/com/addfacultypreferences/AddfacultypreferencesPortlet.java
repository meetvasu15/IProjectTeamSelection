package com.addfacultypreferences;


import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import com.addfacultypreferences.slayer.model.LNSBook;
import com.addfacultypreferences.slayer.model.impl.LNSBookImpl;
import com.addfacultypreferences.slayer.service.LNSBookLocalServiceUtil;


/**
 * Portlet implementation class AddfacultypreferencesPortlet
 */
public class AddfacultypreferencesPortlet extends MVCPortlet {
	
	public void updateBook(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws IOException, PortletException {
			String bookTitle = ParamUtil.getString(actionRequest, "name");
			String author = ParamUtil.getString(actionRequest, "email");
			String number = ParamUtil.getString(actionRequest, "number");
			System.out.println("Your inputs ==> " + bookTitle + ", " + author + "," +"number");
			
			LNSBook name = new LNSBookImpl();
			// set primary key
			long nameId = 0L;
			try {
			nameId =
			CounterLocalServiceUtil.increment(
			this.getClass().getName());
			} catch (SystemException e) {
			e.printStackTrace();
			}
			name.setNameId(nameId);
			// set UI fields
			name.setName(bookTitle);
			name.setEmail(author);
			name.setNumber(number);
			// set audit field(s)
			name.setDateAdded(new Date());
			
		try {
		LNSBookLocalServiceUtil.addLNSBook(name);
		} catch (SystemException e) {
		e.printStackTrace();
		}
	}

}
