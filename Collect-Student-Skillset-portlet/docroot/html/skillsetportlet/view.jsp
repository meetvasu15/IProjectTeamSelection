<%@ include file="/html/skillsetportlet/init.jsp"%>
<%
	PortletURL listprojectsURL = renderResponse.createRenderURL();
	listprojectsURL.setParameter("jspPage",
			"/html/skillsetportlet/list.jsp");
%>

<portlet:renderURL var="updateprojectURL">

	<portlet:param name="jspPage" value="/html/skillsetportlet/update.jsp" />
</portlet:renderURL>

<h1>Student Skillsets</h1>
<br />
<p>Rank your skills below:</p>
<br />
<a href="<%=updateprojectURL%>">Rank your skills &raquo;</a>



