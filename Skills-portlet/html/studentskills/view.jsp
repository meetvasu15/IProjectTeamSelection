<%@ include file="/html/studentskills/init.jsp"%>

<h1>Student Skillsets</h1>
<br />


<%
PortletURL updateSkillsURL = renderResponse.createActionURL();
updateSkillsURL.setParameter(ActionRequest.ACTION_NAME,
"updateSkills");
%>

<p>Rate your interest/skills on a scale of 1-10 in the following areas:</p>
<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;None &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;High</p>
<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;1 &nbsp; &nbsp; &nbsp;&nbsp;2 &nbsp; &nbsp; &nbsp;&nbsp;3 &nbsp; &nbsp; &nbsp;&nbsp;4 &nbsp; &nbsp; &nbsp;&nbsp;5 &nbsp; &nbsp; &nbsp;&nbsp;6 &nbsp; &nbsp; &nbsp;7 &nbsp; &nbsp; &nbsp;&nbsp;8 &nbsp; &nbsp; &nbsp;&nbsp;9 &nbsp; &nbsp; &nbsp;10</p>

<aui:form name="fm" method="POST"
action="<%=updateSkillsURL.toString()%>">

<aui:field-wrapper inlineField="true" name="Project_Management" label="Project Management"> &nbsp;&nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Project_Management" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Technical_Writing" label="Technical Writing">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Technical_Writing" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Oral_Presentation" label="Oral Presentation"> &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Oral_Presentation" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Thermo_Fluids" label="Thermo-Fluids"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Thermo_Fluids" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Data_Analysis" label="Data Analysis"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Data_Analysis" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Leadership" label="Leadership"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Leadership" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Automation" label="Automation"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Automation" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Mechanical_Design" label="Mechanical Design"> &nbsp; &nbsp; &nbsp;&nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Mechanical_Design" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Fabrication_Welding" label="Fabrication Welding"> &nbsp; &nbsp;&nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Fabrication_Welding" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Machining_CNC" label="Machining CNC"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Machining_CNC" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Heat_Transfer" label="Heat Transfer"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Heat_Transfer" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Electronics" label="Electronics">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Electronics" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Microcontrollers" label="Microcontrollers">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Microcontrollers" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="GUI_and_Programming" label="GUI & Programming">&nbsp; &nbsp;&nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="GUI_and_Programming" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="LabView" label="LabView"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="LabView" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Embedded_Systems" label="Embedded Systems"> &nbsp; &nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Embedded_Systems" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="CADD" label="CADD"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="CADD" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="FEA" label="FEA"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="FEA" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:field-wrapper inlineField="true" name="Civil_Engineering" label="Civil Engineering"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<%
for (int i = 1; i <= 10; i++) {
Integer abc = i;
%>
<aui:input name="Civil_Engineering" label=" " type="radio" value="<%=i%>"></aui:input>
<%
}
%>
</aui:field-wrapper>
<br />

<aui:button type="submit" value="Submit" />
</aui:form>

<br />
<br />