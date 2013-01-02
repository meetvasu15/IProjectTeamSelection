<%@ include file="/html/iproject/init.jsp" %>
<%@page import="com.iproject.slayer.model.impl.ProjectdetailImpl" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.iproject.slayer.service.ProjectdetailLocalServiceUtil"%>
<%
PortletURL updateprojectURL = renderResponse.createActionURL();
updateprojectURL.setParameter(ActionRequest.ACTION_NAME, "updateproject");

Projectdetail projects = new ProjectdetailImpl();
long prjId = ParamUtil.getLong(request, "projectId");
if (prjId > 0L) {
	projects = ProjectdetailLocalServiceUtil.getProjectdetail(prjId);
}
%>
<aui:form name="fm" method="POST" action="<%= updateprojectURL.toString() %>">


<aui:input type="text" size="100"  name="projectTitle" label="Project Title" />
<br/>
<aui:input type="textarea" rows="10" cols="100"  name="projectdescription" label="Project Description" /> 
<br/>
<aui:input type="textarea" rows="4" cols="100"  name="projectrequiredskill" label="Required Skillset" />
<br/>
<aui:input type="text" size="100" name="contact" label="Contact" />


<br/>
<aui:button type="submit" value="Submit"/>
</aui:form>

<br/>
<br/>
<a href="<portlet:renderURL/>">&laquo; Go Back</a>