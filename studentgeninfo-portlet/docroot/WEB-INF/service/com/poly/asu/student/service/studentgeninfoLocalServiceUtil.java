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

package com.poly.asu.student.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the studentgeninfo local service. This utility wraps {@link com.poly.asu.student.service.impl.studentgeninfoLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Shruthi
 * @see studentgeninfoLocalService
 * @see com.poly.asu.student.service.base.studentgeninfoLocalServiceBaseImpl
 * @see com.poly.asu.student.service.impl.studentgeninfoLocalServiceImpl
 * @generated
 */
public class studentgeninfoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.poly.asu.student.service.impl.studentgeninfoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the studentgeninfo to the database. Also notifies the appropriate model listeners.
	*
	* @param studentgeninfo the studentgeninfo
	* @return the studentgeninfo that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.poly.asu.student.model.studentgeninfo addstudentgeninfo(
		com.poly.asu.student.model.studentgeninfo studentgeninfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addstudentgeninfo(studentgeninfo);
	}

	/**
	* Creates a new studentgeninfo with the primary key. Does not add the studentgeninfo to the database.
	*
	* @param studentgeninfoid the primary key for the new studentgeninfo
	* @return the new studentgeninfo
	*/
	public static com.poly.asu.student.model.studentgeninfo createstudentgeninfo(
		long studentgeninfoid) {
		return getService().createstudentgeninfo(studentgeninfoid);
	}

	/**
	* Deletes the studentgeninfo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentgeninfoid the primary key of the studentgeninfo
	* @return the studentgeninfo that was removed
	* @throws PortalException if a studentgeninfo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.poly.asu.student.model.studentgeninfo deletestudentgeninfo(
		long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletestudentgeninfo(studentgeninfoid);
	}

	/**
	* Deletes the studentgeninfo from the database. Also notifies the appropriate model listeners.
	*
	* @param studentgeninfo the studentgeninfo
	* @return the studentgeninfo that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.poly.asu.student.model.studentgeninfo deletestudentgeninfo(
		com.poly.asu.student.model.studentgeninfo studentgeninfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletestudentgeninfo(studentgeninfo);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.poly.asu.student.model.studentgeninfo fetchstudentgeninfo(
		long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchstudentgeninfo(studentgeninfoid);
	}

	/**
	* Returns the studentgeninfo with the primary key.
	*
	* @param studentgeninfoid the primary key of the studentgeninfo
	* @return the studentgeninfo
	* @throws PortalException if a studentgeninfo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.poly.asu.student.model.studentgeninfo getstudentgeninfo(
		long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getstudentgeninfo(studentgeninfoid);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.poly.asu.student.model.studentgeninfo> getstudentgeninfos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getstudentgeninfos(start, end);
	}

	/**
	* Returns the number of studentgeninfos.
	*
	* @return the number of studentgeninfos
	* @throws SystemException if a system exception occurred
	*/
	public static int getstudentgeninfosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getstudentgeninfosCount();
	}

	/**
	* Updates the studentgeninfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param studentgeninfo the studentgeninfo
	* @return the studentgeninfo that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.poly.asu.student.model.studentgeninfo updatestudentgeninfo(
		com.poly.asu.student.model.studentgeninfo studentgeninfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatestudentgeninfo(studentgeninfo);
	}

	/**
	* Updates the studentgeninfo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param studentgeninfo the studentgeninfo
	* @param merge whether to merge the studentgeninfo with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the studentgeninfo that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.poly.asu.student.model.studentgeninfo updatestudentgeninfo(
		com.poly.asu.student.model.studentgeninfo studentgeninfo, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatestudentgeninfo(studentgeninfo, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static studentgeninfoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					studentgeninfoLocalService.class.getName());

			if (invokableLocalService instanceof studentgeninfoLocalService) {
				_service = (studentgeninfoLocalService)invokableLocalService;
			}
			else {
				_service = new studentgeninfoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(studentgeninfoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(studentgeninfoLocalService service) {
	}

	private static studentgeninfoLocalService _service;
}