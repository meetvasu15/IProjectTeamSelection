<%@ include file="/html/sample/init.jsp" %>
<script type="text/javascript">
var checeked = 0;
	function Validate(){
		var chks = document.getElementsNyName('faculty');
		var checkCount =0;
		for(var i = 0; i < chks.length; i++){
			
			if (chks[i].checked)
			{
				checkCount++;
				}
		}
		if (checkCount < 3)
		{
		alert("Please select at least three.");
		return false;
		}
		return true;
		}
	
	
<%
PortletURL updateTeamsURL = renderResponse.createActionURL();
updateTeamsURL.setParameter(
ActionRequest.ACTION_NAME, "createTeams");
%>

Select iProject: 
<%
	int count = ProjectdetailLocalServiceUtil.getProjectdetailsCount();
	List<Projectdetail> projects = ProjectdetailLocalServiceUtil.getProjectdetails(0,
			count);
%>
<%
	int facultyCount = FacultyLocalServiceUtil.getFacultiesCount();
	List<Faculty> faculties = FacultyLocalServiceUtil.getFaculties(0,
			facultyCount);
%>




<form name="<portlet:namespace/>fm" method="POST" onSubmit = return Validate(); action="<%=
updateTeamsURL.toString() %>">
<select name="project">
<option></option>
<%
		for (Projectdetail project : projects) {
	%>
	<option> <%= project.getProjectTitle() %></option>
	<%
		}
	%>
</select>
<br ><br >

<table width="50%">
<th></th>
<th>ASUID</th>
<th>Name</th>
<th>Department</th>
<tr></tr><%

		for (Faculty fclty : faculties) {
		%>
	
			
	<tr>
	<td><input type="checkbox" name="faculty" onclick  = return Validate()  value="<%= fclty.getAsuid() %>"></td>
	
	


	<td><%= fclty.getAsuid() %></td>
	<td><%= fclty.getFacultyName() %></td>
	<td><%= fclty.getFacultyDept()  %></td>
	</tr>
	
	
	<%

	String [] faculty = {"- ", "- ", "- ", "- "}; 
	

	
	for (int i=0; i< faculty.length;i++){
	if (request.getParameter("faculty") != null){
				
					System.out.println(faculty[i]) ;
					faculty[i]=request.getParameter("faculty");
				}
			
				else {
					faculty[i] = null;
				}
			}
%>
	
	<%
		}
	
		%>	
		 
	
</table>
<br ><br >


<input type="submit" value="submit" name ="Create Team">

</form><br><br>



