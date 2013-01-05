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
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>

<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="javax.portlet.WindowState" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry" %>

<%@ page import="com.viewiProject.servicelayer.model.viewprj" %>


<%@page import="com.viewiProject.servicelayer.service.viewprjLocalServiceUtil"%>

<portlet:defineObjects />

<h2>iProject Information</h2>
<%
int count = viewprjLocalServiceUtil.getviewprjsCount();
List<viewprj> projects = viewprjLocalServiceUtil.getviewprjs(0, count);
for (viewprj prj : projects) {
%>
<div id="1div">
<table  >
<tr><td width="50%">Project Name: </td><td id="prjname" width="50%" align="center"><%= prj.getProjectTitle() %> </td></tr>
</table>
</div>
<div id="2div">
<table width="100%" >
<tr><td>Description: </td><td><%= prj.getProjectdescription() %> </td></tr>
<tr><td>Required Skillset: </td><td> <%= prj.getProjectrequiredskill() %> </td></tr>
<tr><td>Contact: </td><td><%= prj.getContact() %> </td></tr>
</table>
</div>
<%
}
%>


    <script type="text/javascript" >
       
        alert(document.getElementById("prjname"));
    </script>


<%--
<h1>List of projects</h1>
<% 
int count = viewprjLocalServiceUtil.getviewprjsCount();
List<viewprj> projects = viewprjLocalServiceUtil.getviewprjs(0, count);
%>

 <table border="0" width="90%" >
<tr>
<th align="center"> projectID </th>
<th align="center">Project Title</th>
<th align="center">Project Description</th>
<th align="center">Required Skills</th>
<th align="center">Contact</th>

<th align="center"> Date added </th>
</tr>



<%
for (viewprj project : projects) {
%>
<tr>
<td><%= project.getProjectId() %></td>
<td><%= project.getProjectTitle() %></td>
<td><%= project.getProjectdescription() %></td>
<td><%= project.getProjectrequiredskill() %> </td>
<td><%= project.getContact() %></td>
<td><%= project.getDateAdded() %></td>

</tr>
<%
}
%>
</table> --%>

 
 
<%--  <%
    PortletURL portletURL = renderResponse.createRenderURL();
    
    // define list of headers we will use in the table 
    List<String> headerNames = new ArrayList<String>();
    headerNames.add("Project Title");
    

    // create search container, used to display table
    SearchContainer searchContainer = new SearchContainer(renderRequest,
                                                        null, null,
                                                        SearchContainer.DEFAULT_CUR_PARAM,
                                                        SearchContainer.DEFAULT_DELTA,
                                                        portletURL,
                                                        headerNames,
                                                        "There are no projects");
    portletURL.setParameter(searchContainer.getCurParam(), String.valueOf(searchContainer.getCurValue()));
    
    // get count of projects and list of projects to display on current page
    int Count = viewprjLocalServiceUtil.getviewprjsCount();
    List<viewprj> projects = viewprjLocalServiceUtil.getviewprjs(searchContainer.getStart(),
            										searchContainer.getEnd());
    
    // set count into search container
    searchContainer.setTotal(Count);
    
    // fill table
    List<ResultRow> resultRows = searchContainer.getResultRows();
    for (int i=0; i < projects.size(); i++) {
    	viewprj prj = projects.get(i);
        ResultRow row = new ResultRow(prj, prj.getProjectId(), i);

        PortletURL prjURL = renderResponse.createRenderURL();
        prjURL.setWindowState(WindowState.MAXIMIZED);
        prjURL.setParameter("prj_id", String.valueOf(prj.getProjectId()));
        prjURL.setParameter("redirect", com.liferay.portal.util.PortalUtil.getCurrentURL(request));
        row.addText(prj.getProjectTitle(), prjURL.toString());
        resultRows.add(row);
    }	
    
    // and finally display it:
%>

<liferay-ui:search-iterator searchContainer="<%= searchContainer %>"  /> --%>
  