package com.test.anshu;


import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.slayer.model.LMSBook;
import com.test.slayer.model.impl.LMSBookImpl;
import com.test.slayer.service.LMSBookLocalServiceUtil;

/**
 * Portlet implementation class anshu
 */
public class anshu extends MVCPortlet {
	
	public void updateBook(ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws IOException, PortletException {
			String bookTitle = ParamUtil.getString(actionRequest, "asuid");
			String author = ParamUtil.getString(actionRequest, "email");
			System.out.println("Your inputs ==> " + bookTitle + ", " + author);
			
			LMSBook book = new LMSBookImpl();
			// set primary key
			long bookId = 0L;
			try {
			bookId =
			CounterLocalServiceUtil.increment(
			this.getClass().getName());
			} catch (SystemException e) {
			e.printStackTrace();
			}
			book.setBookId(bookId);
			// set UI fields
			book.setAsuid(bookTitle);
			book.setEmail(author);
			// set audit field(s)
			book.setDateAdded(new Date());
			
		try {
		LMSBookLocalServiceUtil.addLMSBook(book);
		} catch (SystemException e) {
		e.printStackTrace();
		}
	}

}
