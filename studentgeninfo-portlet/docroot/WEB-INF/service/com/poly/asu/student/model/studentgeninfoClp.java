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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.poly.asu.student.service.studentgeninfoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Shruthi
 */
public class studentgeninfoClp extends BaseModelImpl<studentgeninfo>
	implements studentgeninfo {
	public studentgeninfoClp() {
	}

	public Class<?> getModelClass() {
		return studentgeninfo.class;
	}

	public String getModelClassName() {
		return studentgeninfo.class.getName();
	}

	public long getPrimaryKey() {
		return _studentgeninfoid;
	}

	public void setPrimaryKey(long primaryKey) {
		setStudentgeninfoid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_studentgeninfoid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentgeninfoid", getStudentgeninfoid());
		attributes.put("name", getName());
		attributes.put("asuid", getAsuid());
		attributes.put("department", getDepartment());
		attributes.put("level", getLevel());
		attributes.put("cummulativegpa", getCummulativegpa());
		attributes.put("loggedinuserId", getLoggedinuserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentgeninfoid = (Long)attributes.get("studentgeninfoid");

		if (studentgeninfoid != null) {
			setStudentgeninfoid(studentgeninfoid);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long asuid = (Long)attributes.get("asuid");

		if (asuid != null) {
			setAsuid(asuid);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		Long level = (Long)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		Float cummulativegpa = (Float)attributes.get("cummulativegpa");

		if (cummulativegpa != null) {
			setCummulativegpa(cummulativegpa);
		}

		Long loggedinuserId = (Long)attributes.get("loggedinuserId");

		if (loggedinuserId != null) {
			setLoggedinuserId(loggedinuserId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
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

	public BaseModel<?> getstudentgeninfoRemoteModel() {
		return _studentgeninfoRemoteModel;
	}

	public void setstudentgeninfoRemoteModel(
		BaseModel<?> studentgeninfoRemoteModel) {
		_studentgeninfoRemoteModel = studentgeninfoRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			studentgeninfoLocalServiceUtil.addstudentgeninfo(this);
		}
		else {
			studentgeninfoLocalServiceUtil.updatestudentgeninfo(this);
		}
	}

	@Override
	public studentgeninfo toEscapedModel() {
		return (studentgeninfo)Proxy.newProxyInstance(studentgeninfo.class.getClassLoader(),
			new Class[] { studentgeninfo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		studentgeninfoClp clone = new studentgeninfoClp();

		clone.setStudentgeninfoid(getStudentgeninfoid());
		clone.setName(getName());
		clone.setAsuid(getAsuid());
		clone.setDepartment(getDepartment());
		clone.setLevel(getLevel());
		clone.setCummulativegpa(getCummulativegpa());
		clone.setLoggedinuserId(getLoggedinuserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	public int compareTo(studentgeninfo studentgeninfo) {
		long primaryKey = studentgeninfo.getPrimaryKey();

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

		studentgeninfoClp studentgeninfo = null;

		try {
			studentgeninfo = (studentgeninfoClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = studentgeninfo.getPrimaryKey();

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

		sb.append("{studentgeninfoid=");
		sb.append(getStudentgeninfoid());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", asuid=");
		sb.append(getAsuid());
		sb.append(", department=");
		sb.append(getDepartment());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", cummulativegpa=");
		sb.append(getCummulativegpa());
		sb.append(", loggedinuserId=");
		sb.append(getLoggedinuserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.poly.asu.student.model.studentgeninfo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentgeninfoid</column-name><column-value><![CDATA[");
		sb.append(getStudentgeninfoid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asuid</column-name><column-value><![CDATA[");
		sb.append(getAsuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>department</column-name><column-value><![CDATA[");
		sb.append(getDepartment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cummulativegpa</column-name><column-value><![CDATA[");
		sb.append(getCummulativegpa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loggedinuserId</column-name><column-value><![CDATA[");
		sb.append(getLoggedinuserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _studentgeninfoRemoteModel;
}