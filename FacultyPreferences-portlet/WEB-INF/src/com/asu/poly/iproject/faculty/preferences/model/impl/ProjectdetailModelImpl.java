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

package com.asu.poly.iproject.faculty.preferences.model.impl;

import com.asu.poly.iproject.faculty.preferences.model.Projectdetail;
import com.asu.poly.iproject.faculty.preferences.model.ProjectdetailModel;
import com.asu.poly.iproject.faculty.preferences.model.ProjectdetailSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Projectdetail service. Represents a row in the &quot;iproject_projectdetail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.asu.poly.iproject.faculty.preferences.model.ProjectdetailModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProjectdetailImpl}.
 * </p>
 *
 * @author emente
 * @see ProjectdetailImpl
 * @see com.asu.poly.iproject.faculty.preferences.model.Projectdetail
 * @see com.asu.poly.iproject.faculty.preferences.model.ProjectdetailModel
 * @generated
 */
@JSON(strict = true)
public class ProjectdetailModelImpl extends BaseModelImpl<Projectdetail>
	implements ProjectdetailModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a projectdetail model instance should use the {@link com.asu.poly.iproject.faculty.preferences.model.Projectdetail} interface instead.
	 */
	public static final String TABLE_NAME = "iproject_projectdetail";
	public static final Object[][] TABLE_COLUMNS = {
			{ "projectID", Types.BIGINT },
			{ "projectTitle", Types.VARCHAR },
			{ "dateAdded", Types.TIMESTAMP },
			{ "dateModified", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table iproject_projectdetail (projectID LONG not null primary key,projectTitle VARCHAR(75) null,dateAdded DATE null,dateModified DATE null)";
	public static final String TABLE_SQL_DROP = "drop table iproject_projectdetail";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.asu.poly.iproject.faculty.preferences.model.Projectdetail"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.asu.poly.iproject.faculty.preferences.model.Projectdetail"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Projectdetail toModel(ProjectdetailSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Projectdetail model = new ProjectdetailImpl();

		model.setProjectID(soapModel.getProjectID());
		model.setProjectTitle(soapModel.getProjectTitle());
		model.setDateAdded(soapModel.getDateAdded());
		model.setDateModified(soapModel.getDateModified());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Projectdetail> toModels(ProjectdetailSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Projectdetail> models = new ArrayList<Projectdetail>(soapModels.length);

		for (ProjectdetailSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.asu.poly.iproject.faculty.preferences.model.Projectdetail"));

	public ProjectdetailModelImpl() {
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

	public Class<?> getModelClass() {
		return Projectdetail.class;
	}

	public String getModelClassName() {
		return Projectdetail.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("projectID", getProjectID());
		attributes.put("projectTitle", getProjectTitle());
		attributes.put("dateAdded", getDateAdded());
		attributes.put("dateModified", getDateModified());

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

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}

		Date dateModified = (Date)attributes.get("dateModified");

		if (dateModified != null) {
			setDateModified(dateModified);
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
	public String getProjectTitle() {
		if (_projectTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _projectTitle;
		}
	}

	public void setProjectTitle(String projectTitle) {
		_projectTitle = projectTitle;
	}

	@JSON
	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	@JSON
	public Date getDateModified() {
		return _dateModified;
	}

	public void setDateModified(Date dateModified) {
		_dateModified = dateModified;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Projectdetail.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Projectdetail toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Projectdetail)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		ProjectdetailImpl projectdetailImpl = new ProjectdetailImpl();

		projectdetailImpl.setProjectID(getProjectID());
		projectdetailImpl.setProjectTitle(getProjectTitle());
		projectdetailImpl.setDateAdded(getDateAdded());
		projectdetailImpl.setDateModified(getDateModified());

		projectdetailImpl.resetOriginalValues();

		return projectdetailImpl;
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

		Projectdetail projectdetail = null;

		try {
			projectdetail = (Projectdetail)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Projectdetail> toCacheModel() {
		ProjectdetailCacheModel projectdetailCacheModel = new ProjectdetailCacheModel();

		projectdetailCacheModel.projectID = getProjectID();

		projectdetailCacheModel.projectTitle = getProjectTitle();

		String projectTitle = projectdetailCacheModel.projectTitle;

		if ((projectTitle != null) && (projectTitle.length() == 0)) {
			projectdetailCacheModel.projectTitle = null;
		}

		Date dateAdded = getDateAdded();

		if (dateAdded != null) {
			projectdetailCacheModel.dateAdded = dateAdded.getTime();
		}
		else {
			projectdetailCacheModel.dateAdded = Long.MIN_VALUE;
		}

		Date dateModified = getDateModified();

		if (dateModified != null) {
			projectdetailCacheModel.dateModified = dateModified.getTime();
		}
		else {
			projectdetailCacheModel.dateModified = Long.MIN_VALUE;
		}

		return projectdetailCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{projectID=");
		sb.append(getProjectID());
		sb.append(", projectTitle=");
		sb.append(getProjectTitle());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append(", dateModified=");
		sb.append(getDateModified());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append(
			"com.asu.poly.iproject.faculty.preferences.model.Projectdetail");
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
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateModified</column-name><column-value><![CDATA[");
		sb.append(getDateModified());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Projectdetail.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Projectdetail.class
		};
	private long _projectID;
	private String _projectTitle;
	private Date _dateAdded;
	private Date _dateModified;
	private Projectdetail _escapedModelProxy;
}