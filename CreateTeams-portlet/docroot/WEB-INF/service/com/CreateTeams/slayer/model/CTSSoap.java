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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    zhengyan
 * @generated
 */
public class CTSSoap implements Serializable {
	public static CTSSoap toSoapModel(CTS model) {
		CTSSoap soapModel = new CTSSoap();

		soapModel.setTeamId(model.getTeamId());
		soapModel.setTeamName(model.getTeamName());
		soapModel.setTeamMembers(model.getTeamMembers());
		soapModel.setDateAdded(model.getDateAdded());

		return soapModel;
	}

	public static CTSSoap[] toSoapModels(CTS[] models) {
		CTSSoap[] soapModels = new CTSSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CTSSoap[][] toSoapModels(CTS[][] models) {
		CTSSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CTSSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CTSSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CTSSoap[] toSoapModels(List<CTS> models) {
		List<CTSSoap> soapModels = new ArrayList<CTSSoap>(models.size());

		for (CTS model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CTSSoap[soapModels.size()]);
	}

	public CTSSoap() {
	}

	public long getPrimaryKey() {
		return _TeamId;
	}

	public void setPrimaryKey(long pk) {
		setTeamId(pk);
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

	private long _TeamId;
	private String _TeamName;
	private String _TeamMembers;
	private Date _dateAdded;
}