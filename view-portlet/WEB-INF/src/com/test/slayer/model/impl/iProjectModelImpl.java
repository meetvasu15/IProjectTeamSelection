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

package com.test.slayer.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.slayer.model.iProject;
import com.test.slayer.model.iProjectModel;
import com.test.slayer.model.iProjectSoap;
import com.test.slayer.service.persistence.iProjectPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the iProject service. Represents a row in the &quot;iproject_iproject&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.test.slayer.model.iProjectModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link iProjectImpl}.
 * </p>
 *
 * @author anshu
 * @see iProjectImpl
 * @see com.test.slayer.model.iProject
 * @see com.test.slayer.model.iProjectModel
 * @generated
 */
@JSON(strict = true)
public class iProjectModelImpl extends BaseModelImpl<iProject>
	implements iProjectModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a i project model instance should use the {@link com.test.slayer.model.iProject} interface instead.
	 */
	public static final String TABLE_NAME = "iproject_iproject";
	public static final Object[][] TABLE_COLUMNS = {
			{ "projectID", Types.BIGINT },
			{ "projectName", Types.VARCHAR },
			{ "skillset", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "contact", Types.VARCHAR },
			{ "dateAdded", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table iproject_iproject (projectID LONG not null,projectName VARCHAR(75) not null,skillset VARCHAR(75) null,description VARCHAR(75) null,contact VARCHAR(75) null,dateAdded DATE null,primary key (projectID, projectName))";
	public static final String TABLE_SQL_DROP = "drop table iproject_iproject";
	public static final String ORDER_BY_JPQL = " ORDER BY iProject.id.projectName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY iproject_iproject.projectName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.test.slayer.model.iProject"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.test.slayer.model.iProject"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static iProject toModel(iProjectSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		iProject model = new iProjectImpl();

		model.setProjectID(soapModel.getProjectID());
		model.setProjectName(soapModel.getProjectName());
		model.setSkillset(soapModel.getSkillset());
		model.setDescription(soapModel.getDescription());
		model.setContact(soapModel.getContact());
		model.setDateAdded(soapModel.getDateAdded());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<iProject> toModels(iProjectSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<iProject> models = new ArrayList<iProject>(soapModels.length);

		for (iProjectSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.test.slayer.model.iProject"));

	public iProjectModelImpl() {
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

	public Class<?> getModelClass() {
		return iProject.class;
	}

	public String getModelClassName() {
		return iProject.class.getName();
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

	@JSON
	public long getProjectID() {
		return _projectID;
	}

	public void setProjectID(long projectID) {
		_projectID = projectID;
	}

	@JSON
	public String getProjectName() {
		if (_projectName == null) {
			return StringPool.BLANK;
		}
		else {
			return _projectName;
		}
	}

	public void setProjectName(String projectName) {
		_projectName = projectName;
	}

	@JSON
	public String getSkillset() {
		if (_skillset == null) {
			return StringPool.BLANK;
		}
		else {
			return _skillset;
		}
	}

	public void setSkillset(String skillset) {
		_skillset = skillset;
	}

	@JSON
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	public String getContact() {
		if (_contact == null) {
			return StringPool.BLANK;
		}
		else {
			return _contact;
		}
	}

	public void setContact(String contact) {
		_contact = contact;
	}

	@JSON
	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	@Override
	public iProject toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (iProject)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		iProjectImpl iProjectImpl = new iProjectImpl();

		iProjectImpl.setProjectID(getProjectID());
		iProjectImpl.setProjectName(getProjectName());
		iProjectImpl.setSkillset(getSkillset());
		iProjectImpl.setDescription(getDescription());
		iProjectImpl.setContact(getContact());
		iProjectImpl.setDateAdded(getDateAdded());

		iProjectImpl.resetOriginalValues();

		return iProjectImpl;
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

		iProject iProject = null;

		try {
			iProject = (iProject)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<iProject> toCacheModel() {
		iProjectCacheModel iProjectCacheModel = new iProjectCacheModel();

		iProjectCacheModel.projectID = getProjectID();

		iProjectCacheModel.projectName = getProjectName();

		String projectName = iProjectCacheModel.projectName;

		if ((projectName != null) && (projectName.length() == 0)) {
			iProjectCacheModel.projectName = null;
		}

		iProjectCacheModel.skillset = getSkillset();

		String skillset = iProjectCacheModel.skillset;

		if ((skillset != null) && (skillset.length() == 0)) {
			iProjectCacheModel.skillset = null;
		}

		iProjectCacheModel.description = getDescription();

		String description = iProjectCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			iProjectCacheModel.description = null;
		}

		iProjectCacheModel.contact = getContact();

		String contact = iProjectCacheModel.contact;

		if ((contact != null) && (contact.length() == 0)) {
			iProjectCacheModel.contact = null;
		}

		Date dateAdded = getDateAdded();

		if (dateAdded != null) {
			iProjectCacheModel.dateAdded = dateAdded.getTime();
		}
		else {
			iProjectCacheModel.dateAdded = Long.MIN_VALUE;
		}

		return iProjectCacheModel;
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

	private static ClassLoader _classLoader = iProject.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			iProject.class
		};
	private long _projectID;
	private String _projectName;
	private String _skillset;
	private String _description;
	private String _contact;
	private Date _dateAdded;
	private iProject _escapedModelProxy;
}