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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Skillset}.
 * </p>
 *
 * @author    Eshwari
 * @see       Skillset
 * @generated
 */
public class SkillsetWrapper implements Skillset, ModelWrapper<Skillset> {
	public SkillsetWrapper(Skillset skillset) {
		_skillset = skillset;
	}

	public Class<?> getModelClass() {
		return Skillset.class;
	}

	public String getModelClassName() {
		return Skillset.class.getName();
	}

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

	/**
	* Returns the primary key of this skillset.
	*
	* @return the primary key of this skillset
	*/
	public long getPrimaryKey() {
		return _skillset.getPrimaryKey();
	}

	/**
	* Sets the primary key of this skillset.
	*
	* @param primaryKey the primary key of this skillset
	*/
	public void setPrimaryKey(long primaryKey) {
		_skillset.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the student i d of this skillset.
	*
	* @return the student i d of this skillset
	*/
	public long getStudentID() {
		return _skillset.getStudentID();
	}

	/**
	* Sets the student i d of this skillset.
	*
	* @param studentID the student i d of this skillset
	*/
	public void setStudentID(long studentID) {
		_skillset.setStudentID(studentID);
	}

	/**
	* Returns the asuid of this skillset.
	*
	* @return the asuid of this skillset
	*/
	public java.lang.String getAsuid() {
		return _skillset.getAsuid();
	}

	/**
	* Sets the asuid of this skillset.
	*
	* @param asuid the asuid of this skillset
	*/
	public void setAsuid(java.lang.String asuid) {
		_skillset.setAsuid(asuid);
	}

	/**
	* Returns the project_ management of this skillset.
	*
	* @return the project_ management of this skillset
	*/
	public java.lang.String getProject_Management() {
		return _skillset.getProject_Management();
	}

	/**
	* Sets the project_ management of this skillset.
	*
	* @param Project_Management the project_ management of this skillset
	*/
	public void setProject_Management(java.lang.String Project_Management) {
		_skillset.setProject_Management(Project_Management);
	}

	/**
	* Returns the technical_ writing of this skillset.
	*
	* @return the technical_ writing of this skillset
	*/
	public java.lang.String getTechnical_Writing() {
		return _skillset.getTechnical_Writing();
	}

	/**
	* Sets the technical_ writing of this skillset.
	*
	* @param Technical_Writing the technical_ writing of this skillset
	*/
	public void setTechnical_Writing(java.lang.String Technical_Writing) {
		_skillset.setTechnical_Writing(Technical_Writing);
	}

	/**
	* Returns the oral_ presentation of this skillset.
	*
	* @return the oral_ presentation of this skillset
	*/
	public java.lang.String getOral_Presentation() {
		return _skillset.getOral_Presentation();
	}

	/**
	* Sets the oral_ presentation of this skillset.
	*
	* @param Oral_Presentation the oral_ presentation of this skillset
	*/
	public void setOral_Presentation(java.lang.String Oral_Presentation) {
		_skillset.setOral_Presentation(Oral_Presentation);
	}

	/**
	* Returns the thermo_ fluids of this skillset.
	*
	* @return the thermo_ fluids of this skillset
	*/
	public java.lang.String getThermo_Fluids() {
		return _skillset.getThermo_Fluids();
	}

	/**
	* Sets the thermo_ fluids of this skillset.
	*
	* @param Thermo_Fluids the thermo_ fluids of this skillset
	*/
	public void setThermo_Fluids(java.lang.String Thermo_Fluids) {
		_skillset.setThermo_Fluids(Thermo_Fluids);
	}

	/**
	* Returns the data_ analysis of this skillset.
	*
	* @return the data_ analysis of this skillset
	*/
	public java.lang.String getData_Analysis() {
		return _skillset.getData_Analysis();
	}

	/**
	* Sets the data_ analysis of this skillset.
	*
	* @param Data_Analysis the data_ analysis of this skillset
	*/
	public void setData_Analysis(java.lang.String Data_Analysis) {
		_skillset.setData_Analysis(Data_Analysis);
	}

	/**
	* Returns the leadership of this skillset.
	*
	* @return the leadership of this skillset
	*/
	public java.lang.String getLeadership() {
		return _skillset.getLeadership();
	}

	/**
	* Sets the leadership of this skillset.
	*
	* @param Leadership the leadership of this skillset
	*/
	public void setLeadership(java.lang.String Leadership) {
		_skillset.setLeadership(Leadership);
	}

	/**
	* Returns the automation of this skillset.
	*
	* @return the automation of this skillset
	*/
	public java.lang.String getAutomation() {
		return _skillset.getAutomation();
	}

	/**
	* Sets the automation of this skillset.
	*
	* @param Automation the automation of this skillset
	*/
	public void setAutomation(java.lang.String Automation) {
		_skillset.setAutomation(Automation);
	}

	/**
	* Returns the mechanical_ design of this skillset.
	*
	* @return the mechanical_ design of this skillset
	*/
	public java.lang.String getMechanical_Design() {
		return _skillset.getMechanical_Design();
	}

	/**
	* Sets the mechanical_ design of this skillset.
	*
	* @param Mechanical_Design the mechanical_ design of this skillset
	*/
	public void setMechanical_Design(java.lang.String Mechanical_Design) {
		_skillset.setMechanical_Design(Mechanical_Design);
	}

	/**
	* Returns the fabrication_ welding of this skillset.
	*
	* @return the fabrication_ welding of this skillset
	*/
	public java.lang.String getFabrication_Welding() {
		return _skillset.getFabrication_Welding();
	}

	/**
	* Sets the fabrication_ welding of this skillset.
	*
	* @param Fabrication_Welding the fabrication_ welding of this skillset
	*/
	public void setFabrication_Welding(java.lang.String Fabrication_Welding) {
		_skillset.setFabrication_Welding(Fabrication_Welding);
	}

	/**
	* Returns the machining_ c n c of this skillset.
	*
	* @return the machining_ c n c of this skillset
	*/
	public java.lang.String getMachining_CNC() {
		return _skillset.getMachining_CNC();
	}

	/**
	* Sets the machining_ c n c of this skillset.
	*
	* @param Machining_CNC the machining_ c n c of this skillset
	*/
	public void setMachining_CNC(java.lang.String Machining_CNC) {
		_skillset.setMachining_CNC(Machining_CNC);
	}

	/**
	* Returns the heat_ transfer of this skillset.
	*
	* @return the heat_ transfer of this skillset
	*/
	public java.lang.String getHeat_Transfer() {
		return _skillset.getHeat_Transfer();
	}

	/**
	* Sets the heat_ transfer of this skillset.
	*
	* @param Heat_Transfer the heat_ transfer of this skillset
	*/
	public void setHeat_Transfer(java.lang.String Heat_Transfer) {
		_skillset.setHeat_Transfer(Heat_Transfer);
	}

	/**
	* Returns the electronics of this skillset.
	*
	* @return the electronics of this skillset
	*/
	public java.lang.String getElectronics() {
		return _skillset.getElectronics();
	}

	/**
	* Sets the electronics of this skillset.
	*
	* @param Electronics the electronics of this skillset
	*/
	public void setElectronics(java.lang.String Electronics) {
		_skillset.setElectronics(Electronics);
	}

	/**
	* Returns the microcontrollers of this skillset.
	*
	* @return the microcontrollers of this skillset
	*/
	public java.lang.String getMicrocontrollers() {
		return _skillset.getMicrocontrollers();
	}

	/**
	* Sets the microcontrollers of this skillset.
	*
	* @param Microcontrollers the microcontrollers of this skillset
	*/
	public void setMicrocontrollers(java.lang.String Microcontrollers) {
		_skillset.setMicrocontrollers(Microcontrollers);
	}

	/**
	* Returns the g u i_and_ programming of this skillset.
	*
	* @return the g u i_and_ programming of this skillset
	*/
	public java.lang.String getGUI_and_Programming() {
		return _skillset.getGUI_and_Programming();
	}

	/**
	* Sets the g u i_and_ programming of this skillset.
	*
	* @param GUI_and_Programming the g u i_and_ programming of this skillset
	*/
	public void setGUI_and_Programming(java.lang.String GUI_and_Programming) {
		_skillset.setGUI_and_Programming(GUI_and_Programming);
	}

	/**
	* Returns the lab view of this skillset.
	*
	* @return the lab view of this skillset
	*/
	public java.lang.String getLabView() {
		return _skillset.getLabView();
	}

	/**
	* Sets the lab view of this skillset.
	*
	* @param LabView the lab view of this skillset
	*/
	public void setLabView(java.lang.String LabView) {
		_skillset.setLabView(LabView);
	}

	/**
	* Returns the embedded_ systems of this skillset.
	*
	* @return the embedded_ systems of this skillset
	*/
	public java.lang.String getEmbedded_Systems() {
		return _skillset.getEmbedded_Systems();
	}

	/**
	* Sets the embedded_ systems of this skillset.
	*
	* @param Embedded_Systems the embedded_ systems of this skillset
	*/
	public void setEmbedded_Systems(java.lang.String Embedded_Systems) {
		_skillset.setEmbedded_Systems(Embedded_Systems);
	}

	/**
	* Returns the c a d d of this skillset.
	*
	* @return the c a d d of this skillset
	*/
	public java.lang.String getCADD() {
		return _skillset.getCADD();
	}

	/**
	* Sets the c a d d of this skillset.
	*
	* @param CADD the c a d d of this skillset
	*/
	public void setCADD(java.lang.String CADD) {
		_skillset.setCADD(CADD);
	}

	/**
	* Returns the f e a of this skillset.
	*
	* @return the f e a of this skillset
	*/
	public java.lang.String getFEA() {
		return _skillset.getFEA();
	}

	/**
	* Sets the f e a of this skillset.
	*
	* @param FEA the f e a of this skillset
	*/
	public void setFEA(java.lang.String FEA) {
		_skillset.setFEA(FEA);
	}

	/**
	* Returns the civil_ engineering of this skillset.
	*
	* @return the civil_ engineering of this skillset
	*/
	public java.lang.String getCivil_Engineering() {
		return _skillset.getCivil_Engineering();
	}

	/**
	* Sets the civil_ engineering of this skillset.
	*
	* @param Civil_Engineering the civil_ engineering of this skillset
	*/
	public void setCivil_Engineering(java.lang.String Civil_Engineering) {
		_skillset.setCivil_Engineering(Civil_Engineering);
	}

	/**
	* Returns the date added of this skillset.
	*
	* @return the date added of this skillset
	*/
	public java.util.Date getDateAdded() {
		return _skillset.getDateAdded();
	}

	/**
	* Sets the date added of this skillset.
	*
	* @param dateAdded the date added of this skillset
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_skillset.setDateAdded(dateAdded);
	}

	public boolean isNew() {
		return _skillset.isNew();
	}

	public void setNew(boolean n) {
		_skillset.setNew(n);
	}

	public boolean isCachedModel() {
		return _skillset.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_skillset.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _skillset.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _skillset.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_skillset.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _skillset.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_skillset.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SkillsetWrapper((Skillset)_skillset.clone());
	}

	public int compareTo(
		com.asu.poly.teams.manualSelect.slayer.model.Skillset skillset) {
		return _skillset.compareTo(skillset);
	}

	@Override
	public int hashCode() {
		return _skillset.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.asu.poly.teams.manualSelect.slayer.model.Skillset> toCacheModel() {
		return _skillset.toCacheModel();
	}

	public com.asu.poly.teams.manualSelect.slayer.model.Skillset toEscapedModel() {
		return new SkillsetWrapper(_skillset.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _skillset.toString();
	}

	public java.lang.String toXmlString() {
		return _skillset.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_skillset.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Skillset getWrappedSkillset() {
		return _skillset;
	}

	public Skillset getWrappedModel() {
		return _skillset;
	}

	public void resetOriginalValues() {
		_skillset.resetOriginalValues();
	}

	private Skillset _skillset;
}