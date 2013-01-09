/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.asu.poly.teams.randomCreate.slayer.model;

import com.asu.poly.teams.randomCreate.slayer.service.SkillsetLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author asingh64
 */
public class SkillsetClp extends BaseModelImpl<Skillset> implements Skillset {
	public SkillsetClp() {
	}

	public Class<?> getModelClass() {
		return Skillset.class;
	}

	public String getModelClassName() {
		return Skillset.class.getName();
	}

	public long getPrimaryKey() {
		return _studentID;
	}

	public void setPrimaryKey(long primaryKey) {
		setStudentID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_studentID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentID", getStudentID());
		attributes.put("asuid", getAsuid());
		attributes.put("Project_Management", getProject_Management());
		attributes.put("Technical_Writing", getTechnical_Writing());
		attributes.put("Oral_Presentation", getOral_Presentation());
		attributes.put("Thermo_Fluids", getThermo_Fluids());
		attributes.put("Data_Analysis", getData_Analysis());
		attributes.put("Leadership", getLeadership());
		attributes.put("Automation", getAutomation());
		attributes.put("Mechanical_Design", getMechanical_Design());
		attributes.put("Fabrication_Welding", getFabrication_Welding());
		attributes.put("Machining_CNC", getMachining_CNC());
		attributes.put("Heat_Transfer", getHeat_Transfer());
		attributes.put("Electronics", getElectronics());
		attributes.put("Microcontrollers", getMicrocontrollers());
		attributes.put("GUI_and_Programming", getGUI_and_Programming());
		attributes.put("LabView", getLabView());
		attributes.put("Embedded_Systems", getEmbedded_Systems());
		attributes.put("CADD", getCADD());
		attributes.put("FEA", getFEA());
		attributes.put("Civil_Engineering", getCivil_Engineering());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentID = (Long)attributes.get("studentID");

		if (studentID != null) {
			setStudentID(studentID);
		}

		String asuid = (String)attributes.get("asuid");

		if (asuid != null) {
			setAsuid(asuid);
		}

		String Project_Management = (String)attributes.get("Project_Management");

		if (Project_Management != null) {
			setProject_Management(Project_Management);
		}

		String Technical_Writing = (String)attributes.get("Technical_Writing");

		if (Technical_Writing != null) {
			setTechnical_Writing(Technical_Writing);
		}

		String Oral_Presentation = (String)attributes.get("Oral_Presentation");

		if (Oral_Presentation != null) {
			setOral_Presentation(Oral_Presentation);
		}

		String Thermo_Fluids = (String)attributes.get("Thermo_Fluids");

		if (Thermo_Fluids != null) {
			setThermo_Fluids(Thermo_Fluids);
		}

		String Data_Analysis = (String)attributes.get("Data_Analysis");

		if (Data_Analysis != null) {
			setData_Analysis(Data_Analysis);
		}

		String Leadership = (String)attributes.get("Leadership");

		if (Leadership != null) {
			setLeadership(Leadership);
		}

		String Automation = (String)attributes.get("Automation");

		if (Automation != null) {
			setAutomation(Automation);
		}

		String Mechanical_Design = (String)attributes.get("Mechanical_Design");

		if (Mechanical_Design != null) {
			setMechanical_Design(Mechanical_Design);
		}

		String Fabrication_Welding = (String)attributes.get(
				"Fabrication_Welding");

		if (Fabrication_Welding != null) {
			setFabrication_Welding(Fabrication_Welding);
		}

		String Machining_CNC = (String)attributes.get("Machining_CNC");

		if (Machining_CNC != null) {
			setMachining_CNC(Machining_CNC);
		}

		String Heat_Transfer = (String)attributes.get("Heat_Transfer");

		if (Heat_Transfer != null) {
			setHeat_Transfer(Heat_Transfer);
		}

		String Electronics = (String)attributes.get("Electronics");

		if (Electronics != null) {
			setElectronics(Electronics);
		}

		String Microcontrollers = (String)attributes.get("Microcontrollers");

		if (Microcontrollers != null) {
			setMicrocontrollers(Microcontrollers);
		}

		String GUI_and_Programming = (String)attributes.get(
				"GUI_and_Programming");

		if (GUI_and_Programming != null) {
			setGUI_and_Programming(GUI_and_Programming);
		}

		String LabView = (String)attributes.get("LabView");

		if (LabView != null) {
			setLabView(LabView);
		}

		String Embedded_Systems = (String)attributes.get("Embedded_Systems");

		if (Embedded_Systems != null) {
			setEmbedded_Systems(Embedded_Systems);
		}

		String CADD = (String)attributes.get("CADD");

		if (CADD != null) {
			setCADD(CADD);
		}

		String FEA = (String)attributes.get("FEA");

		if (FEA != null) {
			setFEA(FEA);
		}

		String Civil_Engineering = (String)attributes.get("Civil_Engineering");

		if (Civil_Engineering != null) {
			setCivil_Engineering(Civil_Engineering);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}
	}

	public long getStudentID() {
		return _studentID;
	}

	public void setStudentID(long studentID) {
		_studentID = studentID;
	}

	public String getAsuid() {
		return _asuid;
	}

	public void setAsuid(String asuid) {
		_asuid = asuid;
	}

	public String getProject_Management() {
		return _Project_Management;
	}

	public void setProject_Management(String Project_Management) {
		_Project_Management = Project_Management;
	}

	public String getTechnical_Writing() {
		return _Technical_Writing;
	}

	public void setTechnical_Writing(String Technical_Writing) {
		_Technical_Writing = Technical_Writing;
	}

	public String getOral_Presentation() {
		return _Oral_Presentation;
	}

	public void setOral_Presentation(String Oral_Presentation) {
		_Oral_Presentation = Oral_Presentation;
	}

	public String getThermo_Fluids() {
		return _Thermo_Fluids;
	}

	public void setThermo_Fluids(String Thermo_Fluids) {
		_Thermo_Fluids = Thermo_Fluids;
	}

	public String getData_Analysis() {
		return _Data_Analysis;
	}

	public void setData_Analysis(String Data_Analysis) {
		_Data_Analysis = Data_Analysis;
	}

	public String getLeadership() {
		return _Leadership;
	}

	public void setLeadership(String Leadership) {
		_Leadership = Leadership;
	}

	public String getAutomation() {
		return _Automation;
	}

	public void setAutomation(String Automation) {
		_Automation = Automation;
	}

	public String getMechanical_Design() {
		return _Mechanical_Design;
	}

	public void setMechanical_Design(String Mechanical_Design) {
		_Mechanical_Design = Mechanical_Design;
	}

	public String getFabrication_Welding() {
		return _Fabrication_Welding;
	}

	public void setFabrication_Welding(String Fabrication_Welding) {
		_Fabrication_Welding = Fabrication_Welding;
	}

	public String getMachining_CNC() {
		return _Machining_CNC;
	}

	public void setMachining_CNC(String Machining_CNC) {
		_Machining_CNC = Machining_CNC;
	}

	public String getHeat_Transfer() {
		return _Heat_Transfer;
	}

	public void setHeat_Transfer(String Heat_Transfer) {
		_Heat_Transfer = Heat_Transfer;
	}

	public String getElectronics() {
		return _Electronics;
	}

	public void setElectronics(String Electronics) {
		_Electronics = Electronics;
	}

	public String getMicrocontrollers() {
		return _Microcontrollers;
	}

	public void setMicrocontrollers(String Microcontrollers) {
		_Microcontrollers = Microcontrollers;
	}

	public String getGUI_and_Programming() {
		return _GUI_and_Programming;
	}

	public void setGUI_and_Programming(String GUI_and_Programming) {
		_GUI_and_Programming = GUI_and_Programming;
	}

	public String getLabView() {
		return _LabView;
	}

	public void setLabView(String LabView) {
		_LabView = LabView;
	}

	public String getEmbedded_Systems() {
		return _Embedded_Systems;
	}

	public void setEmbedded_Systems(String Embedded_Systems) {
		_Embedded_Systems = Embedded_Systems;
	}

	public String getCADD() {
		return _CADD;
	}

	public void setCADD(String CADD) {
		_CADD = CADD;
	}

	public String getFEA() {
		return _FEA;
	}

	public void setFEA(String FEA) {
		_FEA = FEA;
	}

	public String getCivil_Engineering() {
		return _Civil_Engineering;
	}

	public void setCivil_Engineering(String Civil_Engineering) {
		_Civil_Engineering = Civil_Engineering;
	}

	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	public BaseModel<?> getSkillsetRemoteModel() {
		return _skillsetRemoteModel;
	}

	public void setSkillsetRemoteModel(BaseModel<?> skillsetRemoteModel) {
		_skillsetRemoteModel = skillsetRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SkillsetLocalServiceUtil.addSkillset(this);
		}
		else {
			SkillsetLocalServiceUtil.updateSkillset(this);
		}
	}

	@Override
	public Skillset toEscapedModel() {
		return (Skillset)Proxy.newProxyInstance(Skillset.class.getClassLoader(),
			new Class[] { Skillset.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SkillsetClp clone = new SkillsetClp();

		clone.setStudentID(getStudentID());
		clone.setAsuid(getAsuid());
		clone.setProject_Management(getProject_Management());
		clone.setTechnical_Writing(getTechnical_Writing());
		clone.setOral_Presentation(getOral_Presentation());
		clone.setThermo_Fluids(getThermo_Fluids());
		clone.setData_Analysis(getData_Analysis());
		clone.setLeadership(getLeadership());
		clone.setAutomation(getAutomation());
		clone.setMechanical_Design(getMechanical_Design());
		clone.setFabrication_Welding(getFabrication_Welding());
		clone.setMachining_CNC(getMachining_CNC());
		clone.setHeat_Transfer(getHeat_Transfer());
		clone.setElectronics(getElectronics());
		clone.setMicrocontrollers(getMicrocontrollers());
		clone.setGUI_and_Programming(getGUI_and_Programming());
		clone.setLabView(getLabView());
		clone.setEmbedded_Systems(getEmbedded_Systems());
		clone.setCADD(getCADD());
		clone.setFEA(getFEA());
		clone.setCivil_Engineering(getCivil_Engineering());
		clone.setDateAdded(getDateAdded());

		return clone;
	}

	public int compareTo(Skillset skillset) {
		long primaryKey = skillset.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		SkillsetClp skillset = null;

		try {
			skillset = (SkillsetClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = skillset.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{studentID=");
		sb.append(getStudentID());
		sb.append(", asuid=");
		sb.append(getAsuid());
		sb.append(", Project_Management=");
		sb.append(getProject_Management());
		sb.append(", Technical_Writing=");
		sb.append(getTechnical_Writing());
		sb.append(", Oral_Presentation=");
		sb.append(getOral_Presentation());
		sb.append(", Thermo_Fluids=");
		sb.append(getThermo_Fluids());
		sb.append(", Data_Analysis=");
		sb.append(getData_Analysis());
		sb.append(", Leadership=");
		sb.append(getLeadership());
		sb.append(", Automation=");
		sb.append(getAutomation());
		sb.append(", Mechanical_Design=");
		sb.append(getMechanical_Design());
		sb.append(", Fabrication_Welding=");
		sb.append(getFabrication_Welding());
		sb.append(", Machining_CNC=");
		sb.append(getMachining_CNC());
		sb.append(", Heat_Transfer=");
		sb.append(getHeat_Transfer());
		sb.append(", Electronics=");
		sb.append(getElectronics());
		sb.append(", Microcontrollers=");
		sb.append(getMicrocontrollers());
		sb.append(", GUI_and_Programming=");
		sb.append(getGUI_and_Programming());
		sb.append(", LabView=");
		sb.append(getLabView());
		sb.append(", Embedded_Systems=");
		sb.append(getEmbedded_Systems());
		sb.append(", CADD=");
		sb.append(getCADD());
		sb.append(", FEA=");
		sb.append(getFEA());
		sb.append(", Civil_Engineering=");
		sb.append(getCivil_Engineering());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("com.asu.poly.teams.randomCreate.slayer.model.Skillset");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentID</column-name><column-value><![CDATA[");
		sb.append(getStudentID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asuid</column-name><column-value><![CDATA[");
		sb.append(getAsuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Project_Management</column-name><column-value><![CDATA[");
		sb.append(getProject_Management());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Technical_Writing</column-name><column-value><![CDATA[");
		sb.append(getTechnical_Writing());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Oral_Presentation</column-name><column-value><![CDATA[");
		sb.append(getOral_Presentation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Thermo_Fluids</column-name><column-value><![CDATA[");
		sb.append(getThermo_Fluids());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Data_Analysis</column-name><column-value><![CDATA[");
		sb.append(getData_Analysis());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Leadership</column-name><column-value><![CDATA[");
		sb.append(getLeadership());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Automation</column-name><column-value><![CDATA[");
		sb.append(getAutomation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Mechanical_Design</column-name><column-value><![CDATA[");
		sb.append(getMechanical_Design());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Fabrication_Welding</column-name><column-value><![CDATA[");
		sb.append(getFabrication_Welding());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Machining_CNC</column-name><column-value><![CDATA[");
		sb.append(getMachining_CNC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Heat_Transfer</column-name><column-value><![CDATA[");
		sb.append(getHeat_Transfer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Electronics</column-name><column-value><![CDATA[");
		sb.append(getElectronics());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Microcontrollers</column-name><column-value><![CDATA[");
		sb.append(getMicrocontrollers());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GUI_and_Programming</column-name><column-value><![CDATA[");
		sb.append(getGUI_and_Programming());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LabView</column-name><column-value><![CDATA[");
		sb.append(getLabView());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Embedded_Systems</column-name><column-value><![CDATA[");
		sb.append(getEmbedded_Systems());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CADD</column-name><column-value><![CDATA[");
		sb.append(getCADD());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FEA</column-name><column-value><![CDATA[");
		sb.append(getFEA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Civil_Engineering</column-name><column-value><![CDATA[");
		sb.append(getCivil_Engineering());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _studentID;
	private String _asuid;
	private String _Project_Management;
	private String _Technical_Writing;
	private String _Oral_Presentation;
	private String _Thermo_Fluids;
	private String _Data_Analysis;
	private String _Leadership;
	private String _Automation;
	private String _Mechanical_Design;
	private String _Fabrication_Welding;
	private String _Machining_CNC;
	private String _Heat_Transfer;
	private String _Electronics;
	private String _Microcontrollers;
	private String _GUI_and_Programming;
	private String _LabView;
	private String _Embedded_Systems;
	private String _CADD;
	private String _FEA;
	private String _Civil_Engineering;
	private Date _dateAdded;
	private BaseModel<?> _skillsetRemoteModel;
}