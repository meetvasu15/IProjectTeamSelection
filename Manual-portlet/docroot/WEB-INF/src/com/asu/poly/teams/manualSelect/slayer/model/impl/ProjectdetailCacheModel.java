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

import com.asu.poly.teams.manualSelect.slayer.model.Projectdetail;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Projectdetail in entity cache.
 *
 * @author Eshwari
 * @see Projectdetail
 * @generated
 */
public class ProjectdetailCacheModel implements CacheModel<Projectdetail>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{projectID=");
		sb.append(projectID);
		sb.append(", projectTitle=");
		sb.append(projectTitle);
		sb.append(", projectdescription=");
		sb.append(projectdescription);
		sb.append(", sponsor=");
		sb.append(sponsor);
		sb.append(", projectrequiredskill=");
		sb.append(projectrequiredskill);
		sb.append(", contact=");
		sb.append(contact);
		sb.append(", status=");
		sb.append(status);
		sb.append(", link=");
		sb.append(link);
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

		if (projectdescription == null) {
			projectdetailImpl.setProjectdescription(StringPool.BLANK);
		}
		else {
			projectdetailImpl.setProjectdescription(projectdescription);
		}

		if (sponsor == null) {
			projectdetailImpl.setSponsor(StringPool.BLANK);
		}
		else {
			projectdetailImpl.setSponsor(sponsor);
		}

		if (projectrequiredskill == null) {
			projectdetailImpl.setProjectrequiredskill(StringPool.BLANK);
		}
		else {
			projectdetailImpl.setProjectrequiredskill(projectrequiredskill);
		}

		if (contact == null) {
			projectdetailImpl.setContact(StringPool.BLANK);
		}
		else {
			projectdetailImpl.setContact(contact);
		}

		if (status == null) {
			projectdetailImpl.setStatus(StringPool.BLANK);
		}
		else {
			projectdetailImpl.setStatus(status);
		}

		if (link == null) {
			projectdetailImpl.setLink(StringPool.BLANK);
		}
		else {
			projectdetailImpl.setLink(link);
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
	public String projectdescription;
	public String sponsor;
	public String projectrequiredskill;
	public String contact;
	public String status;
	public String link;
	public long dateAdded;
	public long dateModified;
}