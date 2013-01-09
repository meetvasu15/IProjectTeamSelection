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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the l n s book service. This utility wraps {@link LNSBookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eshwari
 * @see LNSBookPersistence
 * @see LNSBookPersistenceImpl
 * @generated
 */
public class LNSBookUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(LNSBook lnsBook) {
		getPersistence().clearCache(lnsBook);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LNSBook> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LNSBook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LNSBook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static LNSBook update(LNSBook lnsBook, boolean merge)
		throws SystemException {
		return getPersistence().update(lnsBook, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static LNSBook update(LNSBook lnsBook, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(lnsBook, merge, serviceContext);
	}

	/**
	* Caches the l n s book in the entity cache if it is enabled.
	*
	* @param lnsBook the l n s book
	*/
	public static void cacheResult(
		com.addfacultypreferences.slayer.model.LNSBook lnsBook) {
		getPersistence().cacheResult(lnsBook);
	}

	/**
	* Caches the l n s books in the entity cache if it is enabled.
	*
	* @param lnsBooks the l n s books
	*/
	public static void cacheResult(
		java.util.List<com.addfacultypreferences.slayer.model.LNSBook> lnsBooks) {
		getPersistence().cacheResult(lnsBooks);
	}

	/**
	* Creates a new l n s book with the primary key. Does not add the l n s book to the database.
	*
	* @param nameId the primary key for the new l n s book
	* @return the new l n s book
	*/
	public static com.addfacultypreferences.slayer.model.LNSBook create(
		long nameId) {
		return getPersistence().create(nameId);
	}

	/**
	* Removes the l n s book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nameId the primary key of the l n s book
	* @return the l n s book that was removed
	* @throws com.addfacultypreferences.slayer.NoSuchBookException if a l n s book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.addfacultypreferences.slayer.model.LNSBook remove(
		long nameId)
		throws com.addfacultypreferences.slayer.NoSuchBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(nameId);
	}

	public static com.addfacultypreferences.slayer.model.LNSBook updateImpl(
		com.addfacultypreferences.slayer.model.LNSBook lnsBook, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lnsBook, merge);
	}

	/**
	* Returns the l n s book with the primary key or throws a {@link com.addfacultypreferences.slayer.NoSuchBookException} if it could not be found.
	*
	* @param nameId the primary key of the l n s book
	* @return the l n s book
	* @throws com.addfacultypreferences.slayer.NoSuchBookException if a l n s book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.addfacultypreferences.slayer.model.LNSBook findByPrimaryKey(
		long nameId)
		throws com.addfacultypreferences.slayer.NoSuchBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(nameId);
	}

	/**
	* Returns the l n s book with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param nameId the primary key of the l n s book
	* @return the l n s book, or <code>null</code> if a l n s book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.addfacultypreferences.slayer.model.LNSBook fetchByPrimaryKey(
		long nameId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(nameId);
	}

	/**
	* Returns all the l n s books.
	*
	* @return the l n s books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.addfacultypreferences.slayer.model.LNSBook> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.addfacultypreferences.slayer.model.LNSBook> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.addfacultypreferences.slayer.model.LNSBook> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the l n s books from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of l n s books.
	*
	* @return the number of l n s books
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LNSBookPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LNSBookPersistence)PortletBeanLocatorUtil.locate(com.addfacultypreferences.slayer.service.ClpSerializer.getServletContextName(),
					LNSBookPersistence.class.getName());

			ReferenceRegistry.registerReference(LNSBookUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(LNSBookPersistence persistence) {
	}

	private static LNSBookPersistence _persistence;
}