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

import com.asu.poly.teams.manualSelect.slayer.model.preferences;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the preferences service. This utility wraps {@link preferencesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eshwari
 * @see preferencesPersistence
 * @see preferencesPersistenceImpl
 * @generated
 */
public class preferencesUtil {
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
	public static void clearCache(preferences preferences) {
		getPersistence().clearCache(preferences);
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
	public static List<preferences> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<preferences> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<preferences> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static preferences update(preferences preferences, boolean merge)
		throws SystemException {
		return getPersistence().update(preferences, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static preferences update(preferences preferences, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(preferences, merge, serviceContext);
	}

	/**
	* Caches the preferences in the entity cache if it is enabled.
	*
	* @param preferences the preferences
	*/
	public static void cacheResult(
		com.asu.poly.teams.manualSelect.slayer.model.preferences preferences) {
		getPersistence().cacheResult(preferences);
	}

	/**
	* Caches the preferenceses in the entity cache if it is enabled.
	*
	* @param preferenceses the preferenceses
	*/
	public static void cacheResult(
		java.util.List<com.asu.poly.teams.manualSelect.slayer.model.preferences> preferenceses) {
		getPersistence().cacheResult(preferenceses);
	}

	/**
	* Creates a new preferences with the primary key. Does not add the preferences to the database.
	*
	* @param facultyID the primary key for the new preferences
	* @return the new preferences
	*/
	public static com.asu.poly.teams.manualSelect.slayer.model.preferences create(
		long facultyID) {
		return getPersistence().create(facultyID);
	}

	/**
	* Removes the preferences with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param facultyID the primary key of the preferences
	* @return the preferences that was removed
	* @throws com.asu.poly.teams.manualSelect.slayer.NoSuchpreferencesException if a preferences with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.teams.manualSelect.slayer.model.preferences remove(
		long facultyID)
		throws com.asu.poly.teams.manualSelect.slayer.NoSuchpreferencesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(facultyID);
	}

	public static com.asu.poly.teams.manualSelect.slayer.model.preferences updateImpl(
		com.asu.poly.teams.manualSelect.slayer.model.preferences preferences,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(preferences, merge);
	}

	/**
	* Returns the preferences with the primary key or throws a {@link com.asu.poly.teams.manualSelect.slayer.NoSuchpreferencesException} if it could not be found.
	*
	* @param facultyID the primary key of the preferences
	* @return the preferences
	* @throws com.asu.poly.teams.manualSelect.slayer.NoSuchpreferencesException if a preferences with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.teams.manualSelect.slayer.model.preferences findByPrimaryKey(
		long facultyID)
		throws com.asu.poly.teams.manualSelect.slayer.NoSuchpreferencesException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(facultyID);
	}

	/**
	* Returns the preferences with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param facultyID the primary key of the preferences
	* @return the preferences, or <code>null</code> if a preferences with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.teams.manualSelect.slayer.model.preferences fetchByPrimaryKey(
		long facultyID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(facultyID);
	}

	/**
	* Returns all the preferenceses.
	*
	* @return the preferenceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.asu.poly.teams.manualSelect.slayer.model.preferences> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the preferenceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of preferenceses
	* @param end the upper bound of the range of preferenceses (not inclusive)
	* @return the range of preferenceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.asu.poly.teams.manualSelect.slayer.model.preferences> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the preferenceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of preferenceses
	* @param end the upper bound of the range of preferenceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of preferenceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.asu.poly.teams.manualSelect.slayer.model.preferences> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the preferenceses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of preferenceses.
	*
	* @return the number of preferenceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static preferencesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (preferencesPersistence)PortletBeanLocatorUtil.locate(com.asu.poly.teams.manualSelect.slayer.service.ClpSerializer.getServletContextName(),
					preferencesPersistence.class.getName());

			ReferenceRegistry.registerReference(preferencesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(preferencesPersistence persistence) {
	}

	private static preferencesPersistence _persistence;
}