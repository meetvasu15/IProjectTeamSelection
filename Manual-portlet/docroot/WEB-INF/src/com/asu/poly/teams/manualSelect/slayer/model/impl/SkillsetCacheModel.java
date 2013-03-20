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

package com.asu.poly.teams.manualSelect.slayer.model.impl;

import com.asu.poly.teams.manualSelect.slayer.model.Skillset;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Skillset in entity cache.
 *
 * @author Eshwari
 * @see Skillset
 * @generated
 */
public class SkillsetCacheModel implements CacheModel<Skillset>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{studentID=");
		sb.append(studentID);
		sb.append(", asuid=");
		sb.append(asuid);
		sb.append(", Project_Management=");
		sb.append(Project_Management);
		sb.append(", Technical_Writing=");
		sb.append(Technical_Writing);
		sb.append(", Oral_Presentation=");
		sb.append(Oral_Presentation);
		sb.append(", Thermo_Fluids=");
		sb.append(Thermo_Fluids);
		sb.append(", Data_Analysis=");
		sb.append(Data_Analysis);
		sb.append(", Leadership=");
		sb.append(Leadership);
		sb.append(", Automation=");
		sb.append(Automation);
		sb.append(", Mechanical_Design=");
		sb.append(Mechanical_Design);
		sb.append(", Fabrication_Welding=");
		sb.append(Fabrication_Welding);
		sb.append(", Machining_CNC=");
		sb.append(Machining_CNC);
		sb.append(", Heat_Transfer=");
		sb.append(Heat_Transfer);
		sb.append(", Electronics=");
		sb.append(Electronics);
		sb.append(", Microcontrollers=");
		sb.append(Microcontrollers);
		sb.append(", GUI_and_Programming=");
		sb.append(GUI_and_Programming);
		sb.append(", LabView=");
		sb.append(LabView);
		sb.append(", Embedded_Systems=");
		sb.append(Embedded_Systems);
		sb.append(", CADD=");
		sb.append(CADD);
		sb.append(", FEA=");
		sb.append(FEA);
		sb.append(", Civil_Engineering=");
		sb.append(Civil_Engineering);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append("}");

		return sb.toString();
	}

	public Skillset toEntityModel() {
		SkillsetImpl skillsetImpl = new SkillsetImpl();

		skillsetImpl.setStudentID(studentID);

		if (asuid == null) {
			skillsetImpl.setAsuid(StringPool.BLANK);
		}
		else {
			skillsetImpl.setAsuid(asuid);
		}

		if (Project_Management == null) {
			skillsetImpl.setProject_Management(StringPool.BLANK);
		}
		else {
			skillsetImpl.setProject_Management(Project_Management);
		}

		if (Technical_Writing == null) {
			skillsetImpl.setTechnical_Writing(StringPool.BLANK);
		}
		else {
			skillsetImpl.setTechnical_Writing(Technical_Writing);
		}

		if (Oral_Presentation == null) {
			skillsetImpl.setOral_Presentation(StringPool.BLANK);
		}
		else {
			skillsetImpl.setOral_Presentation(Oral_Presentation);
		}

		if (Thermo_Fluids == null) {
			skillsetImpl.setThermo_Fluids(StringPool.BLANK);
		}
		else {
			skillsetImpl.setThermo_Fluids(Thermo_Fluids);
		}

		if (Data_Analysis == null) {
			skillsetImpl.setData_Analysis(StringPool.BLANK);
		}
		else {
			skillsetImpl.setData_Analysis(Data_Analysis);
		}

		if (Leadership == null) {
			skillsetImpl.setLeadership(StringPool.BLANK);
		}
		else {
			skillsetImpl.setLeadership(Leadership);
		}

		if (Automation == null) {
			skillsetImpl.setAutomation(StringPool.BLANK);
		}
		else {
			skillsetImpl.setAutomation(Automation);
		}

		if (Mechanical_Design == null) {
			skillsetImpl.setMechanical_Design(StringPool.BLANK);
		}
		else {
			skillsetImpl.setMechanical_Design(Mechanical_Design);
		}

		if (Fabrication_Welding == null) {
			skillsetImpl.setFabrication_Welding(StringPool.BLANK);
		}
		else {
			skillsetImpl.setFabrication_Welding(Fabrication_Welding);
		}

		if (Machining_CNC == null) {
			skillsetImpl.setMachining_CNC(StringPool.BLANK);
		}
		else {
			skillsetImpl.setMachining_CNC(Machining_CNC);
		}

		if (Heat_Transfer == null) {
			skillsetImpl.setHeat_Transfer(StringPool.BLANK);
		}
		else {
			skillsetImpl.setHeat_Transfer(Heat_Transfer);
		}

		if (Electronics == null) {
			skillsetImpl.setElectronics(StringPool.BLANK);
		}
		else {
			skillsetImpl.setElectronics(Electronics);
		}

		if (Microcontrollers == null) {
			skillsetImpl.setMicrocontrollers(StringPool.BLANK);
		}
		else {
			skillsetImpl.setMicrocontrollers(Microcontrollers);
		}

		if (GUI_and_Programming == null) {
			skillsetImpl.setGUI_and_Programming(StringPool.BLANK);
		}
		else {
			skillsetImpl.setGUI_and_Programming(GUI_and_Programming);
		}

		if (LabView == null) {
			skillsetImpl.setLabView(StringPool.BLANK);
		}
		else {
			skillsetImpl.setLabView(LabView);
		}

		if (Embedded_Systems == null) {
			skillsetImpl.setEmbedded_Systems(StringPool.BLANK);
		}
		else {
			skillsetImpl.setEmbedded_Systems(Embedded_Systems);
		}

		if (CADD == null) {
			skillsetImpl.setCADD(StringPool.BLANK);
		}
		else {
			skillsetImpl.setCADD(CADD);
		}

		if (FEA == null) {
			skillsetImpl.setFEA(StringPool.BLANK);
		}
		else {
			skillsetImpl.setFEA(FEA);
		}

		if (Civil_Engineering == null) {
			skillsetImpl.setCivil_Engineering(StringPool.BLANK);
		}
		else {
			skillsetImpl.setCivil_Engineering(Civil_Engineering);
		}

		if (dateAdded == Long.MIN_VALUE) {
			skillsetImpl.setDateAdded(null);
		}
		else {
			skillsetImpl.setDateAdded(new Date(dateAdded));
		}

		skillsetImpl.resetOriginalValues();

		return skillsetImpl;
	}

	public long studentID;
	public String asuid;
	public String Project_Management;
	public String Technical_Writing;
	public String Oral_Presentation;
	public String Thermo_Fluids;
	public String Data_Analysis;
	public String Leadership;
	public String Automation;
	public String Mechanical_Design;
	public String Fabrication_Welding;
	public String Machining_CNC;
	public String Heat_Transfer;
	public String Electronics;
	public String Microcontrollers;
	public String GUI_and_Programming;
	public String LabView;
	public String Embedded_Systems;
	public String CADD;
	public String FEA;
	public String Civil_Engineering;
	public long dateAdded;
}