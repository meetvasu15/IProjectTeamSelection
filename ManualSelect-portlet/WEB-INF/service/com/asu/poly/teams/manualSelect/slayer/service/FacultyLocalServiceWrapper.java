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

package com.asu.poly.teams.manualSelect.slayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link FacultyLocalService}.
 * </p>
 *
 * @author    asingh64
 * @see       FacultyLocalService
 * @generated
 */
public class FacultyLocalServiceWrapper implements FacultyLocalService,
	ServiceWrapper<FacultyLocalService> {
	public FacultyLocalServiceWrapper(FacultyLocalService facultyLocalService) {
		_facultyLocalService = facultyLocalService;
	}

	/**
	* Adds the faculty to the database. Also notifies the appropriate model listeners.
	*
	* @param faculty the faculty
	* @return the faculty that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.teams.manualSelect.slayer.model.Faculty addFaculty(
		com.asu.poly.teams.manualSelect.slayer.model.Faculty faculty)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facultyLocalService.addFaculty(faculty);
	}

	/**
	* Creates a new faculty with the primary key. Does not add the faculty to the database.
	*
	* @param facultyID the primary key for the new faculty
	* @return the new faculty
	*/
	public com.asu.poly.teams.manualSelect.slayer.model.Faculty createFaculty(
		long facultyID) {
		return _facultyLocalService.createFaculty(facultyID);
	}

	/**
	* Deletes the faculty with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param facultyID the primary key of the faculty
	* @return the faculty that was removed
	* @throws PortalException if a faculty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.teams.manualSelect.slayer.model.Faculty deleteFaculty(
		long facultyID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facultyLocalService.deleteFaculty(facultyID);
	}

	/**
	* Deletes the faculty from the database. Also notifies the appropriate model listeners.
	*
	* @param faculty the faculty
	* @return the faculty that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.teams.manualSelect.slayer.model.Faculty deleteFaculty(
		com.asu.poly.teams.manualSelect.slayer.model.Faculty faculty)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facultyLocalService.deleteFaculty(faculty);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _facultyLocalService.dynamicQuery();
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
		return _facultyLocalService.dynamicQuery(dynamicQuery);
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
		return _facultyLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _facultyLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _facultyLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.asu.poly.teams.manualSelect.slayer.model.Faculty fetchFaculty(
		long facultyID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facultyLocalService.fetchFaculty(facultyID);
	}

	/**
	* Returns the faculty with the primary key.
	*
	* @param facultyID the primary key of the faculty
	* @return the faculty
	* @throws PortalException if a faculty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.teams.manualSelect.slayer.model.Faculty getFaculty(
		long facultyID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facultyLocalService.getFaculty(facultyID);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _facultyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the faculties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of faculties
	* @param end the upper bound of the range of faculties (not inclusive)
	* @return the range of faculties
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.asu.poly.teams.manualSelect.slayer.model.Faculty> getFaculties(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facultyLocalService.getFaculties(start, end);
	}

	/**
	* Returns the number of faculties.
	*
	* @return the number of faculties
	* @throws SystemException if a system exception occurred
	*/
	public int getFacultiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facultyLocalService.getFacultiesCount();
	}

	/**
	* Updates the faculty in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faculty the faculty
	* @return the faculty that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.teams.manualSelect.slayer.model.Faculty updateFaculty(
		com.asu.poly.teams.manualSelect.slayer.model.Faculty faculty)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facultyLocalService.updateFaculty(faculty);
	}

	/**
	* Updates the faculty in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faculty the faculty
	* @param merge whether to merge the faculty with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the faculty that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.teams.manualSelect.slayer.model.Faculty updateFaculty(
		com.asu.poly.teams.manualSelect.slayer.model.Faculty faculty,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _facultyLocalService.updateFaculty(faculty, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _facultyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_facultyLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _facultyLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FacultyLocalService getWrappedFacultyLocalService() {
		return _facultyLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFacultyLocalService(
		FacultyLocalService facultyLocalService) {
		_facultyLocalService = facultyLocalService;
	}

	public FacultyLocalService getWrappedService() {
		return _facultyLocalService;
	}

	public void setWrappedService(FacultyLocalService facultyLocalService) {
		_facultyLocalService = facultyLocalService;
	}

	private FacultyLocalService _facultyLocalService;
}