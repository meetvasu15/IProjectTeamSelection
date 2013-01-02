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
%>


<portlet:actionURL name="editProject" var="editProjectURL">
        
</portlet:actionURL>


<table border="1" width="90%" >
<tr>
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
<td><%= project.getProjectTitle() %></td>
<td><%= project.getProjectdescription() %></td>
<td><%= project.getProjectrequiredskill() %> </td>
<td><%= project.getContact() %></td>
<% deleteProjectURL.setParameter("projectID", String.valueOf(project.getProjectID())); %>
<td> 
	<a href="<%= deleteProjectURL.toString() %>">Delete &raquo;</a>
</td>

</tr>
<%
}
%>
</table>
  
 
 <%-- 
   <%
	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("jspPage", "/html/iproject/list.jsp");
	
	PortletURL deleteProjectURL = renderResponse.createActionURL();
	deleteProjectURL.setParameter(ActionRequest.ACTION_NAME, "deleteProject");
	deleteProjectURL.setParameter("redirectURL", iteratorURL.toString());
	
	
	
%>



<liferay-ui:search-container delta="4" iteratorURL="<%= iteratorURL %>" 
	emptyResultsMessage="Sorry. There are no items to display.">

	<liferay-ui:search-container-results 
		total="<%= projects.size() %>"
		results="<%= ListUtil.subList(projects, searchContainer.getStart(), searchContainer.getEnd()) %>"
	/>
		
	<liferay-ui:search-container-row modelVar="project" 
		className="com.iproject.slayer.model.Projectdetail">
		
		<liferay-ui:search-container-column-text name="Project Title" property="projectTitle"/>
		<liferay-ui:search-container-column-text name="Project Description" property="projectdescription" />
		<liferay-ui:search-container-column-text name="Contact" property="contact" />
		<% deleteProjectURL.setParameter("projectID", String.valueOf(project.getProjectID())); %>
		<liferay-ui:search-container-column-text name="Delete">
			<a href="<%= deleteProjectURL.toString() %>">Delete &raquo;</a>
		</liferay-ui:search-container-column-text>
		
		
		
		
		
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />

</liferay-ui:search-container>
 
--%>
   
 
<br> 
<br/><a href="<portlet:renderURL/>">&laquo; Go Back</a>

