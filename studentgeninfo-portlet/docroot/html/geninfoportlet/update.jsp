<%@ include file="/html/geninfoportlet/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%
PortletURL updateprojectURL = renderResponse.createActionURL();
updateprojectURL.setParameter(ActionRequest.ACTION_NAME, "updateproject");
%>

<h3> Please enter your details</h3>

<aui:form name="fm" method="POST" action="<%= updateprojectURL.toString() %>">


	
<aui:input type="text" size="50"  name="studentname" label="Name"  />
<br/>
<aui:input type="text" size="50" name="asuriteid" label="ASURITE ID" /> 
<br/>
<aui:input type="text" size="50" name="department" label="Department"  />
<br/>
<aui:input type="text" size="50" name="level" label="Level"  />
<br/>
<aui:input type="text" size="10"  name="gpa" label=" Cummulative GPA" />


<br/>
<aui:button type="submit" value="Submit"/>
</aui:form>

<br/>
<br/>
<a href="<portlet:renderURL/>">&laquo;Back</a>