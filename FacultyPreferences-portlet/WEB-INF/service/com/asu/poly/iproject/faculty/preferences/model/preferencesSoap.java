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

package com.asu.poly.iproject.faculty.preferences.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.asu.poly.iproject.faculty.preferences.service.http.preferencesServiceSoap}.
 *
 * @author    emente
 * @see       com.asu.poly.iproject.faculty.preferences.service.http.preferencesServiceSoap
 * @generated
 */
public class preferencesSoap implements Serializable {
	public static preferencesSoap toSoapModel(preferences model) {
		preferencesSoap soapModel = new preferencesSoap();

		soapModel.setFacultyID(model.getFacultyID());
		soapModel.setASUID(model.getASUID());
		soapModel.setPreference1(model.getPreference1());
		soapModel.setPreference2(model.getPreference2());
		soapModel.setPreference3(model.getPreference3());
		soapModel.setDateAdded(model.getDateAdded());
		soapModel.setDateModified(model.getDateModified());

		return soapModel;
	}

	public static preferencesSoap[] toSoapModels(preferences[] models) {
		preferencesSoap[] soapModels = new preferencesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static preferencesSoap[][] toSoapModels(preferences[][] models) {
		preferencesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new preferencesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new preferencesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static preferencesSoap[] toSoapModels(List<preferences> models) {
		List<preferencesSoap> soapModels = new ArrayList<preferencesSoap>(models.size());

		for (preferences model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new preferencesSoap[soapModels.size()]);
	}

	public preferencesSoap() {
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

	public String getASUID() {
		return _ASUID;
	}

	public void setASUID(String ASUID) {
		_ASUID = ASUID;
	}

	public String getPreference1() {
		return _preference1;
	}

	public void setPreference1(String preference1) {
		_preference1 = preference1;
	}

	public String getPreference2() {
		return _preference2;
	}

	public void setPreference2(String preference2) {
		_preference2 = preference2;
	}

	public String getPreference3() {
		return _preference3;
	}

	public void setPreference3(String preference3) {
		_preference3 = preference3;
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
	private String _ASUID;
	private String _preference1;
	private String _preference2;
	private String _preference3;
	private Date _dateAdded;
	private Date _dateModified;
}