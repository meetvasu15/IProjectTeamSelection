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

package com.viewiProject.servicelayer.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.viewiProject.servicelayer.model.viewprj;

/**
 * The persistence interface for the viewprj service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see viewprjPersistenceImpl
 * @see viewprjUtil
 * @generated
 */
public interface viewprjPersistence extends BasePersistence<viewprj> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link viewprjUtil} to access the viewprj persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the viewprj in the entity cache if it is enabled.
	*
	* @param viewprj the viewprj
	*/
	public void cacheResult(com.viewiProject.servicelayer.model.viewprj viewprj);

	/**
	* Caches the viewprjs in the entity cache if it is enabled.
	*
	* @param viewprjs the viewprjs
	*/
	public void cacheResult(
		java.util.List<com.viewiProject.servicelayer.model.viewprj> viewprjs);

	/**
	* Creates a new viewprj with the primary key. Does not add the viewprj to the database.
	*
	* @param projectId the primary key for the new viewprj
	* @return the new viewprj
	*/
	public com.viewiProject.servicelayer.model.viewprj create(long projectId);

	/**
	* Removes the viewprj with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the viewprj
	* @return the viewprj that was removed
	* @throws com.viewiProject.servicelayer.NoSuchviewprjException if a viewprj with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.viewprj remove(long projectId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viewiProject.servicelayer.NoSuchviewprjException;

	public com.viewiProject.servicelayer.model.viewprj updateImpl(
		com.viewiProject.servicelayer.model.viewprj viewprj, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the viewprj with the primary key or throws a {@link com.viewiProject.servicelayer.NoSuchviewprjException} if it could not be found.
	*
	* @param projectId the primary key of the viewprj
	* @return the viewprj
	* @throws com.viewiProject.servicelayer.NoSuchviewprjException if a viewprj with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.viewprj findByPrimaryKey(
		long projectId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viewiProject.servicelayer.NoSuchviewprjException;

	/**
	* Returns the viewprj with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectId the primary key of the viewprj
	* @return the viewprj, or <code>null</code> if a viewprj with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.viewprj fetchByPrimaryKey(
		long projectId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the viewprjs.
	*
	* @return the viewprjs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viewiProject.servicelayer.model.viewprj> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the viewprjs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of viewprjs
	* @param end the upper bound of the range of viewprjs (not inclusive)
	* @return the range of viewprjs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viewiProject.servicelayer.model.viewprj> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the viewprjs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of viewprjs
	* @param end the upper bound of the range of viewprjs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of viewprjs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viewiProject.servicelayer.model.viewprj> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the viewprjs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of viewprjs.
	*
	* @return the number of viewprjs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}