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

import com.asu.poly.teams.manualSelect.slayer.model.Student;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author asingh64
 * @see Student
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{studentID=");
		sb.append(studentID);
		sb.append(", asuid=");
		sb.append(asuid);
		sb.append(", studentName=");
		sb.append(studentName);
		sb.append(", level=");
		sb.append(level);
		sb.append(", course=");
		sb.append(course);
		sb.append(", gpa=");
		sb.append(gpa);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append(", dateModified=");
		sb.append(dateModified);
		sb.append("}");

		return sb.toString();
	}

	public Student toEntityModel() {
		StudentImpl studentImpl = new StudentImpl();

		studentImpl.setStudentID(studentID);

		if (asuid == null) {
			studentImpl.setAsuid(StringPool.BLANK);
		}
		else {
			studentImpl.setAsuid(asuid);
		}

		if (studentName == null) {
			studentImpl.setStudentName(StringPool.BLANK);
		}
		else {
			studentImpl.setStudentName(studentName);
		}

		if (level == null) {
			studentImpl.setLevel(StringPool.BLANK);
		}
		else {
			studentImpl.setLevel(level);
		}

		if (course == null) {
			studentImpl.setCourse(StringPool.BLANK);
		}
		else {
			studentImpl.setCourse(course);
		}

		if (gpa == null) {
			studentImpl.setGpa(StringPool.BLANK);
		}
		else {
			studentImpl.setGpa(gpa);
		}

		if (sex == null) {
			studentImpl.setSex(StringPool.BLANK);
		}
		else {
			studentImpl.setSex(sex);
		}

		if (dateAdded == Long.MIN_VALUE) {
			studentImpl.setDateAdded(null);
		}
		else {
			studentImpl.setDateAdded(new Date(dateAdded));
		}

		if (dateModified == Long.MIN_VALUE) {
			studentImpl.setDateModified(null);
		}
		else {
			studentImpl.setDateModified(new Date(dateModified));
		}

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	public long studentID;
	public String asuid;
	public String studentName;
	public String level;
	public String course;
	public String gpa;
	public String sex;
	public long dateAdded;
	public long dateModified;
}