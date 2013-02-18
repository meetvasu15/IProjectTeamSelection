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

package com.poly.asu.student.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.poly.asu.student.model.studentgeninfo;

import java.util.List;

/**
 * The persistence utility for the studentgeninfo service. This utility wraps {@link studentgeninfoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see studentgeninfoPersistence
 * @see studentgeninfoPersistenceImpl
 * @generated
 */
public class studentgeninfoUtil {
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
	public static void clearCache(studentgeninfo studentgeninfo) {
		getPersistence().clearCache(studentgeninfo);
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
	public static List<studentgeninfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<studentgeninfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<studentgeninfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static studentgeninfo update(studentgeninfo studentgeninfo,
		boolean merge) throws SystemException {
		return getPersistence().update(studentgeninfo, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static studentgeninfo update(studentgeninfo studentgeninfo,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(studentgeninfo, merge, serviceContext);
	}

	/**
	* Caches the studentgeninfo in the entity cache if it is enabled.
	*
	* @param studentgeninfo the studentgeninfo
	*/
	public static void cacheResult(
		com.poly.asu.student.model.studentgeninfo studentgeninfo) {
		getPersistence().cacheResult(studentgeninfo);
	}

	/**
	* Caches the studentgeninfos in the entity cache if it is enabled.
	*
	* @param studentgeninfos the studentgeninfos
	*/
	public static void cacheResult(
		java.util.List<com.poly.asu.student.model.studentgeninfo> studentgeninfos) {
		getPersistence().cacheResult(studentgeninfos);
	}

	/**
	* Creates a new studentgeninfo with the primary key. Does not add the studentgeninfo to the database.
	*
	* @param studentgeninfoid the primary key for the new studentgeninfo
	* @return the new studentgeninfo
	*/
	public static com.poly.asu.student.model.studentgeninfo create(
		long studentgeninfoid) {
		return getPersistence().create(studentgeninfoid);
	}

	/**
	* Removes the studentgeninfo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentgeninfoid the primary key of the studentgeninfo
	* @return the studentgeninfo that was removed
	* @throws com.poly.asu.student.NoSuchstudentgeninfoException if a studentgeninfo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.poly.asu.student.model.studentgeninfo remove(
		long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.poly.asu.student.NoSuchstudentgeninfoException {
		return getPersistence().remove(studentgeninfoid);
	}

	public static com.poly.asu.student.model.studentgeninfo updateImpl(
		com.poly.asu.student.model.studentgeninfo studentgeninfo, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(studentgeninfo, merge);
	}

	/**
	* Returns the studentgeninfo with the primary key or throws a {@link com.poly.asu.student.NoSuchstudentgeninfoException} if it could not be found.
	*
	* @param studentgeninfoid the primary key of the studentgeninfo
	* @return the studentgeninfo
	* @throws com.poly.asu.student.NoSuchstudentgeninfoException if a studentgeninfo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.poly.asu.student.model.studentgeninfo findByPrimaryKey(
		long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.poly.asu.student.NoSuchstudentgeninfoException {
		return getPersistence().findByPrimaryKey(studentgeninfoid);
	}

	/**
	* Returns the studentgeninfo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentgeninfoid the primary key of the studentgeninfo
	* @return the studentgeninfo, or <code>null</code> if a studentgeninfo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.poly.asu.student.model.studentgeninfo fetchByPrimaryKey(
		long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(studentgeninfoid);
	}

	/**
	* Returns all the studentgeninfos.
	*
	* @return the studentgeninfos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.poly.asu.student.model.studentgeninfo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the studentgeninfos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of studentgeninfos
	* @param end the upper bound of the range of studentgeninfos (not inclusive)
	* @return the range of studentgeninfos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.poly.asu.student.model.studentgeninfo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the studentgeninfos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of studentgeninfos
	* @param end the upper bound of the range of studentgeninfos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of studentgeninfos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.poly.asu.student.model.studentgeninfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the studentgeninfos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of studentgeninfos.
	*
	* @return the number of studentgeninfos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static studentgeninfoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (studentgeninfoPersistence)PortletBeanLocatorUtil.locate(com.poly.asu.student.service.ClpSerializer.getServletContextName(),
					studentgeninfoPersistence.class.getName());

			ReferenceRegistry.registerReference(studentgeninfoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(studentgeninfoPersistence persistence) {
	}

	private static studentgeninfoPersistence _persistence;
}