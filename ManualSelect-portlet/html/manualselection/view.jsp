<%@ include file="/html/manualselection/init.jsp" %>

<%@ page import="com.asu.poly.teams.manualSelect.slayer.model.Projectdetail" %>
<%@ page import="com.asu.poly.teams.manualSelect.slayer.service.ProjectdetailLocalServiceUtil" %>
<%@ page import="com.asu.poly.teams.manualSelect.slayer.model.Student" %>
<%@ page import="com.asu.poly.teams.manualSelect.slayer.service.StudentLocalServiceUtil" %>
<%@ page import="com.asu.poly.teams.manualSelect.slayer.model.Faculty" %>
<%@ page import="com.asu.poly.teams.manualSelect.slayer.service.FacultyLocalServiceUtil" %>
<portlet:defineObjects />

<%
PortletURL listteamsURL = renderResponse.createRenderURL();
listteamsURL.setParameter("jspPage", "/html/manualselection/list.jsp");
%>

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
	int studentCount = StudentLocalServiceUtil.getStudentsCount();
	List<Student> students = StudentLocalServiceUtil.getStudents(0,
			studentCount);
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
<table width="80%">
<tr><td><input type="checkbox" disabled="true"></td>
<th>ASUID</th>
<th>Name</th>
<th>Course</th>
<th>Level</th>
<th>GPA</th>
<th>Sex</th></tr>

<%
		for (Student stud : students) {
	%>
	<tr>
	<td><input type="checkbox" name="student" value="<%= stud.getAsuid() %>"></td>
	<td><%= stud.getAsuid() %></td>
	<td><%= stud.getStudentName() %></td>
	<td><%= stud.getCourse() %></td>
	<td><%= stud.getLevel() %></td>
	<td><%= stud.getGpa() %></td>
	<td><%= stud.getSex() %></td>
	</tr>
	<%
		}
	%>

</table><br /><br ><br >

<input type="submit" value="Create Team">

</form><br><br>
<a href="<%= listteamsURL.toString() %>">Show all Teams &raquo;</a>


