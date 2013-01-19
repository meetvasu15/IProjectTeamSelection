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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Projectdetail in entity cache.
 *
 * @author emente
 * @see Projectdetail
 * @generated
 */
public class ProjectdetailCacheModel implements CacheModel<Projectdetail>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{projectID=");
		sb.append(projectID);
		sb.append(", projectTitle=");
		sb.append(projectTitle);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append(", dateModified=");
		sb.append(dateModified);
		sb.append("}");

		return sb.toString();
	}

	public Projectdetail toEntityModel() {
		ProjectdetailImpl projectdetailImpl = new ProjectdetailImpl();

		projectdetailImpl.setProjectID(projectID);

		if (projectTitle == null) {
			projectdetailImpl.setProjectTitle(StringPool.BLANK);
		}
		else {
			projectdetailImpl.setProjectTitle(projectTitle);
		}

		if (dateAdded == Long.MIN_VALUE) {
			projectdetailImpl.setDateAdded(null);
		}
		else {
			projectdetailImpl.setDateAdded(new Date(dateAdded));
		}

		if (dateModified == Long.MIN_VALUE) {
			projectdetailImpl.setDateModified(null);
		}
		else {
			projectdetailImpl.setDateModified(new Date(dateModified));
		}

		projectdetailImpl.resetOriginalValues();

		return projectdetailImpl;
	}

	public long projectID;
	public String projectTitle;
	public long dateAdded;
	public long dateModified;
}