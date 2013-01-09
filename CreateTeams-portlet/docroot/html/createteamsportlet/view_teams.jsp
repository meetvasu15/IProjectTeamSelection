<%@ include file="/html/createteamsportlet/init.jsp"%>

<h1>List of Teams</h1>
<br />

<%
	int count = CTSLocalServiceUtil.getCTSsCount();
	List<CTS> teams = CTSLocalServiceUtil.getCTSs(0, count);
%>
<table border="1" width="80%">
	<tr>
		<th>Team Name</th>
		<th>Team Members</th>
		<th>Date Added</th>
	</tr>
	<%
		for (CTS team : teams) {
	%>
	<tr>
		<td><%=team.getTeamName()%></td>
		<td><%=team.getTeamMembers()%></td>
		<td><%=team.getDateAdded()%></td>
	</tr>
	<%
		}
	%>
</table>
<br />
<a href="<portlet:renderURL/>">&laquo; Go Back</a>