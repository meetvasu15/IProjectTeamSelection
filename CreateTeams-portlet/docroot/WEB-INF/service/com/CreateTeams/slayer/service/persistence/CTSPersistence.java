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

package com.CreateTeams.slayer.service.persistence;

import com.CreateTeams.slayer.model.CTS;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the c t s service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhengyan
 * @see CTSPersistenceImpl
 * @see CTSUtil
 * @generated
 */
public interface CTSPersistence extends BasePersistence<CTS> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CTSUtil} to access the c t s persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the c t s in the entity cache if it is enabled.
	*
	* @param cts the c t s
	*/
	public void cacheResult(com.CreateTeams.slayer.model.CTS cts);

	/**
	* Caches the c t ses in the entity cache if it is enabled.
	*
	* @param ctses the c t ses
	*/
	public void cacheResult(
		java.util.List<com.CreateTeams.slayer.model.CTS> ctses);

	/**
	* Creates a new c t s with the primary key. Does not add the c t s to the database.
	*
	* @param TeamId the primary key for the new c t s
	* @return the new c t s
	*/
	public com.CreateTeams.slayer.model.CTS create(long TeamId);

	/**
	* Removes the c t s with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param TeamId the primary key of the c t s
	* @return the c t s that was removed
	* @throws com.CreateTeams.slayer.NoSuchCTSException if a c t s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.CreateTeams.slayer.model.CTS remove(long TeamId)
		throws com.CreateTeams.slayer.NoSuchCTSException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.CreateTeams.slayer.model.CTS updateImpl(
		com.CreateTeams.slayer.model.CTS cts, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c t s with the primary key or throws a {@link com.CreateTeams.slayer.NoSuchCTSException} if it could not be found.
	*
	* @param TeamId the primary key of the c t s
	* @return the c t s
	* @throws com.CreateTeams.slayer.NoSuchCTSException if a c t s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.CreateTeams.slayer.model.CTS findByPrimaryKey(long TeamId)
		throws com.CreateTeams.slayer.NoSuchCTSException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the c t s with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param TeamId the primary key of the c t s
	* @return the c t s, or <code>null</code> if a c t s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.CreateTeams.slayer.model.CTS fetchByPrimaryKey(long TeamId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the c t ses.
	*
	* @return the c t ses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.CreateTeams.slayer.model.CTS> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the c t ses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of c t ses
	* @param end the upper bound of the range of c t ses (not inclusive)
	* @return the range of c t ses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.CreateTeams.slayer.model.CTS> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the c t ses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of c t ses
	* @param end the upper bound of the range of c t ses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of c t ses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.CreateTeams.slayer.model.CTS> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the c t ses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of c t ses.
	*
	* @return the number of c t ses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}