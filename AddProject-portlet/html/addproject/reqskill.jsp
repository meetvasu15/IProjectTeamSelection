<%@ include file="/html/iproject/init.jsp" %>
<%@page import="com.iproject.slayer.model.impl.ProjectdetailImpl" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.iproject.slayer.service.ProjectdetailLocalServiceUtil"%>
 <%@page import="com.iproject.slayer.model.Projectdetail"%>
 <%@page import="com.iproject.util.*"%>
 <%@page import="java.util.*"%>

 <script type="text/javascript"> 
 /*
 function showValue()
 {
  var chosenval = document.getElementsById("<portlet:namespace/>choice1");
	 var str = chosenval.options[chosenval.selectedIndex].value;
	 document.getElementsById("prefer1").value=str;
	 //alert(chosenval);
 }
 function setDropDownValues(){
	 var firstDropDown = document.getElementById("choice1");
	 var choice1IntendedVal= document.getElementById("value");
 }
 */
</script>

 
 <%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/iproject/update.jsp");
 
PortletURL updateprojectURL = renderResponse.createActionURL();
updateprojectURL.setParameter(ActionRequest.ACTION_NAME, "updateproject");

DropDownParser dp = new DropDownParser();
HashMap<String, ArrayList<DropOption>> allDropDowns =  dp.Parse("DropDown.xml");
ArrayList<DropOption> computingSkills = allDropDowns.get("computingSkills");
ArrayList<DropOption> mechanicalSkills = allDropDowns.get("mechanicalskills");



%>
 
 <aui:form name="fm" method="POST" action="<%= updateprojectURL.toString() %>">

<p> Computing Skills</p>
<p>
1.  <select id="choice1" name="preference1" >
<option></option>
<% for (DropOption opt: computingSkills){ %>
<option value="<%= opt.getKey() %>"> <%= opt.getValue() %></option>
<%} %>
</select>
</p>
<p>
2.  <select id="choice2" name="preference2">
<option></option>
<% for (DropOption opt: computingSkills){ %>
<option value="<%= opt.getKey() %>"> <%= opt.getValue() %></option>
<%} %>
</select>
</p>
<p>
3.  <select id="choice3" name="preference3">
<option></option>
<% for (DropOption opt: computingSkills){ %>
<option value="<%= opt.getKey() %>"> <%= opt.getValue() %></option>
<%} %>
</select>
</p>
<p>
4.  <select id="choice4" name="preference4">
<option></option>
<% for (DropOption opt: computingSkills){ %>
<option value="<%= opt.getKey() %>"> <%= opt.getValue() %></option>
<%} %>
</select>
</p>
<p>
5.  <select id="choice5" name="preference5">
<option></option>
<% for (DropOption opt: computingSkills){ %>
<option value="<%= opt.getKey() %>"> <%= opt.getValue() %></option>
<%} %>
</select>
</p>

<br/>
<br/>

<p> Mechanical Skills</p>
<p>
1.  <select name="mpreference1">
<option></option>
<% for (DropOption opt: mechanicalSkills){ %>
<option value="<%= opt.getKey() %>"> <%= opt.getValue() %></option>
<%} %>
</select>
</p>
<p>
2.  <select name="mpreference2">
<option></option>
<% for (DropOption opt: mechanicalSkills){ %>
<option value="<%= opt.getKey() %>"> <%= opt.getValue() %></option>
<%} %>
</select>
</p>
<p>
3.  <select name="mpreference3">
<option></option>
<% for (DropOption opt: mechanicalSkills){ %>
<option value="<%= opt.getKey() %>"> <%= opt.getValue() %></option>
<%} %>
</select>
</p>
<p>
4.  <select name="mpreference4">
<option></option>
<% for (DropOption opt: mechanicalSkills){ %>
<option value="<%= opt.getKey() %>"> <%= opt.getValue() %></option>
<%} %>
</select>
</p>
<p>
5.  <select name="mpreference5">
<option></option>
<% for (DropOption opt: mechanicalSkills){ %>
<option value="<%= opt.getKey() %>"> <%= opt.getValue() %></option>
<%} %>
</select>
</p>	



<br/>
<br/>
<br/>

<input type="hidden" name="projectTitle" value="<%=request.getAttribute("prjtitle")%>">
<input type="hidden" name="projectdescription" value="<%=request.getAttribute("prjdesc")%>">
<input type="hidden" name="sponsor" value="<%=request.getAttribute("prjsponsor")%>">
<input type="hidden" name="contact" value="<%=request.getAttribute("prjcontact")%>">

<aui:button type="submit" value="Submit" /> 


<script type="text/javascript">
//variable test = document.getElementsByName("Sponsor");
//alert("Hello world!");
//alert(test);
</script>
</aui:form>

<a href="<%= backURL.toString() %>">&laquo;Back</a>
