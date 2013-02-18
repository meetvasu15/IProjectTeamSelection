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

package com.poly.asu.student.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.poly.asu.student.service.http.studentgeninfoServiceSoap}.
 *
 * @author    Shruthi
 * @see       com.poly.asu.student.service.http.studentgeninfoServiceSoap
 * @generated
 */
public class studentgeninfoSoap implements Serializable {
	public static studentgeninfoSoap toSoapModel(studentgeninfo model) {
		studentgeninfoSoap soapModel = new studentgeninfoSoap();

		soapModel.setStudentgeninfoid(model.getStudentgeninfoid());
		soapModel.setName(model.getName());
		soapModel.setAsuid(model.getAsuid());
		soapModel.setDepartment(model.getDepartment());
		soapModel.setLevel(model.getLevel());
		soapModel.setCummulativegpa(model.getCummulativegpa());
		soapModel.setLoggedinuserId(model.getLoggedinuserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static studentgeninfoSoap[] toSoapModels(studentgeninfo[] models) {
		studentgeninfoSoap[] soapModels = new studentgeninfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static studentgeninfoSoap[][] toSoapModels(studentgeninfo[][] models) {
		studentgeninfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new studentgeninfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new studentgeninfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static studentgeninfoSoap[] toSoapModels(List<studentgeninfo> models) {
		List<studentgeninfoSoap> soapModels = new ArrayList<studentgeninfoSoap>(models.size());

		for (studentgeninfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new studentgeninfoSoap[soapModels.size()]);
	}

	public studentgeninfoSoap() {
	}

	public long getPrimaryKey() {
		return _studentgeninfoid;
	}

	public void setPrimaryKey(long pk) {
		setStudentgeninfoid(pk);
	}

	public long getStudentgeninfoid() {
		return _studentgeninfoid;
	}

	public void setStudentgeninfoid(long studentgeninfoid) {
		_studentgeninfoid = studentgeninfoid;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getAsuid() {
		return _asuid;
	}

	public void setAsuid(long asuid) {
		_asuid = asuid;
	}

	public String getDepartment() {
		return _department;
	}

	public void setDepartment(String department) {
		_department = department;
	}

	public long getLevel() {
		return _level;
	}

	public void setLevel(long level) {
		_level = level;
	}

	public float getCummulativegpa() {
		return _cummulativegpa;
	}

	public void setCummulativegpa(float cummulativegpa) {
		_cummulativegpa = cummulativegpa;
	}

	public long getLoggedinuserId() {
		return _loggedinuserId;
	}

	public void setLoggedinuserId(long loggedinuserId) {
		_loggedinuserId = loggedinuserId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _studentgeninfoid;
	private String _name;
	private long _asuid;
	private String _department;
	private long _level;
	private float _cummulativegpa;
	private long _loggedinuserId;
	private Date _createDate;
	private Date _modifiedDate;
}