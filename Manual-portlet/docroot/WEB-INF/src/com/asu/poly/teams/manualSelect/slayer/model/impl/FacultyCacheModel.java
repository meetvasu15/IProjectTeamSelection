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

package com.asu.poly.teams.manualSelect.slayer.model.impl;

import com.asu.poly.teams.manualSelect.slayer.model.Faculty;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Faculty in entity cache.
 *
 * @author Eshwari
 * @see Faculty
 * @generated
 */
public class FacultyCacheModel implements CacheModel<Faculty>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{facultyID=");
		sb.append(facultyID);
		sb.append(", asuid=");
		sb.append(asuid);
		sb.append(", facultyName=");
		sb.append(facultyName);
		sb.append(", facultyDept=");
		sb.append(facultyDept);
		sb.append(", contact=");
		sb.append(contact);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append(", dateModified=");
		sb.append(dateModified);
		sb.append("}");

		return sb.toString();
	}

	public Faculty toEntityModel() {
		FacultyImpl facultyImpl = new FacultyImpl();

		facultyImpl.setFacultyID(facultyID);

		if (asuid == null) {
			facultyImpl.setAsuid(StringPool.BLANK);
		}
		else {
			facultyImpl.setAsuid(asuid);
		}

		if (facultyName == null) {
			facultyImpl.setFacultyName(StringPool.BLANK);
		}
		else {
			facultyImpl.setFacultyName(facultyName);
		}

		if (facultyDept == null) {
			facultyImpl.setFacultyDept(StringPool.BLANK);
		}
		else {
			facultyImpl.setFacultyDept(facultyDept);
		}

		if (contact == null) {
			facultyImpl.setContact(StringPool.BLANK);
		}
		else {
			facultyImpl.setContact(contact);
		}

		if (dateAdded == Long.MIN_VALUE) {
			facultyImpl.setDateAdded(null);
		}
		else {
			facultyImpl.setDateAdded(new Date(dateAdded));
		}

		if (dateModified == Long.MIN_VALUE) {
			facultyImpl.setDateModified(null);
		}
		else {
			facultyImpl.setDateModified(new Date(dateModified));
		}

		facultyImpl.resetOriginalValues();

		return facultyImpl;
	}

	public long facultyID;
	public String asuid;
	public String facultyName;
	public String facultyDept;
	public String contact;
	public long dateAdded;
	public long dateModified;
}