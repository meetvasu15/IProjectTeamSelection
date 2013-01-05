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

import com.asu.iproject.student.skillset.service.SkillsetLocalServiceUtil;

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
 * @author zhengyan
 */
public class SkillsetClp extends BaseModelImpl<Skillset> implements Skillset {
	public SkillsetClp() {
	}

	public Class<?> getModelClass() {
		return Skillset.class;
	}

	public String getModelClassName() {
		return Skillset.class.getName();
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
		attributes.put("asuid", getAsuid());
		attributes.put("email", getEmail());
		attributes.put("skill1", getSkill1());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentID = (Long)attributes.get("studentID");

		if (studentID != null) {
			setStudentID(studentID);
		}

		String asuid = (String)attributes.get("asuid");

		if (asuid != null) {
			setAsuid(asuid);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String skill1 = (String)attributes.get("skill1");

		if (skill1 != null) {
			setSkill1(skill1);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}
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

	public BaseModel<?> getSkillsetRemoteModel() {
		return _skillsetRemoteModel;
	}

	public void setSkillsetRemoteModel(BaseModel<?> skillsetRemoteModel) {
		_skillsetRemoteModel = skillsetRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			SkillsetLocalServiceUtil.addSkillset(this);
		}
		else {
			SkillsetLocalServiceUtil.updateSkillset(this);
		}
	}

	@Override
	public Skillset toEscapedModel() {
		return (Skillset)Proxy.newProxyInstance(Skillset.class.getClassLoader(),
			new Class[] { Skillset.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SkillsetClp clone = new SkillsetClp();

		clone.setStudentID(getStudentID());
		clone.setAsuid(getAsuid());
		clone.setEmail(getEmail());
		clone.setSkill1(getSkill1());
		clone.setDateAdded(getDateAdded());

		return clone;
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

		SkillsetClp skillset = null;

		try {
			skillset = (SkillsetClp)obj;
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
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{studentID=");
		sb.append(getStudentID());
		sb.append(", asuid=");
		sb.append(getAsuid());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", skill1=");
		sb.append(getSkill1());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.asu.iproject.student.skillset.model.Skillset");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentID</column-name><column-value><![CDATA[");
		sb.append(getStudentID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asuid</column-name><column-value><![CDATA[");
		sb.append(getAsuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>skill1</column-name><column-value><![CDATA[");
		sb.append(getSkill1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _studentID;
	private String _asuid;
	private String _email;
	private String _skill1;
	private Date _dateAdded;
	private BaseModel<?> _skillsetRemoteModel;
}