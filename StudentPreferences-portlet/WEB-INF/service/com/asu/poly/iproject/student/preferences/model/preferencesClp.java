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

package com.asu.poly.iproject.student.preferences.model;

import com.asu.poly.iproject.student.preferences.service.preferencesLocalServiceUtil;

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
 * @author asingh64
 */
public class preferencesClp extends BaseModelImpl<preferences>
	implements preferences {
	public preferencesClp() {
	}

	public Class<?> getModelClass() {
		return preferences.class;
	}

	public String getModelClassName() {
		return preferences.class.getName();
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

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentID", getStudentID());
		attributes.put("ASUID", getASUID());
		attributes.put("preference1", getPreference1());
		attributes.put("preference2", getPreference2());
		attributes.put("preference3", getPreference3());
		attributes.put("preference4", getPreference4());
		attributes.put("preference5", getPreference5());
		attributes.put("dateAdded", getDateAdded());
		attributes.put("dateModified", getDateModified());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentID = (Long)attributes.get("studentID");

		if (studentID != null) {
			setStudentID(studentID);
		}

		String ASUID = (String)attributes.get("ASUID");

		if (ASUID != null) {
			setASUID(ASUID);
		}

		String preference1 = (String)attributes.get("preference1");

		if (preference1 != null) {
			setPreference1(preference1);
		}

		String preference2 = (String)attributes.get("preference2");

		if (preference2 != null) {
			setPreference2(preference2);
		}

		String preference3 = (String)attributes.get("preference3");

		if (preference3 != null) {
			setPreference3(preference3);
		}

		String preference4 = (String)attributes.get("preference4");

		if (preference4 != null) {
			setPreference4(preference4);
		}

		String preference5 = (String)attributes.get("preference5");

		if (preference5 != null) {
			setPreference5(preference5);
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

	public long getStudentID() {
		return _studentID;
	}

	public void setStudentID(long studentID) {
		_studentID = studentID;
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

	public String getPreference4() {
		return _preference4;
	}

	public void setPreference4(String preference4) {
		_preference4 = preference4;
	}

	public String getPreference5() {
		return _preference5;
	}

	public void setPreference5(String preference5) {
		_preference5 = preference5;
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

	public BaseModel<?> getpreferencesRemoteModel() {
		return _preferencesRemoteModel;
	}

	public void setpreferencesRemoteModel(BaseModel<?> preferencesRemoteModel) {
		_preferencesRemoteModel = preferencesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			preferencesLocalServiceUtil.addpreferences(this);
		}
		else {
			preferencesLocalServiceUtil.updatepreferences(this);
		}
	}

	@Override
	public preferences toEscapedModel() {
		return (preferences)Proxy.newProxyInstance(preferences.class.getClassLoader(),
			new Class[] { preferences.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		preferencesClp clone = new preferencesClp();

		clone.setStudentID(getStudentID());
		clone.setASUID(getASUID());
		clone.setPreference1(getPreference1());
		clone.setPreference2(getPreference2());
		clone.setPreference3(getPreference3());
		clone.setPreference4(getPreference4());
		clone.setPreference5(getPreference5());
		clone.setDateAdded(getDateAdded());
		clone.setDateModified(getDateModified());

		return clone;
	}

	public int compareTo(preferences preferences) {
		long primaryKey = preferences.getPrimaryKey();

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

		preferencesClp preferences = null;

		try {
			preferences = (preferencesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = preferences.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{studentID=");
		sb.append(getStudentID());
		sb.append(", ASUID=");
		sb.append(getASUID());
		sb.append(", preference1=");
		sb.append(getPreference1());
		sb.append(", preference2=");
		sb.append(getPreference2());
		sb.append(", preference3=");
		sb.append(getPreference3());
		sb.append(", preference4=");
		sb.append(getPreference4());
		sb.append(", preference5=");
		sb.append(getPreference5());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append(", dateModified=");
		sb.append(getDateModified());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.asu.poly.iproject.student.preferences.model.preferences");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentID</column-name><column-value><![CDATA[");
		sb.append(getStudentID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ASUID</column-name><column-value><![CDATA[");
		sb.append(getASUID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preference1</column-name><column-value><![CDATA[");
		sb.append(getPreference1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preference2</column-name><column-value><![CDATA[");
		sb.append(getPreference2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preference3</column-name><column-value><![CDATA[");
		sb.append(getPreference3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preference4</column-name><column-value><![CDATA[");
		sb.append(getPreference4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preference5</column-name><column-value><![CDATA[");
		sb.append(getPreference5());
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

	private long _studentID;
	private String _ASUID;
	private String _preference1;
	private String _preference2;
	private String _preference3;
	private String _preference4;
	private String _preference5;
	private Date _dateAdded;
	private Date _dateModified;
	private BaseModel<?> _preferencesRemoteModel;
}