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

package com.iproject.slayer.model;

import com.iproject.slayer.service.ProjectdetailLocalServiceUtil;

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
 * @author Shruthi
 */
public class ProjectdetailClp extends BaseModelImpl<Projectdetail>
	implements Projectdetail {
	public ProjectdetailClp() {
	}

	public Class<?> getModelClass() {
		return Projectdetail.class;
	}

	public String getModelClassName() {
		return Projectdetail.class.getName();
	}

	public long getPrimaryKey() {
		return _projectID;
	}

	public void setPrimaryKey(long primaryKey) {
		setProjectID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_projectID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("projectID", getProjectID());
		attributes.put("projectTitle", getProjectTitle());
		attributes.put("projectdescription", getProjectdescription());
		attributes.put("projectrequiredskill", getProjectrequiredskill());
		attributes.put("contact", getContact());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long projectID = (Long)attributes.get("projectID");

		if (projectID != null) {
			setProjectID(projectID);
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

	public long getProjectID() {
		return _projectID;
	}

	public void setProjectID(long projectID) {
		_projectID = projectID;
	}

	public String getProjectTitle() {
		return _projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		_projectTitle = projectTitle;
	}

	public String getProjectdescription() {
		return _projectdescription;
	}

	public void setProjectdescription(String projectdescription) {
		_projectdescription = projectdescription;
	}

	public String getProjectrequiredskill() {
		return _projectrequiredskill;
	}

	public void setProjectrequiredskill(String projectrequiredskill) {
		_projectrequiredskill = projectrequiredskill;
	}

	public String getContact() {
		return _contact;
	}

	public void setContact(String contact) {
		_contact = contact;
	}

	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	public BaseModel<?> getProjectdetailRemoteModel() {
		return _projectdetailRemoteModel;
	}

	public void setProjectdetailRemoteModel(
		BaseModel<?> projectdetailRemoteModel) {
		_projectdetailRemoteModel = projectdetailRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			ProjectdetailLocalServiceUtil.addProjectdetail(this);
		}
		else {
			ProjectdetailLocalServiceUtil.updateProjectdetail(this);
		}
	}

	@Override
	public Projectdetail toEscapedModel() {
		return (Projectdetail)Proxy.newProxyInstance(Projectdetail.class.getClassLoader(),
			new Class[] { Projectdetail.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProjectdetailClp clone = new ProjectdetailClp();

		clone.setProjectID(getProjectID());
		clone.setProjectTitle(getProjectTitle());
		clone.setProjectdescription(getProjectdescription());
		clone.setProjectrequiredskill(getProjectrequiredskill());
		clone.setContact(getContact());
		clone.setDateAdded(getDateAdded());

		return clone;
	}

	public int compareTo(Projectdetail projectdetail) {
		long primaryKey = projectdetail.getPrimaryKey();

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

		ProjectdetailClp projectdetail = null;

		try {
			projectdetail = (ProjectdetailClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = projectdetail.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{projectID=");
		sb.append(getProjectID());
		sb.append(", projectTitle=");
		sb.append(getProjectTitle());
		sb.append(", projectdescription=");
		sb.append(getProjectdescription());
		sb.append(", projectrequiredskill=");
		sb.append(getProjectrequiredskill());
		sb.append(", contact=");
		sb.append(getContact());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.iproject.slayer.model.Projectdetail");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>projectID</column-name><column-value><![CDATA[");
		sb.append(getProjectID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectTitle</column-name><column-value><![CDATA[");
		sb.append(getProjectTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectdescription</column-name><column-value><![CDATA[");
		sb.append(getProjectdescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectrequiredskill</column-name><column-value><![CDATA[");
		sb.append(getProjectrequiredskill());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contact</column-name><column-value><![CDATA[");
		sb.append(getContact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _projectID;
	private String _projectTitle;
	private String _projectdescription;
	private String _projectrequiredskill;
	private String _contact;
	private Date _dateAdded;
	private BaseModel<?> _projectdetailRemoteModel;
}