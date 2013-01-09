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

package com.asu.poly.teams.randomCreate.slayer.model;

import com.asu.poly.teams.randomCreate.slayer.service.StudentLocalServiceUtil;

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
public class StudentClp extends BaseModelImpl<Student> implements Student {
	public StudentClp() {
	}

	public Class<?> getModelClass() {
		return Student.class;
	}

	public String getModelClassName() {
		return Student.class.getName();
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
		attributes.put("studentName", getStudentName());
		attributes.put("level", getLevel());
		attributes.put("course", getCourse());
		attributes.put("gpa", getGpa());
		attributes.put("sex", getSex());
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

		String asuid = (String)attributes.get("asuid");

		if (asuid != null) {
			setAsuid(asuid);
		}

		String studentName = (String)attributes.get("studentName");

		if (studentName != null) {
			setStudentName(studentName);
		}

		String level = (String)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String course = (String)attributes.get("course");

		if (course != null) {
			setCourse(course);
		}

		String gpa = (String)attributes.get("gpa");

		if (gpa != null) {
			setGpa(gpa);
		}

		String sex = (String)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
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

	public String getAsuid() {
		return _asuid;
	}

	public void setAsuid(String asuid) {
		_asuid = asuid;
	}

	public String getStudentName() {
		return _studentName;
	}

	public void setStudentName(String studentName) {
		_studentName = studentName;
	}

	public String getLevel() {
		return _level;
	}

	public void setLevel(String level) {
		_level = level;
	}

	public String getCourse() {
		return _course;
	}

	public void setCourse(String course) {
		_course = course;
	}

	public String getGpa() {
		return _gpa;
	}

	public void setGpa(String gpa) {
		_gpa = gpa;
	}

	public String getSex() {
		return _sex;
	}

	public void setSex(String sex) {
		_sex = sex;
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

	public BaseModel<?> getStudentRemoteModel() {
		return _studentRemoteModel;
	}

	public void setStudentRemoteModel(BaseModel<?> studentRemoteModel) {
		_studentRemoteModel = studentRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			StudentLocalServiceUtil.addStudent(this);
		}
		else {
			StudentLocalServiceUtil.updateStudent(this);
		}
	}

	@Override
	public Student toEscapedModel() {
		return (Student)Proxy.newProxyInstance(Student.class.getClassLoader(),
			new Class[] { Student.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StudentClp clone = new StudentClp();

		clone.setStudentID(getStudentID());
		clone.setAsuid(getAsuid());
		clone.setStudentName(getStudentName());
		clone.setLevel(getLevel());
		clone.setCourse(getCourse());
		clone.setGpa(getGpa());
		clone.setSex(getSex());
		clone.setDateAdded(getDateAdded());
		clone.setDateModified(getDateModified());

		return clone;
	}

	public int compareTo(Student student) {
		long primaryKey = student.getPrimaryKey();

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

		StudentClp student = null;

		try {
			student = (StudentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = student.getPrimaryKey();

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
		sb.append(", asuid=");
		sb.append(getAsuid());
		sb.append(", studentName=");
		sb.append(getStudentName());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", course=");
		sb.append(getCourse());
		sb.append(", gpa=");
		sb.append(getGpa());
		sb.append(", sex=");
		sb.append(getSex());
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
		sb.append("com.asu.poly.teams.randomCreate.slayer.model.Student");
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
			"<column><column-name>studentName</column-name><column-value><![CDATA[");
		sb.append(getStudentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>course</column-name><column-value><![CDATA[");
		sb.append(getCourse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpa</column-name><column-value><![CDATA[");
		sb.append(getGpa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sex</column-name><column-value><![CDATA[");
		sb.append(getSex());
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
	private String _asuid;
	private String _studentName;
	private String _level;
	private String _course;
	private String _gpa;
	private String _sex;
	private Date _dateAdded;
	private Date _dateModified;
	private BaseModel<?> _studentRemoteModel;
}