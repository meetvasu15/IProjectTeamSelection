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

package com.asu.iproject.student.skillset.model.impl;

import com.asu.iproject.student.skillset.model.Skillset;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Skillset in entity cache.
 *
 * @author zhengyan
 * @see Skillset
 * @generated
 */
public class SkillsetCacheModel implements CacheModel<Skillset>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{studentID=");
		sb.append(studentID);
		sb.append(", asuid=");
		sb.append(asuid);
		sb.append(", email=");
		sb.append(email);
		sb.append(", skill1=");
		sb.append(skill1);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append("}");

		return sb.toString();
	}

	public Skillset toEntityModel() {
		SkillsetImpl skillsetImpl = new SkillsetImpl();

		skillsetImpl.setStudentID(studentID);

		if (asuid == null) {
			skillsetImpl.setAsuid(StringPool.BLANK);
		}
		else {
			skillsetImpl.setAsuid(asuid);
		}

		if (email == null) {
			skillsetImpl.setEmail(StringPool.BLANK);
		}
		else {
			skillsetImpl.setEmail(email);
		}

		if (skill1 == null) {
			skillsetImpl.setSkill1(StringPool.BLANK);
		}
		else {
			skillsetImpl.setSkill1(skill1);
		}

		if (dateAdded == Long.MIN_VALUE) {
			skillsetImpl.setDateAdded(null);
		}
		else {
			skillsetImpl.setDateAdded(new Date(dateAdded));
		}

		skillsetImpl.resetOriginalValues();

		return skillsetImpl;
	}

	public long studentID;
	public String asuid;
	public String email;
	public String skill1;
	public long dateAdded;
}