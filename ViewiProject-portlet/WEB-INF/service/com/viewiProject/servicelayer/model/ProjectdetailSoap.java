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

package com.viewiProject.servicelayer.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.viewiProject.servicelayer.service.http.ProjectdetailServiceSoap}.
 *
 * @author    Shruthi
 * @see       com.viewiProject.servicelayer.service.http.ProjectdetailServiceSoap
 * @generated
 */
public class ProjectdetailSoap implements Serializable {
	public static ProjectdetailSoap toSoapModel(Projectdetail model) {
		ProjectdetailSoap soapModel = new ProjectdetailSoap();

		soapModel.setProjectId(model.getProjectId());
		soapModel.setProjectTitle(model.getProjectTitle());
		soapModel.setProjectdescription(model.getProjectdescription());
		soapModel.setProjectrequiredskill(model.getProjectrequiredskill());
		soapModel.setContact(model.getContact());
		soapModel.setDateAdded(model.getDateAdded());

		return soapModel;
	}

	public static ProjectdetailSoap[] toSoapModels(Projectdetail[] models) {
		ProjectdetailSoap[] soapModels = new ProjectdetailSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProjectdetailSoap[][] toSoapModels(Projectdetail[][] models) {
		ProjectdetailSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProjectdetailSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProjectdetailSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProjectdetailSoap[] toSoapModels(List<Projectdetail> models) {
		List<ProjectdetailSoap> soapModels = new ArrayList<ProjectdetailSoap>(models.size());

		for (Projectdetail model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProjectdetailSoap[soapModels.size()]);
	}

	public ProjectdetailSoap() {
	}

	public long getPrimaryKey() {
		return _projectId;
	}

	public void setPrimaryKey(long pk) {
		setProjectId(pk);
	}

	public long getProjectId() {
		return _projectId;
	}

	public void setProjectId(long projectId) {
		_projectId = projectId;
	}

	public String getProjectTitle() {
		return _projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		_projectTitle = projectTitle;
	}

	public String getProjectdescription() {
		return _projectdescription;
	}

	public void setProjectdescription(String projectdescription) {
		_projectdescription = projectdescription;
	}

	public String getProjectrequiredskill() {
		return _projectrequiredskill;
	}

	public void setProjectrequiredskill(String projectrequiredskill) {
		_projectrequiredskill = projectrequiredskill;
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

	private long _projectId;
	private String _projectTitle;
	private String _projectdescription;
	private String _projectrequiredskill;
	private String _contact;
	private Date _dateAdded;
}