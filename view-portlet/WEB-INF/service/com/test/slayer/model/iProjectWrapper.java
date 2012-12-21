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

package com.test.slayer.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link iProject}.
 * </p>
 *
 * @author    anshu
 * @see       iProject
 * @generated
 */
public class iProjectWrapper implements iProject, ModelWrapper<iProject> {
	public iProjectWrapper(iProject iProject) {
		_iProject = iProject;
	}

	public Class<?> getModelClass() {
		return iProject.class;
	}

	public String getModelClassName() {
		return iProject.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("projectID", getProjectID());
		attributes.put("projectName", getProjectName());
		attributes.put("skillset", getSkillset());
		attributes.put("description", getDescription());
		attributes.put("contact", getContact());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long projectID = (Long)attributes.get("projectID");

		if (projectID != null) {
			setProjectID(projectID);
		}

		String projectName = (String)attributes.get("projectName");

		if (projectName != null) {
			setProjectName(projectName);
		}

		String skillset = (String)attributes.get("skillset");

		if (skillset != null) {
			setSkillset(skillset);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String contact = (String)attributes.get("contact");

		if (contact != null) {
			setContact(contact);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}
	}

	/**
	* Returns the primary key of this i project.
	*
	* @return the primary key of this i project
	*/
	public com.test.slayer.service.persistence.iProjectPK getPrimaryKey() {
		return _iProject.getPrimaryKey();
	}

	/**
	* Sets the primary key of this i project.
	*
	* @param primaryKey the primary key of this i project
	*/
	public void setPrimaryKey(
		com.test.slayer.service.persistence.iProjectPK primaryKey) {
		_iProject.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the project i d of this i project.
	*
	* @return the project i d of this i project
	*/
	public long getProjectID() {
		return _iProject.getProjectID();
	}

	/**
	* Sets the project i d of this i project.
	*
	* @param projectID the project i d of this i project
	*/
	public void setProjectID(long projectID) {
		_iProject.setProjectID(projectID);
	}

	/**
	* Returns the project name of this i project.
	*
	* @return the project name of this i project
	*/
	public java.lang.String getProjectName() {
		return _iProject.getProjectName();
	}

	/**
	* Sets the project name of this i project.
	*
	* @param projectName the project name of this i project
	*/
	public void setProjectName(java.lang.String projectName) {
		_iProject.setProjectName(projectName);
	}

	/**
	* Returns the skillset of this i project.
	*
	* @return the skillset of this i project
	*/
	public java.lang.String getSkillset() {
		return _iProject.getSkillset();
	}

	/**
	* Sets the skillset of this i project.
	*
	* @param skillset the skillset of this i project
	*/
	public void setSkillset(java.lang.String skillset) {
		_iProject.setSkillset(skillset);
	}

	/**
	* Returns the description of this i project.
	*
	* @return the description of this i project
	*/
	public java.lang.String getDescription() {
		return _iProject.getDescription();
	}

	/**
	* Sets the description of this i project.
	*
	* @param description the description of this i project
	*/
	public void setDescription(java.lang.String description) {
		_iProject.setDescription(description);
	}

	/**
	* Returns the contact of this i project.
	*
	* @return the contact of this i project
	*/
	public java.lang.String getContact() {
		return _iProject.getContact();
	}

	/**
	* Sets the contact of this i project.
	*
	* @param contact the contact of this i project
	*/
	public void setContact(java.lang.String contact) {
		_iProject.setContact(contact);
	}

	/**
	* Returns the date added of this i project.
	*
	* @return the date added of this i project
	*/
	public java.util.Date getDateAdded() {
		return _iProject.getDateAdded();
	}

	/**
	* Sets the date added of this i project.
	*
	* @param dateAdded the date added of this i project
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_iProject.setDateAdded(dateAdded);
	}

	public boolean isNew() {
		return _iProject.isNew();
	}

	public void setNew(boolean n) {
		_iProject.setNew(n);
	}

	public boolean isCachedModel() {
		return _iProject.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_iProject.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _iProject.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _iProject.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_iProject.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _iProject.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_iProject.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new iProjectWrapper((iProject)_iProject.clone());
	}

	public int compareTo(com.test.slayer.model.iProject iProject) {
		return _iProject.compareTo(iProject);
	}

	@Override
	public int hashCode() {
		return _iProject.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.test.slayer.model.iProject> toCacheModel() {
		return _iProject.toCacheModel();
	}

	public com.test.slayer.model.iProject toEscapedModel() {
		return new iProjectWrapper(_iProject.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _iProject.toString();
	}

	public java.lang.String toXmlString() {
		return _iProject.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_iProject.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public iProject getWrappediProject() {
		return _iProject;
	}

	public iProject getWrappedModel() {
		return _iProject;
	}

	public void resetOriginalValues() {
		_iProject.resetOriginalValues();
	}

	private iProject _iProject;
}