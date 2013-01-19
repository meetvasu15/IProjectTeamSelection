<%@ include file="/html/addproject/init.jsp" %>
<%@page import="com.asu.poly.iproject.teams.addProject.model.impl.ProjectdetailImpl" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.asu.poly.iproject.teams.addProject.service.ProjectdetailLocalServiceUtil"%>
 <%@page import="com.asu.poly.iproject.teams.addProject.model.Projectdetail"%>


<%
PortletURL updateprojectURL = renderResponse.createActionURL();
updateprojectURL.setParameter(ActionRequest.ACTION_NAME, "updateproject");

Projectdetail project = new ProjectdetailImpl();
long prjId = ParamUtil.getLong(request, "projectID");
if (prjId > 0L) {
project = ProjectdetailLocalServiceUtil.getProjectdetail(prjId);
System.out.println(ParamUtil.getLong(request, "projectID"));
}
%>
<aui:form name="fm" method="POST" action="<%= updateprojectURL.toString() %>">

<aui:input type="hidden" name="redirectURL" value="<%= renderResponse.createRenderURL().toString() %>"/>
<aui:input type="hidden" name="projectId" value="<%= String.valueOf(project.getProjectID()) %>"/>
<aui:input type="text" size="100" name="projectTitle" label="Project Title" value="<%= project.getProjectTitle() %>" />
<br/>
<aui:input type="textarea" rows="10" cols="100" name="projectdescription" label="Project Description" value="<%= project.getProjectdescription() %>"/>
<br/>
<aui:input type="textarea" rows="4" cols="100" name="projectrequiredskill" label="Required Skillset" value="<%= project.getProjectrequiredskill() %>" />
<br/>
<aui:input type="text" size="100" name="contact" label="Contact" value="<%= project.getContact() %>"/>


<br/>
<aui:button type="submit" value="Submit"/>
</aui:form>


<!-- <h3>File Upload:</h3>
<h3> Select a file to upload: </h3>
<br />
<form action="UploadServlet" method="post" enctype="multipart/form-data">
<input type="file" name="file" size="50" />
<br />
<input type="submit" value="Upload File" />
</form> -->


<br/>
<br/>
<a href="<portlet:renderURL/>">&laquo;Back</a>