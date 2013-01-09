<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />
<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@ page import="com.asu.poly.teams.randomCreate.slayer.model.Projectdetail" %>
<%@ page import="com.asu.poly.teams.randomCreate.slayer.service.ProjectdetailLocalServiceUtil" %>
<%@ page import="com.asu.poly.teams.randomCreate.slayer.model.Student" %>
<%@ page import="com.asu.poly.teams.randomCreate.slayer.service.StudentLocalServiceUtil" %>
<%@ page import="com.asu.poly.teams.randomCreate.slayer.model.Faculty" %>
<%@ page import="com.asu.poly.teams.randomCreate.slayer.service.FacultyLocalServiceUtil" %>
<%@ page import="com.asu.poly.teams.randomCreate.slayer.model.Team" %>
<%@ page import="com.asu.poly.teams.randomCreate.slayer.service.TeamLocalServiceUtil" %>
