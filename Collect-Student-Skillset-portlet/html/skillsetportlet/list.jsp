<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="/html/skillsetportlet/init.jsp" %>

<h1>List of student skill sets</h1>
<% 
int count = SkillsetLocalServiceUtil.getSkillsetsCount();
List<Skillset> skills = SkillsetLocalServiceUtil.getSkillsets(0, count);
%>


<table border="1" width="90%" >
<tr>
<th align="center">ASU ID</th>
<th align="center">Email</th>
<th align="center">Student Skillset</th>
</tr>
<%
for (Skillset skill : skills) {
%>
<tr>
<td><%= skill.getAsuid() %></td>
<td><%= skill.getEmail() %></td>
<td><%= skill.getSkill1() %></td>
</tr>
<%
}
%>
</table>


<br/><a href="<portlet:renderURL/>">&laquo; Go Back</a>

