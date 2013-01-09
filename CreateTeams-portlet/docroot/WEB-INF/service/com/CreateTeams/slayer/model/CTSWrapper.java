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

package com.CreateTeams.slayer.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CTS}.
 * </p>
 *
 * @author    zhengyan
 * @see       CTS
 * @generated
 */
public class CTSWrapper implements CTS, ModelWrapper<CTS> {
	public CTSWrapper(CTS cts) {
		_cts = cts;
	}

	public Class<?> getModelClass() {
		return CTS.class;
	}

	public String getModelClassName() {
		return CTS.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("TeamId", getTeamId());
		attributes.put("TeamName", getTeamName());
		attributes.put("TeamMembers", getTeamMembers());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long TeamId = (Long)attributes.get("TeamId");

		if (TeamId != null) {
			setTeamId(TeamId);
		}

		String TeamName = (String)attributes.get("TeamName");

		if (TeamName != null) {
			setTeamName(TeamName);
		}

		String TeamMembers = (String)attributes.get("TeamMembers");

		if (TeamMembers != null) {
			setTeamMembers(TeamMembers);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}
	}

	/**
	* Returns the primary key of this c t s.
	*
	* @return the primary key of this c t s
	*/
	public long getPrimaryKey() {
		return _cts.getPrimaryKey();
	}

	/**
	* Sets the primary key of this c t s.
	*
	* @param primaryKey the primary key of this c t s
	*/
	public void setPrimaryKey(long primaryKey) {
		_cts.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the team ID of this c t s.
	*
	* @return the team ID of this c t s
	*/
	public long getTeamId() {
		return _cts.getTeamId();
	}

	/**
	* Sets the team ID of this c t s.
	*
	* @param TeamId the team ID of this c t s
	*/
	public void setTeamId(long TeamId) {
		_cts.setTeamId(TeamId);
	}

	/**
	* Returns the team name of this c t s.
	*
	* @return the team name of this c t s
	*/
	public java.lang.String getTeamName() {
		return _cts.getTeamName();
	}

	/**
	* Sets the team name of this c t s.
	*
	* @param TeamName the team name of this c t s
	*/
	public void setTeamName(java.lang.String TeamName) {
		_cts.setTeamName(TeamName);
	}

	/**
	* Returns the team members of this c t s.
	*
	* @return the team members of this c t s
	*/
	public java.lang.String getTeamMembers() {
		return _cts.getTeamMembers();
	}

	/**
	* Sets the team members of this c t s.
	*
	* @param TeamMembers the team members of this c t s
	*/
	public void setTeamMembers(java.lang.String TeamMembers) {
		_cts.setTeamMembers(TeamMembers);
	}

	/**
	* Returns the date added of this c t s.
	*
	* @return the date added of this c t s
	*/
	public java.util.Date getDateAdded() {
		return _cts.getDateAdded();
	}

	/**
	* Sets the date added of this c t s.
	*
	* @param dateAdded the date added of this c t s
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_cts.setDateAdded(dateAdded);
	}

	public boolean isNew() {
		return _cts.isNew();
	}

	public void setNew(boolean n) {
		_cts.setNew(n);
	}

	public boolean isCachedModel() {
		return _cts.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_cts.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _cts.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _cts.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cts.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cts.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cts.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CTSWrapper((CTS)_cts.clone());
	}

	public int compareTo(com.CreateTeams.slayer.model.CTS cts) {
		return _cts.compareTo(cts);
	}

	@Override
	public int hashCode() {
		return _cts.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.CreateTeams.slayer.model.CTS> toCacheModel() {
		return _cts.toCacheModel();
	}

	public com.CreateTeams.slayer.model.CTS toEscapedModel() {
		return new CTSWrapper(_cts.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cts.toString();
	}

	public java.lang.String toXmlString() {
		return _cts.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cts.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public CTS getWrappedCTS() {
		return _cts;
	}

	public CTS getWrappedModel() {
		return _cts;
	}

	public void resetOriginalValues() {
		_cts.resetOriginalValues();
	}

	private CTS _cts;
}