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

import com.asu.poly.teams.manualSelect.slayer.NoSuchProjectdetailException;
import com.asu.poly.teams.manualSelect.slayer.model.Projectdetail;
import com.asu.poly.teams.manualSelect.slayer.model.impl.ProjectdetailImpl;
import com.asu.poly.teams.manualSelect.slayer.model.impl.ProjectdetailModelImpl;

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
 * The persistence implementation for the projectdetail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author asingh64
 * @see ProjectdetailPersistence
 * @see ProjectdetailUtil
 * @generated
 */
public class ProjectdetailPersistenceImpl extends BasePersistenceImpl<Projectdetail>
	implements ProjectdetailPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProjectdetailUtil} to access the projectdetail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProjectdetailImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProjectdetailModelImpl.ENTITY_CACHE_ENABLED,
			ProjectdetailModelImpl.FINDER_CACHE_ENABLED,
			ProjectdetailImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProjectdetailModelImpl.ENTITY_CACHE_ENABLED,
			ProjectdetailModelImpl.FINDER_CACHE_ENABLED,
			ProjectdetailImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProjectdetailModelImpl.ENTITY_CACHE_ENABLED,
			ProjectdetailModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the projectdetail in the entity cache if it is enabled.
	 *
	 * @param projectdetail the projectdetail
	 */
	public void cacheResult(Projectdetail projectdetail) {
		EntityCacheUtil.putResult(ProjectdetailModelImpl.ENTITY_CACHE_ENABLED,
			ProjectdetailImpl.class, projectdetail.getPrimaryKey(),
			projectdetail);

		projectdetail.resetOriginalValues();
	}

	/**
	 * Caches the projectdetails in the entity cache if it is enabled.
	 *
	 * @param projectdetails the projectdetails
	 */
	public void cacheResult(List<Projectdetail> projectdetails) {
		for (Projectdetail projectdetail : projectdetails) {
			if (EntityCacheUtil.getResult(
						ProjectdetailModelImpl.ENTITY_CACHE_ENABLED,
						ProjectdetailImpl.class, projectdetail.getPrimaryKey()) == null) {
				cacheResult(projectdetail);
			}
			else {
				projectdetail.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all projectdetails.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProjectdetailImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProjectdetailImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the projectdetail.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Projectdetail projectdetail) {
		EntityCacheUtil.removeResult(ProjectdetailModelImpl.ENTITY_CACHE_ENABLED,
			ProjectdetailImpl.class, projectdetail.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Projectdetail> projectdetails) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Projectdetail projectdetail : projectdetails) {
			EntityCacheUtil.removeResult(ProjectdetailModelImpl.ENTITY_CACHE_ENABLED,
				ProjectdetailImpl.class, projectdetail.getPrimaryKey());
		}
	}

	/**
	 * Creates a new projectdetail with the primary key. Does not add the projectdetail to the database.
	 *
	 * @param projectID the primary key for the new projectdetail
	 * @return the new projectdetail
	 */
	public Projectdetail create(long projectID) {
		Projectdetail projectdetail = new ProjectdetailImpl();

		projectdetail.setNew(true);
		projectdetail.setPrimaryKey(projectID);

		return projectdetail;
	}

	/**
	 * Removes the projectdetail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectID the primary key of the projectdetail
	 * @return the projectdetail that was removed
	 * @throws com.asu.poly.teams.manualSelect.slayer.NoSuchProjectdetailException if a projectdetail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Projectdetail remove(long projectID)
		throws NoSuchProjectdetailException, SystemException {
		return remove(Long.valueOf(projectID));
	}

	/**
	 * Removes the projectdetail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the projectdetail
	 * @return the projectdetail that was removed
	 * @throws com.asu.poly.teams.manualSelect.slayer.NoSuchProjectdetailException if a projectdetail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Projectdetail remove(Serializable primaryKey)
		throws NoSuchProjectdetailException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Projectdetail projectdetail = (Projectdetail)session.get(ProjectdetailImpl.class,
					primaryKey);

			if (projectdetail == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProjectdetailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(projectdetail);
		}
		catch (NoSuchProjectdetailException nsee) {
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
	protected Projectdetail removeImpl(Projectdetail projectdetail)
		throws SystemException {
		projectdetail = toUnwrappedModel(projectdetail);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, projectdetail);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(projectdetail);

		return projectdetail;
	}

	@Override
	public Projectdetail updateImpl(
		com.asu.poly.teams.manualSelect.slayer.model.Projectdetail projectdetail,
		boolean merge) throws SystemException {
		projectdetail = toUnwrappedModel(projectdetail);

		boolean isNew = projectdetail.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, projectdetail, merge);

			projectdetail.setNew(false);
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

		EntityCacheUtil.putResult(ProjectdetailModelImpl.ENTITY_CACHE_ENABLED,
			ProjectdetailImpl.class, projectdetail.getPrimaryKey(),
			projectdetail);

		return projectdetail;
	}

	protected Projectdetail toUnwrappedModel(Projectdetail projectdetail) {
		if (projectdetail instanceof ProjectdetailImpl) {
			return projectdetail;
		}

		ProjectdetailImpl projectdetailImpl = new ProjectdetailImpl();

		projectdetailImpl.setNew(projectdetail.isNew());
		projectdetailImpl.setPrimaryKey(projectdetail.getPrimaryKey());

		projectdetailImpl.setProjectID(projectdetail.getProjectID());
		projectdetailImpl.setProjectTitle(projectdetail.getProjectTitle());
		projectdetailImpl.setProjectdescription(projectdetail.getProjectdescription());
		projectdetailImpl.setProjectrequiredskill(projectdetail.getProjectrequiredskill());
		projectdetailImpl.setContact(projectdetail.getContact());
		projectdetailImpl.setDateAdded(projectdetail.getDateAdded());
		projectdetailImpl.setDateModified(projectdetail.getDateModified());

		return projectdetailImpl;
	}

	/**
	 * Returns the projectdetail with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the projectdetail
	 * @return the projectdetail
	 * @throws com.liferay.portal.NoSuchModelException if a projectdetail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Projectdetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the projectdetail with the primary key or throws a {@link com.asu.poly.teams.manualSelect.slayer.NoSuchProjectdetailException} if it could not be found.
	 *
	 * @param projectID the primary key of the projectdetail
	 * @return the projectdetail
	 * @throws com.asu.poly.teams.manualSelect.slayer.NoSuchProjectdetailException if a projectdetail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Projectdetail findByPrimaryKey(long projectID)
		throws NoSuchProjectdetailException, SystemException {
		Projectdetail projectdetail = fetchByPrimaryKey(projectID);

		if (projectdetail == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + projectID);
			}

			throw new NoSuchProjectdetailException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				projectID);
		}

		return projectdetail;
	}

	/**
	 * Returns the projectdetail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the projectdetail
	 * @return the projectdetail, or <code>null</code> if a projectdetail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Projectdetail fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the projectdetail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param projectID the primary key of the projectdetail
	 * @return the projectdetail, or <code>null</code> if a projectdetail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Projectdetail fetchByPrimaryKey(long projectID)
		throws SystemException {
		Projectdetail projectdetail = (Projectdetail)EntityCacheUtil.getResult(ProjectdetailModelImpl.ENTITY_CACHE_ENABLED,
				ProjectdetailImpl.class, projectID);

		if (projectdetail == _nullProjectdetail) {
			return null;
		}

		if (projectdetail == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				projectdetail = (Projectdetail)session.get(ProjectdetailImpl.class,
						Long.valueOf(projectID));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (projectdetail != null) {
					cacheResult(projectdetail);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ProjectdetailModelImpl.ENTITY_CACHE_ENABLED,
						ProjectdetailImpl.class, projectID, _nullProjectdetail);
				}

				closeSession(session);
			}
		}

		return projectdetail;
	}

	/**
	 * Returns all the projectdetails.
	 *
	 * @return the projectdetails
	 * @throws SystemException if a system exception occurred
	 */
	public List<Projectdetail> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Projectdetail> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the projectdetails.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of projectdetails
	 * @param end the upper bound of the range of projectdetails (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of projectdetails
	 * @throws SystemException if a system exception occurred
	 */
	public List<Projectdetail> findAll(int start, int end,
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

		List<Projectdetail> list = (List<Projectdetail>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PROJECTDETAIL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROJECTDETAIL;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Projectdetail>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Projectdetail>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the projectdetails from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Projectdetail projectdetail : findAll()) {
			remove(projectdetail);
		}
	}

	/**
	 * Returns the number of projectdetails.
	 *
	 * @return the number of projectdetails
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PROJECTDETAIL);

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
	 * Initializes the projectdetail persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.asu.poly.teams.manualSelect.slayer.model.Projectdetail")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Projectdetail>> listenersList = new ArrayList<ModelListener<Projectdetail>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Projectdetail>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ProjectdetailImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = FacultyPersistence.class)
	protected FacultyPersistence facultyPersistence;
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
	private static final String _SQL_SELECT_PROJECTDETAIL = "SELECT projectdetail FROM Projectdetail projectdetail";
	private static final String _SQL_COUNT_PROJECTDETAIL = "SELECT COUNT(projectdetail) FROM Projectdetail projectdetail";
	private static final String _ORDER_BY_ENTITY_ALIAS = "projectdetail.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Projectdetail exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ProjectdetailPersistenceImpl.class);
	private static Projectdetail _nullProjectdetail = new ProjectdetailImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Projectdetail> toCacheModel() {
				return _nullProjectdetailCacheModel;
			}
		};

	private static CacheModel<Projectdetail> _nullProjectdetailCacheModel = new CacheModel<Projectdetail>() {
			public Projectdetail toEntityModel() {
				return _nullProjectdetail;
			}
		};
}