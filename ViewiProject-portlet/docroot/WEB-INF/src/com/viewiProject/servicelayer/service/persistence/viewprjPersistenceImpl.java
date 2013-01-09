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

package com.viewiProject.servicelayer.service.persistence;

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

import com.viewiProject.servicelayer.NoSuchviewprjException;
import com.viewiProject.servicelayer.model.impl.viewprjImpl;
import com.viewiProject.servicelayer.model.impl.viewprjModelImpl;
import com.viewiProject.servicelayer.model.viewprj;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the viewprj service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see viewprjPersistence
 * @see viewprjUtil
 * @generated
 */
public class viewprjPersistenceImpl extends BasePersistenceImpl<viewprj>
	implements viewprjPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link viewprjUtil} to access the viewprj persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = viewprjImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(viewprjModelImpl.ENTITY_CACHE_ENABLED,
			viewprjModelImpl.FINDER_CACHE_ENABLED, viewprjImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(viewprjModelImpl.ENTITY_CACHE_ENABLED,
			viewprjModelImpl.FINDER_CACHE_ENABLED, viewprjImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(viewprjModelImpl.ENTITY_CACHE_ENABLED,
			viewprjModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the viewprj in the entity cache if it is enabled.
	 *
	 * @param viewprj the viewprj
	 */
	public void cacheResult(viewprj viewprj) {
		EntityCacheUtil.putResult(viewprjModelImpl.ENTITY_CACHE_ENABLED,
			viewprjImpl.class, viewprj.getPrimaryKey(), viewprj);

		viewprj.resetOriginalValues();
	}

	/**
	 * Caches the viewprjs in the entity cache if it is enabled.
	 *
	 * @param viewprjs the viewprjs
	 */
	public void cacheResult(List<viewprj> viewprjs) {
		for (viewprj viewprj : viewprjs) {
			if (EntityCacheUtil.getResult(
						viewprjModelImpl.ENTITY_CACHE_ENABLED,
						viewprjImpl.class, viewprj.getPrimaryKey()) == null) {
				cacheResult(viewprj);
			}
			else {
				viewprj.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all viewprjs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(viewprjImpl.class.getName());
		}

		EntityCacheUtil.clearCache(viewprjImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the viewprj.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(viewprj viewprj) {
		EntityCacheUtil.removeResult(viewprjModelImpl.ENTITY_CACHE_ENABLED,
			viewprjImpl.class, viewprj.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<viewprj> viewprjs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (viewprj viewprj : viewprjs) {
			EntityCacheUtil.removeResult(viewprjModelImpl.ENTITY_CACHE_ENABLED,
				viewprjImpl.class, viewprj.getPrimaryKey());
		}
	}

	/**
	 * Creates a new viewprj with the primary key. Does not add the viewprj to the database.
	 *
	 * @param projectId the primary key for the new viewprj
	 * @return the new viewprj
	 */
	public viewprj create(long projectId) {
		viewprj viewprj = new viewprjImpl();

		viewprj.setNew(true);
		viewprj.setPrimaryKey(projectId);

		return viewprj;
	}

	/**
	 * Removes the viewprj with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectId the primary key of the viewprj
	 * @return the viewprj that was removed
	 * @throws com.viewiProject.servicelayer.NoSuchviewprjException if a viewprj with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public viewprj remove(long projectId)
		throws NoSuchviewprjException, SystemException {
		return remove(Long.valueOf(projectId));
	}

	/**
	 * Removes the viewprj with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the viewprj
	 * @return the viewprj that was removed
	 * @throws com.viewiProject.servicelayer.NoSuchviewprjException if a viewprj with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public viewprj remove(Serializable primaryKey)
		throws NoSuchviewprjException, SystemException {
		Session session = null;

		try {
			session = openSession();

			viewprj viewprj = (viewprj)session.get(viewprjImpl.class, primaryKey);

			if (viewprj == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchviewprjException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(viewprj);
		}
		catch (NoSuchviewprjException nsee) {
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
	protected viewprj removeImpl(viewprj viewprj) throws SystemException {
		viewprj = toUnwrappedModel(viewprj);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, viewprj);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(viewprj);

		return viewprj;
	}

	@Override
	public viewprj updateImpl(
		com.viewiProject.servicelayer.model.viewprj viewprj, boolean merge)
		throws SystemException {
		viewprj = toUnwrappedModel(viewprj);

		boolean isNew = viewprj.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, viewprj, merge);

			viewprj.setNew(false);
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

		EntityCacheUtil.putResult(viewprjModelImpl.ENTITY_CACHE_ENABLED,
			viewprjImpl.class, viewprj.getPrimaryKey(), viewprj);

		return viewprj;
	}

	protected viewprj toUnwrappedModel(viewprj viewprj) {
		if (viewprj instanceof viewprjImpl) {
			return viewprj;
		}

		viewprjImpl viewprjImpl = new viewprjImpl();

		viewprjImpl.setNew(viewprj.isNew());
		viewprjImpl.setPrimaryKey(viewprj.getPrimaryKey());

		viewprjImpl.setProjectId(viewprj.getProjectId());
		viewprjImpl.setProjectTitle(viewprj.getProjectTitle());
		viewprjImpl.setProjectdescription(viewprj.getProjectdescription());
		viewprjImpl.setProjectrequiredskill(viewprj.getProjectrequiredskill());
		viewprjImpl.setContact(viewprj.getContact());
		viewprjImpl.setDateAdded(viewprj.getDateAdded());

		return viewprjImpl;
	}

	/**
	 * Returns the viewprj with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the viewprj
	 * @return the viewprj
	 * @throws com.liferay.portal.NoSuchModelException if a viewprj with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public viewprj findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the viewprj with the primary key or throws a {@link com.viewiProject.servicelayer.NoSuchviewprjException} if it could not be found.
	 *
	 * @param projectId the primary key of the viewprj
	 * @return the viewprj
	 * @throws com.viewiProject.servicelayer.NoSuchviewprjException if a viewprj with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public viewprj findByPrimaryKey(long projectId)
		throws NoSuchviewprjException, SystemException {
		viewprj viewprj = fetchByPrimaryKey(projectId);

		if (viewprj == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + projectId);
			}

			throw new NoSuchviewprjException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				projectId);
		}

		return viewprj;
	}

	/**
	 * Returns the viewprj with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the viewprj
	 * @return the viewprj, or <code>null</code> if a viewprj with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public viewprj fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the viewprj with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param projectId the primary key of the viewprj
	 * @return the viewprj, or <code>null</code> if a viewprj with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public viewprj fetchByPrimaryKey(long projectId) throws SystemException {
		viewprj viewprj = (viewprj)EntityCacheUtil.getResult(viewprjModelImpl.ENTITY_CACHE_ENABLED,
				viewprjImpl.class, projectId);

		if (viewprj == _nullviewprj) {
			return null;
		}

		if (viewprj == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				viewprj = (viewprj)session.get(viewprjImpl.class,
						Long.valueOf(projectId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (viewprj != null) {
					cacheResult(viewprj);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(viewprjModelImpl.ENTITY_CACHE_ENABLED,
						viewprjImpl.class, projectId, _nullviewprj);
				}

				closeSession(session);
			}
		}

		return viewprj;
	}

	/**
	 * Returns all the viewprjs.
	 *
	 * @return the viewprjs
	 * @throws SystemException if a system exception occurred
	 */
	public List<viewprj> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the viewprjs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of viewprjs
	 * @param end the upper bound of the range of viewprjs (not inclusive)
	 * @return the range of viewprjs
	 * @throws SystemException if a system exception occurred
	 */
	public List<viewprj> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the viewprjs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of viewprjs
	 * @param end the upper bound of the range of viewprjs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of viewprjs
	 * @throws SystemException if a system exception occurred
	 */
	public List<viewprj> findAll(int start, int end,
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

		List<viewprj> list = (List<viewprj>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VIEWPRJ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VIEWPRJ;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<viewprj>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<viewprj>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the viewprjs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (viewprj viewprj : findAll()) {
			remove(viewprj);
		}
	}

	/**
	 * Returns the number of viewprjs.
	 *
	 * @return the number of viewprjs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VIEWPRJ);

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
	 * Initializes the viewprj persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viewiProject.servicelayer.model.viewprj")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<viewprj>> listenersList = new ArrayList<ModelListener<viewprj>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<viewprj>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(viewprjImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = viewprjPersistence.class)
	protected viewprjPersistence viewprjPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VIEWPRJ = "SELECT viewprj FROM viewprj viewprj";
	private static final String _SQL_COUNT_VIEWPRJ = "SELECT COUNT(viewprj) FROM viewprj viewprj";
	private static final String _ORDER_BY_ENTITY_ALIAS = "viewprj.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No viewprj exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(viewprjPersistenceImpl.class);
	private static viewprj _nullviewprj = new viewprjImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<viewprj> toCacheModel() {
				return _nullviewprjCacheModel;
			}
		};

	private static CacheModel<viewprj> _nullviewprjCacheModel = new CacheModel<viewprj>() {
			public viewprj toEntityModel() {
				return _nullviewprj;
			}
		};
}