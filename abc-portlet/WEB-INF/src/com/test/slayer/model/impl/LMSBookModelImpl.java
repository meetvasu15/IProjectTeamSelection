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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.test.slayer.model.LMSBook;
import com.test.slayer.model.LMSBookModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LMSBook service. Represents a row in the &quot;LMS_LMSBook&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.test.slayer.model.LMSBookModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LMSBookImpl}.
 * </p>
 *
 * @author anshu
 * @see LMSBookImpl
 * @see com.test.slayer.model.LMSBook
 * @see com.test.slayer.model.LMSBookModel
 * @generated
 */
public class LMSBookModelImpl extends BaseModelImpl<LMSBook>
	implements LMSBookModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a l m s book model instance should use the {@link com.test.slayer.model.LMSBook} interface instead.
	 */
	public static final String TABLE_NAME = "LMS_LMSBook";
	public static final Object[][] TABLE_COLUMNS = {
			{ "bookId", Types.BIGINT },
			{ "asuid", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "dateAdded", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table LMS_LMSBook (bookId LONG not null primary key,asuid VARCHAR(75) null,email VARCHAR(75) null,dateAdded DATE null)";
	public static final String TABLE_SQL_DROP = "drop table LMS_LMSBook";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.test.slayer.model.LMSBook"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.test.slayer.model.LMSBook"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.test.slayer.model.LMSBook"));

	public LMSBookModelImpl() {
	}

	public long getPrimaryKey() {
		return _bookId;
	}

	public void setPrimaryKey(long primaryKey) {
		setBookId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_bookId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return LMSBook.class;
	}

	public String getModelClassName() {
		return LMSBook.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bookId", getBookId());
		attributes.put("asuid", getAsuid());
		attributes.put("email", getEmail());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		String asuid = (String)attributes.get("asuid");

		if (asuid != null) {
			setAsuid(asuid);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
	}

	public String getAsuid() {
		if (_asuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _asuid;
		}
	}

	public void setAsuid(String asuid) {
		_asuid = asuid;
	}

	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	public void setEmail(String email) {
		_email = email;
	}

	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			LMSBook.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LMSBook toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (LMSBook)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		LMSBookImpl lmsBookImpl = new LMSBookImpl();

		lmsBookImpl.setBookId(getBookId());
		lmsBookImpl.setAsuid(getAsuid());
		lmsBookImpl.setEmail(getEmail());
		lmsBookImpl.setDateAdded(getDateAdded());

		lmsBookImpl.resetOriginalValues();

		return lmsBookImpl;
	}

	public int compareTo(LMSBook lmsBook) {
		long primaryKey = lmsBook.getPrimaryKey();

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

		LMSBook lmsBook = null;

		try {
			lmsBook = (LMSBook)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = lmsBook.getPrimaryKey();

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
	public CacheModel<LMSBook> toCacheModel() {
		LMSBookCacheModel lmsBookCacheModel = new LMSBookCacheModel();

		lmsBookCacheModel.bookId = getBookId();

		lmsBookCacheModel.asuid = getAsuid();

		String asuid = lmsBookCacheModel.asuid;

		if ((asuid != null) && (asuid.length() == 0)) {
			lmsBookCacheModel.asuid = null;
		}

		lmsBookCacheModel.email = getEmail();

		String email = lmsBookCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			lmsBookCacheModel.email = null;
		}

		Date dateAdded = getDateAdded();

		if (dateAdded != null) {
			lmsBookCacheModel.dateAdded = dateAdded.getTime();
		}
		else {
			lmsBookCacheModel.dateAdded = Long.MIN_VALUE;
		}

		return lmsBookCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{bookId=");
		sb.append(getBookId());
		sb.append(", asuid=");
		sb.append(getAsuid());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.test.slayer.model.LMSBook");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>bookId</column-name><column-value><![CDATA[");
		sb.append(getBookId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asuid</column-name><column-value><![CDATA[");
		sb.append(getAsuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LMSBook.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			LMSBook.class
		};
	private long _bookId;
	private String _asuid;
	private String _email;
	private Date _dateAdded;
	private LMSBook _escapedModelProxy;
}