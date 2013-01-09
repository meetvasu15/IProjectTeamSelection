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

package com.asu.poly.teams.manualSelect.slayer.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.asu.poly.teams.manualSelect.slayer.service.http.SkillsetServiceSoap}.
 *
 * @author    asingh64
 * @see       com.asu.poly.teams.manualSelect.slayer.service.http.SkillsetServiceSoap
 * @generated
 */
public class SkillsetSoap implements Serializable {
	public static SkillsetSoap toSoapModel(Skillset model) {
		SkillsetSoap soapModel = new SkillsetSoap();

		soapModel.setStudentID(model.getStudentID());
		soapModel.setAsuid(model.getAsuid());
		soapModel.setProject_Management(model.getProject_Management());
		soapModel.setTechnical_Writing(model.getTechnical_Writing());
		soapModel.setOral_Presentation(model.getOral_Presentation());
		soapModel.setThermo_Fluids(model.getThermo_Fluids());
		soapModel.setData_Analysis(model.getData_Analysis());
		soapModel.setLeadership(model.getLeadership());
		soapModel.setAutomation(model.getAutomation());
		soapModel.setMechanical_Design(model.getMechanical_Design());
		soapModel.setFabrication_Welding(model.getFabrication_Welding());
		soapModel.setMachining_CNC(model.getMachining_CNC());
		soapModel.setHeat_Transfer(model.getHeat_Transfer());
		soapModel.setElectronics(model.getElectronics());
		soapModel.setMicrocontrollers(model.getMicrocontrollers());
		soapModel.setGUI_and_Programming(model.getGUI_and_Programming());
		soapModel.setLabView(model.getLabView());
		soapModel.setEmbedded_Systems(model.getEmbedded_Systems());
		soapModel.setCADD(model.getCADD());
		soapModel.setFEA(model.getFEA());
		soapModel.setCivil_Engineering(model.getCivil_Engineering());
		soapModel.setDateAdded(model.getDateAdded());

		return soapModel;
	}

	public static SkillsetSoap[] toSoapModels(Skillset[] models) {
		SkillsetSoap[] soapModels = new SkillsetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SkillsetSoap[][] toSoapModels(Skillset[][] models) {
		SkillsetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SkillsetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SkillsetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SkillsetSoap[] toSoapModels(List<Skillset> models) {
		List<SkillsetSoap> soapModels = new ArrayList<SkillsetSoap>(models.size());

		for (Skillset model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SkillsetSoap[soapModels.size()]);
	}

	public SkillsetSoap() {
	}

	public long getPrimaryKey() {
		return _studentID;
	}

	public void setPrimaryKey(long pk) {
		setStudentID(pk);
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
}