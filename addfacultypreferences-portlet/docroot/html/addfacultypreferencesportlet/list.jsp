<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="/html/addfacultypreferencesportlet/init.jsp" %>

<h3>List of Faculty Names</h3>

<%
int count = LNSBookLocalServiceUtil.getLNSBooksCount();
List<LNSBook> books =
LNSBookLocalServiceUtil.getLNSBooks(0, count);
%>
<table border="1" width="80%">
<tr>
<th>Faculty name</th>
<th>Email</th>
<th>No of projects willing to mentor</th>
<th>Date Added</th>
</tr>
<%
for (LNSBook name : books) {
%>
<tr>
<td><%= name.getName() %></td>
<td><%= name.getEmail() %></td>
<td><%= name.getNumber() %></td>

<td><%= name.getDateAdded() %></td>
</tr>
<%
}
%>
</table>
<br/><a href="<portlet:renderURL/>">&laquo; Go Back</a>



