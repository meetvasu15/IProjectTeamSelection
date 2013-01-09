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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.asu.poly.teams.manualSelect.slayer.service.http.StudentServiceSoap}.
 *
 * @author    asingh64
 * @see       com.asu.poly.teams.manualSelect.slayer.service.http.StudentServiceSoap
 * @generated
 */
public class StudentSoap implements Serializable {
	public static StudentSoap toSoapModel(Student model) {
		StudentSoap soapModel = new StudentSoap();

		soapModel.setStudentID(model.getStudentID());
		soapModel.setAsuid(model.getAsuid());
		soapModel.setStudentName(model.getStudentName());
		soapModel.setLevel(model.getLevel());
		soapModel.setCourse(model.getCourse());
		soapModel.setGpa(model.getGpa());
		soapModel.setSex(model.getSex());
		soapModel.setDateAdded(model.getDateAdded());
		soapModel.setDateModified(model.getDateModified());

		return soapModel;
	}

	public static StudentSoap[] toSoapModels(Student[] models) {
		StudentSoap[] soapModels = new StudentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StudentSoap[][] toSoapModels(Student[][] models) {
		StudentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StudentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StudentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StudentSoap[] toSoapModels(List<Student> models) {
		List<StudentSoap> soapModels = new ArrayList<StudentSoap>(models.size());

		for (Student model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StudentSoap[soapModels.size()]);
	}

	public StudentSoap() {
	}

	public long getPrimaryKey() {
		return _studentID;
	}

	public void setPrimaryKey(long pk) {
		setStudentID(pk);
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

	private long _studentID;
	private String _asuid;
	private String _studentName;
	private String _level;
	private String _course;
	private String _gpa;
	private String _sex;
	private Date _dateAdded;
	private Date _dateModified;
}