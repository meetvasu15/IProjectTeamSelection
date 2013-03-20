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

package com.asu.poly.teams.manualSelect.slayer.service.persistence;

import com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException;
import com.asu.poly.teams.manualSelect.slayer.model.Faculty;
import com.asu.poly.teams.manualSelect.slayer.model.impl.FacultyImpl;
import com.asu.poly.teams.manualSelect.slayer.model.impl.FacultyModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the faculty service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eshwari
 * @see FacultyPersistence
 * @see FacultyUtil
 * @generated
 */
public class FacultyPersistenceImpl extends BasePersistenceImpl<Faculty>
	implements FacultyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FacultyUtil} to access the faculty persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FacultyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FacultyModelImpl.ENTITY_CACHE_ENABLED,
			FacultyModelImpl.FINDER_CACHE_ENABLED, FacultyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FacultyModelImpl.ENTITY_CACHE_ENABLED,
			FacultyModelImpl.FINDER_CACHE_ENABLED, FacultyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FacultyModelImpl.ENTITY_CACHE_ENABLED,
			FacultyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the faculty in the entity cache if it is enabled.
	 *
	 * @param faculty the faculty
	 */
	public void cacheResult(Faculty faculty) {
		EntityCacheUtil.putResult(FacultyModelImpl.ENTITY_CACHE_ENABLED,
			FacultyImpl.class, faculty.getPrimaryKey(), faculty);

		faculty.resetOriginalValues();
	}

	/**
	 * Caches the faculties in the entity cache if it is enabled.
	 *
	 * @param faculties the faculties
	 */
	public void cacheResult(List<Faculty> faculties) {
		for (Faculty faculty : faculties) {
			if (EntityCacheUtil.getResult(
						FacultyModelImpl.ENTITY_CACHE_ENABLED,
						FacultyImpl.class, faculty.getPrimaryKey()) == null) {
				cacheResult(faculty);
			}
			else {
				faculty.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all faculties.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FacultyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FacultyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the faculty.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Faculty faculty) {
		EntityCacheUtil.removeResult(FacultyModelImpl.ENTITY_CACHE_ENABLED,
			FacultyImpl.class, faculty.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Faculty> faculties) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Faculty faculty : faculties) {
			EntityCacheUtil.removeResult(FacultyModelImpl.ENTITY_CACHE_ENABLED,
				FacultyImpl.class, faculty.getPrimaryKey());
		}
	}

	/**
	 * Creates a new faculty with the primary key. Does not add the faculty to the database.
	 *
	 * @param facultyID the primary key for the new faculty
	 * @return the new faculty
	 */
	public Faculty create(long facultyID) {
		Faculty faculty = new FacultyImpl();

		faculty.setNew(true);
		faculty.setPrimaryKey(facultyID);

		return faculty;
	}

	/**
	 * Removes the faculty with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param facultyID the primary key of the faculty
	 * @return the faculty that was removed
	 * @throws com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException if a faculty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Faculty remove(long facultyID)
		throws NoSuchFacultyException, SystemException {
		return remove(Long.valueOf(facultyID));
	}

	/**
	 * Removes the faculty with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the faculty
	 * @return the faculty that was removed
	 * @throws com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException if a faculty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Faculty remove(Serializable primaryKey)
		throws NoSuchFacultyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Faculty faculty = (Faculty)session.get(FacultyImpl.class, primaryKey);

			if (faculty == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFacultyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(faculty);
		}
		catch (NoSuchFacultyException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Faculty removeImpl(Faculty faculty) throws SystemException {
		faculty = toUnwrappedModel(faculty);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, faculty);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(faculty);

		return faculty;
	}

	@Override
	public Faculty updateImpl(
		com.asu.poly.teams.manualSelect.slayer.model.Faculty faculty,
		boolean merge) throws SystemException {
		faculty = toUnwrappedModel(faculty);

		boolean isNew = faculty.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, faculty, merge);

			faculty.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(FacultyModelImpl.ENTITY_CACHE_ENABLED,
			FacultyImpl.class, faculty.getPrimaryKey(), faculty);

		return faculty;
	}

	protected Faculty toUnwrappedModel(Faculty faculty) {
		if (faculty instanceof FacultyImpl) {
			return faculty;
		}

		FacultyImpl facultyImpl = new FacultyImpl();

		facultyImpl.setNew(faculty.isNew());
		facultyImpl.setPrimaryKey(faculty.getPrimaryKey());

		facultyImpl.setFacultyID(faculty.getFacultyID());
		facultyImpl.setAsuid(faculty.getAsuid());
		facultyImpl.setFacultyName(faculty.getFacultyName());
		facultyImpl.setFacultyDept(faculty.getFacultyDept());
		facultyImpl.setContact(faculty.getContact());
		facultyImpl.setDateAdded(faculty.getDateAdded());
		facultyImpl.setDateModified(faculty.getDateModified());

		return facultyImpl;
	}

	/**
	 * Returns the faculty with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the faculty
	 * @return the faculty
	 * @throws com.liferay.portal.NoSuchModelException if a faculty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Faculty findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the faculty with the primary key or throws a {@link com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException} if it could not be found.
	 *
	 * @param facultyID the primary key of the faculty
	 * @return the faculty
	 * @throws com.asu.poly.teams.manualSelect.slayer.NoSuchFacultyException if a faculty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Faculty findByPrimaryKey(long facultyID)
		throws NoSuchFacultyException, SystemException {
		Faculty faculty = fetchByPrimaryKey(facultyID);

		if (faculty == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + facultyID);
			}

			throw new NoSuchFacultyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				facultyID);
		}

		return faculty;
	}

	/**
	 * Returns the faculty with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the faculty
	 * @return the faculty, or <code>null</code> if a faculty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Faculty fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the faculty with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param facultyID the primary key of the faculty
	 * @return the faculty, or <code>null</code> if a faculty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Faculty fetchByPrimaryKey(long facultyID) throws SystemException {
		Faculty faculty = (Faculty)EntityCacheUtil.getResult(FacultyModelImpl.ENTITY_CACHE_ENABLED,
				FacultyImpl.class, facultyID);

		if (faculty == _nullFaculty) {
			return null;
		}

		if (faculty == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				faculty = (Faculty)session.get(FacultyImpl.class,
						Long.valueOf(facultyID));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (faculty != null) {
					cacheResult(faculty);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FacultyModelImpl.ENTITY_CACHE_ENABLED,
						FacultyImpl.class, facultyID, _nullFaculty);
				}

				closeSession(session);
			}
		}

		return faculty;
	}

	/**
	 * Returns all the faculties.
	 *
	 * @return the faculties
	 * @throws SystemException if a system exception occurred
	 */
	public List<Faculty> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Faculty> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the faculties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of faculties
	 * @param end the upper bound of the range of faculties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of faculties
	 * @throws SystemException if a system exception occurred
	 */
	public List<Faculty> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Faculty> list = (List<Faculty>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FACULTY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FACULTY;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Faculty>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Faculty>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the faculties from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Faculty faculty : findAll()) {
			remove(faculty);
		}
	}

	/**
	 * Returns the number of faculties.
	 *
	 * @return the number of faculties
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FACULTY);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the faculty persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.asu.poly.teams.manualSelect.slayer.model.Faculty")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Faculty>> listenersList = new ArrayList<ModelListener<Faculty>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Faculty>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(FacultyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = FacultyPersistence.class)
	protected FacultyPersistence facultyPersistence;
	@BeanReference(type = preferencesPersistence.class)
	protected preferencesPersistence preferencesPersistence;
	@BeanReference(type = ProjectdetailPersistence.class)
	protected ProjectdetailPersistence projectdetailPersistence;
	@BeanReference(type = SkillsetPersistence.class)
	protected SkillsetPersistence skillsetPersistence;
	@BeanReference(type = StudentPersistence.class)
	protected StudentPersistence studentPersistence;
	@BeanReference(type = TeamPersistence.class)
	protected TeamPersistence teamPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_FACULTY = "SELECT faculty FROM Faculty faculty";
	private static final String _SQL_COUNT_FACULTY = "SELECT COUNT(faculty) FROM Faculty faculty";
	private static final String _ORDER_BY_ENTITY_ALIAS = "faculty.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Faculty exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FacultyPersistenceImpl.class);
	private static Faculty _nullFaculty = new FacultyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Faculty> toCacheModel() {
				return _nullFacultyCacheModel;
			}
		};

	private static CacheModel<Faculty> _nullFacultyCacheModel = new CacheModel<Faculty>() {
			public Faculty toEntityModel() {
				return _nullFaculty;
			}
		};
}