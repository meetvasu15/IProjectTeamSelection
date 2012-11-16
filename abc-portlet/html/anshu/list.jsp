<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="/html/anshu/init.jsp" %>

<h1>List of Student Ids</h1>

<%
int count = LMSBookLocalServiceUtil.getLMSBooksCount();
List<LMSBook> books =
LMSBookLocalServiceUtil.getLMSBooks(0, count);
%>
<table border="1" width="80%">
<tr>
<th>Student id</th>
<th>Email</th>
<th>Date Added</th>
</tr>
<%
for (LMSBook book : books) {
%>
<tr>
<td><%= book.getAsuid() %></td>
<td><%= book.getEmail() %></td>
<td><%= book.getDateAdded() %></td>
</tr>
<%
}
%>
</table>
<br/><a href="<portlet:renderURL/>">&laquo; Go Back</a>



