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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the c t s service. This utility wraps {@link CTSPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhengyan
 * @see CTSPersistence
 * @see CTSPersistenceImpl
 * @generated
 */
public class CTSUtil {
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
	public static void clearCache(CTS cts) {
		getPersistence().clearCache(cts);
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
	public static List<CTS> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CTS> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CTS> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static CTS update(CTS cts, boolean merge) throws SystemException {
		return getPersistence().update(cts, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static CTS update(CTS cts, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(cts, merge, serviceContext);
	}

	/**
	* Caches the c t s in the entity cache if it is enabled.
	*
	* @param cts the c t s
	*/
	public static void cacheResult(com.CreateTeams.slayer.model.CTS cts) {
		getPersistence().cacheResult(cts);
	}

	/**
	* Caches the c t ses in the entity cache if it is enabled.
	*
	* @param ctses the c t ses
	*/
	public static void cacheResult(
		java.util.List<com.CreateTeams.slayer.model.CTS> ctses) {
		getPersistence().cacheResult(ctses);
	}

	/**
	* Creates a new c t s with the primary key. Does not add the c t s to the database.
	*
	* @param TeamId the primary key for the new c t s
	* @return the new c t s
	*/
	public static com.CreateTeams.slayer.model.CTS create(long TeamId) {
		return getPersistence().create(TeamId);
	}

	/**
	* Removes the c t s with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param TeamId the primary key of the c t s
	* @return the c t s that was removed
	* @throws com.CreateTeams.slayer.NoSuchCTSException if a c t s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.CreateTeams.slayer.model.CTS remove(long TeamId)
		throws com.CreateTeams.slayer.NoSuchCTSException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(TeamId);
	}

	public static com.CreateTeams.slayer.model.CTS updateImpl(
		com.CreateTeams.slayer.model.CTS cts, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(cts, merge);
	}

	/**
	* Returns the c t s with the primary key or throws a {@link com.CreateTeams.slayer.NoSuchCTSException} if it could not be found.
	*
	* @param TeamId the primary key of the c t s
	* @return the c t s
	* @throws com.CreateTeams.slayer.NoSuchCTSException if a c t s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.CreateTeams.slayer.model.CTS findByPrimaryKey(long TeamId)
		throws com.CreateTeams.slayer.NoSuchCTSException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(TeamId);
	}

	/**
	* Returns the c t s with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param TeamId the primary key of the c t s
	* @return the c t s, or <code>null</code> if a c t s with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.CreateTeams.slayer.model.CTS fetchByPrimaryKey(
		long TeamId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(TeamId);
	}

	/**
	* Returns all the c t ses.
	*
	* @return the c t ses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.CreateTeams.slayer.model.CTS> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.CreateTeams.slayer.model.CTS> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.CreateTeams.slayer.model.CTS> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the c t ses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of c t ses.
	*
	* @return the number of c t ses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CTSPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CTSPersistence)PortletBeanLocatorUtil.locate(com.CreateTeams.slayer.service.ClpSerializer.getServletContextName(),
					CTSPersistence.class.getName());

			ReferenceRegistry.registerReference(CTSUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(CTSPersistence persistence) {
	}

	private static CTSPersistence _persistence;
}