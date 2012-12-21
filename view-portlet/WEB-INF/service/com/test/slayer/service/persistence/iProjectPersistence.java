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

import com.liferay.portal.service.persistence.BasePersistence;

import com.test.slayer.model.iProject;

/**
 * The persistence interface for the i project service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anshu
 * @see iProjectPersistenceImpl
 * @see iProjectUtil
 * @generated
 */
public interface iProjectPersistence extends BasePersistence<iProject> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link iProjectUtil} to access the i project persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the i project in the entity cache if it is enabled.
	*
	* @param iProject the i project
	*/
	public void cacheResult(com.test.slayer.model.iProject iProject);

	/**
	* Caches the i projects in the entity cache if it is enabled.
	*
	* @param iProjects the i projects
	*/
	public void cacheResult(
		java.util.List<com.test.slayer.model.iProject> iProjects);

	/**
	* Creates a new i project with the primary key. Does not add the i project to the database.
	*
	* @param iProjectPK the primary key for the new i project
	* @return the new i project
	*/
	public com.test.slayer.model.iProject create(
		com.test.slayer.service.persistence.iProjectPK iProjectPK);

	/**
	* Removes the i project with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param iProjectPK the primary key of the i project
	* @return the i project that was removed
	* @throws com.test.slayer.NoSuchiProjectException if a i project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.slayer.model.iProject remove(
		com.test.slayer.service.persistence.iProjectPK iProjectPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.slayer.NoSuchiProjectException;

	public com.test.slayer.model.iProject updateImpl(
		com.test.slayer.model.iProject iProject, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the i project with the primary key or throws a {@link com.test.slayer.NoSuchiProjectException} if it could not be found.
	*
	* @param iProjectPK the primary key of the i project
	* @return the i project
	* @throws com.test.slayer.NoSuchiProjectException if a i project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.slayer.model.iProject findByPrimaryKey(
		com.test.slayer.service.persistence.iProjectPK iProjectPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.slayer.NoSuchiProjectException;

	/**
	* Returns the i project with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param iProjectPK the primary key of the i project
	* @return the i project, or <code>null</code> if a i project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.slayer.model.iProject fetchByPrimaryKey(
		com.test.slayer.service.persistence.iProjectPK iProjectPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the i projects.
	*
	* @return the i projects
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.slayer.model.iProject> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the i projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of i projects
	* @param end the upper bound of the range of i projects (not inclusive)
	* @return the range of i projects
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.slayer.model.iProject> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the i projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of i projects
	* @param end the upper bound of the range of i projects (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of i projects
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.slayer.model.iProject> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the i projects from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of i projects.
	*
	* @return the number of i projects
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}