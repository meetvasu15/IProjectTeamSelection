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

import com.CreateTeams.slayer.service.CTSLocalServiceUtil;

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
 * @author zhengyan
 */
public class CTSClp extends BaseModelImpl<CTS> implements CTS {
	public CTSClp() {
	}

	public Class<?> getModelClass() {
		return CTS.class;
	}

	public String getModelClassName() {
		return CTS.class.getName();
	}

	public long getPrimaryKey() {
		return _TeamId;
	}

	public void setPrimaryKey(long primaryKey) {
		setTeamId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_TeamId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("TeamId", getTeamId());
		attributes.put("TeamName", getTeamName());
		attributes.put("TeamMembers", getTeamMembers());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

	@Override
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

	public long getTeamId() {
		return _TeamId;
	}

	public void setTeamId(long TeamId) {
		_TeamId = TeamId;
	}

	public String getTeamName() {
		return _TeamName;
	}

	public void setTeamName(String TeamName) {
		_TeamName = TeamName;
	}

	public String getTeamMembers() {
		return _TeamMembers;
	}

	public void setTeamMembers(String TeamMembers) {
		_TeamMembers = TeamMembers;
	}

	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	public BaseModel<?> getCTSRemoteModel() {
		return _ctsRemoteModel;
	}

	public void setCTSRemoteModel(BaseModel<?> ctsRemoteModel) {
		_ctsRemoteModel = ctsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			CTSLocalServiceUtil.addCTS(this);
		}
		else {
			CTSLocalServiceUtil.updateCTS(this);
		}
	}

	@Override
	public CTS toEscapedModel() {
		return (CTS)Proxy.newProxyInstance(CTS.class.getClassLoader(),
			new Class[] { CTS.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CTSClp clone = new CTSClp();

		clone.setTeamId(getTeamId());
		clone.setTeamName(getTeamName());
		clone.setTeamMembers(getTeamMembers());
		clone.setDateAdded(getDateAdded());

		return clone;
	}

	public int compareTo(CTS cts) {
		long primaryKey = cts.getPrimaryKey();

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

		CTSClp cts = null;

		try {
			cts = (CTSClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = cts.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{TeamId=");
		sb.append(getTeamId());
		sb.append(", TeamName=");
		sb.append(getTeamName());
		sb.append(", TeamMembers=");
		sb.append(getTeamMembers());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.CreateTeams.slayer.model.CTS");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>TeamId</column-name><column-value><![CDATA[");
		sb.append(getTeamId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TeamName</column-name><column-value><![CDATA[");
		sb.append(getTeamName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TeamMembers</column-name><column-value><![CDATA[");
		sb.append(getTeamMembers());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _TeamId;
	private String _TeamName;
	private String _TeamMembers;
	private Date _dateAdded;
	private BaseModel<?> _ctsRemoteModel;
}