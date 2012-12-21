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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.slayer.model.iProject;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing iProject in entity cache.
 *
 * @author anshu
 * @see iProject
 * @generated
 */
public class iProjectCacheModel implements CacheModel<iProject>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{projectID=");
		sb.append(projectID);
		sb.append(", projectName=");
		sb.append(projectName);
		sb.append(", skillset=");
		sb.append(skillset);
		sb.append(", description=");
		sb.append(description);
		sb.append(", contact=");
		sb.append(contact);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append("}");

		return sb.toString();
	}

	public iProject toEntityModel() {
		iProjectImpl iProjectImpl = new iProjectImpl();

		iProjectImpl.setProjectID(projectID);

		if (projectName == null) {
			iProjectImpl.setProjectName(StringPool.BLANK);
		}
		else {
			iProjectImpl.setProjectName(projectName);
		}

		if (skillset == null) {
			iProjectImpl.setSkillset(StringPool.BLANK);
		}
		else {
			iProjectImpl.setSkillset(skillset);
		}

		if (description == null) {
			iProjectImpl.setDescription(StringPool.BLANK);
		}
		else {
			iProjectImpl.setDescription(description);
		}

		if (contact == null) {
			iProjectImpl.setContact(StringPool.BLANK);
		}
		else {
			iProjectImpl.setContact(contact);
		}

		if (dateAdded == Long.MIN_VALUE) {
			iProjectImpl.setDateAdded(null);
		}
		else {
			iProjectImpl.setDateAdded(new Date(dateAdded));
		}

		iProjectImpl.resetOriginalValues();

		return iProjectImpl;
	}

	public long projectID;
	public String projectName;
	public String skillset;
	public String description;
	public String contact;
	public long dateAdded;
}