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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Skillset}.
 * </p>
 *
 * @author    zhengyan
 * @see       Skillset
 * @generated
 */
public class SkillsetWrapper implements Skillset, ModelWrapper<Skillset> {
	public SkillsetWrapper(Skillset skillset) {
		_skillset = skillset;
	}

	public Class<?> getModelClass() {
		return Skillset.class;
	}

	public String getModelClassName() {
		return Skillset.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentID", getStudentID());
		attributes.put("asuid", getAsuid());
		attributes.put("email", getEmail());
		attributes.put("skill1", getSkill1());
		attributes.put("dateAdded", getDateAdded());

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

	/**
	* Returns the primary key of this skillset.
	*
	* @return the primary key of this skillset
	*/
	public long getPrimaryKey() {
		return _skillset.getPrimaryKey();
	}

	/**
	* Sets the primary key of this skillset.
	*
	* @param primaryKey the primary key of this skillset
	*/
	public void setPrimaryKey(long primaryKey) {
		_skillset.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the student i d of this skillset.
	*
	* @return the student i d of this skillset
	*/
	public long getStudentID() {
		return _skillset.getStudentID();
	}

	/**
	* Sets the student i d of this skillset.
	*
	* @param studentID the student i d of this skillset
	*/
	public void setStudentID(long studentID) {
		_skillset.setStudentID(studentID);
	}

	/**
	* Returns the asuid of this skillset.
	*
	* @return the asuid of this skillset
	*/
	public java.lang.String getAsuid() {
		return _skillset.getAsuid();
	}

	/**
	* Sets the asuid of this skillset.
	*
	* @param asuid the asuid of this skillset
	*/
	public void setAsuid(java.lang.String asuid) {
		_skillset.setAsuid(asuid);
	}

	/**
	* Returns the email of this skillset.
	*
	* @return the email of this skillset
	*/
	public java.lang.String getEmail() {
		return _skillset.getEmail();
	}

	/**
	* Sets the email of this skillset.
	*
	* @param email the email of this skillset
	*/
	public void setEmail(java.lang.String email) {
		_skillset.setEmail(email);
	}

	/**
	* Returns the skill1 of this skillset.
	*
	* @return the skill1 of this skillset
	*/
	public java.lang.String getSkill1() {
		return _skillset.getSkill1();
	}

	/**
	* Sets the skill1 of this skillset.
	*
	* @param skill1 the skill1 of this skillset
	*/
	public void setSkill1(java.lang.String skill1) {
		_skillset.setSkill1(skill1);
	}

	/**
	* Returns the date added of this skillset.
	*
	* @return the date added of this skillset
	*/
	public java.util.Date getDateAdded() {
		return _skillset.getDateAdded();
	}

	/**
	* Sets the date added of this skillset.
	*
	* @param dateAdded the date added of this skillset
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_skillset.setDateAdded(dateAdded);
	}

	public boolean isNew() {
		return _skillset.isNew();
	}

	public void setNew(boolean n) {
		_skillset.setNew(n);
	}

	public boolean isCachedModel() {
		return _skillset.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_skillset.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _skillset.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _skillset.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_skillset.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _skillset.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_skillset.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SkillsetWrapper((Skillset)_skillset.clone());
	}

	public int compareTo(Skillset skillset) {
		return _skillset.compareTo(skillset);
	}

	@Override
	public int hashCode() {
		return _skillset.hashCode();
	}

	public com.liferay.portal.model.CacheModel<Skillset> toCacheModel() {
		return _skillset.toCacheModel();
	}

	public Skillset toEscapedModel() {
		return new SkillsetWrapper(_skillset.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _skillset.toString();
	}

	public java.lang.String toXmlString() {
		return _skillset.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_skillset.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Skillset getWrappedSkillset() {
		return _skillset;
	}

	public Skillset getWrappedModel() {
		return _skillset;
	}

	public void resetOriginalValues() {
		_skillset.resetOriginalValues();
	}

	private Skillset _skillset;
}