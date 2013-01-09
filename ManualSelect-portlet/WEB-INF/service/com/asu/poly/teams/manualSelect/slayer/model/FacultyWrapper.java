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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Faculty}.
 * </p>
 *
 * @author    asingh64
 * @see       Faculty
 * @generated
 */
public class FacultyWrapper implements Faculty, ModelWrapper<Faculty> {
	public FacultyWrapper(Faculty faculty) {
		_faculty = faculty;
	}

	public Class<?> getModelClass() {
		return Faculty.class;
	}

	public String getModelClassName() {
		return Faculty.class.getName();
	}

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

	/**
	* Returns the primary key of this faculty.
	*
	* @return the primary key of this faculty
	*/
	public long getPrimaryKey() {
		return _faculty.getPrimaryKey();
	}

	/**
	* Sets the primary key of this faculty.
	*
	* @param primaryKey the primary key of this faculty
	*/
	public void setPrimaryKey(long primaryKey) {
		_faculty.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the faculty i d of this faculty.
	*
	* @return the faculty i d of this faculty
	*/
	public long getFacultyID() {
		return _faculty.getFacultyID();
	}

	/**
	* Sets the faculty i d of this faculty.
	*
	* @param facultyID the faculty i d of this faculty
	*/
	public void setFacultyID(long facultyID) {
		_faculty.setFacultyID(facultyID);
	}

	/**
	* Returns the asuid of this faculty.
	*
	* @return the asuid of this faculty
	*/
	public java.lang.String getAsuid() {
		return _faculty.getAsuid();
	}

	/**
	* Sets the asuid of this faculty.
	*
	* @param asuid the asuid of this faculty
	*/
	public void setAsuid(java.lang.String asuid) {
		_faculty.setAsuid(asuid);
	}

	/**
	* Returns the faculty name of this faculty.
	*
	* @return the faculty name of this faculty
	*/
	public java.lang.String getFacultyName() {
		return _faculty.getFacultyName();
	}

	/**
	* Sets the faculty name of this faculty.
	*
	* @param facultyName the faculty name of this faculty
	*/
	public void setFacultyName(java.lang.String facultyName) {
		_faculty.setFacultyName(facultyName);
	}

	/**
	* Returns the faculty dept of this faculty.
	*
	* @return the faculty dept of this faculty
	*/
	public java.lang.String getFacultyDept() {
		return _faculty.getFacultyDept();
	}

	/**
	* Sets the faculty dept of this faculty.
	*
	* @param facultyDept the faculty dept of this faculty
	*/
	public void setFacultyDept(java.lang.String facultyDept) {
		_faculty.setFacultyDept(facultyDept);
	}

	/**
	* Returns the contact of this faculty.
	*
	* @return the contact of this faculty
	*/
	public java.lang.String getContact() {
		return _faculty.getContact();
	}

	/**
	* Sets the contact of this faculty.
	*
	* @param contact the contact of this faculty
	*/
	public void setContact(java.lang.String contact) {
		_faculty.setContact(contact);
	}

	/**
	* Returns the date added of this faculty.
	*
	* @return the date added of this faculty
	*/
	public java.util.Date getDateAdded() {
		return _faculty.getDateAdded();
	}

	/**
	* Sets the date added of this faculty.
	*
	* @param dateAdded the date added of this faculty
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_faculty.setDateAdded(dateAdded);
	}

	/**
	* Returns the date modified of this faculty.
	*
	* @return the date modified of this faculty
	*/
	public java.util.Date getDateModified() {
		return _faculty.getDateModified();
	}

	/**
	* Sets the date modified of this faculty.
	*
	* @param dateModified the date modified of this faculty
	*/
	public void setDateModified(java.util.Date dateModified) {
		_faculty.setDateModified(dateModified);
	}

	public boolean isNew() {
		return _faculty.isNew();
	}

	public void setNew(boolean n) {
		_faculty.setNew(n);
	}

	public boolean isCachedModel() {
		return _faculty.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_faculty.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _faculty.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _faculty.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_faculty.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _faculty.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_faculty.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FacultyWrapper((Faculty)_faculty.clone());
	}

	public int compareTo(
		com.asu.poly.teams.manualSelect.slayer.model.Faculty faculty) {
		return _faculty.compareTo(faculty);
	}

	@Override
	public int hashCode() {
		return _faculty.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.asu.poly.teams.manualSelect.slayer.model.Faculty> toCacheModel() {
		return _faculty.toCacheModel();
	}

	public com.asu.poly.teams.manualSelect.slayer.model.Faculty toEscapedModel() {
		return new FacultyWrapper(_faculty.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _faculty.toString();
	}

	public java.lang.String toXmlString() {
		return _faculty.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_faculty.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Faculty getWrappedFaculty() {
		return _faculty;
	}

	public Faculty getWrappedModel() {
		return _faculty;
	}

	public void resetOriginalValues() {
		_faculty.resetOriginalValues();
	}

	private Faculty _faculty;
}