<%@ include file="/html/createteamsportlet/init.jsp"%>

<h1>Create Teams</h1>
<br />

<portlet:renderURL var="random_selectionURL">
	<portlet:param name="jspPage"
		value="/html/createteamsportlet/random_selection.jsp" />
</portlet:renderURL>
<a href="<%=random_selectionURL%>">random selection &raquo;</a>
<br />

<portlet:renderURL var="manual_selectionURL">
	<portlet:param name="jspPage"
		value="/html/createteamsportlet/manual_selection.jsp" />
</portlet:renderURL>
<a href="<%=manual_selectionURL%>">manual selection &raquo;</a>
<br />

<%
	PortletURL view_teamsURL = renderResponse.createRenderURL();
	view_teamsURL.setParameter("jspPage",
			"/html/createteamsportlet/view_teams.jsp");
%>
<a href="<%=view_teamsURL.toString()%>">view teams &raquo;</a>
<br />

