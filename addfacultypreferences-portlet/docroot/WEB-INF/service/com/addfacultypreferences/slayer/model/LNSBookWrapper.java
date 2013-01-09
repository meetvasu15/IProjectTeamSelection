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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LNSBook}.
 * </p>
 *
 * @author    Eshwari
 * @see       LNSBook
 * @generated
 */
public class LNSBookWrapper implements LNSBook, ModelWrapper<LNSBook> {
	public LNSBookWrapper(LNSBook lnsBook) {
		_lnsBook = lnsBook;
	}

	public Class<?> getModelClass() {
		return LNSBook.class;
	}

	public String getModelClassName() {
		return LNSBook.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nameId", getNameId());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("number", getNumber());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

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

	/**
	* Returns the primary key of this l n s book.
	*
	* @return the primary key of this l n s book
	*/
	public long getPrimaryKey() {
		return _lnsBook.getPrimaryKey();
	}

	/**
	* Sets the primary key of this l n s book.
	*
	* @param primaryKey the primary key of this l n s book
	*/
	public void setPrimaryKey(long primaryKey) {
		_lnsBook.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the name ID of this l n s book.
	*
	* @return the name ID of this l n s book
	*/
	public long getNameId() {
		return _lnsBook.getNameId();
	}

	/**
	* Sets the name ID of this l n s book.
	*
	* @param nameId the name ID of this l n s book
	*/
	public void setNameId(long nameId) {
		_lnsBook.setNameId(nameId);
	}

	/**
	* Returns the name of this l n s book.
	*
	* @return the name of this l n s book
	*/
	public java.lang.String getName() {
		return _lnsBook.getName();
	}

	/**
	* Sets the name of this l n s book.
	*
	* @param name the name of this l n s book
	*/
	public void setName(java.lang.String name) {
		_lnsBook.setName(name);
	}

	/**
	* Returns the email of this l n s book.
	*
	* @return the email of this l n s book
	*/
	public java.lang.String getEmail() {
		return _lnsBook.getEmail();
	}

	/**
	* Sets the email of this l n s book.
	*
	* @param email the email of this l n s book
	*/
	public void setEmail(java.lang.String email) {
		_lnsBook.setEmail(email);
	}

	/**
	* Returns the number of this l n s book.
	*
	* @return the number of this l n s book
	*/
	public java.lang.String getNumber() {
		return _lnsBook.getNumber();
	}

	/**
	* Sets the number of this l n s book.
	*
	* @param number the number of this l n s book
	*/
	public void setNumber(java.lang.String number) {
		_lnsBook.setNumber(number);
	}

	/**
	* Returns the date added of this l n s book.
	*
	* @return the date added of this l n s book
	*/
	public java.util.Date getDateAdded() {
		return _lnsBook.getDateAdded();
	}

	/**
	* Sets the date added of this l n s book.
	*
	* @param dateAdded the date added of this l n s book
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_lnsBook.setDateAdded(dateAdded);
	}

	public boolean isNew() {
		return _lnsBook.isNew();
	}

	public void setNew(boolean n) {
		_lnsBook.setNew(n);
	}

	public boolean isCachedModel() {
		return _lnsBook.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_lnsBook.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _lnsBook.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _lnsBook.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lnsBook.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lnsBook.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lnsBook.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LNSBookWrapper((LNSBook)_lnsBook.clone());
	}

	public int compareTo(com.addfacultypreferences.slayer.model.LNSBook lnsBook) {
		return _lnsBook.compareTo(lnsBook);
	}

	@Override
	public int hashCode() {
		return _lnsBook.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.addfacultypreferences.slayer.model.LNSBook> toCacheModel() {
		return _lnsBook.toCacheModel();
	}

	public com.addfacultypreferences.slayer.model.LNSBook toEscapedModel() {
		return new LNSBookWrapper(_lnsBook.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lnsBook.toString();
	}

	public java.lang.String toXmlString() {
		return _lnsBook.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lnsBook.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public LNSBook getWrappedLNSBook() {
		return _lnsBook;
	}

	public LNSBook getWrappedModel() {
		return _lnsBook;
	}

	public void resetOriginalValues() {
		_lnsBook.resetOriginalValues();
	}

	private LNSBook _lnsBook;
}