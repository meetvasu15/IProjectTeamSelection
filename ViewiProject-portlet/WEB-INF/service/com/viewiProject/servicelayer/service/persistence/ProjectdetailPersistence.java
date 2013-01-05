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

import com.viewiProject.servicelayer.model.Projectdetail;

/**
 * The persistence interface for the projectdetail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see ProjectdetailPersistenceImpl
 * @see ProjectdetailUtil
 * @generated
 */
public interface ProjectdetailPersistence extends BasePersistence<Projectdetail> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProjectdetailUtil} to access the projectdetail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the projectdetail in the entity cache if it is enabled.
	*
	* @param projectdetail the projectdetail
	*/
	public void cacheResult(
		com.viewiProject.servicelayer.model.Projectdetail projectdetail);

	/**
	* Caches the projectdetails in the entity cache if it is enabled.
	*
	* @param projectdetails the projectdetails
	*/
	public void cacheResult(
		java.util.List<com.viewiProject.servicelayer.model.Projectdetail> projectdetails);

	/**
	* Creates a new projectdetail with the primary key. Does not add the projectdetail to the database.
	*
	* @param projectId the primary key for the new projectdetail
	* @return the new projectdetail
	*/
	public com.viewiProject.servicelayer.model.Projectdetail create(
		long projectId);

	/**
	* Removes the projectdetail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the projectdetail
	* @return the projectdetail that was removed
	* @throws com.viewiProject.servicelayer.NoSuchProjectdetailException if a projectdetail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.Projectdetail remove(
		long projectId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viewiProject.servicelayer.NoSuchProjectdetailException;

	public com.viewiProject.servicelayer.model.Projectdetail updateImpl(
		com.viewiProject.servicelayer.model.Projectdetail projectdetail,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the projectdetail with the primary key or throws a {@link com.viewiProject.servicelayer.NoSuchProjectdetailException} if it could not be found.
	*
	* @param projectId the primary key of the projectdetail
	* @return the projectdetail
	* @throws com.viewiProject.servicelayer.NoSuchProjectdetailException if a projectdetail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.Projectdetail findByPrimaryKey(
		long projectId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viewiProject.servicelayer.NoSuchProjectdetailException;

	/**
	* Returns the projectdetail with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectId the primary key of the projectdetail
	* @return the projectdetail, or <code>null</code> if a projectdetail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.Projectdetail fetchByPrimaryKey(
		long projectId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the projectdetails.
	*
	* @return the projectdetails
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viewiProject.servicelayer.model.Projectdetail> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the projectdetails.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of projectdetails
	* @param end the upper bound of the range of projectdetails (not inclusive)
	* @return the range of projectdetails
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viewiProject.servicelayer.model.Projectdetail> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the projectdetails.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of projectdetails
	* @param end the upper bound of the range of projectdetails (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of projectdetails
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viewiProject.servicelayer.model.Projectdetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the projectdetails from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of projectdetails.
	*
	* @return the number of projectdetails
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}