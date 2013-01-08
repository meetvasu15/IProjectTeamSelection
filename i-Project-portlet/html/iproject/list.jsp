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





<table border="1" width="90%" >
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
 

   
 
<br> 
<br/><a href="<portlet:renderURL/>">&laquo; Go Back</a>

 
  --%>
<%--  
 <%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="/html/iproject/init.jsp" %>

<h1>List of iProjects</h1>

<%
int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0, count);%>


<table border="1" width="80%">
	<tr>
		<th>Book Title</th>
		<th>Author</th>
		<th>Date Added</th>
	</tr>
	
	<% 
		for (LMSBook book : books) {
			%>
				<tr>
					<td><%= book.getBookTitle() %></td>
					<td><%= book.getAuthor() %></td>
					<td><%= book.getDateAdded() %></td>
				</tr>
			<%
		}
	%>
</table>


<%
	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("jspPage", "/html/iproject/list.jsp");
	
	PortletURL deleteBookURL = renderResponse.createActionURL();
	deleteBookURL.setParameter(ActionRequest.ACTION_NAME, "deleteBook");
	deleteBookURL.setParameter("redirectURL", iteratorURL.toString());
	
	PortletURL detailsURL = renderResponse.createRenderURL();
	detailsURL.setParameter("jspPage", "/html/iproject/details.jsp");
%>

<liferay-ui:search-container delta="4" iteratorURL="<%= iteratorURL %>" 
	emptyResultsMessage="Sorry. There are no items to display.">

	<liferay-ui:search-container-results 
		total="<%= projects.size() %>"
		results="<%= ListUtil.subList(projects, searchContainer.getStart(), searchContainer.getEnd()) %>"
	/>
		
	<liferay-ui:search-container-row modelVar="project" 
		className="com.library.slayer.model.LMSBook">
		
		<% 
			detailsURL.setParameter("bookId", String.valueOf(book.getBookId()));
			detailsURL.setParameter("backURL", themeDisplay.getURLCurrent());
		%>
		<liferay-ui:search-container-column-text name="Book Title">
			<aui:a href="<%= detailsURL.toString() %>"><%= book.getBookTitle() %></aui:a>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Author" property="author" />
		<liferay-ui:search-container-column-text name="Date Added">
			<fmt:formatDate value="<%= book.getDateAdded() %>" pattern="dd/MMM/yyyy"/>
		</liferay-ui:search-container-column-text>
		
		<% deleteBookURL.setParameter("bookId", String.valueOf(book.getBookId())); %>
		<liferay-ui:search-container-column-text name="Delete">
			<a href="<%= deleteBookURL.toString() %>">Delete &raquo;</a>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-jsp name="Actions" 
			path="/html/library/actions.jsp" />
		
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />

</liferay-ui:search-container>

<br/><a href="<portlet:renderURL/>">&laquo; Go Back</a> --%>