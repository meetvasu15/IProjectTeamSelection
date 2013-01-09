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

package com.addfacultypreferences.slayer.model.impl;

import com.addfacultypreferences.slayer.model.LNSBook;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing LNSBook in entity cache.
 *
 * @author Eshwari
 * @see LNSBook
 * @generated
 */
public class LNSBookCacheModel implements CacheModel<LNSBook>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{nameId=");
		sb.append(nameId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", number=");
		sb.append(number);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append("}");

		return sb.toString();
	}

	public LNSBook toEntityModel() {
		LNSBookImpl lnsBookImpl = new LNSBookImpl();

		lnsBookImpl.setNameId(nameId);

		if (name == null) {
			lnsBookImpl.setName(StringPool.BLANK);
		}
		else {
			lnsBookImpl.setName(name);
		}

		if (email == null) {
			lnsBookImpl.setEmail(StringPool.BLANK);
		}
		else {
			lnsBookImpl.setEmail(email);
		}

		if (number == null) {
			lnsBookImpl.setNumber(StringPool.BLANK);
		}
		else {
			lnsBookImpl.setNumber(number);
		}

		if (dateAdded == Long.MIN_VALUE) {
			lnsBookImpl.setDateAdded(null);
		}
		else {
			lnsBookImpl.setDateAdded(new Date(dateAdded));
		}

		lnsBookImpl.resetOriginalValues();

		return lnsBookImpl;
	}

	public long nameId;
	public String name;
	public String email;
	public String number;
	public long dateAdded;
}