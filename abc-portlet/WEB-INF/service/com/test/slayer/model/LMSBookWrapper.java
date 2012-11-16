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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LMSBook}.
 * </p>
 *
 * @author    anshu
 * @see       LMSBook
 * @generated
 */
public class LMSBookWrapper implements LMSBook, ModelWrapper<LMSBook> {
	public LMSBookWrapper(LMSBook lmsBook) {
		_lmsBook = lmsBook;
	}

	public Class<?> getModelClass() {
		return LMSBook.class;
	}

	public String getModelClassName() {
		return LMSBook.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bookId", getBookId());
		attributes.put("asuid", getAsuid());
		attributes.put("email", getEmail());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

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

	/**
	* Returns the primary key of this l m s book.
	*
	* @return the primary key of this l m s book
	*/
	public long getPrimaryKey() {
		return _lmsBook.getPrimaryKey();
	}

	/**
	* Sets the primary key of this l m s book.
	*
	* @param primaryKey the primary key of this l m s book
	*/
	public void setPrimaryKey(long primaryKey) {
		_lmsBook.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the book ID of this l m s book.
	*
	* @return the book ID of this l m s book
	*/
	public long getBookId() {
		return _lmsBook.getBookId();
	}

	/**
	* Sets the book ID of this l m s book.
	*
	* @param bookId the book ID of this l m s book
	*/
	public void setBookId(long bookId) {
		_lmsBook.setBookId(bookId);
	}

	/**
	* Returns the asuid of this l m s book.
	*
	* @return the asuid of this l m s book
	*/
	public java.lang.String getAsuid() {
		return _lmsBook.getAsuid();
	}

	/**
	* Sets the asuid of this l m s book.
	*
	* @param asuid the asuid of this l m s book
	*/
	public void setAsuid(java.lang.String asuid) {
		_lmsBook.setAsuid(asuid);
	}

	/**
	* Returns the email of this l m s book.
	*
	* @return the email of this l m s book
	*/
	public java.lang.String getEmail() {
		return _lmsBook.getEmail();
	}

	/**
	* Sets the email of this l m s book.
	*
	* @param email the email of this l m s book
	*/
	public void setEmail(java.lang.String email) {
		_lmsBook.setEmail(email);
	}

	/**
	* Returns the date added of this l m s book.
	*
	* @return the date added of this l m s book
	*/
	public java.util.Date getDateAdded() {
		return _lmsBook.getDateAdded();
	}

	/**
	* Sets the date added of this l m s book.
	*
	* @param dateAdded the date added of this l m s book
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_lmsBook.setDateAdded(dateAdded);
	}

	public boolean isNew() {
		return _lmsBook.isNew();
	}

	public void setNew(boolean n) {
		_lmsBook.setNew(n);
	}

	public boolean isCachedModel() {
		return _lmsBook.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_lmsBook.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _lmsBook.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _lmsBook.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lmsBook.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lmsBook.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lmsBook.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LMSBookWrapper((LMSBook)_lmsBook.clone());
	}

	public int compareTo(LMSBook lmsBook) {
		return _lmsBook.compareTo(lmsBook);
	}

	@Override
	public int hashCode() {
		return _lmsBook.hashCode();
	}

	public com.liferay.portal.model.CacheModel<LMSBook> toCacheModel() {
		return _lmsBook.toCacheModel();
	}

	public LMSBook toEscapedModel() {
		return new LMSBookWrapper(_lmsBook.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lmsBook.toString();
	}

	public java.lang.String toXmlString() {
		return _lmsBook.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lmsBook.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public LMSBook getWrappedLMSBook() {
		return _lmsBook;
	}

	public LMSBook getWrappedModel() {
		return _lmsBook;
	}

	public void resetOriginalValues() {
		_lmsBook.resetOriginalValues();
	}

	private LMSBook _lmsBook;
}