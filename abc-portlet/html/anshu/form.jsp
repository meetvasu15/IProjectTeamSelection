<%@ include file="/html/anshu/init.jsp" %>

<h1>Student Preferences</h1>

<%
PortletURL preferencesFormURL = renderResponse.createActionURL();
preferencesFormURL.setParameter(
ActionRequest.ACTION_NAME, "updateBook");
%>

<aui:form name="fm" method="POST" action="<%= preferencesFormURL.toString() %>">
<aui:input name="asuid" label="ASUID"/>
<aui:input name="email"/>
<aui:button type="submit" value="Save"/>
</aui:form>

<a href="<portlet:renderURL/>"> &laquo; Go Back </a>

