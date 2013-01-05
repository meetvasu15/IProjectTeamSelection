<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="/html/skillsetportlet/init.jsp"%>

<h1>List of student skill sets</h1>
<%
	int count = SkillsetLocalServiceUtil.getSkillsetsCount();
	List<Skillset> skills = SkillsetLocalServiceUtil.getSkillsets(0,
			count);
%>


<table border="1" width="90%">
	<tr>
		<th align="center">Project Management</th>
		<th align="center">Technical Writing</th>
		<th align="center">Oral Presentation</th>
		<th align="center">Thermo-Fluids</th>
		<th align="center">Data Analysis</th>
		<th align="center">Leadership</th>
		<th align="center">Automation</th>
		<th align="center">Mechanical Design</th>
		<th align="center">Fabrication/Welding</th>
		<th align="center">Machining/CNC</th>
		<th align="center">Heat Transfer</th>
		<th align="center">Electronics</th>
		<th align="center">Microcontrollers</th>
		<th align="center">GUI and Programming</th>
		<th align="center">LabView</th>
		<th align="center">Embedded Systems</th>
		<th align="center">CADD</th>
		<th align="center">FEA</th>
		<th align="center">Civil Engineering</th>
	</tr>
	<%
		for (Skillset skill : skills) {
	%>
	<tr>
		<td><%=skill.getProject_Management()%></td>
		<td><%=skill.getTechnical_Writing()%></td>
		<td><%=skill.getOral_Presentation()%></td>
		<td><%=skill.getThermo_Fluids()%></td>
		<td><%=skill.getData_Analysis()%></td>
		<td><%=skill.getLeadership()%></td>
		<td><%=skill.getAutomation()%></td>
		<td><%=skill.getMechanical_Design()%></td>
		<td><%=skill.getFabrication_Welding()%></td>
		<td><%=skill.getMachining_CNC()%></td>
		<td><%=skill.getHeat_Transfer()%></td>
		<td><%=skill.getElectronics()%></td>
		<td><%=skill.getMicrocontrollers()%></td>
		<td><%=skill.getGUI_and_Programming()%></td>
		<td><%=skill.getLabView()%></td>
		<td><%=skill.getEmbedded_Systems()%></td>
		<td><%=skill.getCADD()%></td>
		<td><%=skill.getFEA()%></td>
		<td><%=skill.getCivil_Engineering()%></td>
	</tr>
	<%
		}
	%>
</table>


<br />
<a href="<portlet:renderURL/>">&laquo; Go Back</a>

