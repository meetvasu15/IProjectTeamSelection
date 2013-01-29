<%@ include file="/html/manual/init.jsp" %>

<%
PortletURL listTeamsURL = renderResponse.createRenderURL();
listTeamsURL.setParameter("jspPage", "/html/manual/view.jsp");
%>

<%
PortletURL updateTeamsURL = renderResponse.createActionURL();
updateTeamsURL.setParameter(
ActionRequest.ACTION_NAME, "updateTeams");
%>


<%
int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0,
count);
%>
<h3>Select the follwing to for  a manual team</h3>
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
<input type="submit" value="Submit">


</form>
