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

package com.asu.poly.teams.manualSelect.slayer.service.persistence;

import com.asu.poly.teams.manualSelect.slayer.model.Faculty;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the faculty service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eshwari
 * @see FacultyPersistenceImpl
 * @see FacultyUtil
 * @generated
 */
public interface FacultyPersistence extends BasePersistence<Faculty> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FacultyUtil} to access the faculty persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the faculty in the entity cache if it is enabled.
	*
	* @param faculty the faculty
	*/
	public void cacheResult(
		com.asu.poly.teams.manualSelect.slayer.model.Faculty faculty);

	/**
	* Caches the faculties in the entity cache if it is enabled.
	*
	* @param faculties the faculties
	*/
	public void cacheResult(
		java.util.List<com.asu.poly.teams.manualSelect.slayer.model.Faculty> faculties);

	/**
	* Creates a new faculty with the primary key. Does not add the faculty to the database.
	*
	* @param facultyID the primary key for the new faculty
	* @return the new faculty
	*/
	public com.asu.poly.teams.manualSelect.slayer.model.Faculty create(
		long facultyID);

	/**
	* Removes the faculty with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param facultyID the primary key of the faculty
	* @return the faculty that was removed
	* @throws com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException if a faculty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.teams.manualSelect.slayer.model.Faculty remove(
		long facultyID)
		throws com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.asu.poly.teams.manualSelect.slayer.model.Faculty updateImpl(
		com.asu.poly.teams.manualSelect.slayer.model.Faculty faculty,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the faculty with the primary key or throws a {@link com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException} if it could not be found.
	*
	* @param facultyID the primary key of the faculty
	* @return the faculty
	* @throws com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException if a faculty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.teams.manualSelect.slayer.model.Faculty findByPrimaryKey(
		long facultyID)
		throws com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the faculty with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param facultyID the primary key of the faculty
	* @return the faculty, or <code>null</code> if a faculty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.teams.manualSelect.slayer.model.Faculty fetchByPrimaryKey(
		long facultyID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the faculties.
	*
	* @return the faculties
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.asu.poly.teams.manualSelect.slayer.model.Faculty> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the faculties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of faculties
	* @param end the upper bound of the range of faculties (not inclusive)
	* @return the range of faculties
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.asu.poly.teams.manualSelect.slayer.model.Faculty> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the faculties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of faculties
	* @param end the upper bound of the range of faculties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of faculties
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.asu.poly.teams.manualSelect.slayer.model.Faculty> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the faculties from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of faculties.
	*
	* @return the number of faculties
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}