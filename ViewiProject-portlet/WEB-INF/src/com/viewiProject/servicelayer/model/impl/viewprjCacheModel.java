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

package com.viewiProject.servicelayer.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.viewiProject.servicelayer.model.viewprj;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing viewprj in entity cache.
 *
 * @author Shruthi
 * @see viewprj
 * @generated
 */
public class viewprjCacheModel implements CacheModel<viewprj>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{projectId=");
		sb.append(projectId);
		sb.append(", projectTitle=");
		sb.append(projectTitle);
		sb.append(", projectdescription=");
		sb.append(projectdescription);
		sb.append(", projectrequiredskill=");
		sb.append(projectrequiredskill);
		sb.append(", contact=");
		sb.append(contact);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append("}");

		return sb.toString();
	}

	public viewprj toEntityModel() {
		viewprjImpl viewprjImpl = new viewprjImpl();

		viewprjImpl.setProjectId(projectId);

		if (projectTitle == null) {
			viewprjImpl.setProjectTitle(StringPool.BLANK);
		}
		else {
			viewprjImpl.setProjectTitle(projectTitle);
		}

		if (projectdescription == null) {
			viewprjImpl.setProjectdescription(StringPool.BLANK);
		}
		else {
			viewprjImpl.setProjectdescription(projectdescription);
		}

		if (projectrequiredskill == null) {
			viewprjImpl.setProjectrequiredskill(StringPool.BLANK);
		}
		else {
			viewprjImpl.setProjectrequiredskill(projectrequiredskill);
		}

		if (contact == null) {
			viewprjImpl.setContact(StringPool.BLANK);
		}
		else {
			viewprjImpl.setContact(contact);
		}

		if (dateAdded == Long.MIN_VALUE) {
			viewprjImpl.setDateAdded(null);
		}
		else {
			viewprjImpl.setDateAdded(new Date(dateAdded));
		}

		viewprjImpl.resetOriginalValues();

		return viewprjImpl;
	}

	public long projectId;
	public String projectTitle;
	public String projectdescription;
	public String projectrequiredskill;
	public String contact;
	public long dateAdded;
}