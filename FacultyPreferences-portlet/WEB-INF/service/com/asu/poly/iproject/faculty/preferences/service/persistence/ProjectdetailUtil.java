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

package com.asu.poly.iproject.faculty.preferences.service.persistence;

import com.asu.poly.iproject.faculty.preferences.model.Projectdetail;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the projectdetail service. This utility wraps {@link ProjectdetailPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author emente
 * @see ProjectdetailPersistence
 * @see ProjectdetailPersistenceImpl
 * @generated
 */
public class ProjectdetailUtil {
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
	public static void clearCache(Projectdetail projectdetail) {
		getPersistence().clearCache(projectdetail);
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
	public static List<Projectdetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Projectdetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Projectdetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Projectdetail update(Projectdetail projectdetail,
		boolean merge) throws SystemException {
		return getPersistence().update(projectdetail, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Projectdetail update(Projectdetail projectdetail,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(projectdetail, merge, serviceContext);
	}

	/**
	* Caches the projectdetail in the entity cache if it is enabled.
	*
	* @param projectdetail the projectdetail
	*/
	public static void cacheResult(
		com.asu.poly.iproject.faculty.preferences.model.Projectdetail projectdetail) {
		getPersistence().cacheResult(projectdetail);
	}

	/**
	* Caches the projectdetails in the entity cache if it is enabled.
	*
	* @param projectdetails the projectdetails
	*/
	public static void cacheResult(
		java.util.List<com.asu.poly.iproject.faculty.preferences.model.Projectdetail> projectdetails) {
		getPersistence().cacheResult(projectdetails);
	}

	/**
	* Creates a new projectdetail with the primary key. Does not add the projectdetail to the database.
	*
	* @param projectID the primary key for the new projectdetail
	* @return the new projectdetail
	*/
	public static com.asu.poly.iproject.faculty.preferences.model.Projectdetail create(
		long projectID) {
		return getPersistence().create(projectID);
	}

	/**
	* Removes the projectdetail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectID the primary key of the projectdetail
	* @return the projectdetail that was removed
	* @throws com.asu.poly.iproject.faculty.preferences.NoSuchProjectdetailException if a projectdetail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.iproject.faculty.preferences.model.Projectdetail remove(
		long projectID)
		throws com.asu.poly.iproject.faculty.preferences.NoSuchProjectdetailException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(projectID);
	}

	public static com.asu.poly.iproject.faculty.preferences.model.Projectdetail updateImpl(
		com.asu.poly.iproject.faculty.preferences.model.Projectdetail projectdetail,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(projectdetail, merge);
	}

	/**
	* Returns the projectdetail with the primary key or throws a {@link com.asu.poly.iproject.faculty.preferences.NoSuchProjectdetailException} if it could not be found.
	*
	* @param projectID the primary key of the projectdetail
	* @return the projectdetail
	* @throws com.asu.poly.iproject.faculty.preferences.NoSuchProjectdetailException if a projectdetail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.iproject.faculty.preferences.model.Projectdetail findByPrimaryKey(
		long projectID)
		throws com.asu.poly.iproject.faculty.preferences.NoSuchProjectdetailException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(projectID);
	}

	/**
	* Returns the projectdetail with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projectID the primary key of the projectdetail
	* @return the projectdetail, or <code>null</code> if a projectdetail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.iproject.faculty.preferences.model.Projectdetail fetchByPrimaryKey(
		long projectID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(projectID);
	}

	/**
	* Returns all the projectdetails.
	*
	* @return the projectdetails
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.asu.poly.iproject.faculty.preferences.model.Projectdetail> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.asu.poly.iproject.faculty.preferences.model.Projectdetail> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.asu.poly.iproject.faculty.preferences.model.Projectdetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the projectdetails from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of projectdetails.
	*
	* @return the number of projectdetails
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ProjectdetailPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ProjectdetailPersistence)PortletBeanLocatorUtil.locate(com.asu.poly.iproject.faculty.preferences.service.ClpSerializer.getServletContextName(),
					ProjectdetailPersistence.class.getName());

			ReferenceRegistry.registerReference(ProjectdetailUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(ProjectdetailPersistence persistence) {
	}

	private static ProjectdetailPersistence _persistence;
}