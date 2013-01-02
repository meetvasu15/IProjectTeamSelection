<%@ include file="/html/iproject/init.jsp" %>

<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Projectdetail project = (Projectdetail) row.getObject();
	
	PortletURL editProjectURL = renderResponse.createRenderURL();
	
	PortletURL viewProjectURL = renderResponse.createRenderURL();
%>

<liferay-ui:icon-menu>
	<liferay-ui:icon image="edit" message="Edit Book" url="<%= editProjectURL.toString() %>" />
	<liferay-ui:icon image="view" message="View Details" url="<%= viewProjectURL.toString() %>" />
</liferay-ui:icon-menu> 