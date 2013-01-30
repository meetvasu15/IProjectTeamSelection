<%@ include file="/html/abc/init.jsp" %>

<h1>Student Preferences</h1>

<%
PortletURL preferencesFormURL = renderResponse.createActionURL();
preferencesFormURL.setParameter(
ActionRequest.ACTION_NAME, "updateBook");
%>
<liferay-ui:error key="asuid-is-required" 
message="ASUID is required" ></liferay-ui:error>
<liferay-ui:error key="email-is-required" 
message="email is required" ></liferay-ui:error>

<aui:form name="fm" method="POST" action="<%= preferencesFormURL.toString() %>">

<aui:input name="asuid" label="ASUID"/>
<aui:input name="email"/>
<aui:button type="submit" value="Save"/>
</aui:form>

<a href="<portlet:renderURL/>"> &laquo; Go Back </a>
