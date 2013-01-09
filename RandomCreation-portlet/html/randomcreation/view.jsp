<%@ include file="/html/randomcreation/init.jsp" %>

<%
PortletURL listteamsURL = renderResponse.createRenderURL();
listteamsURL.setParameter("jspPage", "/html/randomcreation/list.jsp");
%>

<%
PortletURL updateTeamsURL = renderResponse.createActionURL();
updateTeamsURL.setParameter(
ActionRequest.ACTION_NAME, "createTeams");
%>


<%
	int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
	List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0,
			count);
%>

<form name="<portlet:namespace/>fm" method="POST" action="<%=
updateTeamsURL.toString() %>">
Select iProject: <select name="project">
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
Enter the number of students: <input type="number" name="numofStudents">

<br /><br ><br >

<input type="submit" value="Submit">&nbsp;</form>
</form>

<a href="<%= listteamsURL.toString() %>">Show all Teams &raquo;</a>


