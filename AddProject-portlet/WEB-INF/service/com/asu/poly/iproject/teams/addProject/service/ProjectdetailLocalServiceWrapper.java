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

package com.asu.poly.iproject.teams.addProject.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ProjectdetailLocalService}.
 * </p>
 *
 * @author    Shruthi
 * @see       ProjectdetailLocalService
 * @generated
 */
public class ProjectdetailLocalServiceWrapper
	implements ProjectdetailLocalService,
		ServiceWrapper<ProjectdetailLocalService> {
	public ProjectdetailLocalServiceWrapper(
		ProjectdetailLocalService projectdetailLocalService) {
		_projectdetailLocalService = projectdetailLocalService;
	}

	/**
	* Adds the projectdetail to the database. Also notifies the appropriate model listeners.
	*
	* @param projectdetail the projectdetail
	* @return the projectdetail that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iproject.teams.addProject.model.Projectdetail addProjectdetail(
		com.asu.poly.iproject.teams.addProject.model.Projectdetail projectdetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectdetailLocalService.addProjectdetail(projectdetail);
	}

	/**
	* Creates a new projectdetail with the primary key. Does not add the projectdetail to the database.
	*
	* @param projectID the primary key for the new projectdetail
	* @return the new projectdetail
	*/
	public com.asu.poly.iproject.teams.addProject.model.Projectdetail createProjectdetail(
		long projectID) {
		return _projectdetailLocalService.createProjectdetail(projectID);
	}

	/**
	* Deletes the projectdetail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectID the primary key of the projectdetail
	* @return the projectdetail that was removed
	* @throws PortalException if a projectdetail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iproject.teams.addProject.model.Projectdetail deleteProjectdetail(
		long projectID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectdetailLocalService.deleteProjectdetail(projectID);
	}

	/**
	* Deletes the projectdetail from the database. Also notifies the appropriate model listeners.
	*
	* @param projectdetail the projectdetail
	* @return the projectdetail that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iproject.teams.addProject.model.Projectdetail deleteProjectdetail(
		com.asu.poly.iproject.teams.addProject.model.Projectdetail projectdetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectdetailLocalService.deleteProjectdetail(projectdetail);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _projectdetailLocalService.dynamicQuery();
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
		return _projectdetailLocalService.dynamicQuery(dynamicQuery);
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
		return _projectdetailLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _projectdetailLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _projectdetailLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.asu.poly.iproject.teams.addProject.model.Projectdetail fetchProjectdetail(
		long projectID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectdetailLocalService.fetchProjectdetail(projectID);
	}

	/**
	* Returns the projectdetail with the primary key.
	*
	* @param projectID the primary key of the projectdetail
	* @return the projectdetail
	* @throws PortalException if a projectdetail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iproject.teams.addProject.model.Projectdetail getProjectdetail(
		long projectID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectdetailLocalService.getProjectdetail(projectID);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectdetailLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.asu.poly.iproject.teams.addProject.model.Projectdetail> getProjectdetails(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectdetailLocalService.getProjectdetails(start, end);
	}

	/**
	* Returns the number of projectdetails.
	*
	* @return the number of projectdetails
	* @throws SystemException if a system exception occurred
	*/
	public int getProjectdetailsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectdetailLocalService.getProjectdetailsCount();
	}

	/**
	* Updates the projectdetail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param projectdetail the projectdetail
	* @return the projectdetail that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iproject.teams.addProject.model.Projectdetail updateProjectdetail(
		com.asu.poly.iproject.teams.addProject.model.Projectdetail projectdetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectdetailLocalService.updateProjectdetail(projectdetail);
	}

	/**
	* Updates the projectdetail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param projectdetail the projectdetail
	* @param merge whether to merge the projectdetail with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the projectdetail that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iproject.teams.addProject.model.Projectdetail updateProjectdetail(
		com.asu.poly.iproject.teams.addProject.model.Projectdetail projectdetail,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectdetailLocalService.updateProjectdetail(projectdetail,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _projectdetailLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_projectdetailLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _projectdetailLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ProjectdetailLocalService getWrappedProjectdetailLocalService() {
		return _projectdetailLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedProjectdetailLocalService(
		ProjectdetailLocalService projectdetailLocalService) {
		_projectdetailLocalService = projectdetailLocalService;
	}

	public ProjectdetailLocalService getWrappedService() {
		return _projectdetailLocalService;
	}

	public void setWrappedService(
		ProjectdetailLocalService projectdetailLocalService) {
		_projectdetailLocalService = projectdetailLocalService;
	}

	private ProjectdetailLocalService _projectdetailLocalService;
}