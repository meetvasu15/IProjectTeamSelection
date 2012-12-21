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

package com.test.slayer.service.persistence;

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

import com.test.slayer.NoSuchiProjectException;
import com.test.slayer.model.iProject;
import com.test.slayer.model.impl.iProjectImpl;
import com.test.slayer.model.impl.iProjectModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the i project service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author anshu
 * @see iProjectPersistence
 * @see iProjectUtil
 * @generated
 */
public class iProjectPersistenceImpl extends BasePersistenceImpl<iProject>
	implements iProjectPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link iProjectUtil} to access the i project persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = iProjectImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(iProjectModelImpl.ENTITY_CACHE_ENABLED,
			iProjectModelImpl.FINDER_CACHE_ENABLED, iProjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(iProjectModelImpl.ENTITY_CACHE_ENABLED,
			iProjectModelImpl.FINDER_CACHE_ENABLED, iProjectImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(iProjectModelImpl.ENTITY_CACHE_ENABLED,
			iProjectModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the i project in the entity cache if it is enabled.
	 *
	 * @param iProject the i project
	 */
	public void cacheResult(iProject iProject) {
		EntityCacheUtil.putResult(iProjectModelImpl.ENTITY_CACHE_ENABLED,
			iProjectImpl.class, iProject.getPrimaryKey(), iProject);

		iProject.resetOriginalValues();
	}

	/**
	 * Caches the i projects in the entity cache if it is enabled.
	 *
	 * @param iProjects the i projects
	 */
	public void cacheResult(List<iProject> iProjects) {
		for (iProject iProject : iProjects) {
			if (EntityCacheUtil.getResult(
						iProjectModelImpl.ENTITY_CACHE_ENABLED,
						iProjectImpl.class, iProject.getPrimaryKey()) == null) {
				cacheResult(iProject);
			}
			else {
				iProject.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all i projects.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(iProjectImpl.class.getName());
		}

		EntityCacheUtil.clearCache(iProjectImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the i project.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(iProject iProject) {
		EntityCacheUtil.removeResult(iProjectModelImpl.ENTITY_CACHE_ENABLED,
			iProjectImpl.class, iProject.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<iProject> iProjects) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (iProject iProject : iProjects) {
			EntityCacheUtil.removeResult(iProjectModelImpl.ENTITY_CACHE_ENABLED,
				iProjectImpl.class, iProject.getPrimaryKey());
		}
	}

	/**
	 * Creates a new i project with the primary key. Does not add the i project to the database.
	 *
	 * @param iProjectPK the primary key for the new i project
	 * @return the new i project
	 */
	public iProject create(iProjectPK iProjectPK) {
		iProject iProject = new iProjectImpl();

		iProject.setNew(true);
		iProject.setPrimaryKey(iProjectPK);

		return iProject;
	}

	/**
	 * Removes the i project with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param iProjectPK the primary key of the i project
	 * @return the i project that was removed
	 * @throws com.test.slayer.NoSuchiProjectException if a i project with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public iProject remove(iProjectPK iProjectPK)
		throws NoSuchiProjectException, SystemException {
		return remove((Serializable)iProjectPK);
	}

	/**
	 * Removes the i project with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the i project
	 * @return the i project that was removed
	 * @throws com.test.slayer.NoSuchiProjectException if a i project with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public iProject remove(Serializable primaryKey)
		throws NoSuchiProjectException, SystemException {
		Session session = null;

		try {
			session = openSession();

			iProject iProject = (iProject)session.get(iProjectImpl.class,
					primaryKey);

			if (iProject == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchiProjectException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(iProject);
		}
		catch (NoSuchiProjectException nsee) {
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
	protected iProject removeImpl(iProject iProject) throws SystemException {
		iProject = toUnwrappedModel(iProject);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, iProject);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(iProject);

		return iProject;
	}

	@Override
	public iProject updateImpl(com.test.slayer.model.iProject iProject,
		boolean merge) throws SystemException {
		iProject = toUnwrappedModel(iProject);

		boolean isNew = iProject.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, iProject, merge);

			iProject.setNew(false);
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

		EntityCacheUtil.putResult(iProjectModelImpl.ENTITY_CACHE_ENABLED,
			iProjectImpl.class, iProject.getPrimaryKey(), iProject);

		return iProject;
	}

	protected iProject toUnwrappedModel(iProject iProject) {
		if (iProject instanceof iProjectImpl) {
			return iProject;
		}

		iProjectImpl iProjectImpl = new iProjectImpl();

		iProjectImpl.setNew(iProject.isNew());
		iProjectImpl.setPrimaryKey(iProject.getPrimaryKey());

		iProjectImpl.setProjectID(iProject.getProjectID());
		iProjectImpl.setProjectName(iProject.getProjectName());
		iProjectImpl.setSkillset(iProject.getSkillset());
		iProjectImpl.setDescription(iProject.getDescription());
		iProjectImpl.setContact(iProject.getContact());
		iProjectImpl.setDateAdded(iProject.getDateAdded());

		return iProjectImpl;
	}

	/**
	 * Returns the i project with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the i project
	 * @return the i project
	 * @throws com.liferay.portal.NoSuchModelException if a i project with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public iProject findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((iProjectPK)primaryKey);
	}

	/**
	 * Returns the i project with the primary key or throws a {@link com.test.slayer.NoSuchiProjectException} if it could not be found.
	 *
	 * @param iProjectPK the primary key of the i project
	 * @return the i project
	 * @throws com.test.slayer.NoSuchiProjectException if a i project with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public iProject findByPrimaryKey(iProjectPK iProjectPK)
		throws NoSuchiProjectException, SystemException {
		iProject iProject = fetchByPrimaryKey(iProjectPK);

		if (iProject == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + iProjectPK);
			}

			throw new NoSuchiProjectException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				iProjectPK);
		}

		return iProject;
	}

	/**
	 * Returns the i project with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the i project
	 * @return the i project, or <code>null</code> if a i project with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public iProject fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((iProjectPK)primaryKey);
	}

	/**
	 * Returns the i project with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param iProjectPK the primary key of the i project
	 * @return the i project, or <code>null</code> if a i project with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public iProject fetchByPrimaryKey(iProjectPK iProjectPK)
		throws SystemException {
		iProject iProject = (iProject)EntityCacheUtil.getResult(iProjectModelImpl.ENTITY_CACHE_ENABLED,
				iProjectImpl.class, iProjectPK);

		if (iProject == _nulliProject) {
			return null;
		}

		if (iProject == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				iProject = (iProject)session.get(iProjectImpl.class, iProjectPK);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (iProject != null) {
					cacheResult(iProject);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(iProjectModelImpl.ENTITY_CACHE_ENABLED,
						iProjectImpl.class, iProjectPK, _nulliProject);
				}

				closeSession(session);
			}
		}

		return iProject;
	}

	/**
	 * Returns all the i projects.
	 *
	 * @return the i projects
	 * @throws SystemException if a system exception occurred
	 */
	public List<iProject> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<iProject> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the i projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of i projects
	 * @param end the upper bound of the range of i projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of i projects
	 * @throws SystemException if a system exception occurred
	 */
	public List<iProject> findAll(int start, int end,
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

		List<iProject> list = (List<iProject>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_IPROJECT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_IPROJECT.concat(iProjectModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<iProject>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<iProject>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the i projects from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (iProject iProject : findAll()) {
			remove(iProject);
		}
	}

	/**
	 * Returns the number of i projects.
	 *
	 * @return the number of i projects
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_IPROJECT);

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
	 * Initializes the i project persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.slayer.model.iProject")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<iProject>> listenersList = new ArrayList<ModelListener<iProject>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<iProject>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(iProjectImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = iProjectPersistence.class)
	protected iProjectPersistence iProjectPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_IPROJECT = "SELECT iProject FROM iProject iProject";
	private static final String _SQL_COUNT_IPROJECT = "SELECT COUNT(iProject) FROM iProject iProject";
	private static final String _ORDER_BY_ENTITY_ALIAS = "iProject.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No iProject exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(iProjectPersistenceImpl.class);
	private static iProject _nulliProject = new iProjectImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<iProject> toCacheModel() {
				return _nulliProjectCacheModel;
			}
		};

	private static CacheModel<iProject> _nulliProjectCacheModel = new CacheModel<iProject>() {
			public iProject toEntityModel() {
				return _nulliProject;
			}
		};
}