<%@ include file="/html/addproject/init.jsp" %>
<%
PortletURL listprojectsURL = renderResponse.createRenderURL();
listprojectsURL.setParameter("jspPage", "/html/addproject/list.jsp");
%>
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

<portlet:renderURL var="updateprojectURL">

<portlet:param name="jspPage" value="/html/addproject/update.jsp"/>
</portlet:renderURL>
<h1> Details of Projects</h1>
<br/>
<br/>
<p> Please enter the project details </p>
<br/><a href="<%= updateprojectURL %>">Add new Project &raquo;</a>
<br/>
<br/>
<a href="<%= listprojectsURL.toString() %>">Show all Projects &raquo;</a>

