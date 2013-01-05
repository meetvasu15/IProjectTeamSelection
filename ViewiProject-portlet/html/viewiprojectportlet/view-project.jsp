<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="javax.portlet.WindowState" %>
<%@ page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>

<%@ page import="com.viewiProject.servicelayer.model.viewprj" %>


<portlet:defineObjects />

<%
// get the project id sent from view.jsp
viewprj prjid = (viewprj)request.getAttribute("prj_id");
String redirect = request.getParameter("redirect");
%>

<table class="lfr-table">
    <tr>
        <td class="lfr-label"><liferay-ui:message key="Project Title" />:</td>
        <td><%= prjid.getProjectTitle() %></td>
    </tr>
    <tr>
        <td class="lfr-label"><liferay-ui:message key="Project Description" />:</td>
        <td><%= prjid.getProjectdescription() %></td>
    </tr>
    <tr>
        <td class="lfr-label"><liferay-ui:message key="Required Skillset" />:</td>
        <td><%= prjid.getProjectrequiredskill() %></td>
    </tr>
    <tr>
        <td class="lfr-label"><liferay-ui:message key="Contact Information" />:</td>
        <td><%= prjid.getContact() %></td>
    </tr>    
</table>
<input id="backButton" type="button" value="<liferay-ui:message key='Back' />" 
       onclick="location.href = '<%= UnicodeFormatter.toString(redirect) %>'"/>
