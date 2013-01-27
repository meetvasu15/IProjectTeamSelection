<%@ include file="/html/project/init.jsp" %>

<h1> Add form</h1>

<%

PortletURL studentAvailabilityURL = renderResponse.createActionURL();
studentAvailabilityURL.setParameter(
ActionRequest.ACTION_NAME, "studentAvailability");

%>

<aui form name="<portlet:namespace/>fm" method="POST" action="<%=studentAvailability.toString() %>">

<aui:head>Enter the percentage of hours available</aui:head>

<aui:style type="text/css">
table.tftable
{
font-size:12px;
color:#333333;
width:100%
border-width: 1px;
border-color: #729ea5;
border-collapse: collapse;
}
table.tftable th
{
font-size:12px;
background-color:#acc8cc;
border-width: 1px;padding: 5px;
width: 100px;
border-style: solid;
border-color: #729ea5;
text-align:left;
}
table.tftable tr
{
background-color:#d4e3e5;	
}
table.tftable td
{
font-size:12px;
border-width: 1px;padding: 5px;
border-style: solid;
border-color: #729ea5;
}

body 
{

font: 0.8em/21px arial,sans-serif;
}

</aui:style>
<aui:br><aui:br>
<aui:table id="tfhover" class="tftable" border="1">
<aui:tr><aui:th>Hours</aui:th><aui:th>8:00 - 9:00</aui:th><aui:th>9:00 - 10:00</aui:th><aui:th>10:00 - 11:00</aui:th><aui:th>11:00 - 12:00</aui:th><aui:th>12:00 - 1:00</aui:th><aui:th>1:00 - 2:00</aui:th><aui:th>2:00 - 3:00</aui:th><aui:th>3:00 - 4:00</aui:th><aui:th>4:00 - 5:00</aui:th></aui:tr>
<aui:tr><aui:th>Monday</aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th></aui:tr>

<aui:tr><aui:th>Tuesday</aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th></aui:tr>

<aui:tr><aui:th>Wednesday</aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th></aui:tr>

<aui:tr><aui:th>Thursday</aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th></aui:tr>

<aui:tr><aui:th>Friday</aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th></aui:tr>

<aui:tr><aui:th>Saturday</aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th></aui:tr>

<aui:tr><aui:th>Sunday</aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th>
<aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th><aui:th><aui:input type="text" style = "width: 50px;"/></aui:th></aui:tr>



</aui:table>

<aui:input type="submit" value="Submit" />

</aui:form>

<a href="<portlet:renderURL/>">&laquo; Go Back</a>
</aui>