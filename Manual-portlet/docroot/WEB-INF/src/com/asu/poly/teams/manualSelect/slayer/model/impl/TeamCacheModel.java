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

import com.asu.poly.teams.manualSelect.slayer.model.Team;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Team in entity cache.
 *
 * @author Eshwari
 * @see Team
 * @generated
 */
public class TeamCacheModel implements CacheModel<Team>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{teamID=");
		sb.append(teamID);
		sb.append(", projectTitle=");
		sb.append(projectTitle);
		sb.append(", faculty1=");
		sb.append(faculty1);
		sb.append(", faculty2=");
		sb.append(faculty2);
		sb.append(", faculty3=");
		sb.append(faculty3);
		sb.append(", faculty4=");
		sb.append(faculty4);
		sb.append(", student0=");
		sb.append(student0);
		sb.append(", student1=");
		sb.append(student1);
		sb.append(", student2=");
		sb.append(student2);
		sb.append(", student3=");
		sb.append(student3);
		sb.append(", student4=");
		sb.append(student4);
		sb.append(", student5=");
		sb.append(student5);
		sb.append(", student6=");
		sb.append(student6);
		sb.append(", student7=");
		sb.append(student7);
		sb.append(", student8=");
		sb.append(student8);
		sb.append(", student9=");
		sb.append(student9);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append(", dateModified=");
		sb.append(dateModified);
		sb.append("}");

		return sb.toString();
	}

	public Team toEntityModel() {
		TeamImpl teamImpl = new TeamImpl();

		teamImpl.setTeamID(teamID);

		if (projectTitle == null) {
			teamImpl.setProjectTitle(StringPool.BLANK);
		}
		else {
			teamImpl.setProjectTitle(projectTitle);
		}

		if (faculty1 == null) {
			teamImpl.setFaculty1(StringPool.BLANK);
		}
		else {
			teamImpl.setFaculty1(faculty1);
		}

		if (faculty2 == null) {
			teamImpl.setFaculty2(StringPool.BLANK);
		}
		else {
			teamImpl.setFaculty2(faculty2);
		}

		if (faculty3 == null) {
			teamImpl.setFaculty3(StringPool.BLANK);
		}
		else {
			teamImpl.setFaculty3(faculty3);
		}

		if (faculty4 == null) {
			teamImpl.setFaculty4(StringPool.BLANK);
		}
		else {
			teamImpl.setFaculty4(faculty4);
		}

		if (student0 == null) {
			teamImpl.setStudent0(StringPool.BLANK);
		}
		else {
			teamImpl.setStudent0(student0);
		}

		if (student1 == null) {
			teamImpl.setStudent1(StringPool.BLANK);
		}
		else {
			teamImpl.setStudent1(student1);
		}

		if (student2 == null) {
			teamImpl.setStudent2(StringPool.BLANK);
		}
		else {
			teamImpl.setStudent2(student2);
		}

		if (student3 == null) {
			teamImpl.setStudent3(StringPool.BLANK);
		}
		else {
			teamImpl.setStudent3(student3);
		}

		if (student4 == null) {
			teamImpl.setStudent4(StringPool.BLANK);
		}
		else {
			teamImpl.setStudent4(student4);
		}

		if (student5 == null) {
			teamImpl.setStudent5(StringPool.BLANK);
		}
		else {
			teamImpl.setStudent5(student5);
		}

		if (student6 == null) {
			teamImpl.setStudent6(StringPool.BLANK);
		}
		else {
			teamImpl.setStudent6(student6);
		}

		if (student7 == null) {
			teamImpl.setStudent7(StringPool.BLANK);
		}
		else {
			teamImpl.setStudent7(student7);
		}

		if (student8 == null) {
			teamImpl.setStudent8(StringPool.BLANK);
		}
		else {
			teamImpl.setStudent8(student8);
		}

		if (student9 == null) {
			teamImpl.setStudent9(StringPool.BLANK);
		}
		else {
			teamImpl.setStudent9(student9);
		}

		if (dateAdded == Long.MIN_VALUE) {
			teamImpl.setDateAdded(null);
		}
		else {
			teamImpl.setDateAdded(new Date(dateAdded));
		}

		if (dateModified == Long.MIN_VALUE) {
			teamImpl.setDateModified(null);
		}
		else {
			teamImpl.setDateModified(new Date(dateModified));
		}

		teamImpl.resetOriginalValues();

		return teamImpl;
	}

	public long teamID;
	public String projectTitle;
	public String faculty1;
	public String faculty2;
	public String faculty3;
	public String faculty4;
	public String student0;
	public String student1;
	public String student2;
	public String student3;
	public String student4;
	public String student5;
	public String student6;
	public String student7;
	public String student8;
	public String student9;
	public long dateAdded;
	public long dateModified;
}