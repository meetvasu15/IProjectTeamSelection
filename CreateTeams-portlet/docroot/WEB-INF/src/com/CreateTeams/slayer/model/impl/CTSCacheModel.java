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

package com.CreateTeams.slayer.model.impl;

import com.CreateTeams.slayer.model.CTS;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing CTS in entity cache.
 *
 * @author zhengyan
 * @see CTS
 * @generated
 */
public class CTSCacheModel implements CacheModel<CTS>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{TeamId=");
		sb.append(TeamId);
		sb.append(", TeamName=");
		sb.append(TeamName);
		sb.append(", TeamMembers=");
		sb.append(TeamMembers);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append("}");

		return sb.toString();
	}

	public CTS toEntityModel() {
		CTSImpl ctsImpl = new CTSImpl();

		ctsImpl.setTeamId(TeamId);

		if (TeamName == null) {
			ctsImpl.setTeamName(StringPool.BLANK);
		}
		else {
			ctsImpl.setTeamName(TeamName);
		}

		if (TeamMembers == null) {
			ctsImpl.setTeamMembers(StringPool.BLANK);
		}
		else {
			ctsImpl.setTeamMembers(TeamMembers);
		}

		if (dateAdded == Long.MIN_VALUE) {
			ctsImpl.setDateAdded(null);
		}
		else {
			ctsImpl.setDateAdded(new Date(dateAdded));
		}

		ctsImpl.resetOriginalValues();

		return ctsImpl;
	}

	public long TeamId;
	public String TeamName;
	public String TeamMembers;
	public long dateAdded;
}