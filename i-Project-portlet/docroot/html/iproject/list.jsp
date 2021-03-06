<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="/html/iproject/init.jsp" %>

<h1>List of projects</h1>
<% 
int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0, count);
%>

<%
	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("jspPage", "/html/iproject/list.jsp");
	
	PortletURL deleteProjectURL = renderResponse.createActionURL();
	deleteProjectURL.setParameter(ActionRequest.ACTION_NAME, "deleteProject");
	deleteProjectURL.setParameter("redirectURL", iteratorURL.toString());	
	
	PortletURL editProjectURL = renderResponse.createRenderURL();	
	editProjectURL.setParameter("jspPage", "/html/iproject/update.jsp");
%>

<table border="1" width="100%">
<tr>
<th align="center" style="display:none"> Project id</th>
<th align="center">Project Title</th>
<th align="center">Project Description</th>
<th align="center">Required Skills</th>
<th align="center">Contact</th>
<th align="center"> Delete </th>
<th align="center"> Edit </th>
</tr>
<%
for (Projectdetail project : projects) {
%>
<tr>
<td style="display:none"><%= project.getProjectID() %></td>
<td><%= project.getProjectTitle() %></td>
<td><%= project.getProjectdescription() %></td>
<td><%= project.getProjectrequiredskill() %> </td>
<td><%= project.getContact() %></td>
<% deleteProjectURL.setParameter("projectID", String.valueOf(project.getProjectID())); %>
<td> 
	<a href="<%= deleteProjectURL.toString() %>">Delete &raquo;</a>
</td>
<% editProjectURL.setParameter("projectID", String.valueOf(project.getProjectID())); %>
<td> 
	<a href="<%= editProjectURL.toString() %>">Edit &raquo;</a>
</td>

</tr>
<%
}
%>
</table>
 
  
<br/><a href="<portlet:renderURL/>">&laquo;Back</a>  
 
  
  




	
	
 

   
 


	
	