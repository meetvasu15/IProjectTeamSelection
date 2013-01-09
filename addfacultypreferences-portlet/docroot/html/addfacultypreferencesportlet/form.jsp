<%@ include file="/html/addfacultypreferencesportlet/init.jsp" %>

<h2>Enter the Preferences for project</h2>

<%
PortletURL preferencesFormURL = renderResponse.createActionURL();
preferencesFormURL.setParameter(
ActionRequest.ACTION_NAME, "updateBook");
%>

<aui:form name="form" method="POST" action="<%= preferencesFormURL.toString() %>">
<aui:input name="name" label="NAME"/>
<aui:input name="email"/>
<aui:input name="number" label="Number of projects willing to mentor:"/>
<aui:button type="submit" value="Save"/>
</aui:form>

<a href="<portlet:renderURL/>"> &laquo; Go Back </a>

