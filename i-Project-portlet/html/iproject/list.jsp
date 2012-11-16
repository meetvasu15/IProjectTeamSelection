<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="/html/iproject/init.jsp" %>

<h1>List of projects</h1>
<% 
int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0, count);
%>


<table border="1" width="90%" >
<tr>
<th align="center">Project Title</th>
<th align="center">Project Description</th>
<th align="center">Contact</th>
</tr>
<%
for (Projectdetail project : projects) {
%>
<tr>
<td><%= project.getProjectTitle() %></td>
<td><%= project.getProjectdescription() %></td>
<td><%= project.getContact() %></td>
</tr>
<%
}
%>
</table>


<br/><a href="<portlet:renderURL/>">&laquo; Go Back</a>

