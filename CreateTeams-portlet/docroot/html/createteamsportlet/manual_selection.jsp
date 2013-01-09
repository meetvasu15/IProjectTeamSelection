<%@ include file="/html/createteamsportlet/init.jsp"%>

<h1>manual selection</h1>
<br />

<%
	PortletURL manual_selectionURL = renderResponse.createActionURL();
	manual_selectionURL.setParameter(ActionRequest.ACTION_NAME,
			"manual_selection");
%>
<aui:form name="fm" method="POST"
	action="<%=manual_selectionURL.toString()%>">
	<aui:input name="TeamName" label="Team Name" />
	<aui:input name="TeamMembers" label="Team Members" />
	<aui:button type="submit" value="Submit" />
</aui:form>

<a href="<portlet:renderURL/>">&laquo; Go Back</a>