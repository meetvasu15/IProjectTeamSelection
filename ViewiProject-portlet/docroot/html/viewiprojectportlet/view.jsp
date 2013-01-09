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
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>

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

<%--  <%
int count = viewprjLocalServiceUtil.getviewprjsCount();
List<viewprj> projects = viewprjLocalServiceUtil.getviewprjs(0, count);
 for (viewprj prj : projects) {
%> --%>
<%-- <div id="1div">
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
--%> 

<%
    PortletURL projectdetailsURL = renderResponse.createRenderURL();
   
    
    // define list of headers we will use in the table 
    List<String> headerNames = new ArrayList<String>();
    headerNames.add("Projects");
    

    // create search container, used to display table
    SearchContainer searchContainer = new SearchContainer(renderRequest,
                                                        null, null,
                                                        SearchContainer.DEFAULT_CUR_PARAM,
                                                        SearchContainer.DEFAULT_DELTA,
                                                        projectdetailsURL,
                                                        headerNames,
                                                        "There are no projects to display");
    projectdetailsURL.setParameter(searchContainer.getCurParam(), String.valueOf(searchContainer.getCurValue()));
    
    // get count of pets and list of pets to display on current page
    int projectCount = viewprjLocalServiceUtil.getviewprjsCount();
    List<viewprj> projects = viewprjLocalServiceUtil.getviewprjs(searchContainer.getStart(),
                                                    searchContainer.getEnd());
    
    // set count into search container
    searchContainer.setTotal(projectCount);
    
    // fill table        
    List<ResultRow> resultRows = searchContainer.getResultRows();
    for (int i=0; i < projects.size(); i++) {
        viewprj project = projects.get(i);
        ResultRow row = new ResultRow(project, project.getProjectId(), i);

        PortletURL projectURL = renderResponse.createRenderURL();
        projectURL.setParameter("jspPage", "/html/viewiprojectportlet/view-project.jsp");
        projectURL.setWindowState(WindowState.MAXIMIZED);        
        projectURL.setParameter("prj_id", String.valueOf(project.getProjectId()));
        projectURL.setParameter("redirect", com.liferay.portal.util.PortalUtil.getCurrentURL(request));
        row.addText(project.getProjectTitle(), projectURL.toString());
        
        

        resultRows.add(row);
    }    
    
    // and finally display it
%>
<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />
