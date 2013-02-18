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

package com.poly.asu.student.service.persistence;

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

import com.poly.asu.student.NoSuchstudentgeninfoException;
import com.poly.asu.student.model.impl.studentgeninfoImpl;
import com.poly.asu.student.model.impl.studentgeninfoModelImpl;
import com.poly.asu.student.model.studentgeninfo;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the studentgeninfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see studentgeninfoPersistence
 * @see studentgeninfoUtil
 * @generated
 */
public class studentgeninfoPersistenceImpl extends BasePersistenceImpl<studentgeninfo>
	implements studentgeninfoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link studentgeninfoUtil} to access the studentgeninfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = studentgeninfoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(studentgeninfoModelImpl.ENTITY_CACHE_ENABLED,
			studentgeninfoModelImpl.FINDER_CACHE_ENABLED,
			studentgeninfoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(studentgeninfoModelImpl.ENTITY_CACHE_ENABLED,
			studentgeninfoModelImpl.FINDER_CACHE_ENABLED,
			studentgeninfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(studentgeninfoModelImpl.ENTITY_CACHE_ENABLED,
			studentgeninfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the studentgeninfo in the entity cache if it is enabled.
	 *
	 * @param studentgeninfo the studentgeninfo
	 */
	public void cacheResult(studentgeninfo studentgeninfo) {
		EntityCacheUtil.putResult(studentgeninfoModelImpl.ENTITY_CACHE_ENABLED,
			studentgeninfoImpl.class, studentgeninfo.getPrimaryKey(),
			studentgeninfo);

		studentgeninfo.resetOriginalValues();
	}

	/**
	 * Caches the studentgeninfos in the entity cache if it is enabled.
	 *
	 * @param studentgeninfos the studentgeninfos
	 */
	public void cacheResult(List<studentgeninfo> studentgeninfos) {
		for (studentgeninfo studentgeninfo : studentgeninfos) {
			if (EntityCacheUtil.getResult(
						studentgeninfoModelImpl.ENTITY_CACHE_ENABLED,
						studentgeninfoImpl.class, studentgeninfo.getPrimaryKey()) == null) {
				cacheResult(studentgeninfo);
			}
			else {
				studentgeninfo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all studentgeninfos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(studentgeninfoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(studentgeninfoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the studentgeninfo.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(studentgeninfo studentgeninfo) {
		EntityCacheUtil.removeResult(studentgeninfoModelImpl.ENTITY_CACHE_ENABLED,
			studentgeninfoImpl.class, studentgeninfo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<studentgeninfo> studentgeninfos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (studentgeninfo studentgeninfo : studentgeninfos) {
			EntityCacheUtil.removeResult(studentgeninfoModelImpl.ENTITY_CACHE_ENABLED,
				studentgeninfoImpl.class, studentgeninfo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new studentgeninfo with the primary key. Does not add the studentgeninfo to the database.
	 *
	 * @param studentgeninfoid the primary key for the new studentgeninfo
	 * @return the new studentgeninfo
	 */
	public studentgeninfo create(long studentgeninfoid) {
		studentgeninfo studentgeninfo = new studentgeninfoImpl();

		studentgeninfo.setNew(true);
		studentgeninfo.setPrimaryKey(studentgeninfoid);

		return studentgeninfo;
	}

	/**
	 * Removes the studentgeninfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentgeninfoid the primary key of the studentgeninfo
	 * @return the studentgeninfo that was removed
	 * @throws com.poly.asu.student.NoSuchstudentgeninfoException if a studentgeninfo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public studentgeninfo remove(long studentgeninfoid)
		throws NoSuchstudentgeninfoException, SystemException {
		return remove(Long.valueOf(studentgeninfoid));
	}

	/**
	 * Removes the studentgeninfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the studentgeninfo
	 * @return the studentgeninfo that was removed
	 * @throws com.poly.asu.student.NoSuchstudentgeninfoException if a studentgeninfo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public studentgeninfo remove(Serializable primaryKey)
		throws NoSuchstudentgeninfoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			studentgeninfo studentgeninfo = (studentgeninfo)session.get(studentgeninfoImpl.class,
					primaryKey);

			if (studentgeninfo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchstudentgeninfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(studentgeninfo);
		}
		catch (NoSuchstudentgeninfoException nsee) {
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
	protected studentgeninfo removeImpl(studentgeninfo studentgeninfo)
		throws SystemException {
		studentgeninfo = toUnwrappedModel(studentgeninfo);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, studentgeninfo);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(studentgeninfo);

		return studentgeninfo;
	}

	@Override
	public studentgeninfo updateImpl(
		com.poly.asu.student.model.studentgeninfo studentgeninfo, boolean merge)
		throws SystemException {
		studentgeninfo = toUnwrappedModel(studentgeninfo);

		boolean isNew = studentgeninfo.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, studentgeninfo, merge);

			studentgeninfo.setNew(false);
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

		EntityCacheUtil.putResult(studentgeninfoModelImpl.ENTITY_CACHE_ENABLED,
			studentgeninfoImpl.class, studentgeninfo.getPrimaryKey(),
			studentgeninfo);

		return studentgeninfo;
	}

	protected studentgeninfo toUnwrappedModel(studentgeninfo studentgeninfo) {
		if (studentgeninfo instanceof studentgeninfoImpl) {
			return studentgeninfo;
		}

		studentgeninfoImpl studentgeninfoImpl = new studentgeninfoImpl();

		studentgeninfoImpl.setNew(studentgeninfo.isNew());
		studentgeninfoImpl.setPrimaryKey(studentgeninfo.getPrimaryKey());

		studentgeninfoImpl.setStudentgeninfoid(studentgeninfo.getStudentgeninfoid());
		studentgeninfoImpl.setName(studentgeninfo.getName());
		studentgeninfoImpl.setAsuid(studentgeninfo.getAsuid());
		studentgeninfoImpl.setDepartment(studentgeninfo.getDepartment());
		studentgeninfoImpl.setLevel(studentgeninfo.getLevel());
		studentgeninfoImpl.setCummulativegpa(studentgeninfo.getCummulativegpa());
		studentgeninfoImpl.setLoggedinuserId(studentgeninfo.getLoggedinuserId());
		studentgeninfoImpl.setCreateDate(studentgeninfo.getCreateDate());
		studentgeninfoImpl.setModifiedDate(studentgeninfo.getModifiedDate());

		return studentgeninfoImpl;
	}

	/**
	 * Returns the studentgeninfo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the studentgeninfo
	 * @return the studentgeninfo
	 * @throws com.liferay.portal.NoSuchModelException if a studentgeninfo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public studentgeninfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the studentgeninfo with the primary key or throws a {@link com.poly.asu.student.NoSuchstudentgeninfoException} if it could not be found.
	 *
	 * @param studentgeninfoid the primary key of the studentgeninfo
	 * @return the studentgeninfo
	 * @throws com.poly.asu.student.NoSuchstudentgeninfoException if a studentgeninfo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public studentgeninfo findByPrimaryKey(long studentgeninfoid)
		throws NoSuchstudentgeninfoException, SystemException {
		studentgeninfo studentgeninfo = fetchByPrimaryKey(studentgeninfoid);

		if (studentgeninfo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + studentgeninfoid);
			}

			throw new NoSuchstudentgeninfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				studentgeninfoid);
		}

		return studentgeninfo;
	}

	/**
	 * Returns the studentgeninfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the studentgeninfo
	 * @return the studentgeninfo, or <code>null</code> if a studentgeninfo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public studentgeninfo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the studentgeninfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentgeninfoid the primary key of the studentgeninfo
	 * @return the studentgeninfo, or <code>null</code> if a studentgeninfo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public studentgeninfo fetchByPrimaryKey(long studentgeninfoid)
		throws SystemException {
		studentgeninfo studentgeninfo = (studentgeninfo)EntityCacheUtil.getResult(studentgeninfoModelImpl.ENTITY_CACHE_ENABLED,
				studentgeninfoImpl.class, studentgeninfoid);

		if (studentgeninfo == _nullstudentgeninfo) {
			return null;
		}

		if (studentgeninfo == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				studentgeninfo = (studentgeninfo)session.get(studentgeninfoImpl.class,
						Long.valueOf(studentgeninfoid));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (studentgeninfo != null) {
					cacheResult(studentgeninfo);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(studentgeninfoModelImpl.ENTITY_CACHE_ENABLED,
						studentgeninfoImpl.class, studentgeninfoid,
						_nullstudentgeninfo);
				}

				closeSession(session);
			}
		}

		return studentgeninfo;
	}

	/**
	 * Returns all the studentgeninfos.
	 *
	 * @return the studentgeninfos
	 * @throws SystemException if a system exception occurred
	 */
	public List<studentgeninfo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<studentgeninfo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the studentgeninfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of studentgeninfos
	 * @param end the upper bound of the range of studentgeninfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of studentgeninfos
	 * @throws SystemException if a system exception occurred
	 */
	public List<studentgeninfo> findAll(int start, int end,
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

		List<studentgeninfo> list = (List<studentgeninfo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STUDENTGENINFO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STUDENTGENINFO;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<studentgeninfo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<studentgeninfo>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the studentgeninfos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (studentgeninfo studentgeninfo : findAll()) {
			remove(studentgeninfo);
		}
	}

	/**
	 * Returns the number of studentgeninfos.
	 *
	 * @return the number of studentgeninfos
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STUDENTGENINFO);

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
	 * Initializes the studentgeninfo persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.poly.asu.student.model.studentgeninfo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<studentgeninfo>> listenersList = new ArrayList<ModelListener<studentgeninfo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<studentgeninfo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(studentgeninfoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = studentgeninfoPersistence.class)
	protected studentgeninfoPersistence studentgeninfoPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_STUDENTGENINFO = "SELECT studentgeninfo FROM studentgeninfo studentgeninfo";
	private static final String _SQL_COUNT_STUDENTGENINFO = "SELECT COUNT(studentgeninfo) FROM studentgeninfo studentgeninfo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "studentgeninfo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No studentgeninfo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(studentgeninfoPersistenceImpl.class);
	private static studentgeninfo _nullstudentgeninfo = new studentgeninfoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<studentgeninfo> toCacheModel() {
				return _nullstudentgeninfoCacheModel;
			}
		};

	private static CacheModel<studentgeninfo> _nullstudentgeninfoCacheModel = new CacheModel<studentgeninfo>() {
			public studentgeninfo toEntityModel() {
				return _nullstudentgeninfo;
			}
		};
}