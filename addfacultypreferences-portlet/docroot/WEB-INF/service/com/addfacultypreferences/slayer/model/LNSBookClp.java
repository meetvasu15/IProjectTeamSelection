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

import com.addfacultypreferences.slayer.service.LNSBookLocalServiceUtil;

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
 * @author Eshwari
 */
public class LNSBookClp extends BaseModelImpl<LNSBook> implements LNSBook {
	public LNSBookClp() {
	}

	public Class<?> getModelClass() {
		return LNSBook.class;
	}

	public String getModelClassName() {
		return LNSBook.class.getName();
	}

	public long getPrimaryKey() {
		return _nameId;
	}

	public void setPrimaryKey(long primaryKey) {
		setNameId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_nameId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nameId", getNameId());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("number", getNumber());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nameId = (Long)attributes.get("nameId");

		if (nameId != null) {
			setNameId(nameId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}
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

	public BaseModel<?> getLNSBookRemoteModel() {
		return _lnsBookRemoteModel;
	}

	public void setLNSBookRemoteModel(BaseModel<?> lnsBookRemoteModel) {
		_lnsBookRemoteModel = lnsBookRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			LNSBookLocalServiceUtil.addLNSBook(this);
		}
		else {
			LNSBookLocalServiceUtil.updateLNSBook(this);
		}
	}

	@Override
	public LNSBook toEscapedModel() {
		return (LNSBook)Proxy.newProxyInstance(LNSBook.class.getClassLoader(),
			new Class[] { LNSBook.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LNSBookClp clone = new LNSBookClp();

		clone.setNameId(getNameId());
		clone.setName(getName());
		clone.setEmail(getEmail());
		clone.setNumber(getNumber());
		clone.setDateAdded(getDateAdded());

		return clone;
	}

	public int compareTo(LNSBook lnsBook) {
		long primaryKey = lnsBook.getPrimaryKey();

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

		LNSBookClp lnsBook = null;

		try {
			lnsBook = (LNSBookClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = lnsBook.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{nameId=");
		sb.append(getNameId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", number=");
		sb.append(getNumber());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.addfacultypreferences.slayer.model.LNSBook");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>nameId</column-name><column-value><![CDATA[");
		sb.append(getNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number</column-name><column-value><![CDATA[");
		sb.append(getNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _nameId;
	private String _name;
	private String _email;
	private String _number;
	private Date _dateAdded;
	private BaseModel<?> _lnsBookRemoteModel;
}