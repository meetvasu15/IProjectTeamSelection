<%@ include file="/html/skillsetportlet/init.jsp" %>
<%
PortletURL updateprojectURL = renderResponse.createActionURL();
updateprojectURL.setParameter(ActionRequest.ACTION_NAME, "updateproject");
%>
<aui:form name="fm" method="POST" action="<%= updateprojectURL.toString() %>">
<aui:input type="text" size="100"  name="asuid" label="ASU ID" />
<br/>
<aui:input type="text" size="100"  name="email" label="Email" /> 
<br/>
<aui:input type="text" size="100" name="skill1" label="Enter your skillset" />
<br/>
<aui:button type="submit" value="Submit"/>
</aui:form>

<br/>
<br/>
<a href="<portlet:renderURL/>">&laquo; Go Back</a>