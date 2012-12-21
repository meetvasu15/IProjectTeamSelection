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

package com.test.slayer.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author anshu
 */
public class iProjectPK implements Comparable<iProjectPK>, Serializable {
	public long projectID;
	public String projectName;

	public iProjectPK() {
	}

	public iProjectPK(long projectID, String projectName) {
		this.projectID = projectID;
		this.projectName = projectName;
	}

	public long getProjectID() {
		return projectID;
	}

	public void setProjectID(long projectID) {
		this.projectID = projectID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int compareTo(iProjectPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (projectID < pk.projectID) {
			value = -1;
		}
		else if (projectID > pk.projectID) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = projectName.compareTo(pk.projectName);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		iProjectPK pk = null;

		try {
			pk = (iProjectPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((projectID == pk.projectID) &&
				(projectName.equals(pk.projectName))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(projectID) + String.valueOf(projectName)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("projectID");
		sb.append(StringPool.EQUAL);
		sb.append(projectID);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("projectName");
		sb.append(StringPool.EQUAL);
		sb.append(projectName);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}