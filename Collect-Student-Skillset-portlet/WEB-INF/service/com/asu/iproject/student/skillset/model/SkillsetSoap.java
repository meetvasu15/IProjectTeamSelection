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

package com.asu.iproject.student.skillset.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    zhengyan
 * @generated
 */
public class SkillsetSoap implements Serializable {
	public static SkillsetSoap toSoapModel(Skillset model) {
		SkillsetSoap soapModel = new SkillsetSoap();

		soapModel.setStudentID(model.getStudentID());
		soapModel.setAsuid(model.getAsuid());
		soapModel.setEmail(model.getEmail());
		soapModel.setSkill1(model.getSkill1());
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

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getSkill1() {
		return _skill1;
	}

	public void setSkill1(String skill1) {
		_skill1 = skill1;
	}

	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	private long _studentID;
	private String _asuid;
	private String _email;
	private String _skill1;
	private Date _dateAdded;
}