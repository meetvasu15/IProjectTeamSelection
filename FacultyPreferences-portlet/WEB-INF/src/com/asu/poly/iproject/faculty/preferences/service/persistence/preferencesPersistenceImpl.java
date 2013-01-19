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

import com.asu.poly.iproject.faculty.preferences.NoSuchpreferencesException;
import com.asu.poly.iproject.faculty.preferences.model.impl.preferencesImpl;
import com.asu.poly.iproject.faculty.preferences.model.impl.preferencesModelImpl;
import com.asu.poly.iproject.faculty.preferences.model.preferences;

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
 * The persistence implementation for the preferences service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author emente
 * @see preferencesPersistence
 * @see preferencesUtil
 * @generated
 */
public class preferencesPersistenceImpl extends BasePersistenceImpl<preferences>
	implements preferencesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link preferencesUtil} to access the preferences persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = preferencesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(preferencesModelImpl.ENTITY_CACHE_ENABLED,
			preferencesModelImpl.FINDER_CACHE_ENABLED, preferencesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(preferencesModelImpl.ENTITY_CACHE_ENABLED,
			preferencesModelImpl.FINDER_CACHE_ENABLED, preferencesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(preferencesModelImpl.ENTITY_CACHE_ENABLED,
			preferencesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the preferences in the entity cache if it is enabled.
	 *
	 * @param preferences the preferences
	 */
	public void cacheResult(preferences preferences) {
		EntityCacheUtil.putResult(preferencesModelImpl.ENTITY_CACHE_ENABLED,
			preferencesImpl.class, preferences.getPrimaryKey(), preferences);

		preferences.resetOriginalValues();
	}

	/**
	 * Caches the preferenceses in the entity cache if it is enabled.
	 *
	 * @param preferenceses the preferenceses
	 */
	public void cacheResult(List<preferences> preferenceses) {
		for (preferences preferences : preferenceses) {
			if (EntityCacheUtil.getResult(
						preferencesModelImpl.ENTITY_CACHE_ENABLED,
						preferencesImpl.class, preferences.getPrimaryKey()) == null) {
				cacheResult(preferences);
			}
			else {
				preferences.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all preferenceses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(preferencesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(preferencesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the preferences.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(preferences preferences) {
		EntityCacheUtil.removeResult(preferencesModelImpl.ENTITY_CACHE_ENABLED,
			preferencesImpl.class, preferences.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<preferences> preferenceses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (preferences preferences : preferenceses) {
			EntityCacheUtil.removeResult(preferencesModelImpl.ENTITY_CACHE_ENABLED,
				preferencesImpl.class, preferences.getPrimaryKey());
		}
	}

	/**
	 * Creates a new preferences with the primary key. Does not add the preferences to the database.
	 *
	 * @param facultyID the primary key for the new preferences
	 * @return the new preferences
	 */
	public preferences create(long facultyID) {
		preferences preferences = new preferencesImpl();

		preferences.setNew(true);
		preferences.setPrimaryKey(facultyID);

		return preferences;
	}

	/**
	 * Removes the preferences with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param facultyID the primary key of the preferences
	 * @return the preferences that was removed
	 * @throws com.asu.poly.iproject.faculty.preferences.NoSuchpreferencesException if a preferences with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public preferences remove(long facultyID)
		throws NoSuchpreferencesException, SystemException {
		return remove(Long.valueOf(facultyID));
	}

	/**
	 * Removes the preferences with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the preferences
	 * @return the preferences that was removed
	 * @throws com.asu.poly.iproject.faculty.preferences.NoSuchpreferencesException if a preferences with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public preferences remove(Serializable primaryKey)
		throws NoSuchpreferencesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			preferences preferences = (preferences)session.get(preferencesImpl.class,
					primaryKey);

			if (preferences == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpreferencesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(preferences);
		}
		catch (NoSuchpreferencesException nsee) {
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
	protected preferences removeImpl(preferences preferences)
		throws SystemException {
		preferences = toUnwrappedModel(preferences);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, preferences);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(preferences);

		return preferences;
	}

	@Override
	public preferences updateImpl(
		com.asu.poly.iproject.faculty.preferences.model.preferences preferences,
		boolean merge) throws SystemException {
		preferences = toUnwrappedModel(preferences);

		boolean isNew = preferences.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, preferences, merge);

			preferences.setNew(false);
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

		EntityCacheUtil.putResult(preferencesModelImpl.ENTITY_CACHE_ENABLED,
			preferencesImpl.class, preferences.getPrimaryKey(), preferences);

		return preferences;
	}

	protected preferences toUnwrappedModel(preferences preferences) {
		if (preferences instanceof preferencesImpl) {
			return preferences;
		}

		preferencesImpl preferencesImpl = new preferencesImpl();

		preferencesImpl.setNew(preferences.isNew());
		preferencesImpl.setPrimaryKey(preferences.getPrimaryKey());

		preferencesImpl.setFacultyID(preferences.getFacultyID());
		preferencesImpl.setASUID(preferences.getASUID());
		preferencesImpl.setPreference1(preferences.getPreference1());
		preferencesImpl.setPreference2(preferences.getPreference2());
		preferencesImpl.setPreference3(preferences.getPreference3());
		preferencesImpl.setDateAdded(preferences.getDateAdded());
		preferencesImpl.setDateModified(preferences.getDateModified());

		return preferencesImpl;
	}

	/**
	 * Returns the preferences with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the preferences
	 * @return the preferences
	 * @throws com.liferay.portal.NoSuchModelException if a preferences with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public preferences findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the preferences with the primary key or throws a {@link com.asu.poly.iproject.faculty.preferences.NoSuchpreferencesException} if it could not be found.
	 *
	 * @param facultyID the primary key of the preferences
	 * @return the preferences
	 * @throws com.asu.poly.iproject.faculty.preferences.NoSuchpreferencesException if a preferences with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public preferences findByPrimaryKey(long facultyID)
		throws NoSuchpreferencesException, SystemException {
		preferences preferences = fetchByPrimaryKey(facultyID);

		if (preferences == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + facultyID);
			}

			throw new NoSuchpreferencesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				facultyID);
		}

		return preferences;
	}

	/**
	 * Returns the preferences with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the preferences
	 * @return the preferences, or <code>null</code> if a preferences with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public preferences fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the preferences with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param facultyID the primary key of the preferences
	 * @return the preferences, or <code>null</code> if a preferences with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public preferences fetchByPrimaryKey(long facultyID)
		throws SystemException {
		preferences preferences = (preferences)EntityCacheUtil.getResult(preferencesModelImpl.ENTITY_CACHE_ENABLED,
				preferencesImpl.class, facultyID);

		if (preferences == _nullpreferences) {
			return null;
		}

		if (preferences == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				preferences = (preferences)session.get(preferencesImpl.class,
						Long.valueOf(facultyID));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (preferences != null) {
					cacheResult(preferences);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(preferencesModelImpl.ENTITY_CACHE_ENABLED,
						preferencesImpl.class, facultyID, _nullpreferences);
				}

				closeSession(session);
			}
		}

		return preferences;
	}

	/**
	 * Returns all the preferenceses.
	 *
	 * @return the preferenceses
	 * @throws SystemException if a system exception occurred
	 */
	public List<preferences> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the preferenceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferenceses
	 * @param end the upper bound of the range of preferenceses (not inclusive)
	 * @return the range of preferenceses
	 * @throws SystemException if a system exception occurred
	 */
	public List<preferences> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the preferenceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferenceses
	 * @param end the upper bound of the range of preferenceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of preferenceses
	 * @throws SystemException if a system exception occurred
	 */
	public List<preferences> findAll(int start, int end,
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

		List<preferences> list = (List<preferences>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PREFERENCES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PREFERENCES;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<preferences>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<preferences>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the preferenceses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (preferences preferences : findAll()) {
			remove(preferences);
		}
	}

	/**
	 * Returns the number of preferenceses.
	 *
	 * @return the number of preferenceses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PREFERENCES);

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
	 * Initializes the preferences persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.asu.poly.iproject.faculty.preferences.model.preferences")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<preferences>> listenersList = new ArrayList<ModelListener<preferences>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<preferences>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(preferencesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = preferencesPersistence.class)
	protected preferencesPersistence preferencesPersistence;
	@BeanReference(type = ProjectdetailPersistence.class)
	protected ProjectdetailPersistence projectdetailPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_PREFERENCES = "SELECT preferences FROM preferences preferences";
	private static final String _SQL_COUNT_PREFERENCES = "SELECT COUNT(preferences) FROM preferences preferences";
	private static final String _ORDER_BY_ENTITY_ALIAS = "preferences.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No preferences exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(preferencesPersistenceImpl.class);
	private static preferences _nullpreferences = new preferencesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<preferences> toCacheModel() {
				return _nullpreferencesCacheModel;
			}
		};

	private static CacheModel<preferences> _nullpreferencesCacheModel = new CacheModel<preferences>() {
			public preferences toEntityModel() {
				return _nullpreferences;
			}
		};
}