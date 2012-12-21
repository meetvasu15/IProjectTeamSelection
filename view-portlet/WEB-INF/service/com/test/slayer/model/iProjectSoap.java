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

package com.test.slayer.model;

import com.test.slayer.service.persistence.iProjectPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.test.slayer.service.http.iProjectServiceSoap}.
 *
 * @author    anshu
 * @see       com.test.slayer.service.http.iProjectServiceSoap
 * @generated
 */
public class iProjectSoap implements Serializable {
	public static iProjectSoap toSoapModel(iProject model) {
		iProjectSoap soapModel = new iProjectSoap();

		soapModel.setProjectID(model.getProjectID());
		soapModel.setProjectName(model.getProjectName());
		soapModel.setSkillset(model.getSkillset());
		soapModel.setDescription(model.getDescription());
		soapModel.setContact(model.getContact());
		soapModel.setDateAdded(model.getDateAdded());

		return soapModel;
	}

	public static iProjectSoap[] toSoapModels(iProject[] models) {
		iProjectSoap[] soapModels = new iProjectSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static iProjectSoap[][] toSoapModels(iProject[][] models) {
		iProjectSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new iProjectSoap[models.length][models[0].length];
		}
		else {
			soapModels = new iProjectSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static iProjectSoap[] toSoapModels(List<iProject> models) {
		List<iProjectSoap> soapModels = new ArrayList<iProjectSoap>(models.size());

		for (iProject model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new iProjectSoap[soapModels.size()]);
	}

	public iProjectSoap() {
	}

	public iProjectPK getPrimaryKey() {
		return new iProjectPK(_projectID, _projectName);
	}

	public void setPrimaryKey(iProjectPK pk) {
		setProjectID(pk.projectID);
		setProjectName(pk.projectName);
	}

	public long getProjectID() {
		return _projectID;
	}

	public void setProjectID(long projectID) {
		_projectID = projectID;
	}

	public String getProjectName() {
		return _projectName;
	}

	public void setProjectName(String projectName) {
		_projectName = projectName;
	}

	public String getSkillset() {
		return _skillset;
	}

	public void setSkillset(String skillset) {
		_skillset = skillset;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
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

	private long _projectID;
	private String _projectName;
	private String _skillset;
	private String _description;
	private String _contact;
	private Date _dateAdded;
}