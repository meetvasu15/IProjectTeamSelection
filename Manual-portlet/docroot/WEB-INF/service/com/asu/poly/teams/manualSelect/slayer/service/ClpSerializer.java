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

import com.asu.poly.teams.manualSelect.slayer.model.FacultyClp;
import com.asu.poly.teams.manualSelect.slayer.model.ProjectdetailClp;
import com.asu.poly.teams.manualSelect.slayer.model.SkillsetClp;
import com.asu.poly.teams.manualSelect.slayer.model.StudentClp;
import com.asu.poly.teams.manualSelect.slayer.model.TeamClp;
import com.asu.poly.teams.manualSelect.slayer.model.preferencesClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"Manual-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"Manual-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "Manual-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(FacultyClp.class.getName())) {
			return translateInputFaculty(oldModel);
		}

		if (oldModelClassName.equals(preferencesClp.class.getName())) {
			return translateInputpreferences(oldModel);
		}

		if (oldModelClassName.equals(ProjectdetailClp.class.getName())) {
			return translateInputProjectdetail(oldModel);
		}

		if (oldModelClassName.equals(SkillsetClp.class.getName())) {
			return translateInputSkillset(oldModel);
		}

		if (oldModelClassName.equals(StudentClp.class.getName())) {
			return translateInputStudent(oldModel);
		}

		if (oldModelClassName.equals(TeamClp.class.getName())) {
			return translateInputTeam(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputFaculty(BaseModel<?> oldModel) {
		FacultyClp oldClpModel = (FacultyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getFacultyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputpreferences(BaseModel<?> oldModel) {
		preferencesClp oldClpModel = (preferencesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getpreferencesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputProjectdetail(BaseModel<?> oldModel) {
		ProjectdetailClp oldClpModel = (ProjectdetailClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getProjectdetailRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputSkillset(BaseModel<?> oldModel) {
		SkillsetClp oldClpModel = (SkillsetClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getSkillsetRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputStudent(BaseModel<?> oldModel) {
		StudentClp oldClpModel = (StudentClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getStudentRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTeam(BaseModel<?> oldModel) {
		TeamClp oldClpModel = (TeamClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTeamRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.asu.poly.teams.manualSelect.slayer.model.impl.FacultyImpl")) {
			return translateOutputFaculty(oldModel);
		}

		if (oldModelClassName.equals(
					"com.asu.poly.teams.manualSelect.slayer.model.impl.preferencesImpl")) {
			return translateOutputpreferences(oldModel);
		}

		if (oldModelClassName.equals(
					"com.asu.poly.teams.manualSelect.slayer.model.impl.ProjectdetailImpl")) {
			return translateOutputProjectdetail(oldModel);
		}

		if (oldModelClassName.equals(
					"com.asu.poly.teams.manualSelect.slayer.model.impl.SkillsetImpl")) {
			return translateOutputSkillset(oldModel);
		}

		if (oldModelClassName.equals(
					"com.asu.poly.teams.manualSelect.slayer.model.impl.StudentImpl")) {
			return translateOutputStudent(oldModel);
		}

		if (oldModelClassName.equals(
					"com.asu.poly.teams.manualSelect.slayer.model.impl.TeamImpl")) {
			return translateOutputTeam(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException")) {
			return new com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException();
		}

		if (className.equals(
					"com.asu.poly.teams.manualSelect.slayer.NoSuchpreferencesException")) {
			return new com.asu.poly.teams.manualSelect.slayer.NoSuchpreferencesException();
		}

		if (className.equals(
					"com.asu.poly.teams.manualSelect.slayer.NoSuchProjectdetailException")) {
			return new com.asu.poly.teams.manualSelect.slayer.NoSuchProjectdetailException();
		}

		if (className.equals(
					"com.asu.poly.teams.manualSelect.slayer.NoSuchSkillsetException")) {
			return new com.asu.poly.teams.manualSelect.slayer.NoSuchSkillsetException();
		}

		if (className.equals(
					"com.asu.poly.teams.manualSelect.slayer.NoSuchStudentException")) {
			return new com.asu.poly.teams.manualSelect.slayer.NoSuchStudentException();
		}

		if (className.equals(
					"com.asu.poly.teams.manualSelect.slayer.NoSuchTeamException")) {
			return new com.asu.poly.teams.manualSelect.slayer.NoSuchTeamException();
		}

		return throwable;
	}

	public static Object translateOutputFaculty(BaseModel<?> oldModel) {
		FacultyClp newModel = new FacultyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setFacultyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputpreferences(BaseModel<?> oldModel) {
		preferencesClp newModel = new preferencesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setpreferencesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputProjectdetail(BaseModel<?> oldModel) {
		ProjectdetailClp newModel = new ProjectdetailClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setProjectdetailRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputSkillset(BaseModel<?> oldModel) {
		SkillsetClp newModel = new SkillsetClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setSkillsetRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputStudent(BaseModel<?> oldModel) {
		StudentClp newModel = new StudentClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setStudentRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTeam(BaseModel<?> oldModel) {
		TeamClp newModel = new TeamClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTeamRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}