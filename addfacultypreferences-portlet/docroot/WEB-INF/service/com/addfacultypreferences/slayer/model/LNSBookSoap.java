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

package com.addfacultypreferences.slayer.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    Eshwari
 * @generated
 */
public class LNSBookSoap implements Serializable {
	public static LNSBookSoap toSoapModel(LNSBook model) {
		LNSBookSoap soapModel = new LNSBookSoap();

		soapModel.setNameId(model.getNameId());
		soapModel.setName(model.getName());
		soapModel.setEmail(model.getEmail());
		soapModel.setNumber(model.getNumber());
		soapModel.setDateAdded(model.getDateAdded());

		return soapModel;
	}

	public static LNSBookSoap[] toSoapModels(LNSBook[] models) {
		LNSBookSoap[] soapModels = new LNSBookSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LNSBookSoap[][] toSoapModels(LNSBook[][] models) {
		LNSBookSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LNSBookSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LNSBookSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LNSBookSoap[] toSoapModels(List<LNSBook> models) {
		List<LNSBookSoap> soapModels = new ArrayList<LNSBookSoap>(models.size());

		for (LNSBook model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LNSBookSoap[soapModels.size()]);
	}

	public LNSBookSoap() {
	}

	public long getPrimaryKey() {
		return _nameId;
	}

	public void setPrimaryKey(long pk) {
		setNameId(pk);
	}

	public long getNameId() {
		return _nameId;
	}

	public void setNameId(long nameId) {
		_nameId = nameId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getNumber() {
		return _number;
	}

	public void setNumber(String number) {
		_number = number;
	}

	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	private long _nameId;
	private String _name;
	private String _email;
	private String _number;
	private Date _dateAdded;
}