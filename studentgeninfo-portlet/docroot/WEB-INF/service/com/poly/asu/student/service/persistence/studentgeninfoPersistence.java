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

package com.poly.asu.student.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.poly.asu.student.model.studentgeninfo;

/**
 * The persistence interface for the studentgeninfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see studentgeninfoPersistenceImpl
 * @see studentgeninfoUtil
 * @generated
 */
public interface studentgeninfoPersistence extends BasePersistence<studentgeninfo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link studentgeninfoUtil} to access the studentgeninfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the studentgeninfo in the entity cache if it is enabled.
	*
	* @param studentgeninfo the studentgeninfo
	*/
	public void cacheResult(
		com.poly.asu.student.model.studentgeninfo studentgeninfo);

	/**
	* Caches the studentgeninfos in the entity cache if it is enabled.
	*
	* @param studentgeninfos the studentgeninfos
	*/
	public void cacheResult(
		java.util.List<com.poly.asu.student.model.studentgeninfo> studentgeninfos);

	/**
	* Creates a new studentgeninfo with the primary key. Does not add the studentgeninfo to the database.
	*
	* @param studentgeninfoid the primary key for the new studentgeninfo
	* @return the new studentgeninfo
	*/
	public com.poly.asu.student.model.studentgeninfo create(
		long studentgeninfoid);

	/**
	* Removes the studentgeninfo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentgeninfoid the primary key of the studentgeninfo
	* @return the studentgeninfo that was removed
	* @throws com.poly.asu.student.NoSuchstudentgeninfoException if a studentgeninfo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.poly.asu.student.model.studentgeninfo remove(
		long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.poly.asu.student.NoSuchstudentgeninfoException;

	public com.poly.asu.student.model.studentgeninfo updateImpl(
		com.poly.asu.student.model.studentgeninfo studentgeninfo, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the studentgeninfo with the primary key or throws a {@link com.poly.asu.student.NoSuchstudentgeninfoException} if it could not be found.
	*
	* @param studentgeninfoid the primary key of the studentgeninfo
	* @return the studentgeninfo
	* @throws com.poly.asu.student.NoSuchstudentgeninfoException if a studentgeninfo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.poly.asu.student.model.studentgeninfo findByPrimaryKey(
		long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.poly.asu.student.NoSuchstudentgeninfoException;

	/**
	* Returns the studentgeninfo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentgeninfoid the primary key of the studentgeninfo
	* @return the studentgeninfo, or <code>null</code> if a studentgeninfo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.poly.asu.student.model.studentgeninfo fetchByPrimaryKey(
		long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the studentgeninfos.
	*
	* @return the studentgeninfos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.poly.asu.student.model.studentgeninfo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the studentgeninfos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of studentgeninfos
	* @param end the upper bound of the range of studentgeninfos (not inclusive)
	* @return the range of studentgeninfos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.poly.asu.student.model.studentgeninfo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the studentgeninfos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of studentgeninfos
	* @param end the upper bound of the range of studentgeninfos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of studentgeninfos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.poly.asu.student.model.studentgeninfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the studentgeninfos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of studentgeninfos.
	*
	* @return the number of studentgeninfos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}