<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>


<%@page import="java.util.List"%>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>

<%@page import="com.test.slayer.model.LMSBook"%>
<%@page import="com.test.slayer.model.impl.LMSBookImpl"%>
<%@page import="com.test.slayer.service.LMSBookLocalServiceUtil"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />