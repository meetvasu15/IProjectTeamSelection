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

<%@ include file="/html/addfacultypreferencesportlet/init.jsp" %>


<portlet:renderURL var="preferencesFormURL">
	<portlet:param name="jspPage" value="/html/addfacultypreferencesportlet/form.jsp"/>
</portlet:renderURL>

<br/><a href="<%= preferencesFormURL %>"> Add Your Preferences &raquo; </a>

<br/>
<%
PortletURL listBooksURL = renderResponse.createRenderURL();
listBooksURL.setParameter("jspPage", "/html/addfacultypreferencesportlet/list.jsp");
%>
<a href="<%= listBooksURL.toString() %>">Show all faculty &raquo;</a>
