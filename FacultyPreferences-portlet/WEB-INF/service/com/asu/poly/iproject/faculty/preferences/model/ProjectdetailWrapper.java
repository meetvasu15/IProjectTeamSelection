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

package com.asu.poly.iproject.faculty.preferences.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Projectdetail}.
 * </p>
 *
 * @author    emente
 * @see       Projectdetail
 * @generated
 */
public class ProjectdetailWrapper implements Projectdetail,
	ModelWrapper<Projectdetail> {
	public ProjectdetailWrapper(Projectdetail projectdetail) {
		_projectdetail = projectdetail;
	}

	public Class<?> getModelClass() {
		return Projectdetail.class;
	}

	public String getModelClassName() {
		return Projectdetail.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("projectID", getProjectID());
		attributes.put("projectTitle", getProjectTitle());
		attributes.put("dateAdded", getDateAdded());
		attributes.put("dateModified", getDateModified());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long projectID = (Long)attributes.get("projectID");

		if (projectID != null) {
			setProjectID(projectID);
		}

		String projectTitle = (String)attributes.get("projectTitle");

		if (projectTitle != null) {
			setProjectTitle(projectTitle);
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
	* Returns the primary key of this projectdetail.
	*
	* @return the primary key of this projectdetail
	*/
	public long getPrimaryKey() {
		return _projectdetail.getPrimaryKey();
	}

	/**
	* Sets the primary key of this projectdetail.
	*
	* @param primaryKey the primary key of this projectdetail
	*/
	public void setPrimaryKey(long primaryKey) {
		_projectdetail.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the project i d of this projectdetail.
	*
	* @return the project i d of this projectdetail
	*/
	public long getProjectID() {
		return _projectdetail.getProjectID();
	}

	/**
	* Sets the project i d of this projectdetail.
	*
	* @param projectID the project i d of this projectdetail
	*/
	public void setProjectID(long projectID) {
		_projectdetail.setProjectID(projectID);
	}

	/**
	* Returns the project title of this projectdetail.
	*
	* @return the project title of this projectdetail
	*/
	public java.lang.String getProjectTitle() {
		return _projectdetail.getProjectTitle();
	}

	/**
	* Sets the project title of this projectdetail.
	*
	* @param projectTitle the project title of this projectdetail
	*/
	public void setProjectTitle(java.lang.String projectTitle) {
		_projectdetail.setProjectTitle(projectTitle);
	}

	/**
	* Returns the date added of this projectdetail.
	*
	* @return the date added of this projectdetail
	*/
	public java.util.Date getDateAdded() {
		return _projectdetail.getDateAdded();
	}

	/**
	* Sets the date added of this projectdetail.
	*
	* @param dateAdded the date added of this projectdetail
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_projectdetail.setDateAdded(dateAdded);
	}

	/**
	* Returns the date modified of this projectdetail.
	*
	* @return the date modified of this projectdetail
	*/
	public java.util.Date getDateModified() {
		return _projectdetail.getDateModified();
	}

	/**
	* Sets the date modified of this projectdetail.
	*
	* @param dateModified the date modified of this projectdetail
	*/
	public void setDateModified(java.util.Date dateModified) {
		_projectdetail.setDateModified(dateModified);
	}

	public boolean isNew() {
		return _projectdetail.isNew();
	}

	public void setNew(boolean n) {
		_projectdetail.setNew(n);
	}

	public boolean isCachedModel() {
		return _projectdetail.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_projectdetail.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _projectdetail.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _projectdetail.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_projectdetail.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _projectdetail.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_projectdetail.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ProjectdetailWrapper((Projectdetail)_projectdetail.clone());
	}

	public int compareTo(Projectdetail projectdetail) {
		return _projectdetail.compareTo(projectdetail);
	}

	@Override
	public int hashCode() {
		return _projectdetail.hashCode();
	}

	public com.liferay.portal.model.CacheModel<Projectdetail> toCacheModel() {
		return _projectdetail.toCacheModel();
	}

	public Projectdetail toEscapedModel() {
		return new ProjectdetailWrapper(_projectdetail.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _projectdetail.toString();
	}

	public java.lang.String toXmlString() {
		return _projectdetail.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_projectdetail.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Projectdetail getWrappedProjectdetail() {
		return _projectdetail;
	}

	public Projectdetail getWrappedModel() {
		return _projectdetail;
	}

	public void resetOriginalValues() {
		_projectdetail.resetOriginalValues();
	}

	private Projectdetail _projectdetail;
}