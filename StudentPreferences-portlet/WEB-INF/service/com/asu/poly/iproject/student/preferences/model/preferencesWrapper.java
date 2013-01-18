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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link preferences}.
 * </p>
 *
 * @author    asingh64
 * @see       preferences
 * @generated
 */
public class preferencesWrapper implements preferences,
	ModelWrapper<preferences> {
	public preferencesWrapper(preferences preferences) {
		_preferences = preferences;
	}

	public Class<?> getModelClass() {
		return preferences.class;
	}

	public String getModelClassName() {
		return preferences.class.getName();
	}

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

	/**
	* Returns the primary key of this preferences.
	*
	* @return the primary key of this preferences
	*/
	public long getPrimaryKey() {
		return _preferences.getPrimaryKey();
	}

	/**
	* Sets the primary key of this preferences.
	*
	* @param primaryKey the primary key of this preferences
	*/
	public void setPrimaryKey(long primaryKey) {
		_preferences.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the student i d of this preferences.
	*
	* @return the student i d of this preferences
	*/
	public long getStudentID() {
		return _preferences.getStudentID();
	}

	/**
	* Sets the student i d of this preferences.
	*
	* @param studentID the student i d of this preferences
	*/
	public void setStudentID(long studentID) {
		_preferences.setStudentID(studentID);
	}

	/**
	* Returns the a s u i d of this preferences.
	*
	* @return the a s u i d of this preferences
	*/
	public java.lang.String getASUID() {
		return _preferences.getASUID();
	}

	/**
	* Sets the a s u i d of this preferences.
	*
	* @param ASUID the a s u i d of this preferences
	*/
	public void setASUID(java.lang.String ASUID) {
		_preferences.setASUID(ASUID);
	}

	/**
	* Returns the preference1 of this preferences.
	*
	* @return the preference1 of this preferences
	*/
	public java.lang.String getPreference1() {
		return _preferences.getPreference1();
	}

	/**
	* Sets the preference1 of this preferences.
	*
	* @param preference1 the preference1 of this preferences
	*/
	public void setPreference1(java.lang.String preference1) {
		_preferences.setPreference1(preference1);
	}

	/**
	* Returns the preference2 of this preferences.
	*
	* @return the preference2 of this preferences
	*/
	public java.lang.String getPreference2() {
		return _preferences.getPreference2();
	}

	/**
	* Sets the preference2 of this preferences.
	*
	* @param preference2 the preference2 of this preferences
	*/
	public void setPreference2(java.lang.String preference2) {
		_preferences.setPreference2(preference2);
	}

	/**
	* Returns the preference3 of this preferences.
	*
	* @return the preference3 of this preferences
	*/
	public java.lang.String getPreference3() {
		return _preferences.getPreference3();
	}

	/**
	* Sets the preference3 of this preferences.
	*
	* @param preference3 the preference3 of this preferences
	*/
	public void setPreference3(java.lang.String preference3) {
		_preferences.setPreference3(preference3);
	}

	/**
	* Returns the preference4 of this preferences.
	*
	* @return the preference4 of this preferences
	*/
	public java.lang.String getPreference4() {
		return _preferences.getPreference4();
	}

	/**
	* Sets the preference4 of this preferences.
	*
	* @param preference4 the preference4 of this preferences
	*/
	public void setPreference4(java.lang.String preference4) {
		_preferences.setPreference4(preference4);
	}

	/**
	* Returns the preference5 of this preferences.
	*
	* @return the preference5 of this preferences
	*/
	public java.lang.String getPreference5() {
		return _preferences.getPreference5();
	}

	/**
	* Sets the preference5 of this preferences.
	*
	* @param preference5 the preference5 of this preferences
	*/
	public void setPreference5(java.lang.String preference5) {
		_preferences.setPreference5(preference5);
	}

	/**
	* Returns the date added of this preferences.
	*
	* @return the date added of this preferences
	*/
	public java.util.Date getDateAdded() {
		return _preferences.getDateAdded();
	}

	/**
	* Sets the date added of this preferences.
	*
	* @param dateAdded the date added of this preferences
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_preferences.setDateAdded(dateAdded);
	}

	/**
	* Returns the date modified of this preferences.
	*
	* @return the date modified of this preferences
	*/
	public java.util.Date getDateModified() {
		return _preferences.getDateModified();
	}

	/**
	* Sets the date modified of this preferences.
	*
	* @param dateModified the date modified of this preferences
	*/
	public void setDateModified(java.util.Date dateModified) {
		_preferences.setDateModified(dateModified);
	}

	public boolean isNew() {
		return _preferences.isNew();
	}

	public void setNew(boolean n) {
		_preferences.setNew(n);
	}

	public boolean isCachedModel() {
		return _preferences.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_preferences.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _preferences.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _preferences.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_preferences.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _preferences.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_preferences.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new preferencesWrapper((preferences)_preferences.clone());
	}

	public int compareTo(preferences preferences) {
		return _preferences.compareTo(preferences);
	}

	@Override
	public int hashCode() {
		return _preferences.hashCode();
	}

	public com.liferay.portal.model.CacheModel<preferences> toCacheModel() {
		return _preferences.toCacheModel();
	}

	public preferences toEscapedModel() {
		return new preferencesWrapper(_preferences.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _preferences.toString();
	}

	public java.lang.String toXmlString() {
		return _preferences.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_preferences.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public preferences getWrappedpreferences() {
		return _preferences;
	}

	public preferences getWrappedModel() {
		return _preferences;
	}

	public void resetOriginalValues() {
		_preferences.resetOriginalValues();
	}

	private preferences _preferences;
}