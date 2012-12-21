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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<%@page import="java.util.List"%>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>

<%@page import="com.test.slayer.model.iProject"%>
<%@page import="com.test.slayer.model.impl.iProjectImpl"%>
<%@page import="com.test.slayer.service.iProjectLocalServiceUtil"%>

<h1>iProject Information</h1>
<%
int count = iProjectLocalServiceUtil.getiProjectsCount();
List<iProject> project = iProjectLocalServiceUtil.getiProjects(0, count);
for (iProject book : project) {
%>
<p><table width="80%" >
<tr><td width="20%" >Project Name: </td><td><%= book.getProjectName() %> </td></tr>
<tr><td>Description: </td><td><%= book.getDescription() %> </td></tr>
<tr><td>Required Skillset: </td><td> <%= book.getSkillset() %> </td></tr>
<tr><td>Contact: </td><td><%= book.getContact() %> </td></tr>
</table>

<%
}
%>

