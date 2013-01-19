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
 * This class is used by SOAP remote services, specifically {@link com.asu.poly.iproject.faculty.preferences.service.http.ProjectdetailServiceSoap}.
 *
 * @author    emente
 * @see       com.asu.poly.iproject.faculty.preferences.service.http.ProjectdetailServiceSoap
 * @generated
 */
public class ProjectdetailSoap implements Serializable {
	public static ProjectdetailSoap toSoapModel(Projectdetail model) {
		ProjectdetailSoap soapModel = new ProjectdetailSoap();

		soapModel.setProjectID(model.getProjectID());
		soapModel.setProjectTitle(model.getProjectTitle());
		soapModel.setDateAdded(model.getDateAdded());
		soapModel.setDateModified(model.getDateModified());

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
		return _projectID;
	}

	public void setPrimaryKey(long pk) {
		setProjectID(pk);
	}

	public long getProjectID() {
		return _projectID;
	}

	public void setProjectID(long projectID) {
		_projectID = projectID;
	}

	public String getProjectTitle() {
		return _projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		_projectTitle = projectTitle;
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

	private long _projectID;
	private String _projectTitle;
	private Date _dateAdded;
	private Date _dateModified;
}