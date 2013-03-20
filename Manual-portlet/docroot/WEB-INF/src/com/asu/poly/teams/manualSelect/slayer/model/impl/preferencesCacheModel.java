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

import com.asu.poly.teams.manualSelect.slayer.model.preferences;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing preferences in entity cache.
 *
 * @author Eshwari
 * @see preferences
 * @generated
 */
public class preferencesCacheModel implements CacheModel<preferences>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{facultyID=");
		sb.append(facultyID);
		sb.append(", ASUID=");
		sb.append(ASUID);
		sb.append(", preference1=");
		sb.append(preference1);
		sb.append(", preference2=");
		sb.append(preference2);
		sb.append(", preference3=");
		sb.append(preference3);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append(", dateModified=");
		sb.append(dateModified);
		sb.append("}");

		return sb.toString();
	}

	public preferences toEntityModel() {
		preferencesImpl preferencesImpl = new preferencesImpl();

		preferencesImpl.setFacultyID(facultyID);

		if (ASUID == null) {
			preferencesImpl.setASUID(StringPool.BLANK);
		}
		else {
			preferencesImpl.setASUID(ASUID);
		}

		if (preference1 == null) {
			preferencesImpl.setPreference1(StringPool.BLANK);
		}
		else {
			preferencesImpl.setPreference1(preference1);
		}

		if (preference2 == null) {
			preferencesImpl.setPreference2(StringPool.BLANK);
		}
		else {
			preferencesImpl.setPreference2(preference2);
		}

		if (preference3 == null) {
			preferencesImpl.setPreference3(StringPool.BLANK);
		}
		else {
			preferencesImpl.setPreference3(preference3);
		}

		if (dateAdded == Long.MIN_VALUE) {
			preferencesImpl.setDateAdded(null);
		}
		else {
			preferencesImpl.setDateAdded(new Date(dateAdded));
		}

		if (dateModified == Long.MIN_VALUE) {
			preferencesImpl.setDateModified(null);
		}
		else {
			preferencesImpl.setDateModified(new Date(dateModified));
		}

		preferencesImpl.resetOriginalValues();

		return preferencesImpl;
	}

	public long facultyID;
	public String ASUID;
	public String preference1;
	public String preference2;
	public String preference3;
	public long dateAdded;
	public long dateModified;
}