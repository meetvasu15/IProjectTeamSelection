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

package com.asu.poly.iproject.student.skills.service.persistence;

import com.asu.poly.iproject.student.skills.model.Skillset;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the skillset service. This utility wraps {@link SkillsetPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author asingh64
 * @see SkillsetPersistence
 * @see SkillsetPersistenceImpl
 * @generated
 */
public class SkillsetUtil {
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
	public static void clearCache(Skillset skillset) {
		getPersistence().clearCache(skillset);
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
	public static List<Skillset> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Skillset> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Skillset> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Skillset update(Skillset skillset, boolean merge)
		throws SystemException {
		return getPersistence().update(skillset, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Skillset update(Skillset skillset, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(skillset, merge, serviceContext);
	}

	/**
	* Caches the skillset in the entity cache if it is enabled.
	*
	* @param skillset the skillset
	*/
	public static void cacheResult(
		com.asu.poly.iproject.student.skills.model.Skillset skillset) {
		getPersistence().cacheResult(skillset);
	}

	/**
	* Caches the skillsets in the entity cache if it is enabled.
	*
	* @param skillsets the skillsets
	*/
	public static void cacheResult(
		java.util.List<com.asu.poly.iproject.student.skills.model.Skillset> skillsets) {
		getPersistence().cacheResult(skillsets);
	}

	/**
	* Creates a new skillset with the primary key. Does not add the skillset to the database.
	*
	* @param studentID the primary key for the new skillset
	* @return the new skillset
	*/
	public static com.asu.poly.iproject.student.skills.model.Skillset create(
		long studentID) {
		return getPersistence().create(studentID);
	}

	/**
	* Removes the skillset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentID the primary key of the skillset
	* @return the skillset that was removed
	* @throws com.asu.poly.iproject.student.skills.NoSuchSkillsetException if a skillset with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.iproject.student.skills.model.Skillset remove(
		long studentID)
		throws com.asu.poly.iproject.student.skills.NoSuchSkillsetException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(studentID);
	}

	public static com.asu.poly.iproject.student.skills.model.Skillset updateImpl(
		com.asu.poly.iproject.student.skills.model.Skillset skillset,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(skillset, merge);
	}

	/**
	* Returns the skillset with the primary key or throws a {@link com.asu.poly.iproject.student.skills.NoSuchSkillsetException} if it could not be found.
	*
	* @param studentID the primary key of the skillset
	* @return the skillset
	* @throws com.asu.poly.iproject.student.skills.NoSuchSkillsetException if a skillset with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.iproject.student.skills.model.Skillset findByPrimaryKey(
		long studentID)
		throws com.asu.poly.iproject.student.skills.NoSuchSkillsetException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(studentID);
	}

	/**
	* Returns the skillset with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentID the primary key of the skillset
	* @return the skillset, or <code>null</code> if a skillset with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.iproject.student.skills.model.Skillset fetchByPrimaryKey(
		long studentID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(studentID);
	}

	/**
	* Returns all the skillsets.
	*
	* @return the skillsets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.asu.poly.iproject.student.skills.model.Skillset> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the skillsets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of skillsets
	* @param end the upper bound of the range of skillsets (not inclusive)
	* @return the range of skillsets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.asu.poly.iproject.student.skills.model.Skillset> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the skillsets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of skillsets
	* @param end the upper bound of the range of skillsets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of skillsets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.asu.poly.iproject.student.skills.model.Skillset> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the skillsets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of skillsets.
	*
	* @return the number of skillsets
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SkillsetPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SkillsetPersistence)PortletBeanLocatorUtil.locate(com.asu.poly.iproject.student.skills.service.ClpSerializer.getServletContextName(),
					SkillsetPersistence.class.getName());

			ReferenceRegistry.registerReference(SkillsetUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SkillsetPersistence persistence) {
	}

	private static SkillsetPersistence _persistence;
}