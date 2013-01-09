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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author    asingh64
 * @see       Student
 * @generated
 */
public class StudentWrapper implements Student, ModelWrapper<Student> {
	public StudentWrapper(Student student) {
		_student = student;
	}

	public Class<?> getModelClass() {
		return Student.class;
	}

	public String getModelClassName() {
		return Student.class.getName();
	}

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

	/**
	* Returns the primary key of this student.
	*
	* @return the primary key of this student
	*/
	public long getPrimaryKey() {
		return _student.getPrimaryKey();
	}

	/**
	* Sets the primary key of this student.
	*
	* @param primaryKey the primary key of this student
	*/
	public void setPrimaryKey(long primaryKey) {
		_student.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the student i d of this student.
	*
	* @return the student i d of this student
	*/
	public long getStudentID() {
		return _student.getStudentID();
	}

	/**
	* Sets the student i d of this student.
	*
	* @param studentID the student i d of this student
	*/
	public void setStudentID(long studentID) {
		_student.setStudentID(studentID);
	}

	/**
	* Returns the asuid of this student.
	*
	* @return the asuid of this student
	*/
	public java.lang.String getAsuid() {
		return _student.getAsuid();
	}

	/**
	* Sets the asuid of this student.
	*
	* @param asuid the asuid of this student
	*/
	public void setAsuid(java.lang.String asuid) {
		_student.setAsuid(asuid);
	}

	/**
	* Returns the student name of this student.
	*
	* @return the student name of this student
	*/
	public java.lang.String getStudentName() {
		return _student.getStudentName();
	}

	/**
	* Sets the student name of this student.
	*
	* @param studentName the student name of this student
	*/
	public void setStudentName(java.lang.String studentName) {
		_student.setStudentName(studentName);
	}

	/**
	* Returns the level of this student.
	*
	* @return the level of this student
	*/
	public java.lang.String getLevel() {
		return _student.getLevel();
	}

	/**
	* Sets the level of this student.
	*
	* @param level the level of this student
	*/
	public void setLevel(java.lang.String level) {
		_student.setLevel(level);
	}

	/**
	* Returns the course of this student.
	*
	* @return the course of this student
	*/
	public java.lang.String getCourse() {
		return _student.getCourse();
	}

	/**
	* Sets the course of this student.
	*
	* @param course the course of this student
	*/
	public void setCourse(java.lang.String course) {
		_student.setCourse(course);
	}

	/**
	* Returns the gpa of this student.
	*
	* @return the gpa of this student
	*/
	public java.lang.String getGpa() {
		return _student.getGpa();
	}

	/**
	* Sets the gpa of this student.
	*
	* @param gpa the gpa of this student
	*/
	public void setGpa(java.lang.String gpa) {
		_student.setGpa(gpa);
	}

	/**
	* Returns the sex of this student.
	*
	* @return the sex of this student
	*/
	public java.lang.String getSex() {
		return _student.getSex();
	}

	/**
	* Sets the sex of this student.
	*
	* @param sex the sex of this student
	*/
	public void setSex(java.lang.String sex) {
		_student.setSex(sex);
	}

	/**
	* Returns the date added of this student.
	*
	* @return the date added of this student
	*/
	public java.util.Date getDateAdded() {
		return _student.getDateAdded();
	}

	/**
	* Sets the date added of this student.
	*
	* @param dateAdded the date added of this student
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_student.setDateAdded(dateAdded);
	}

	/**
	* Returns the date modified of this student.
	*
	* @return the date modified of this student
	*/
	public java.util.Date getDateModified() {
		return _student.getDateModified();
	}

	/**
	* Sets the date modified of this student.
	*
	* @param dateModified the date modified of this student
	*/
	public void setDateModified(java.util.Date dateModified) {
		_student.setDateModified(dateModified);
	}

	public boolean isNew() {
		return _student.isNew();
	}

	public void setNew(boolean n) {
		_student.setNew(n);
	}

	public boolean isCachedModel() {
		return _student.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_student.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _student.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _student.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_student.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _student.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_student.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StudentWrapper((Student)_student.clone());
	}

	public int compareTo(
		com.asu.poly.teams.randomCreate.slayer.model.Student student) {
		return _student.compareTo(student);
	}

	@Override
	public int hashCode() {
		return _student.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.asu.poly.teams.randomCreate.slayer.model.Student> toCacheModel() {
		return _student.toCacheModel();
	}

	public com.asu.poly.teams.randomCreate.slayer.model.Student toEscapedModel() {
		return new StudentWrapper(_student.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _student.toString();
	}

	public java.lang.String toXmlString() {
		return _student.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_student.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Student getWrappedStudent() {
		return _student;
	}

	public Student getWrappedModel() {
		return _student;
	}

	public void resetOriginalValues() {
		_student.resetOriginalValues();
	}

	private Student _student;
}