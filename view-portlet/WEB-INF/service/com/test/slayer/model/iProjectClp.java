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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.slayer.service.iProjectLocalServiceUtil;
import com.test.slayer.service.persistence.iProjectPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author anshu
 */
public class iProjectClp extends BaseModelImpl<iProject> implements iProject {
	public iProjectClp() {
	}

	public Class<?> getModelClass() {
		return iProject.class;
	}

	public String getModelClassName() {
		return iProject.class.getName();
	}

	public iProjectPK getPrimaryKey() {
		return new iProjectPK(_projectID, _projectName);
	}

	public void setPrimaryKey(iProjectPK primaryKey) {
		setProjectID(primaryKey.projectID);
		setProjectName(primaryKey.projectName);
	}

	public Serializable getPrimaryKeyObj() {
		return new iProjectPK(_projectID, _projectName);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((iProjectPK)primaryKeyObj);
	}

	@Override
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

	@Override
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

	public long getProjectID() {
		return _projectID;
	}

	public void setProjectID(long projectID) {
		_projectID = projectID;
	}

	public String getProjectName() {
		return _projectName;
	}

	public void setProjectName(String projectName) {
		_projectName = projectName;
	}

	public String getSkillset() {
		return _skillset;
	}

	public void setSkillset(String skillset) {
		_skillset = skillset;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
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

	public BaseModel<?> getiProjectRemoteModel() {
		return _iProjectRemoteModel;
	}

	public void setiProjectRemoteModel(BaseModel<?> iProjectRemoteModel) {
		_iProjectRemoteModel = iProjectRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			iProjectLocalServiceUtil.addiProject(this);
		}
		else {
			iProjectLocalServiceUtil.updateiProject(this);
		}
	}

	@Override
	public iProject toEscapedModel() {
		return (iProject)Proxy.newProxyInstance(iProject.class.getClassLoader(),
			new Class[] { iProject.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		iProjectClp clone = new iProjectClp();

		clone.setProjectID(getProjectID());
		clone.setProjectName(getProjectName());
		clone.setSkillset(getSkillset());
		clone.setDescription(getDescription());
		clone.setContact(getContact());
		clone.setDateAdded(getDateAdded());

		return clone;
	}

	public int compareTo(iProject iProject) {
		int value = 0;

		value = getProjectName().compareTo(iProject.getProjectName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		iProjectClp iProject = null;

		try {
			iProject = (iProjectClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		iProjectPK primaryKey = iProject.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{projectID=");
		sb.append(getProjectID());
		sb.append(", projectName=");
		sb.append(getProjectName());
		sb.append(", skillset=");
		sb.append(getSkillset());
		sb.append(", description=");
		sb.append(getDescription());
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
		sb.append("com.test.slayer.model.iProject");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>projectID</column-name><column-value><![CDATA[");
		sb.append(getProjectID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectName</column-name><column-value><![CDATA[");
		sb.append(getProjectName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>skillset</column-name><column-value><![CDATA[");
		sb.append(getSkillset());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
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
	private String _projectName;
	private String _skillset;
	private String _description;
	private String _contact;
	private Date _dateAdded;
	private BaseModel<?> _iProjectRemoteModel;
}