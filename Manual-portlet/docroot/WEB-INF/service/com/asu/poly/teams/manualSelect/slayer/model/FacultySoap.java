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
 * This class is used by SOAP remote services, specifically {@link com.asu.poly.teams.manualSelect.slayer.service.http.FacultyServiceSoap}.
 *
 * @author    Eshwari
 * @see       com.asu.poly.teams.manualSelect.slayer.service.http.FacultyServiceSoap
 * @generated
 */
public class FacultySoap implements Serializable {
	public static FacultySoap toSoapModel(Faculty model) {
		FacultySoap soapModel = new FacultySoap();

		soapModel.setFacultyID(model.getFacultyID());
		soapModel.setAsuid(model.getAsuid());
		soapModel.setFacultyName(model.getFacultyName());
		soapModel.setFacultyDept(model.getFacultyDept());
		soapModel.setContact(model.getContact());
		soapModel.setDateAdded(model.getDateAdded());
		soapModel.setDateModified(model.getDateModified());

		return soapModel;
	}

	public static FacultySoap[] toSoapModels(Faculty[] models) {
		FacultySoap[] soapModels = new FacultySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FacultySoap[][] toSoapModels(Faculty[][] models) {
		FacultySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FacultySoap[models.length][models[0].length];
		}
		else {
			soapModels = new FacultySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FacultySoap[] toSoapModels(List<Faculty> models) {
		List<FacultySoap> soapModels = new ArrayList<FacultySoap>(models.size());

		for (Faculty model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FacultySoap[soapModels.size()]);
	}

	public FacultySoap() {
	}

	public long getPrimaryKey() {
		return _facultyID;
	}

	public void setPrimaryKey(long pk) {
		setFacultyID(pk);
	}

	public long getFacultyID() {
		return _facultyID;
	}

	public void setFacultyID(long facultyID) {
		_facultyID = facultyID;
	}

	public String getAsuid() {
		return _asuid;
	}

	public void setAsuid(String asuid) {
		_asuid = asuid;
	}

	public String getFacultyName() {
		return _facultyName;
	}

	public void setFacultyName(String facultyName) {
		_facultyName = facultyName;
	}

	public String getFacultyDept() {
		return _facultyDept;
	}

	public void setFacultyDept(String facultyDept) {
		_facultyDept = facultyDept;
	}

	public String getContact() {
		return _contact;
	}

	public void setContact(String contact) {
		_contact = contact;
	}

	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	public Date getDateModified() {
		return _dateModified;
	}

	public void setDateModified(Date dateModified) {
		_dateModified = dateModified;
	}

	private long _facultyID;
	private String _asuid;
	private String _facultyName;
	private String _facultyDept;
	private String _contact;
	private Date _dateAdded;
	private Date _dateModified;
}