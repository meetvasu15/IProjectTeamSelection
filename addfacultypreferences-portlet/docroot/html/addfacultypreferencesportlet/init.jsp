<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>


<%@page import="java.util.List"%>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>

<%@page import="com.addfacultypreferences.slayer.model.LNSBook"%>
<%@page import="com.addfacultypreferences.slayer.model.impl.LNSBookImpl"%>
<%@page import="com.addfacultypreferences.slayer.service.LNSBookLocalServiceUtil"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />