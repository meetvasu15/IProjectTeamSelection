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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.viewiProject.servicelayer.model.viewprj;

import java.util.List;

/**
 * The persistence utility for the viewprj service. This utility wraps {@link viewprjPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see viewprjPersistence
 * @see viewprjPersistenceImpl
 * @generated
 */
public class viewprjUtil {
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
	public static void clearCache(viewprj viewprj) {
		getPersistence().clearCache(viewprj);
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
	public static List<viewprj> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<viewprj> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<viewprj> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static viewprj update(viewprj viewprj, boolean merge)
		throws SystemException {
		return getPersistence().update(viewprj, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static viewprj update(viewprj viewprj, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(viewprj, merge, serviceContext);
	}

	/**
	* Caches the viewprj in the entity cache if it is enabled.
	*
	* @param viewprj the viewprj
	*/
	public static void cacheResult(
		com.viewiProject.servicelayer.model.viewprj viewprj) {
		getPersistence().cacheResult(viewprj);
	}

	/**
	* Caches the viewprjs in the entity cache if it is enabled.
	*
	* @param viewprjs the viewprjs
	*/
	public static void cacheResult(
		java.util.List<com.viewiProject.servicelayer.model.viewprj> viewprjs) {
		getPersistence().cacheResult(viewprjs);
	}

	/**
	* Creates a new viewprj with the primary key. Does not add the viewprj to the database.
	*
	* @param projectId the primary key for the new viewprj
	* @return the new viewprj
	*/
	public static com.viewiProject.servicelayer.model.viewprj create(
		long projectId) {
		return getPersistence().create(projectId);
	}

	/**
	* Removes the viewprj with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the viewprj
	* @return the viewprj that was removed
	* @throws com.viewiProject.servicelayer.NoSuchviewprjException if a viewprj with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viewiProject.servicelayer.model.viewprj remove(
		long projectId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viewiProject.servicelayer.NoSuchviewprjException {
		return getPersistence().remove(projectId);
	}

	public static com.viewiProject.servicelayer.model.viewprj updateImpl(
		com.viewiProject.servicelayer.model.viewprj viewprj, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(viewprj, merge);
	}

	/**
	* Returns the viewprj with the primary key or throws a {@link com.viewiProject.servicelayer.NoSuchviewprjException} if it could not be found.
	*
	* @param projectId the primary key of the viewprj
	* @return the viewprj
	* @throws com.viewiProject.servicelayer.NoSuchviewprjException if a viewprj with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viewiProject.servicelayer.model.viewprj findByPrimaryKey(
		long projectId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viewiProject.servicelayer.NoSuchviewprjException {
		return getPersistence().findByPrimaryKey(projectId);
	}

	/**
	* Returns the viewprj with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectId the primary key of the viewprj
	* @return the viewprj, or <code>null</code> if a viewprj with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viewiProject.servicelayer.model.viewprj fetchByPrimaryKey(
		long projectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(projectId);
	}

	/**
	* Returns all the viewprjs.
	*
	* @return the viewprjs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viewiProject.servicelayer.model.viewprj> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.viewiProject.servicelayer.model.viewprj> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.viewiProject.servicelayer.model.viewprj> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the viewprjs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of viewprjs.
	*
	* @return the number of viewprjs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static viewprjPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (viewprjPersistence)PortletBeanLocatorUtil.locate(com.viewiProject.servicelayer.service.ClpSerializer.getServletContextName(),
					viewprjPersistence.class.getName());

			ReferenceRegistry.registerReference(viewprjUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(viewprjPersistence persistence) {
	}

	private static viewprjPersistence _persistence;
}