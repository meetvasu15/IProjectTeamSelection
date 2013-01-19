package com.asu.poly.iproject.student.skills;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.asu.poly.iproject.student.skills.model.impl.SkillsetImpl;
import com.asu.poly.iproject.student.skills.service.SkillsetLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class StudentSkills
 */
public class StudentSkills extends MVCPortlet {
 
	public void updateSkills(ActionRequest actionRequest,ActionResponse actionResponse)
		throws IOException, PortletException {
		String Project_Management = ParamUtil.getString(actionRequest, "Project_Management");
		String Technical_Writing = ParamUtil.getString(actionRequest, "Technical_Writing");
		String Oral_Presentation = ParamUtil.getString(actionRequest, "Oral_Presentation");
		String Thermo_Fluids = ParamUtil.getString(actionRequest, "Thermo_Fluids");
		String Data_Analysis = ParamUtil.getString(actionRequest, "Data_Analysis");
		String Leadership = ParamUtil.getString(actionRequest, "Leadership");
		String Automation = ParamUtil.getString(actionRequest, "Automation");
		String Mechanical_Design = ParamUtil.getString(actionRequest, "Mechanical_Design");
		String Fabrication_Welding = ParamUtil.getString(actionRequest, "Fabrication_Welding");
		String Machining_CNC = ParamUtil.getString(actionRequest, "Machining_CNC");
		String Heat_Transfer = ParamUtil.getString(actionRequest, "Heat_Transfer");
		String Electronics = ParamUtil.getString(actionRequest, "Electronics");
		String Microcontrollers = ParamUtil.getString(actionRequest, "Microcontrollers");
		String GUI_and_Programming = ParamUtil.getString(actionRequest, "GUI_and_Programming");
		String LabView = ParamUtil.getString(actionRequest, "LabView");
		String Embedded_Systems = ParamUtil.getString(actionRequest, "Embedded_Systems");
		String CADD = ParamUtil.getString(actionRequest, "CADD");
		String FEA = ParamUtil.getString(actionRequest, "FEA");
		String Civil_Engineering = ParamUtil.getString(actionRequest, "Civil_Engineering");
		System.out.println("Your inputs ==> " + Project_Management + ", " + Technical_Writing + "," + Oral_Presentation);
		
		SkillsetImpl project = new SkillsetImpl();
		// set primary key
		long studentID = 0L;
		
		try {
			studentID =
			CounterLocalServiceUtil.increment(
			this.getClass().getName());
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
				e.printStackTrace();
		}
		
		project.setStudentID(studentID);
		// set UI fields
		project.setProject_Management(Project_Management);
		project.setTechnical_Writing(Technical_Writing);
		project.setOral_Presentation(Oral_Presentation);
		project.setThermo_Fluids(Thermo_Fluids);
		project.setData_Analysis(Data_Analysis);
		project.setLeadership(Leadership);
		project.setAutomation(Automation);
		project.setMechanical_Design(Mechanical_Design);
		project.setFabrication_Welding(Fabrication_Welding);
		project.setMachining_CNC(Machining_CNC);
		project.setHeat_Transfer(Heat_Transfer);
		project.setElectronics(Electronics);
		project.setMicrocontrollers(Microcontrollers);
		project.setGUI_and_Programming(GUI_and_Programming);
		project.setLabView(LabView);
		project.setEmbedded_Systems(Embedded_Systems);
		project.setCADD(CADD);
		project.setFEA(FEA);
		project.setCivil_Engineering(Civil_Engineering);
		// set audit field(s)
		project.setDateAdded(new Date());
		
		// insert the book using persistence api
		
		try {
			SkillsetLocalServiceUtil.addSkillset(project);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			
			e.printStackTrace();
		}
		 
	}
}
