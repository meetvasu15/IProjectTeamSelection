<%@ include file="/html/iproject/init.jsp" %>
<%@page import="com.iproject.slayer.model.impl.ProjectdetailImpl" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.iproject.slayer.service.ProjectdetailLocalServiceUtil"%>
 <%@page import="com.iproject.slayer.model.Projectdetail"%>
 
 
 
 <%
PortletURL updateprojectURL = renderResponse.createActionURL();
updateprojectURL.setParameter(ActionRequest.ACTION_NAME, "updateproject");
%>
 
 <aui:form name="fm" method="POST" action="<%= updateprojectURL.toString() %>">

<p> Computing Skills</p>
<p>
1: <select name="preference1">
<option></option>

<option> Electronics</option>
<option> Microcontrollers</option>
<option> GUI and Programming</option>
<option> Labview</option>
<option> Embedded Systems</option>
<option> Web Development</option>
</select>
</p>
<p>
2: <select name="preference2">
<option></option>
<option> Electronics</option>
<option> Microcontrollers</option>
<option> GUI and Programming</option>
<option> Labview</option>
<option> Embedded Systems</option>
<option> Web Development</option>
</select>
</p>
<p>
3: <select name="preference3">
<option></option>
<option> Electronics</option>
<option> Microcontrollers</option>
<option> GUI and Programming</option>
<option> Labview</option>
<option> Embedded Systems</option>
<option> Web Development</option>
</select>
</p>
<p>
4: <select name="preference4">
<option></option>
<option> Electronics</option>
<option> Microcontrollers</option>
<option> GUI and Programming</option>
<option> Labview</option>
<option> Embedded Systems</option>
<option> Web Development</option>
</select>
</p>
<p>
5: <select name="preference5">
<option></option>
<option> Electronics</option>
<option> Microcontrollers</option>
<option> GUI and Programming</option>
<option> Labview</option>
<option> Embedded Systems</option>
<option> Web Development</option>
</select>
</p>

<br/>
<br/>

<p> Mechanical Skills</p>
<p>
1: <select name="preference1">
<option></option>
<option> CADD</option>
<option> FAE</option>
<option> Machining CNC</option>
<option> Thermo Fluids</option>
<option> Mechanical Design</option>
<option> Fabrication and Welding</option>
</select>
</p>
<p>
2: <select name="preference2">
<option></option>
<option> CADD</option>
<option> FAE</option>
<option> Machining CNC</option>
<option> Thermo Fluids</option>
<option> Mechanical Design</option>
<option> Fabrication and Welding</option>
</select>
</p>
<p>
3: <select name="preference3">
<option></option>
<option> CADD</option>
<option> FAE</option>
<option> Machining CNC</option>
<option> Thermo Fluidsd</option>
<option> Mechanical Design</option>
<option> Fabrication and Welding</option>
</select>
</p>
<p>
4: <select name="preference4">
<option></option>
<option> CADD</option>
<option> FAE</option>
<option> Machining CNC</option>
<option> Thermo Fluids</option>
<option> Mechanical Design</option>
<option> Fabrication and Welding</option>
</select>
</p>
<p>
5: <select name="preference5">
<option></option>
<option> CADD</option>
<option> FAE</option>
<option> Machining CNC</option>
<option> Thermo Fluids</option>
<option> Mechanical Design</option>
<option> Fabrication and Welding</option>
</select>
</p>	



<br/>
<br/>
<br/>
<aui:button  type="submit"  value="Submit"/>

<script type="text/javascript">
//variable test = document.getElementsByName("Sponsor");
//alert("Hello world!");
//alert(test);
</script>
</aui:form>

<a href="<portlet:renderURL/>">&laquo;Back</a>
 