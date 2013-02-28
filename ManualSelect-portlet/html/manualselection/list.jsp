<%@ include file="/html/manual/init.jsp" %>
<%@ page import="com.asu.poly.teams.manualSelect.slayer.model.Team" %>
<%@ page import="com.asu.poly.teams.manualSelect.slayer.service.TeamLocalServiceUtil" %>
<h1>List of teams</h1>
<%
int count = TeamLocalServiceUtil.getTeamsCount();
List<Team> teams = TeamLocalServiceUtil.getTeams(0, count);
%>

 <table border="0" width="90%" >
<tr>
<th align="center"> teamID </th>
<th align="center">Project Title</th>
<th align="center">Faculty1</th>
<th align="center">Faculty2</th>
<th align="center">Faculty3</th>
<th align="center">Student 1</th>
<th align="center">Student 2</th>
<th align="center">Student 3</th>
<th align="center">Student 4</th>
<th align="center">Student 5</th>
<th align="center">Student 6</th>
<th align="center">Student 7</th>
<th align="center"> Date added </th>
</tr>

<%
for (Team team : teams) {
%>
<tr>
<td><%= team.getTeamID() %></td>
<td><%= team.getProjectTitle() %></td>
<td><%= team.getFaculty1() %></td>
<td><%= team.getFaculty2() %></td>
<td><%= team.getFaculty3() %></td>
<td><%= team.getStudent1() %> </td>
<td><%= team.getStudent2() %> </td>
<td><%= team.getStudent3() %> </td>
<td><%= team.getStudent4() %> </td>
<td><%= team.getStudent5() %> </td>
<td><%= team.getStudent6() %> </td>
<td><%= team.getStudent7() %> </td>
<td><%= team.getDateAdded() %></td>

</tr>
<%
}
%>
</table> 
<br ><br><br>
 <a href="<portlet:renderURL/>">&laquo;Back</a>
