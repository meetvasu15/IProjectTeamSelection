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

package com.test.slayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link iProjectLocalService}.
 * </p>
 *
 * @author    anshu
 * @see       iProjectLocalService
 * @generated
 */
public class iProjectLocalServiceWrapper implements iProjectLocalService,
	ServiceWrapper<iProjectLocalService> {
	public iProjectLocalServiceWrapper(
		iProjectLocalService iProjectLocalService) {
		_iProjectLocalService = iProjectLocalService;
	}

	/**
	* Adds the i project to the database. Also notifies the appropriate model listeners.
	*
	* @param iProject the i project
	* @return the i project that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.test.slayer.model.iProject addiProject(
		com.test.slayer.model.iProject iProject)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.addiProject(iProject);
	}

	/**
	* Creates a new i project with the primary key. Does not add the i project to the database.
	*
	* @param iProjectPK the primary key for the new i project
	* @return the new i project
	*/
	public com.test.slayer.model.iProject createiProject(
		com.test.slayer.service.persistence.iProjectPK iProjectPK) {
		return _iProjectLocalService.createiProject(iProjectPK);
	}

	/**
	* Deletes the i project with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param iProjectPK the primary key of the i project
	* @return the i project that was removed
	* @throws PortalException if a i project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.slayer.model.iProject deleteiProject(
		com.test.slayer.service.persistence.iProjectPK iProjectPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.deleteiProject(iProjectPK);
	}

	/**
	* Deletes the i project from the database. Also notifies the appropriate model listeners.
	*
	* @param iProject the i project
	* @return the i project that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.test.slayer.model.iProject deleteiProject(
		com.test.slayer.model.iProject iProject)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.deleteiProject(iProject);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _iProjectLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.test.slayer.model.iProject fetchiProject(
		com.test.slayer.service.persistence.iProjectPK iProjectPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.fetchiProject(iProjectPK);
	}

	/**
	* Returns the i project with the primary key.
	*
	* @param iProjectPK the primary key of the i project
	* @return the i project
	* @throws PortalException if a i project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.slayer.model.iProject getiProject(
		com.test.slayer.service.persistence.iProjectPK iProjectPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.getiProject(iProjectPK);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.test.slayer.model.iProject> getiProjects(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.getiProjects(start, end);
	}

	/**
	* Returns the number of i projects.
	*
	* @return the number of i projects
	* @throws SystemException if a system exception occurred
	*/
	public int getiProjectsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.getiProjectsCount();
	}

	/**
	* Updates the i project in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param iProject the i project
	* @return the i project that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.test.slayer.model.iProject updateiProject(
		com.test.slayer.model.iProject iProject)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.updateiProject(iProject);
	}

	/**
	* Updates the i project in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param iProject the i project
	* @param merge whether to merge the i project with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the i project that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.test.slayer.model.iProject updateiProject(
		com.test.slayer.model.iProject iProject, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _iProjectLocalService.updateiProject(iProject, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _iProjectLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_iProjectLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _iProjectLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public iProjectLocalService getWrappediProjectLocalService() {
		return _iProjectLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappediProjectLocalService(
		iProjectLocalService iProjectLocalService) {
		_iProjectLocalService = iProjectLocalService;
	}

	public iProjectLocalService getWrappedService() {
		return _iProjectLocalService;
	}

	public void setWrappedService(iProjectLocalService iProjectLocalService) {
		_iProjectLocalService = iProjectLocalService;
	}

	private iProjectLocalService _iProjectLocalService;
}