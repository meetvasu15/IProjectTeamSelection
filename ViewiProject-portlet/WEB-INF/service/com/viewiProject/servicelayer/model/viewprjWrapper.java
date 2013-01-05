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

package com.viewiProject.servicelayer.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link viewprj}.
 * </p>
 *
 * @author    Shruthi
 * @see       viewprj
 * @generated
 */
public class viewprjWrapper implements viewprj, ModelWrapper<viewprj> {
	public viewprjWrapper(viewprj viewprj) {
		_viewprj = viewprj;
	}

	public Class<?> getModelClass() {
		return viewprj.class;
	}

	public String getModelClassName() {
		return viewprj.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("projectId", getProjectId());
		attributes.put("projectTitle", getProjectTitle());
		attributes.put("projectdescription", getProjectdescription());
		attributes.put("projectrequiredskill", getProjectrequiredskill());
		attributes.put("contact", getContact());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long projectId = (Long)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		String projectTitle = (String)attributes.get("projectTitle");

		if (projectTitle != null) {
			setProjectTitle(projectTitle);
		}

		String projectdescription = (String)attributes.get("projectdescription");

		if (projectdescription != null) {
			setProjectdescription(projectdescription);
		}

		String projectrequiredskill = (String)attributes.get(
				"projectrequiredskill");

		if (projectrequiredskill != null) {
			setProjectrequiredskill(projectrequiredskill);
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
	* Returns the primary key of this viewprj.
	*
	* @return the primary key of this viewprj
	*/
	public long getPrimaryKey() {
		return _viewprj.getPrimaryKey();
	}

	/**
	* Sets the primary key of this viewprj.
	*
	* @param primaryKey the primary key of this viewprj
	*/
	public void setPrimaryKey(long primaryKey) {
		_viewprj.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the project ID of this viewprj.
	*
	* @return the project ID of this viewprj
	*/
	public long getProjectId() {
		return _viewprj.getProjectId();
	}

	/**
	* Sets the project ID of this viewprj.
	*
	* @param projectId the project ID of this viewprj
	*/
	public void setProjectId(long projectId) {
		_viewprj.setProjectId(projectId);
	}

	/**
	* Returns the project title of this viewprj.
	*
	* @return the project title of this viewprj
	*/
	public java.lang.String getProjectTitle() {
		return _viewprj.getProjectTitle();
	}

	/**
	* Sets the project title of this viewprj.
	*
	* @param projectTitle the project title of this viewprj
	*/
	public void setProjectTitle(java.lang.String projectTitle) {
		_viewprj.setProjectTitle(projectTitle);
	}

	/**
	* Returns the projectdescription of this viewprj.
	*
	* @return the projectdescription of this viewprj
	*/
	public java.lang.String getProjectdescription() {
		return _viewprj.getProjectdescription();
	}

	/**
	* Sets the projectdescription of this viewprj.
	*
	* @param projectdescription the projectdescription of this viewprj
	*/
	public void setProjectdescription(java.lang.String projectdescription) {
		_viewprj.setProjectdescription(projectdescription);
	}

	/**
	* Returns the projectrequiredskill of this viewprj.
	*
	* @return the projectrequiredskill of this viewprj
	*/
	public java.lang.String getProjectrequiredskill() {
		return _viewprj.getProjectrequiredskill();
	}

	/**
	* Sets the projectrequiredskill of this viewprj.
	*
	* @param projectrequiredskill the projectrequiredskill of this viewprj
	*/
	public void setProjectrequiredskill(java.lang.String projectrequiredskill) {
		_viewprj.setProjectrequiredskill(projectrequiredskill);
	}

	/**
	* Returns the contact of this viewprj.
	*
	* @return the contact of this viewprj
	*/
	public java.lang.String getContact() {
		return _viewprj.getContact();
	}

	/**
	* Sets the contact of this viewprj.
	*
	* @param contact the contact of this viewprj
	*/
	public void setContact(java.lang.String contact) {
		_viewprj.setContact(contact);
	}

	/**
	* Returns the date added of this viewprj.
	*
	* @return the date added of this viewprj
	*/
	public java.util.Date getDateAdded() {
		return _viewprj.getDateAdded();
	}

	/**
	* Sets the date added of this viewprj.
	*
	* @param dateAdded the date added of this viewprj
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_viewprj.setDateAdded(dateAdded);
	}

	public boolean isNew() {
		return _viewprj.isNew();
	}

	public void setNew(boolean n) {
		_viewprj.setNew(n);
	}

	public boolean isCachedModel() {
		return _viewprj.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_viewprj.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _viewprj.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _viewprj.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_viewprj.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _viewprj.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_viewprj.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new viewprjWrapper((viewprj)_viewprj.clone());
	}

	public int compareTo(com.viewiProject.servicelayer.model.viewprj viewprj) {
		return _viewprj.compareTo(viewprj);
	}

	@Override
	public int hashCode() {
		return _viewprj.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.viewiProject.servicelayer.model.viewprj> toCacheModel() {
		return _viewprj.toCacheModel();
	}

	public com.viewiProject.servicelayer.model.viewprj toEscapedModel() {
		return new viewprjWrapper(_viewprj.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _viewprj.toString();
	}

	public java.lang.String toXmlString() {
		return _viewprj.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_viewprj.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public viewprj getWrappedviewprj() {
		return _viewprj;
	}

	public viewprj getWrappedModel() {
		return _viewprj;
	}

	public void resetOriginalValues() {
		_viewprj.resetOriginalValues();
	}

	private viewprj _viewprj;
}