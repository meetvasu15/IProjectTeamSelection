<%@ include file="/html/manual/init.jsp" %>


<h1>Create Teams</h1>

<%
PortletURL listteamsURL = renderResponse.createRenderURL();
listteamsURL.setParameter("jspPage", "/html/manual/list.jsp");
%>

<%
PortletURL assignStudentsURL = renderResponse.createRenderURL();
assignStudentsURL.setParameter("jspPage", "/html/manual/assignStudent.jsp");
%>

<%
PortletURL assignFacultyURL = renderResponse.createRenderURL();
assignFacultyURL.setParameter("jspPage", "/html/manual/assignFaculty.jsp");
%>
<br><br>
<a href="<%= assignFacultyURL.toString() %>">Assign Faculty Mentors &raquo;</a><br><br>
<a href="<%= assignStudentsURL.toString() %>">Assign Students &raquo;</a><br><br>
<a href="<%= listteamsURL.toString() %>">Show all Teams &raquo;</a><br>


