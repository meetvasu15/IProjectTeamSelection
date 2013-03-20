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

import com.asu.poly.teams.manualSelect.slayer.service.FacultyLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Eshwari
 */
public class FacultyClp extends BaseModelImpl<Faculty> implements Faculty {
	public FacultyClp() {
	}

	public Class<?> getModelClass() {
		return Faculty.class;
	}

	public String getModelClassName() {
		return Faculty.class.getName();
	}

	public long getPrimaryKey() {
		return _facultyID;
	}

	public void setPrimaryKey(long primaryKey) {
		setFacultyID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_facultyID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("facultyID", getFacultyID());
		attributes.put("asuid", getAsuid());
		attributes.put("facultyName", getFacultyName());
		attributes.put("facultyDept", getFacultyDept());
		attributes.put("contact", getContact());
		attributes.put("dateAdded", getDateAdded());
		attributes.put("dateModified", getDateModified());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long facultyID = (Long)attributes.get("facultyID");

		if (facultyID != null) {
			setFacultyID(facultyID);
		}

		String asuid = (String)attributes.get("asuid");

		if (asuid != null) {
			setAsuid(asuid);
		}

		String facultyName = (String)attributes.get("facultyName");

		if (facultyName != null) {
			setFacultyName(facultyName);
		}

		String facultyDept = (String)attributes.get("facultyDept");

		if (facultyDept != null) {
			setFacultyDept(facultyDept);
		}

		String contact = (String)attributes.get("contact");

		if (contact != null) {
			setContact(contact);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}

		Date dateModified = (Date)attributes.get("dateModified");

		if (dateModified != null) {
			setDateModified(dateModified);
		}
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

	public BaseModel<?> getFacultyRemoteModel() {
		return _facultyRemoteModel;
	}

	public void setFacultyRemoteModel(BaseModel<?> facultyRemoteModel) {
		_facultyRemoteModel = facultyRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			FacultyLocalServiceUtil.addFaculty(this);
		}
		else {
			FacultyLocalServiceUtil.updateFaculty(this);
		}
	}

	@Override
	public Faculty toEscapedModel() {
		return (Faculty)Proxy.newProxyInstance(Faculty.class.getClassLoader(),
			new Class[] { Faculty.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FacultyClp clone = new FacultyClp();

		clone.setFacultyID(getFacultyID());
		clone.setAsuid(getAsuid());
		clone.setFacultyName(getFacultyName());
		clone.setFacultyDept(getFacultyDept());
		clone.setContact(getContact());
		clone.setDateAdded(getDateAdded());
		clone.setDateModified(getDateModified());

		return clone;
	}

	public int compareTo(Faculty faculty) {
		long primaryKey = faculty.getPrimaryKey();

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

		FacultyClp faculty = null;

		try {
			faculty = (FacultyClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = faculty.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{facultyID=");
		sb.append(getFacultyID());
		sb.append(", asuid=");
		sb.append(getAsuid());
		sb.append(", facultyName=");
		sb.append(getFacultyName());
		sb.append(", facultyDept=");
		sb.append(getFacultyDept());
		sb.append(", contact=");
		sb.append(getContact());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append(", dateModified=");
		sb.append(getDateModified());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.asu.poly.teams.manualSelect.slayer.model.Faculty");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>facultyID</column-name><column-value><![CDATA[");
		sb.append(getFacultyID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asuid</column-name><column-value><![CDATA[");
		sb.append(getAsuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facultyName</column-name><column-value><![CDATA[");
		sb.append(getFacultyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facultyDept</column-name><column-value><![CDATA[");
		sb.append(getFacultyDept());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contact</column-name><column-value><![CDATA[");
		sb.append(getContact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateModified</column-name><column-value><![CDATA[");
		sb.append(getDateModified());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _facultyID;
	private String _asuid;
	private String _facultyName;
	private String _facultyDept;
	private String _contact;
	private Date _dateAdded;
	private Date _dateModified;
	private BaseModel<?> _facultyRemoteModel;
}