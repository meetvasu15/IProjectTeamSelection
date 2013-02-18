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

package com.poly.asu.student.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link studentgeninfo}.
 * </p>
 *
 * @author    Shruthi
 * @see       studentgeninfo
 * @generated
 */
public class studentgeninfoWrapper implements studentgeninfo,
	ModelWrapper<studentgeninfo> {
	public studentgeninfoWrapper(studentgeninfo studentgeninfo) {
		_studentgeninfo = studentgeninfo;
	}

	public Class<?> getModelClass() {
		return studentgeninfo.class;
	}

	public String getModelClassName() {
		return studentgeninfo.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentgeninfoid", getStudentgeninfoid());
		attributes.put("name", getName());
		attributes.put("asuid", getAsuid());
		attributes.put("department", getDepartment());
		attributes.put("level", getLevel());
		attributes.put("cummulativegpa", getCummulativegpa());
		attributes.put("loggedinuserId", getLoggedinuserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentgeninfoid = (Long)attributes.get("studentgeninfoid");

		if (studentgeninfoid != null) {
			setStudentgeninfoid(studentgeninfoid);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long asuid = (Long)attributes.get("asuid");

		if (asuid != null) {
			setAsuid(asuid);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		Long level = (Long)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		Float cummulativegpa = (Float)attributes.get("cummulativegpa");

		if (cummulativegpa != null) {
			setCummulativegpa(cummulativegpa);
		}

		Long loggedinuserId = (Long)attributes.get("loggedinuserId");

		if (loggedinuserId != null) {
			setLoggedinuserId(loggedinuserId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this studentgeninfo.
	*
	* @return the primary key of this studentgeninfo
	*/
	public long getPrimaryKey() {
		return _studentgeninfo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this studentgeninfo.
	*
	* @param primaryKey the primary key of this studentgeninfo
	*/
	public void setPrimaryKey(long primaryKey) {
		_studentgeninfo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the studentgeninfoid of this studentgeninfo.
	*
	* @return the studentgeninfoid of this studentgeninfo
	*/
	public long getStudentgeninfoid() {
		return _studentgeninfo.getStudentgeninfoid();
	}

	/**
	* Sets the studentgeninfoid of this studentgeninfo.
	*
	* @param studentgeninfoid the studentgeninfoid of this studentgeninfo
	*/
	public void setStudentgeninfoid(long studentgeninfoid) {
		_studentgeninfo.setStudentgeninfoid(studentgeninfoid);
	}

	/**
	* Returns the name of this studentgeninfo.
	*
	* @return the name of this studentgeninfo
	*/
	public java.lang.String getName() {
		return _studentgeninfo.getName();
	}

	/**
	* Sets the name of this studentgeninfo.
	*
	* @param name the name of this studentgeninfo
	*/
	public void setName(java.lang.String name) {
		_studentgeninfo.setName(name);
	}

	/**
	* Returns the asuid of this studentgeninfo.
	*
	* @return the asuid of this studentgeninfo
	*/
	public long getAsuid() {
		return _studentgeninfo.getAsuid();
	}

	/**
	* Sets the asuid of this studentgeninfo.
	*
	* @param asuid the asuid of this studentgeninfo
	*/
	public void setAsuid(long asuid) {
		_studentgeninfo.setAsuid(asuid);
	}

	/**
	* Returns the department of this studentgeninfo.
	*
	* @return the department of this studentgeninfo
	*/
	public java.lang.String getDepartment() {
		return _studentgeninfo.getDepartment();
	}

	/**
	* Sets the department of this studentgeninfo.
	*
	* @param department the department of this studentgeninfo
	*/
	public void setDepartment(java.lang.String department) {
		_studentgeninfo.setDepartment(department);
	}

	/**
	* Returns the level of this studentgeninfo.
	*
	* @return the level of this studentgeninfo
	*/
	public long getLevel() {
		return _studentgeninfo.getLevel();
	}

	/**
	* Sets the level of this studentgeninfo.
	*
	* @param level the level of this studentgeninfo
	*/
	public void setLevel(long level) {
		_studentgeninfo.setLevel(level);
	}

	/**
	* Returns the cummulativegpa of this studentgeninfo.
	*
	* @return the cummulativegpa of this studentgeninfo
	*/
	public float getCummulativegpa() {
		return _studentgeninfo.getCummulativegpa();
	}

	/**
	* Sets the cummulativegpa of this studentgeninfo.
	*
	* @param cummulativegpa the cummulativegpa of this studentgeninfo
	*/
	public void setCummulativegpa(float cummulativegpa) {
		_studentgeninfo.setCummulativegpa(cummulativegpa);
	}

	/**
	* Returns the loggedinuser ID of this studentgeninfo.
	*
	* @return the loggedinuser ID of this studentgeninfo
	*/
	public long getLoggedinuserId() {
		return _studentgeninfo.getLoggedinuserId();
	}

	/**
	* Sets the loggedinuser ID of this studentgeninfo.
	*
	* @param loggedinuserId the loggedinuser ID of this studentgeninfo
	*/
	public void setLoggedinuserId(long loggedinuserId) {
		_studentgeninfo.setLoggedinuserId(loggedinuserId);
	}

	/**
	* Returns the create date of this studentgeninfo.
	*
	* @return the create date of this studentgeninfo
	*/
	public java.util.Date getCreateDate() {
		return _studentgeninfo.getCreateDate();
	}

	/**
	* Sets the create date of this studentgeninfo.
	*
	* @param createDate the create date of this studentgeninfo
	*/
	public void setCreateDate(java.util.Date createDate) {
		_studentgeninfo.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this studentgeninfo.
	*
	* @return the modified date of this studentgeninfo
	*/
	public java.util.Date getModifiedDate() {
		return _studentgeninfo.getModifiedDate();
	}

	/**
	* Sets the modified date of this studentgeninfo.
	*
	* @param modifiedDate the modified date of this studentgeninfo
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_studentgeninfo.setModifiedDate(modifiedDate);
	}

	public boolean isNew() {
		return _studentgeninfo.isNew();
	}

	public void setNew(boolean n) {
		_studentgeninfo.setNew(n);
	}

	public boolean isCachedModel() {
		return _studentgeninfo.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_studentgeninfo.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _studentgeninfo.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _studentgeninfo.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_studentgeninfo.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _studentgeninfo.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_studentgeninfo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new studentgeninfoWrapper((studentgeninfo)_studentgeninfo.clone());
	}

	public int compareTo(
		com.poly.asu.student.model.studentgeninfo studentgeninfo) {
		return _studentgeninfo.compareTo(studentgeninfo);
	}

	@Override
	public int hashCode() {
		return _studentgeninfo.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.poly.asu.student.model.studentgeninfo> toCacheModel() {
		return _studentgeninfo.toCacheModel();
	}

	public com.poly.asu.student.model.studentgeninfo toEscapedModel() {
		return new studentgeninfoWrapper(_studentgeninfo.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _studentgeninfo.toString();
	}

	public java.lang.String toXmlString() {
		return _studentgeninfo.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentgeninfo.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public studentgeninfo getWrappedstudentgeninfo() {
		return _studentgeninfo;
	}

	public studentgeninfo getWrappedModel() {
		return _studentgeninfo;
	}

	public void resetOriginalValues() {
		_studentgeninfo.resetOriginalValues();
	}

	private studentgeninfo _studentgeninfo;
}