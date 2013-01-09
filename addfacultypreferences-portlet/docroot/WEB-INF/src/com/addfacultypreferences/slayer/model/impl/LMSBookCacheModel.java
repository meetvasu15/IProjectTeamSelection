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

import com.addfacultypreferences.slayer.model.LMSBook;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing LMSBook in entity cache.
 *
 * @author Eshwari
 * @see LMSBook
 * @generated
 */
public class LMSBookCacheModel implements CacheModel<LMSBook>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{bookId=");
		sb.append(bookId);
		sb.append(", asuid=");
		sb.append(asuid);
		sb.append(", email=");
		sb.append(email);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append("}");

		return sb.toString();
	}

	public LMSBook toEntityModel() {
		LMSBookImpl lmsBookImpl = new LMSBookImpl();

		lmsBookImpl.setBookId(bookId);

		if (asuid == null) {
			lmsBookImpl.setAsuid(StringPool.BLANK);
		}
		else {
			lmsBookImpl.setAsuid(asuid);
		}

		if (email == null) {
			lmsBookImpl.setEmail(StringPool.BLANK);
		}
		else {
			lmsBookImpl.setEmail(email);
		}

		if (dateAdded == Long.MIN_VALUE) {
			lmsBookImpl.setDateAdded(null);
		}
		else {
			lmsBookImpl.setDateAdded(new Date(dateAdded));
		}

		lmsBookImpl.resetOriginalValues();

		return lmsBookImpl;
	}

	public long bookId;
	public String asuid;
	public String email;
	public long dateAdded;
}