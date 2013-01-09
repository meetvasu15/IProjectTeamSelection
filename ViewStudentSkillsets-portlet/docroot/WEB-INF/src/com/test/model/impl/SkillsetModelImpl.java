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

package com.test.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.test.model.Skillset;
import com.test.model.SkillsetModel;
import com.test.model.SkillsetSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Skillset service. Represents a row in the &quot;skillset_skillset&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.test.model.SkillsetModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SkillsetImpl}.
 * </p>
 *
 * @author zhengyang
 * @see SkillsetImpl
 * @see com.test.model.Skillset
 * @see com.test.model.SkillsetModel
 * @generated
 */
@JSON(strict = true)
public class SkillsetModelImpl extends BaseModelImpl<Skillset>
	implements SkillsetModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a skillset model instance should use the {@link com.test.model.Skillset} interface instead.
	 */
	public static final String TABLE_NAME = "skillset_skillset";
	public static final Object[][] TABLE_COLUMNS = {
			{ "studentID", Types.BIGINT },
			{ "Project_Management", Types.VARCHAR },
			{ "Technical_Writing", Types.VARCHAR },
			{ "Oral_Presentation", Types.VARCHAR },
			{ "Thermo_Fluids", Types.VARCHAR },
			{ "Data_Analysis", Types.VARCHAR },
			{ "Leadership", Types.VARCHAR },
			{ "Automation", Types.VARCHAR },
			{ "Mechanical_Design", Types.VARCHAR },
			{ "Fabrication_Welding", Types.VARCHAR },
			{ "Machining_CNC", Types.VARCHAR },
			{ "Heat_Transfer", Types.VARCHAR },
			{ "Electronics", Types.VARCHAR },
			{ "Microcontrollers", Types.VARCHAR },
			{ "GUI_and_Programming", Types.VARCHAR },
			{ "LabView", Types.VARCHAR },
			{ "Embedded_Systems", Types.VARCHAR },
			{ "CADD", Types.VARCHAR },
			{ "FEA", Types.VARCHAR },
			{ "Civil_Engineering", Types.VARCHAR },
			{ "dateAdded", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table skillset_skillset (studentID LONG not null primary key,Project_Management VARCHAR(75) null,Technical_Writing VARCHAR(75) null,Oral_Presentation VARCHAR(75) null,Thermo_Fluids VARCHAR(75) null,Data_Analysis VARCHAR(75) null,Leadership VARCHAR(75) null,Automation VARCHAR(75) null,Mechanical_Design VARCHAR(75) null,Fabrication_Welding VARCHAR(75) null,Machining_CNC VARCHAR(75) null,Heat_Transfer VARCHAR(75) null,Electronics VARCHAR(75) null,Microcontrollers VARCHAR(75) null,GUI_and_Programming VARCHAR(75) null,LabView VARCHAR(75) null,Embedded_Systems VARCHAR(75) null,CADD VARCHAR(75) null,FEA VARCHAR(75) null,Civil_Engineering VARCHAR(75) null,dateAdded DATE null)";
	public static final String TABLE_SQL_DROP = "drop table skillset_skillset";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.test.model.Skillset"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.test.model.Skillset"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Skillset toModel(SkillsetSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Skillset model = new SkillsetImpl();

		model.setStudentID(soapModel.getStudentID());
		model.setProject_Management(soapModel.getProject_Management());
		model.setTechnical_Writing(soapModel.getTechnical_Writing());
		model.setOral_Presentation(soapModel.getOral_Presentation());
		model.setThermo_Fluids(soapModel.getThermo_Fluids());
		model.setData_Analysis(soapModel.getData_Analysis());
		model.setLeadership(soapModel.getLeadership());
		model.setAutomation(soapModel.getAutomation());
		model.setMechanical_Design(soapModel.getMechanical_Design());
		model.setFabrication_Welding(soapModel.getFabrication_Welding());
		model.setMachining_CNC(soapModel.getMachining_CNC());
		model.setHeat_Transfer(soapModel.getHeat_Transfer());
		model.setElectronics(soapModel.getElectronics());
		model.setMicrocontrollers(soapModel.getMicrocontrollers());
		model.setGUI_and_Programming(soapModel.getGUI_and_Programming());
		model.setLabView(soapModel.getLabView());
		model.setEmbedded_Systems(soapModel.getEmbedded_Systems());
		model.setCADD(soapModel.getCADD());
		model.setFEA(soapModel.getFEA());
		model.setCivil_Engineering(soapModel.getCivil_Engineering());
		model.setDateAdded(soapModel.getDateAdded());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Skillset> toModels(SkillsetSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Skillset> models = new ArrayList<Skillset>(soapModels.length);

		for (SkillsetSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.test.model.Skillset"));

	public SkillsetModelImpl() {
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

	public Class<?> getModelClass() {
		return Skillset.class;
	}

	public String getModelClassName() {
		return Skillset.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentID", getStudentID());
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

	@JSON
	public long getStudentID() {
		return _studentID;
	}

	public void setStudentID(long studentID) {
		_studentID = studentID;
	}

	@JSON
	public String getProject_Management() {
		if (_Project_Management == null) {
			return StringPool.BLANK;
		}
		else {
			return _Project_Management;
		}
	}

	public void setProject_Management(String Project_Management) {
		_Project_Management = Project_Management;
	}

	@JSON
	public String getTechnical_Writing() {
		if (_Technical_Writing == null) {
			return StringPool.BLANK;
		}
		else {
			return _Technical_Writing;
		}
	}

	public void setTechnical_Writing(String Technical_Writing) {
		_Technical_Writing = Technical_Writing;
	}

	@JSON
	public String getOral_Presentation() {
		if (_Oral_Presentation == null) {
			return StringPool.BLANK;
		}
		else {
			return _Oral_Presentation;
		}
	}

	public void setOral_Presentation(String Oral_Presentation) {
		_Oral_Presentation = Oral_Presentation;
	}

	@JSON
	public String getThermo_Fluids() {
		if (_Thermo_Fluids == null) {
			return StringPool.BLANK;
		}
		else {
			return _Thermo_Fluids;
		}
	}

	public void setThermo_Fluids(String Thermo_Fluids) {
		_Thermo_Fluids = Thermo_Fluids;
	}

	@JSON
	public String getData_Analysis() {
		if (_Data_Analysis == null) {
			return StringPool.BLANK;
		}
		else {
			return _Data_Analysis;
		}
	}

	public void setData_Analysis(String Data_Analysis) {
		_Data_Analysis = Data_Analysis;
	}

	@JSON
	public String getLeadership() {
		if (_Leadership == null) {
			return StringPool.BLANK;
		}
		else {
			return _Leadership;
		}
	}

	public void setLeadership(String Leadership) {
		_Leadership = Leadership;
	}

	@JSON
	public String getAutomation() {
		if (_Automation == null) {
			return StringPool.BLANK;
		}
		else {
			return _Automation;
		}
	}

	public void setAutomation(String Automation) {
		_Automation = Automation;
	}

	@JSON
	public String getMechanical_Design() {
		if (_Mechanical_Design == null) {
			return StringPool.BLANK;
		}
		else {
			return _Mechanical_Design;
		}
	}

	public void setMechanical_Design(String Mechanical_Design) {
		_Mechanical_Design = Mechanical_Design;
	}

	@JSON
	public String getFabrication_Welding() {
		if (_Fabrication_Welding == null) {
			return StringPool.BLANK;
		}
		else {
			return _Fabrication_Welding;
		}
	}

	public void setFabrication_Welding(String Fabrication_Welding) {
		_Fabrication_Welding = Fabrication_Welding;
	}

	@JSON
	public String getMachining_CNC() {
		if (_Machining_CNC == null) {
			return StringPool.BLANK;
		}
		else {
			return _Machining_CNC;
		}
	}

	public void setMachining_CNC(String Machining_CNC) {
		_Machining_CNC = Machining_CNC;
	}

	@JSON
	public String getHeat_Transfer() {
		if (_Heat_Transfer == null) {
			return StringPool.BLANK;
		}
		else {
			return _Heat_Transfer;
		}
	}

	public void setHeat_Transfer(String Heat_Transfer) {
		_Heat_Transfer = Heat_Transfer;
	}

	@JSON
	public String getElectronics() {
		if (_Electronics == null) {
			return StringPool.BLANK;
		}
		else {
			return _Electronics;
		}
	}

	public void setElectronics(String Electronics) {
		_Electronics = Electronics;
	}

	@JSON
	public String getMicrocontrollers() {
		if (_Microcontrollers == null) {
			return StringPool.BLANK;
		}
		else {
			return _Microcontrollers;
		}
	}

	public void setMicrocontrollers(String Microcontrollers) {
		_Microcontrollers = Microcontrollers;
	}

	@JSON
	public String getGUI_and_Programming() {
		if (_GUI_and_Programming == null) {
			return StringPool.BLANK;
		}
		else {
			return _GUI_and_Programming;
		}
	}

	public void setGUI_and_Programming(String GUI_and_Programming) {
		_GUI_and_Programming = GUI_and_Programming;
	}

	@JSON
	public String getLabView() {
		if (_LabView == null) {
			return StringPool.BLANK;
		}
		else {
			return _LabView;
		}
	}

	public void setLabView(String LabView) {
		_LabView = LabView;
	}

	@JSON
	public String getEmbedded_Systems() {
		if (_Embedded_Systems == null) {
			return StringPool.BLANK;
		}
		else {
			return _Embedded_Systems;
		}
	}

	public void setEmbedded_Systems(String Embedded_Systems) {
		_Embedded_Systems = Embedded_Systems;
	}

	@JSON
	public String getCADD() {
		if (_CADD == null) {
			return StringPool.BLANK;
		}
		else {
			return _CADD;
		}
	}

	public void setCADD(String CADD) {
		_CADD = CADD;
	}

	@JSON
	public String getFEA() {
		if (_FEA == null) {
			return StringPool.BLANK;
		}
		else {
			return _FEA;
		}
	}

	public void setFEA(String FEA) {
		_FEA = FEA;
	}

	@JSON
	public String getCivil_Engineering() {
		if (_Civil_Engineering == null) {
			return StringPool.BLANK;
		}
		else {
			return _Civil_Engineering;
		}
	}

	public void setCivil_Engineering(String Civil_Engineering) {
		_Civil_Engineering = Civil_Engineering;
	}

	@JSON
	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Skillset.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Skillset toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Skillset)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		SkillsetImpl skillsetImpl = new SkillsetImpl();

		skillsetImpl.setStudentID(getStudentID());
		skillsetImpl.setProject_Management(getProject_Management());
		skillsetImpl.setTechnical_Writing(getTechnical_Writing());
		skillsetImpl.setOral_Presentation(getOral_Presentation());
		skillsetImpl.setThermo_Fluids(getThermo_Fluids());
		skillsetImpl.setData_Analysis(getData_Analysis());
		skillsetImpl.setLeadership(getLeadership());
		skillsetImpl.setAutomation(getAutomation());
		skillsetImpl.setMechanical_Design(getMechanical_Design());
		skillsetImpl.setFabrication_Welding(getFabrication_Welding());
		skillsetImpl.setMachining_CNC(getMachining_CNC());
		skillsetImpl.setHeat_Transfer(getHeat_Transfer());
		skillsetImpl.setElectronics(getElectronics());
		skillsetImpl.setMicrocontrollers(getMicrocontrollers());
		skillsetImpl.setGUI_and_Programming(getGUI_and_Programming());
		skillsetImpl.setLabView(getLabView());
		skillsetImpl.setEmbedded_Systems(getEmbedded_Systems());
		skillsetImpl.setCADD(getCADD());
		skillsetImpl.setFEA(getFEA());
		skillsetImpl.setCivil_Engineering(getCivil_Engineering());
		skillsetImpl.setDateAdded(getDateAdded());

		skillsetImpl.resetOriginalValues();

		return skillsetImpl;
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

		Skillset skillset = null;

		try {
			skillset = (Skillset)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Skillset> toCacheModel() {
		SkillsetCacheModel skillsetCacheModel = new SkillsetCacheModel();

		skillsetCacheModel.studentID = getStudentID();

		skillsetCacheModel.Project_Management = getProject_Management();

		String Project_Management = skillsetCacheModel.Project_Management;

		if ((Project_Management != null) && (Project_Management.length() == 0)) {
			skillsetCacheModel.Project_Management = null;
		}

		skillsetCacheModel.Technical_Writing = getTechnical_Writing();

		String Technical_Writing = skillsetCacheModel.Technical_Writing;

		if ((Technical_Writing != null) && (Technical_Writing.length() == 0)) {
			skillsetCacheModel.Technical_Writing = null;
		}

		skillsetCacheModel.Oral_Presentation = getOral_Presentation();

		String Oral_Presentation = skillsetCacheModel.Oral_Presentation;

		if ((Oral_Presentation != null) && (Oral_Presentation.length() == 0)) {
			skillsetCacheModel.Oral_Presentation = null;
		}

		skillsetCacheModel.Thermo_Fluids = getThermo_Fluids();

		String Thermo_Fluids = skillsetCacheModel.Thermo_Fluids;

		if ((Thermo_Fluids != null) && (Thermo_Fluids.length() == 0)) {
			skillsetCacheModel.Thermo_Fluids = null;
		}

		skillsetCacheModel.Data_Analysis = getData_Analysis();

		String Data_Analysis = skillsetCacheModel.Data_Analysis;

		if ((Data_Analysis != null) && (Data_Analysis.length() == 0)) {
			skillsetCacheModel.Data_Analysis = null;
		}

		skillsetCacheModel.Leadership = getLeadership();

		String Leadership = skillsetCacheModel.Leadership;

		if ((Leadership != null) && (Leadership.length() == 0)) {
			skillsetCacheModel.Leadership = null;
		}

		skillsetCacheModel.Automation = getAutomation();

		String Automation = skillsetCacheModel.Automation;

		if ((Automation != null) && (Automation.length() == 0)) {
			skillsetCacheModel.Automation = null;
		}

		skillsetCacheModel.Mechanical_Design = getMechanical_Design();

		String Mechanical_Design = skillsetCacheModel.Mechanical_Design;

		if ((Mechanical_Design != null) && (Mechanical_Design.length() == 0)) {
			skillsetCacheModel.Mechanical_Design = null;
		}

		skillsetCacheModel.Fabrication_Welding = getFabrication_Welding();

		String Fabrication_Welding = skillsetCacheModel.Fabrication_Welding;

		if ((Fabrication_Welding != null) &&
				(Fabrication_Welding.length() == 0)) {
			skillsetCacheModel.Fabrication_Welding = null;
		}

		skillsetCacheModel.Machining_CNC = getMachining_CNC();

		String Machining_CNC = skillsetCacheModel.Machining_CNC;

		if ((Machining_CNC != null) && (Machining_CNC.length() == 0)) {
			skillsetCacheModel.Machining_CNC = null;
		}

		skillsetCacheModel.Heat_Transfer = getHeat_Transfer();

		String Heat_Transfer = skillsetCacheModel.Heat_Transfer;

		if ((Heat_Transfer != null) && (Heat_Transfer.length() == 0)) {
			skillsetCacheModel.Heat_Transfer = null;
		}

		skillsetCacheModel.Electronics = getElectronics();

		String Electronics = skillsetCacheModel.Electronics;

		if ((Electronics != null) && (Electronics.length() == 0)) {
			skillsetCacheModel.Electronics = null;
		}

		skillsetCacheModel.Microcontrollers = getMicrocontrollers();

		String Microcontrollers = skillsetCacheModel.Microcontrollers;

		if ((Microcontrollers != null) && (Microcontrollers.length() == 0)) {
			skillsetCacheModel.Microcontrollers = null;
		}

		skillsetCacheModel.GUI_and_Programming = getGUI_and_Programming();

		String GUI_and_Programming = skillsetCacheModel.GUI_and_Programming;

		if ((GUI_and_Programming != null) &&
				(GUI_and_Programming.length() == 0)) {
			skillsetCacheModel.GUI_and_Programming = null;
		}

		skillsetCacheModel.LabView = getLabView();

		String LabView = skillsetCacheModel.LabView;

		if ((LabView != null) && (LabView.length() == 0)) {
			skillsetCacheModel.LabView = null;
		}

		skillsetCacheModel.Embedded_Systems = getEmbedded_Systems();

		String Embedded_Systems = skillsetCacheModel.Embedded_Systems;

		if ((Embedded_Systems != null) && (Embedded_Systems.length() == 0)) {
			skillsetCacheModel.Embedded_Systems = null;
		}

		skillsetCacheModel.CADD = getCADD();

		String CADD = skillsetCacheModel.CADD;

		if ((CADD != null) && (CADD.length() == 0)) {
			skillsetCacheModel.CADD = null;
		}

		skillsetCacheModel.FEA = getFEA();

		String FEA = skillsetCacheModel.FEA;

		if ((FEA != null) && (FEA.length() == 0)) {
			skillsetCacheModel.FEA = null;
		}

		skillsetCacheModel.Civil_Engineering = getCivil_Engineering();

		String Civil_Engineering = skillsetCacheModel.Civil_Engineering;

		if ((Civil_Engineering != null) && (Civil_Engineering.length() == 0)) {
			skillsetCacheModel.Civil_Engineering = null;
		}

		Date dateAdded = getDateAdded();

		if (dateAdded != null) {
			skillsetCacheModel.dateAdded = dateAdded.getTime();
		}
		else {
			skillsetCacheModel.dateAdded = Long.MIN_VALUE;
		}

		return skillsetCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{studentID=");
		sb.append(getStudentID());
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
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("com.test.model.Skillset");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentID</column-name><column-value><![CDATA[");
		sb.append(getStudentID());
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

	private static ClassLoader _classLoader = Skillset.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Skillset.class
		};
	private long _studentID;
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
	private Skillset _escapedModelProxy;
}