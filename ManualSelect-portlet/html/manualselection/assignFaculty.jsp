<%@ include file="/html/manual/init.jsp" %>

<%
PortletURL updateTeamsURL = renderResponse.createActionURL();
updateTeamsURL.setParameter(
ActionRequest.ACTION_NAME, "createTeams");
%>

Select iProject: 
<%
	int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
	List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0,
			count);
%>
<%
	int facultyCount = FacultyLocalServiceUtil.getFacultiesCount();
	List<Faculty> faculties = FacultyLocalServiceUtil.getFaculties(0,
			facultyCount);
%>

<form name="<portlet:namespace/>fm" method="POST" action="<%=
updateTeamsURL.toString() %>">
<select name="project">
<option></option>
<%
		for (Projectdetail project : projects) {
	%>
	<option> <%= project.getProjectTitle() %></option>
	<%
		}
	%>
</select>
<br ><br >
<table width="50%">
<th><input type="checkbox" disabled="true"></th>
<th>ASUID</th>
<th>Name</th>
<th>Department</th>
<tr></tr><%
		for (Faculty fclty : faculties) {
	%>
	<tr>
	<td><input type="checkbox" name="faculty" value="<%= fclty.getAsuid() %>"></td>
	<td><%= fclty.getAsuid() %></td>
	<td><%= fclty.getFacultyName() %></td>
	<td><%= fclty.getFacultyDept()  %></td>
	</tr>
	<%
		}
	%>
</table>
<br ><br >


<input type="submit" value="Create Team">

</form><br><br>