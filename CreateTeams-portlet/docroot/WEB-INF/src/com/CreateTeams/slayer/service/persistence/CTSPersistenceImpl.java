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

package com.CreateTeams.slayer.service.persistence;

import com.CreateTeams.slayer.NoSuchCTSException;
import com.CreateTeams.slayer.model.CTS;
import com.CreateTeams.slayer.model.impl.CTSImpl;
import com.CreateTeams.slayer.model.impl.CTSModelImpl;

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
 * The persistence implementation for the c t s service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhengyan
 * @see CTSPersistence
 * @see CTSUtil
 * @generated
 */
public class CTSPersistenceImpl extends BasePersistenceImpl<CTS>
	implements CTSPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CTSUtil} to access the c t s persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CTSImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CTSModelImpl.ENTITY_CACHE_ENABLED,
			CTSModelImpl.FINDER_CACHE_ENABLED, CTSImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CTSModelImpl.ENTITY_CACHE_ENABLED,
			CTSModelImpl.FINDER_CACHE_ENABLED, CTSImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CTSModelImpl.ENTITY_CACHE_ENABLED,
			CTSModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the c t s in the entity cache if it is enabled.
	 *
	 * @param cts the c t s
	 */
	public void cacheResult(CTS cts) {
		EntityCacheUtil.putResult(CTSModelImpl.ENTITY_CACHE_ENABLED,
			CTSImpl.class, cts.getPrimaryKey(), cts);

		cts.resetOriginalValues();
	}

	/**
	 * Caches the c t ses in the entity cache if it is enabled.
	 *
	 * @param ctses the c t ses
	 */
	public void cacheResult(List<CTS> ctses) {
		for (CTS cts : ctses) {
			if (EntityCacheUtil.getResult(CTSModelImpl.ENTITY_CACHE_ENABLED,
						CTSImpl.class, cts.getPrimaryKey()) == null) {
				cacheResult(cts);
			}
			else {
				cts.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all c t ses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CTSImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CTSImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the c t s.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CTS cts) {
		EntityCacheUtil.removeResult(CTSModelImpl.ENTITY_CACHE_ENABLED,
			CTSImpl.class, cts.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CTS> ctses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CTS cts : ctses) {
			EntityCacheUtil.removeResult(CTSModelImpl.ENTITY_CACHE_ENABLED,
				CTSImpl.class, cts.getPrimaryKey());
		}
	}

	/**
	 * Creates a new c t s with the primary key. Does not add the c t s to the database.
	 *
	 * @param TeamId the primary key for the new c t s
	 * @return the new c t s
	 */
	public CTS create(long TeamId) {
		CTS cts = new CTSImpl();

		cts.setNew(true);
		cts.setPrimaryKey(TeamId);

		return cts;
	}

	/**
	 * Removes the c t s with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TeamId the primary key of the c t s
	 * @return the c t s that was removed
	 * @throws com.CreateTeams.slayer.NoSuchCTSException if a c t s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public CTS remove(long TeamId) throws NoSuchCTSException, SystemException {
		return remove(Long.valueOf(TeamId));
	}

	/**
	 * Removes the c t s with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the c t s
	 * @return the c t s that was removed
	 * @throws com.CreateTeams.slayer.NoSuchCTSException if a c t s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CTS remove(Serializable primaryKey)
		throws NoSuchCTSException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CTS cts = (CTS)session.get(CTSImpl.class, primaryKey);

			if (cts == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCTSException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cts);
		}
		catch (NoSuchCTSException nsee) {
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
	protected CTS removeImpl(CTS cts) throws SystemException {
		cts = toUnwrappedModel(cts);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, cts);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(cts);

		return cts;
	}

	@Override
	public CTS updateImpl(com.CreateTeams.slayer.model.CTS cts, boolean merge)
		throws SystemException {
		cts = toUnwrappedModel(cts);

		boolean isNew = cts.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, cts, merge);

			cts.setNew(false);
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

		EntityCacheUtil.putResult(CTSModelImpl.ENTITY_CACHE_ENABLED,
			CTSImpl.class, cts.getPrimaryKey(), cts);

		return cts;
	}

	protected CTS toUnwrappedModel(CTS cts) {
		if (cts instanceof CTSImpl) {
			return cts;
		}

		CTSImpl ctsImpl = new CTSImpl();

		ctsImpl.setNew(cts.isNew());
		ctsImpl.setPrimaryKey(cts.getPrimaryKey());

		ctsImpl.setTeamId(cts.getTeamId());
		ctsImpl.setTeamName(cts.getTeamName());
		ctsImpl.setTeamMembers(cts.getTeamMembers());
		ctsImpl.setDateAdded(cts.getDateAdded());

		return ctsImpl;
	}

	/**
	 * Returns the c t s with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the c t s
	 * @return the c t s
	 * @throws com.liferay.portal.NoSuchModelException if a c t s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CTS findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the c t s with the primary key or throws a {@link com.CreateTeams.slayer.NoSuchCTSException} if it could not be found.
	 *
	 * @param TeamId the primary key of the c t s
	 * @return the c t s
	 * @throws com.CreateTeams.slayer.NoSuchCTSException if a c t s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public CTS findByPrimaryKey(long TeamId)
		throws NoSuchCTSException, SystemException {
		CTS cts = fetchByPrimaryKey(TeamId);

		if (cts == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + TeamId);
			}

			throw new NoSuchCTSException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				TeamId);
		}

		return cts;
	}

	/**
	 * Returns the c t s with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the c t s
	 * @return the c t s, or <code>null</code> if a c t s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CTS fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the c t s with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TeamId the primary key of the c t s
	 * @return the c t s, or <code>null</code> if a c t s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public CTS fetchByPrimaryKey(long TeamId) throws SystemException {
		CTS cts = (CTS)EntityCacheUtil.getResult(CTSModelImpl.ENTITY_CACHE_ENABLED,
				CTSImpl.class, TeamId);

		if (cts == _nullCTS) {
			return null;
		}

		if (cts == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				cts = (CTS)session.get(CTSImpl.class, Long.valueOf(TeamId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (cts != null) {
					cacheResult(cts);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(CTSModelImpl.ENTITY_CACHE_ENABLED,
						CTSImpl.class, TeamId, _nullCTS);
				}

				closeSession(session);
			}
		}

		return cts;
	}

	/**
	 * Returns all the c t ses.
	 *
	 * @return the c t ses
	 * @throws SystemException if a system exception occurred
	 */
	public List<CTS> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the c t ses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of c t ses
	 * @param end the upper bound of the range of c t ses (not inclusive)
	 * @return the range of c t ses
	 * @throws SystemException if a system exception occurred
	 */
	public List<CTS> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the c t ses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of c t ses
	 * @param end the upper bound of the range of c t ses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of c t ses
	 * @throws SystemException if a system exception occurred
	 */
	public List<CTS> findAll(int start, int end,
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

		List<CTS> list = (List<CTS>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CTS;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<CTS>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<CTS>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Removes all the c t ses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (CTS cts : findAll()) {
			remove(cts);
		}
	}

	/**
	 * Returns the number of c t ses.
	 *
	 * @return the number of c t ses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CTS);

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
	 * Initializes the c t s persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.CreateTeams.slayer.model.CTS")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CTS>> listenersList = new ArrayList<ModelListener<CTS>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CTS>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CTSImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = CTSPersistence.class)
	protected CTSPersistence ctsPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_CTS = "SELECT cts FROM CTS cts";
	private static final String _SQL_COUNT_CTS = "SELECT COUNT(cts) FROM CTS cts";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cts.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CTS exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CTSPersistenceImpl.class);
	private static CTS _nullCTS = new CTSImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CTS> toCacheModel() {
				return _nullCTSCacheModel;
			}
		};

	private static CacheModel<CTS> _nullCTSCacheModel = new CacheModel<CTS>() {
			public CTS toEntityModel() {
				return _nullCTS;
			}
		};
}