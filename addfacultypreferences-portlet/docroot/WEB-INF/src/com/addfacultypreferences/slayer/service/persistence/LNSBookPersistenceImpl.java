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

package com.addfacultypreferences.slayer.service.persistence;

import com.addfacultypreferences.slayer.NoSuchBookException;
import com.addfacultypreferences.slayer.model.LNSBook;
import com.addfacultypreferences.slayer.model.impl.LNSBookImpl;
import com.addfacultypreferences.slayer.model.impl.LNSBookModelImpl;

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
 * The persistence implementation for the l n s book service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Eshwari
 * @see LNSBookPersistence
 * @see LNSBookUtil
 * @generated
 */
public class LNSBookPersistenceImpl extends BasePersistenceImpl<LNSBook>
	implements LNSBookPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LNSBookUtil} to access the l n s book persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LNSBookImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LNSBookModelImpl.ENTITY_CACHE_ENABLED,
			LNSBookModelImpl.FINDER_CACHE_ENABLED, LNSBookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LNSBookModelImpl.ENTITY_CACHE_ENABLED,
			LNSBookModelImpl.FINDER_CACHE_ENABLED, LNSBookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LNSBookModelImpl.ENTITY_CACHE_ENABLED,
			LNSBookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the l n s book in the entity cache if it is enabled.
	 *
	 * @param lnsBook the l n s book
	 */
	public void cacheResult(LNSBook lnsBook) {
		EntityCacheUtil.putResult(LNSBookModelImpl.ENTITY_CACHE_ENABLED,
			LNSBookImpl.class, lnsBook.getPrimaryKey(), lnsBook);

		lnsBook.resetOriginalValues();
	}

	/**
	 * Caches the l n s books in the entity cache if it is enabled.
	 *
	 * @param lnsBooks the l n s books
	 */
	public void cacheResult(List<LNSBook> lnsBooks) {
		for (LNSBook lnsBook : lnsBooks) {
			if (EntityCacheUtil.getResult(
						LNSBookModelImpl.ENTITY_CACHE_ENABLED,
						LNSBookImpl.class, lnsBook.getPrimaryKey()) == null) {
				cacheResult(lnsBook);
			}
			else {
				lnsBook.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all l n s books.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LNSBookImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LNSBookImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the l n s book.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LNSBook lnsBook) {
		EntityCacheUtil.removeResult(LNSBookModelImpl.ENTITY_CACHE_ENABLED,
			LNSBookImpl.class, lnsBook.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LNSBook> lnsBooks) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LNSBook lnsBook : lnsBooks) {
			EntityCacheUtil.removeResult(LNSBookModelImpl.ENTITY_CACHE_ENABLED,
				LNSBookImpl.class, lnsBook.getPrimaryKey());
		}
	}

	/**
	 * Creates a new l n s book with the primary key. Does not add the l n s book to the database.
	 *
	 * @param nameId the primary key for the new l n s book
	 * @return the new l n s book
	 */
	public LNSBook create(long nameId) {
		LNSBook lnsBook = new LNSBookImpl();

		lnsBook.setNew(true);
		lnsBook.setPrimaryKey(nameId);

		return lnsBook;
	}

	/**
	 * Removes the l n s book with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nameId the primary key of the l n s book
	 * @return the l n s book that was removed
	 * @throws com.addfacultypreferences.slayer.NoSuchBookException if a l n s book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LNSBook remove(long nameId)
		throws NoSuchBookException, SystemException {
		return remove(Long.valueOf(nameId));
	}

	/**
	 * Removes the l n s book with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the l n s book
	 * @return the l n s book that was removed
	 * @throws com.addfacultypreferences.slayer.NoSuchBookException if a l n s book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LNSBook remove(Serializable primaryKey)
		throws NoSuchBookException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LNSBook lnsBook = (LNSBook)session.get(LNSBookImpl.class, primaryKey);

			if (lnsBook == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lnsBook);
		}
		catch (NoSuchBookException nsee) {
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
	protected LNSBook removeImpl(LNSBook lnsBook) throws SystemException {
		lnsBook = toUnwrappedModel(lnsBook);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, lnsBook);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(lnsBook);

		return lnsBook;
	}

	@Override
	public LNSBook updateImpl(
		com.addfacultypreferences.slayer.model.LNSBook lnsBook, boolean merge)
		throws SystemException {
		lnsBook = toUnwrappedModel(lnsBook);

		boolean isNew = lnsBook.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, lnsBook, merge);

			lnsBook.setNew(false);
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

		EntityCacheUtil.putResult(LNSBookModelImpl.ENTITY_CACHE_ENABLED,
			LNSBookImpl.class, lnsBook.getPrimaryKey(), lnsBook);

		return lnsBook;
	}

	protected LNSBook toUnwrappedModel(LNSBook lnsBook) {
		if (lnsBook instanceof LNSBookImpl) {
			return lnsBook;
		}

		LNSBookImpl lnsBookImpl = new LNSBookImpl();

		lnsBookImpl.setNew(lnsBook.isNew());
		lnsBookImpl.setPrimaryKey(lnsBook.getPrimaryKey());

		lnsBookImpl.setNameId(lnsBook.getNameId());
		lnsBookImpl.setName(lnsBook.getName());
		lnsBookImpl.setEmail(lnsBook.getEmail());
		lnsBookImpl.setNumber(lnsBook.getNumber());
		lnsBookImpl.setDateAdded(lnsBook.getDateAdded());

		return lnsBookImpl;
	}

	/**
	 * Returns the l n s book with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the l n s book
	 * @return the l n s book
	 * @throws com.liferay.portal.NoSuchModelException if a l n s book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LNSBook findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the l n s book with the primary key or throws a {@link com.addfacultypreferences.slayer.NoSuchBookException} if it could not be found.
	 *
	 * @param nameId the primary key of the l n s book
	 * @return the l n s book
	 * @throws com.addfacultypreferences.slayer.NoSuchBookException if a l n s book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LNSBook findByPrimaryKey(long nameId)
		throws NoSuchBookException, SystemException {
		LNSBook lnsBook = fetchByPrimaryKey(nameId);

		if (lnsBook == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + nameId);
			}

			throw new NoSuchBookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				nameId);
		}

		return lnsBook;
	}

	/**
	 * Returns the l n s book with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the l n s book
	 * @return the l n s book, or <code>null</code> if a l n s book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LNSBook fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the l n s book with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nameId the primary key of the l n s book
	 * @return the l n s book, or <code>null</code> if a l n s book with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LNSBook fetchByPrimaryKey(long nameId) throws SystemException {
		LNSBook lnsBook = (LNSBook)EntityCacheUtil.getResult(LNSBookModelImpl.ENTITY_CACHE_ENABLED,
				LNSBookImpl.class, nameId);

		if (lnsBook == _nullLNSBook) {
			return null;
		}

		if (lnsBook == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				lnsBook = (LNSBook)session.get(LNSBookImpl.class,
						Long.valueOf(nameId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (lnsBook != null) {
					cacheResult(lnsBook);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(LNSBookModelImpl.ENTITY_CACHE_ENABLED,
						LNSBookImpl.class, nameId, _nullLNSBook);
				}

				closeSession(session);
			}
		}

		return lnsBook;
	}

	/**
	 * Returns all the l n s books.
	 *
	 * @return the l n s books
	 * @throws SystemException if a system exception occurred
	 */
	public List<LNSBook> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the l n s books.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of l n s books
	 * @param end the upper bound of the range of l n s books (not inclusive)
	 * @return the range of l n s books
	 * @throws SystemException if a system exception occurred
	 */
	public List<LNSBook> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the l n s books.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of l n s books
	 * @param end the upper bound of the range of l n s books (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of l n s books
	 * @throws SystemException if a system exception occurred
	 */
	public List<LNSBook> findAll(int start, int end,
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

		List<LNSBook> list = (List<LNSBook>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LNSBOOK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LNSBOOK;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<LNSBook>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<LNSBook>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the l n s books from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (LNSBook lnsBook : findAll()) {
			remove(lnsBook);
		}
	}

	/**
	 * Returns the number of l n s books.
	 *
	 * @return the number of l n s books
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LNSBOOK);

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
	 * Initializes the l n s book persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.addfacultypreferences.slayer.model.LNSBook")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LNSBook>> listenersList = new ArrayList<ModelListener<LNSBook>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LNSBook>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LNSBookImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = LNSBookPersistence.class)
	protected LNSBookPersistence lnsBookPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_LNSBOOK = "SELECT lnsBook FROM LNSBook lnsBook";
	private static final String _SQL_COUNT_LNSBOOK = "SELECT COUNT(lnsBook) FROM LNSBook lnsBook";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lnsBook.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LNSBook exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LNSBookPersistenceImpl.class);
	private static LNSBook _nullLNSBook = new LNSBookImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LNSBook> toCacheModel() {
				return _nullLNSBookCacheModel;
			}
		};

	private static CacheModel<LNSBook> _nullLNSBookCacheModel = new CacheModel<LNSBook>() {
			public LNSBook toEntityModel() {
				return _nullLNSBook;
			}
		};
}