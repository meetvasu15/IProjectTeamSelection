<%@ include file="/html/iproject/init.jsp" %>
<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/
--%>

<%--
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Projectdetail project = (Projectdetail) row.getObject();
	
		PortletURL editProjectURL = renderResponse.createRenderURL();
		editProjectURL.setParameter("projectId", String.valueOf(project.getProjectID()));
		
		//Projectdetail proj = new ProjectdetailImpl();
		long projectId = ParamUtil.getLong(request, "bookId");
		if (bookId > 0L) {
			book = LMSBookLocalServiceUtil.getLMSBook(bookId);
		}
		
	
%>

 --%> 




