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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.test.slayer.model.iProject;

import java.util.List;

/**
 * The persistence utility for the i project service. This utility wraps {@link iProjectPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anshu
 * @see iProjectPersistence
 * @see iProjectPersistenceImpl
 * @generated
 */
public class iProjectUtil {
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
	public static void clearCache(iProject iProject) {
		getPersistence().clearCache(iProject);
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
	public static List<iProject> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<iProject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<iProject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static iProject update(iProject iProject, boolean merge)
		throws SystemException {
		return getPersistence().update(iProject, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static iProject update(iProject iProject, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(iProject, merge, serviceContext);
	}

	/**
	* Caches the i project in the entity cache if it is enabled.
	*
	* @param iProject the i project
	*/
	public static void cacheResult(com.test.slayer.model.iProject iProject) {
		getPersistence().cacheResult(iProject);
	}

	/**
	* Caches the i projects in the entity cache if it is enabled.
	*
	* @param iProjects the i projects
	*/
	public static void cacheResult(
		java.util.List<com.test.slayer.model.iProject> iProjects) {
		getPersistence().cacheResult(iProjects);
	}

	/**
	* Creates a new i project with the primary key. Does not add the i project to the database.
	*
	* @param iProjectPK the primary key for the new i project
	* @return the new i project
	*/
	public static com.test.slayer.model.iProject create(
		com.test.slayer.service.persistence.iProjectPK iProjectPK) {
		return getPersistence().create(iProjectPK);
	}

	/**
	* Removes the i project with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param iProjectPK the primary key of the i project
	* @return the i project that was removed
	* @throws com.test.slayer.NoSuchiProjectException if a i project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.slayer.model.iProject remove(
		com.test.slayer.service.persistence.iProjectPK iProjectPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.slayer.NoSuchiProjectException {
		return getPersistence().remove(iProjectPK);
	}

	public static com.test.slayer.model.iProject updateImpl(
		com.test.slayer.model.iProject iProject, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(iProject, merge);
	}

	/**
	* Returns the i project with the primary key or throws a {@link com.test.slayer.NoSuchiProjectException} if it could not be found.
	*
	* @param iProjectPK the primary key of the i project
	* @return the i project
	* @throws com.test.slayer.NoSuchiProjectException if a i project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.slayer.model.iProject findByPrimaryKey(
		com.test.slayer.service.persistence.iProjectPK iProjectPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.slayer.NoSuchiProjectException {
		return getPersistence().findByPrimaryKey(iProjectPK);
	}

	/**
	* Returns the i project with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param iProjectPK the primary key of the i project
	* @return the i project, or <code>null</code> if a i project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.slayer.model.iProject fetchByPrimaryKey(
		com.test.slayer.service.persistence.iProjectPK iProjectPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(iProjectPK);
	}

	/**
	* Returns all the i projects.
	*
	* @return the i projects
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.test.slayer.model.iProject> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.test.slayer.model.iProject> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.test.slayer.model.iProject> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the i projects from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of i projects.
	*
	* @return the number of i projects
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static iProjectPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (iProjectPersistence)PortletBeanLocatorUtil.locate(com.test.slayer.service.ClpSerializer.getServletContextName(),
					iProjectPersistence.class.getName());

			ReferenceRegistry.registerReference(iProjectUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(iProjectPersistence persistence) {
	}

	private static iProjectPersistence _persistence;
}