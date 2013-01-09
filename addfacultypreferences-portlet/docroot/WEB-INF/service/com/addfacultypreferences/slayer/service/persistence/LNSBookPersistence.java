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

package com.addfacultypreferences.slayer.service.persistence;

import com.addfacultypreferences.slayer.model.LNSBook;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the l n s book service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eshwari
 * @see LNSBookPersistenceImpl
 * @see LNSBookUtil
 * @generated
 */
public interface LNSBookPersistence extends BasePersistence<LNSBook> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LNSBookUtil} to access the l n s book persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the l n s book in the entity cache if it is enabled.
	*
	* @param lnsBook the l n s book
	*/
	public void cacheResult(
		com.addfacultypreferences.slayer.model.LNSBook lnsBook);

	/**
	* Caches the l n s books in the entity cache if it is enabled.
	*
	* @param lnsBooks the l n s books
	*/
	public void cacheResult(
		java.util.List<com.addfacultypreferences.slayer.model.LNSBook> lnsBooks);

	/**
	* Creates a new l n s book with the primary key. Does not add the l n s book to the database.
	*
	* @param nameId the primary key for the new l n s book
	* @return the new l n s book
	*/
	public com.addfacultypreferences.slayer.model.LNSBook create(long nameId);

	/**
	* Removes the l n s book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nameId the primary key of the l n s book
	* @return the l n s book that was removed
	* @throws com.addfacultypreferences.slayer.NoSuchBookException if a l n s book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.addfacultypreferences.slayer.model.LNSBook remove(long nameId)
		throws com.addfacultypreferences.slayer.NoSuchBookException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.addfacultypreferences.slayer.model.LNSBook updateImpl(
		com.addfacultypreferences.slayer.model.LNSBook lnsBook, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the l n s book with the primary key or throws a {@link com.addfacultypreferences.slayer.NoSuchBookException} if it could not be found.
	*
	* @param nameId the primary key of the l n s book
	* @return the l n s book
	* @throws com.addfacultypreferences.slayer.NoSuchBookException if a l n s book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.addfacultypreferences.slayer.model.LNSBook findByPrimaryKey(
		long nameId)
		throws com.addfacultypreferences.slayer.NoSuchBookException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the l n s book with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param nameId the primary key of the l n s book
	* @return the l n s book, or <code>null</code> if a l n s book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.addfacultypreferences.slayer.model.LNSBook fetchByPrimaryKey(
		long nameId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the l n s books.
	*
	* @return the l n s books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.addfacultypreferences.slayer.model.LNSBook> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the l n s books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of l n s books
	* @param end the upper bound of the range of l n s books (not inclusive)
	* @return the range of l n s books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.addfacultypreferences.slayer.model.LNSBook> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the l n s books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of l n s books
	* @param end the upper bound of the range of l n s books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of l n s books
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.addfacultypreferences.slayer.model.LNSBook> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the l n s books from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of l n s books.
	*
	* @return the number of l n s books
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}