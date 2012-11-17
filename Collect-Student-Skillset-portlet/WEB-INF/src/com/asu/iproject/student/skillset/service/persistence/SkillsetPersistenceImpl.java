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

package com.asu.iproject.student.skillset.service.persistence;

import com.asu.iproject.student.skillset.NoSuchSkillsetException;
import com.asu.iproject.student.skillset.model.Skillset;
import com.asu.iproject.student.skillset.model.impl.SkillsetImpl;
import com.asu.iproject.student.skillset.model.impl.SkillsetModelImpl;

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
 * The persistence implementation for the skillset service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhengyan
 * @see SkillsetPersistence
 * @see SkillsetUtil
 * @generated
 */
public class SkillsetPersistenceImpl extends BasePersistenceImpl<Skillset>
	implements SkillsetPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SkillsetUtil} to access the skillset persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SkillsetImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SkillsetModelImpl.ENTITY_CACHE_ENABLED,
			SkillsetModelImpl.FINDER_CACHE_ENABLED, SkillsetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SkillsetModelImpl.ENTITY_CACHE_ENABLED,
			SkillsetModelImpl.FINDER_CACHE_ENABLED, SkillsetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SkillsetModelImpl.ENTITY_CACHE_ENABLED,
			SkillsetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the skillset in the entity cache if it is enabled.
	 *
	 * @param skillset the skillset
	 */
	public void cacheResult(Skillset skillset) {
		EntityCacheUtil.putResult(SkillsetModelImpl.ENTITY_CACHE_ENABLED,
			SkillsetImpl.class, skillset.getPrimaryKey(), skillset);

		skillset.resetOriginalValues();
	}

	/**
	 * Caches the skillsets in the entity cache if it is enabled.
	 *
	 * @param skillsets the skillsets
	 */
	public void cacheResult(List<Skillset> skillsets) {
		for (Skillset skillset : skillsets) {
			if (EntityCacheUtil.getResult(
						SkillsetModelImpl.ENTITY_CACHE_ENABLED,
						SkillsetImpl.class, skillset.getPrimaryKey()) == null) {
				cacheResult(skillset);
			}
			else {
				skillset.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all skillsets.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SkillsetImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SkillsetImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the skillset.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Skillset skillset) {
		EntityCacheUtil.removeResult(SkillsetModelImpl.ENTITY_CACHE_ENABLED,
			SkillsetImpl.class, skillset.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Skillset> skillsets) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Skillset skillset : skillsets) {
			EntityCacheUtil.removeResult(SkillsetModelImpl.ENTITY_CACHE_ENABLED,
				SkillsetImpl.class, skillset.getPrimaryKey());
		}
	}

	/**
	 * Creates a new skillset with the primary key. Does not add the skillset to the database.
	 *
	 * @param studentID the primary key for the new skillset
	 * @return the new skillset
	 */
	public Skillset create(long studentID) {
		Skillset skillset = new SkillsetImpl();

		skillset.setNew(true);
		skillset.setPrimaryKey(studentID);

		return skillset;
	}

	/**
	 * Removes the skillset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentID the primary key of the skillset
	 * @return the skillset that was removed
	 * @throws com.asu.iproject.student.skillset.NoSuchSkillsetException if a skillset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Skillset remove(long studentID)
		throws NoSuchSkillsetException, SystemException {
		return remove(Long.valueOf(studentID));
	}

	/**
	 * Removes the skillset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the skillset
	 * @return the skillset that was removed
	 * @throws com.asu.iproject.student.skillset.NoSuchSkillsetException if a skillset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Skillset remove(Serializable primaryKey)
		throws NoSuchSkillsetException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Skillset skillset = (Skillset)session.get(SkillsetImpl.class,
					primaryKey);

			if (skillset == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSkillsetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(skillset);
		}
		catch (NoSuchSkillsetException nsee) {
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
	protected Skillset removeImpl(Skillset skillset) throws SystemException {
		skillset = toUnwrappedModel(skillset);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, skillset);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(skillset);

		return skillset;
	}

	@Override
	public Skillset updateImpl(
		com.asu.iproject.student.skillset.model.Skillset skillset, boolean merge)
		throws SystemException {
		skillset = toUnwrappedModel(skillset);

		boolean isNew = skillset.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, skillset, merge);

			skillset.setNew(false);
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

		EntityCacheUtil.putResult(SkillsetModelImpl.ENTITY_CACHE_ENABLED,
			SkillsetImpl.class, skillset.getPrimaryKey(), skillset);

		return skillset;
	}

	protected Skillset toUnwrappedModel(Skillset skillset) {
		if (skillset instanceof SkillsetImpl) {
			return skillset;
		}

		SkillsetImpl skillsetImpl = new SkillsetImpl();

		skillsetImpl.setNew(skillset.isNew());
		skillsetImpl.setPrimaryKey(skillset.getPrimaryKey());

		skillsetImpl.setStudentID(skillset.getStudentID());
		skillsetImpl.setAsuid(skillset.getAsuid());
		skillsetImpl.setEmail(skillset.getEmail());
		skillsetImpl.setSkill1(skillset.getSkill1());
		skillsetImpl.setDateAdded(skillset.getDateAdded());

		return skillsetImpl;
	}

	/**
	 * Returns the skillset with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the skillset
	 * @return the skillset
	 * @throws com.liferay.portal.NoSuchModelException if a skillset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Skillset findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the skillset with the primary key or throws a {@link com.asu.iproject.student.skillset.NoSuchSkillsetException} if it could not be found.
	 *
	 * @param studentID the primary key of the skillset
	 * @return the skillset
	 * @throws com.asu.iproject.student.skillset.NoSuchSkillsetException if a skillset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Skillset findByPrimaryKey(long studentID)
		throws NoSuchSkillsetException, SystemException {
		Skillset skillset = fetchByPrimaryKey(studentID);

		if (skillset == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + studentID);
			}

			throw new NoSuchSkillsetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				studentID);
		}

		return skillset;
	}

	/**
	 * Returns the skillset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the skillset
	 * @return the skillset, or <code>null</code> if a skillset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Skillset fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the skillset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentID the primary key of the skillset
	 * @return the skillset, or <code>null</code> if a skillset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Skillset fetchByPrimaryKey(long studentID) throws SystemException {
		Skillset skillset = (Skillset)EntityCacheUtil.getResult(SkillsetModelImpl.ENTITY_CACHE_ENABLED,
				SkillsetImpl.class, studentID);

		if (skillset == _nullSkillset) {
			return null;
		}

		if (skillset == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				skillset = (Skillset)session.get(SkillsetImpl.class,
						Long.valueOf(studentID));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (skillset != null) {
					cacheResult(skillset);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SkillsetModelImpl.ENTITY_CACHE_ENABLED,
						SkillsetImpl.class, studentID, _nullSkillset);
				}

				closeSession(session);
			}
		}

		return skillset;
	}

	/**
	 * Returns all the skillsets.
	 *
	 * @return the skillsets
	 * @throws SystemException if a system exception occurred
	 */
	public List<Skillset> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the skillsets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of skillsets
	 * @param end the upper bound of the range of skillsets (not inclusive)
	 * @return the range of skillsets
	 * @throws SystemException if a system exception occurred
	 */
	public List<Skillset> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the skillsets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of skillsets
	 * @param end the upper bound of the range of skillsets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of skillsets
	 * @throws SystemException if a system exception occurred
	 */
	public List<Skillset> findAll(int start, int end,
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

		List<Skillset> list = (List<Skillset>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SKILLSET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SKILLSET;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Skillset>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Skillset>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the skillsets from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Skillset skillset : findAll()) {
			remove(skillset);
		}
	}

	/**
	 * Returns the number of skillsets.
	 *
	 * @return the number of skillsets
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SKILLSET);

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
	 * Initializes the skillset persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.asu.iproject.student.skillset.model.Skillset")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Skillset>> listenersList = new ArrayList<ModelListener<Skillset>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Skillset>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SkillsetImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = SkillsetPersistence.class)
	protected SkillsetPersistence skillsetPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_SKILLSET = "SELECT skillset FROM Skillset skillset";
	private static final String _SQL_COUNT_SKILLSET = "SELECT COUNT(skillset) FROM Skillset skillset";
	private static final String _ORDER_BY_ENTITY_ALIAS = "skillset.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Skillset exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SkillsetPersistenceImpl.class);
	private static Skillset _nullSkillset = new SkillsetImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Skillset> toCacheModel() {
				return _nullSkillsetCacheModel;
			}
		};

	private static CacheModel<Skillset> _nullSkillsetCacheModel = new CacheModel<Skillset>() {
			public Skillset toEntityModel() {
				return _nullSkillset;
			}
		};
}