<%@ include file="/html/preferences/init.jsp" %>

<%
PortletURL listPreferencesURL = renderResponse.createRenderURL();
listPreferencesURL.setParameter("jspPage", "/html/preferences/view.jsp");
%>

<%
PortletURL updatePreferencesURL = renderResponse.createActionURL();
updatePreferencesURL.setParameter(
ActionRequest.ACTION_NAME, "updatePreferences");
%>


<%
int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0,
count);
%>

<form name="<portlet:namespace/>fm" method="POST" action="<%=
updatePreferencesURL.toString() %>">
<h3>Student Preferences</h3>
<br>
Select your preferences below:<br><br>
<p>
Preference 1: <select name="preference1">
<option></option>
<%
for (Projectdetail project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>
<p>
Preference 2: <select name="preference2">
<option></option>
<%
for (Projectdetail project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>
<p>
Preference 3: <select name="preference3">
<option></option>
<%
for (Projectdetail project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>
<p>
Preference 4: <select name="preference4">
<option></option>
<%
for (Projectdetail project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>
</p>
<p>
Preference 5: <select name="preference5">
<option></option>
<%
for (Projectdetail project : projects) {
%>
<option> <%= project.getProjectTitle() %></option>
<%
}
%>
</select>

<br><br>
<h4>Enter your focus areas:</h4> <br>

<textarea name="focusarea" rows="3" cols="60"></textarea>

<p>
<br ><br >
<h4>Reasons for choosing the above projects:</h4> <br>

<textarea name="reasons" rows="5" cols="60"></textarea>

<p>
<br ><br >
<input type="submit" value="Submit">


</form>