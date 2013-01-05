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

package com.asu.iproject.student.skillset.service.persistence;

import com.asu.iproject.student.skillset.model.Skillset;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the skillset service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhengyan
 * @see SkillsetPersistenceImpl
 * @see SkillsetUtil
 * @generated
 */
public interface SkillsetPersistence extends BasePersistence<Skillset> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SkillsetUtil} to access the skillset persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the skillset in the entity cache if it is enabled.
	*
	* @param skillset the skillset
	*/
	public void cacheResult(
		com.asu.iproject.student.skillset.model.Skillset skillset);

	/**
	* Caches the skillsets in the entity cache if it is enabled.
	*
	* @param skillsets the skillsets
	*/
	public void cacheResult(
		java.util.List<com.asu.iproject.student.skillset.model.Skillset> skillsets);

	/**
	* Creates a new skillset with the primary key. Does not add the skillset to the database.
	*
	* @param studentID the primary key for the new skillset
	* @return the new skillset
	*/
	public com.asu.iproject.student.skillset.model.Skillset create(
		long studentID);

	/**
	* Removes the skillset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentID the primary key of the skillset
	* @return the skillset that was removed
	* @throws com.asu.iproject.student.skillset.NoSuchSkillsetException if a skillset with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.iproject.student.skillset.model.Skillset remove(
		long studentID)
		throws com.asu.iproject.student.skillset.NoSuchSkillsetException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.asu.iproject.student.skillset.model.Skillset updateImpl(
		com.asu.iproject.student.skillset.model.Skillset skillset, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the skillset with the primary key or throws a {@link com.asu.iproject.student.skillset.NoSuchSkillsetException} if it could not be found.
	*
	* @param studentID the primary key of the skillset
	* @return the skillset
	* @throws com.asu.iproject.student.skillset.NoSuchSkillsetException if a skillset with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.iproject.student.skillset.model.Skillset findByPrimaryKey(
		long studentID)
		throws com.asu.iproject.student.skillset.NoSuchSkillsetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the skillset with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentID the primary key of the skillset
	* @return the skillset, or <code>null</code> if a skillset with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.iproject.student.skillset.model.Skillset fetchByPrimaryKey(
		long studentID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the skillsets.
	*
	* @return the skillsets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.asu.iproject.student.skillset.model.Skillset> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.asu.iproject.student.skillset.model.Skillset> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.asu.iproject.student.skillset.model.Skillset> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the skillsets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of skillsets.
	*
	* @return the number of skillsets
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}