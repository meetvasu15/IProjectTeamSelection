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

package com.poly.asu.student.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.poly.asu.student.model.studentgeninfo;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing studentgeninfo in entity cache.
 *
 * @author Shruthi
 * @see studentgeninfo
 * @generated
 */
public class studentgeninfoCacheModel implements CacheModel<studentgeninfo>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{studentgeninfoid=");
		sb.append(studentgeninfoid);
		sb.append(", name=");
		sb.append(name);
		sb.append(", asuid=");
		sb.append(asuid);
		sb.append(", department=");
		sb.append(department);
		sb.append(", level=");
		sb.append(level);
		sb.append(", cummulativegpa=");
		sb.append(cummulativegpa);
		sb.append(", loggedinuserId=");
		sb.append(loggedinuserId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	public studentgeninfo toEntityModel() {
		studentgeninfoImpl studentgeninfoImpl = new studentgeninfoImpl();

		studentgeninfoImpl.setStudentgeninfoid(studentgeninfoid);

		if (name == null) {
			studentgeninfoImpl.setName(StringPool.BLANK);
		}
		else {
			studentgeninfoImpl.setName(name);
		}

		studentgeninfoImpl.setAsuid(asuid);

		if (department == null) {
			studentgeninfoImpl.setDepartment(StringPool.BLANK);
		}
		else {
			studentgeninfoImpl.setDepartment(department);
		}

		studentgeninfoImpl.setLevel(level);
		studentgeninfoImpl.setCummulativegpa(cummulativegpa);
		studentgeninfoImpl.setLoggedinuserId(loggedinuserId);

		if (createDate == Long.MIN_VALUE) {
			studentgeninfoImpl.setCreateDate(null);
		}
		else {
			studentgeninfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			studentgeninfoImpl.setModifiedDate(null);
		}
		else {
			studentgeninfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		studentgeninfoImpl.resetOriginalValues();

		return studentgeninfoImpl;
	}

	public long studentgeninfoid;
	public String name;
	public long asuid;
	public String department;
	public long level;
	public float cummulativegpa;
	public long loggedinuserId;
	public long createDate;
	public long modifiedDate;
}