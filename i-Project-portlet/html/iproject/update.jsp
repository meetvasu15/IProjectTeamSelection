<%@ include file="/html/iproject/init.jsp" %>
<%
PortletURL updateprojectURL = renderResponse.createActionURL();
updateprojectURL.setParameter(ActionRequest.ACTION_NAME, "updateproject");
%>
<aui:form name="fm" method="POST" action="<%= updateprojectURL.toString() %>">
<aui:input type="text" size="100"  name="projectTitle" label="Project Title" />
<br/>
<aui:input type="text" size="100"  name="projectdescription" label="Project Description" /> 
<br/>
<aui:input type="text" size="100" name="contact" label="Contact" />
<br/>
<aui:button type="submit" value="Submit"/>
</aui:form>

<br/>
<br/>
<a href="<portlet:renderURL/>">&laquo; Go Back</a>