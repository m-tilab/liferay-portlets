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

package com.tookasoft.portlet.addtocontacts.service.persistence;

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

import com.tookasoft.portlet.addtocontacts.NoSuchemailaddressException;
import com.tookasoft.portlet.addtocontacts.model.emailaddress;
import com.tookasoft.portlet.addtocontacts.model.impl.emailaddressImpl;
import com.tookasoft.portlet.addtocontacts.model.impl.emailaddressModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the emailaddress service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tookasoft
 * @see emailaddressPersistence
 * @see emailaddressUtil
 * @generated
 */
public class emailaddressPersistenceImpl extends BasePersistenceImpl<emailaddress>
	implements emailaddressPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link emailaddressUtil} to access the emailaddress persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = emailaddressImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(emailaddressModelImpl.ENTITY_CACHE_ENABLED,
			emailaddressModelImpl.FINDER_CACHE_ENABLED, emailaddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(emailaddressModelImpl.ENTITY_CACHE_ENABLED,
			emailaddressModelImpl.FINDER_CACHE_ENABLED, emailaddressImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(emailaddressModelImpl.ENTITY_CACHE_ENABLED,
			emailaddressModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the emailaddress in the entity cache if it is enabled.
	 *
	 * @param emailaddress the emailaddress
	 */
	public void cacheResult(emailaddress emailaddress) {
		EntityCacheUtil.putResult(emailaddressModelImpl.ENTITY_CACHE_ENABLED,
			emailaddressImpl.class, emailaddress.getPrimaryKey(), emailaddress);

		emailaddress.resetOriginalValues();
	}

	/**
	 * Caches the emailaddresses in the entity cache if it is enabled.
	 *
	 * @param emailaddresses the emailaddresses
	 */
	public void cacheResult(List<emailaddress> emailaddresses) {
		for (emailaddress emailaddress : emailaddresses) {
			if (EntityCacheUtil.getResult(
						emailaddressModelImpl.ENTITY_CACHE_ENABLED,
						emailaddressImpl.class, emailaddress.getPrimaryKey()) == null) {
				cacheResult(emailaddress);
			}
			else {
				emailaddress.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all emailaddresses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(emailaddressImpl.class.getName());
		}

		EntityCacheUtil.clearCache(emailaddressImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the emailaddress.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(emailaddress emailaddress) {
		EntityCacheUtil.removeResult(emailaddressModelImpl.ENTITY_CACHE_ENABLED,
			emailaddressImpl.class, emailaddress.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<emailaddress> emailaddresses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (emailaddress emailaddress : emailaddresses) {
			EntityCacheUtil.removeResult(emailaddressModelImpl.ENTITY_CACHE_ENABLED,
				emailaddressImpl.class, emailaddress.getPrimaryKey());
		}
	}

	/**
	 * Creates a new emailaddress with the primary key. Does not add the emailaddress to the database.
	 *
	 * @param emailId the primary key for the new emailaddress
	 * @return the new emailaddress
	 */
	public emailaddress create(long emailId) {
		emailaddress emailaddress = new emailaddressImpl();

		emailaddress.setNew(true);
		emailaddress.setPrimaryKey(emailId);

		return emailaddress;
	}

	/**
	 * Removes the emailaddress with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param emailId the primary key of the emailaddress
	 * @return the emailaddress that was removed
	 * @throws com.tookasoft.portlet.addtocontacts.NoSuchemailaddressException if a emailaddress with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public emailaddress remove(long emailId)
		throws NoSuchemailaddressException, SystemException {
		return remove(Long.valueOf(emailId));
	}

	/**
	 * Removes the emailaddress with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the emailaddress
	 * @return the emailaddress that was removed
	 * @throws com.tookasoft.portlet.addtocontacts.NoSuchemailaddressException if a emailaddress with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public emailaddress remove(Serializable primaryKey)
		throws NoSuchemailaddressException, SystemException {
		Session session = null;

		try {
			session = openSession();

			emailaddress emailaddress = (emailaddress)session.get(emailaddressImpl.class,
					primaryKey);

			if (emailaddress == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchemailaddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(emailaddress);
		}
		catch (NoSuchemailaddressException nsee) {
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
	protected emailaddress removeImpl(emailaddress emailaddress)
		throws SystemException {
		emailaddress = toUnwrappedModel(emailaddress);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, emailaddress);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(emailaddress);

		return emailaddress;
	}

	@Override
	public emailaddress updateImpl(
		com.tookasoft.portlet.addtocontacts.model.emailaddress emailaddress,
		boolean merge) throws SystemException {
		emailaddress = toUnwrappedModel(emailaddress);

		boolean isNew = emailaddress.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, emailaddress, merge);

			emailaddress.setNew(false);
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

		EntityCacheUtil.putResult(emailaddressModelImpl.ENTITY_CACHE_ENABLED,
			emailaddressImpl.class, emailaddress.getPrimaryKey(), emailaddress);

		return emailaddress;
	}

	protected emailaddress toUnwrappedModel(emailaddress emailaddress) {
		if (emailaddress instanceof emailaddressImpl) {
			return emailaddress;
		}

		emailaddressImpl emailaddressImpl = new emailaddressImpl();

		emailaddressImpl.setNew(emailaddress.isNew());
		emailaddressImpl.setPrimaryKey(emailaddress.getPrimaryKey());

		emailaddressImpl.setEmailId(emailaddress.getEmailId());
		emailaddressImpl.setCreateDate(emailaddress.getCreateDate());
		emailaddressImpl.setEmail(emailaddress.getEmail());

		return emailaddressImpl;
	}

	/**
	 * Returns the emailaddress with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the emailaddress
	 * @return the emailaddress
	 * @throws com.liferay.portal.NoSuchModelException if a emailaddress with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public emailaddress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the emailaddress with the primary key or throws a {@link com.tookasoft.portlet.addtocontacts.NoSuchemailaddressException} if it could not be found.
	 *
	 * @param emailId the primary key of the emailaddress
	 * @return the emailaddress
	 * @throws com.tookasoft.portlet.addtocontacts.NoSuchemailaddressException if a emailaddress with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public emailaddress findByPrimaryKey(long emailId)
		throws NoSuchemailaddressException, SystemException {
		emailaddress emailaddress = fetchByPrimaryKey(emailId);

		if (emailaddress == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + emailId);
			}

			throw new NoSuchemailaddressException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				emailId);
		}

		return emailaddress;
	}

	/**
	 * Returns the emailaddress with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the emailaddress
	 * @return the emailaddress, or <code>null</code> if a emailaddress with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public emailaddress fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the emailaddress with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param emailId the primary key of the emailaddress
	 * @return the emailaddress, or <code>null</code> if a emailaddress with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public emailaddress fetchByPrimaryKey(long emailId)
		throws SystemException {
		emailaddress emailaddress = (emailaddress)EntityCacheUtil.getResult(emailaddressModelImpl.ENTITY_CACHE_ENABLED,
				emailaddressImpl.class, emailId);

		if (emailaddress == _nullemailaddress) {
			return null;
		}

		if (emailaddress == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				emailaddress = (emailaddress)session.get(emailaddressImpl.class,
						Long.valueOf(emailId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (emailaddress != null) {
					cacheResult(emailaddress);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(emailaddressModelImpl.ENTITY_CACHE_ENABLED,
						emailaddressImpl.class, emailId, _nullemailaddress);
				}

				closeSession(session);
			}
		}

		return emailaddress;
	}

	/**
	 * Returns all the emailaddresses.
	 *
	 * @return the emailaddresses
	 * @throws SystemException if a system exception occurred
	 */
	public List<emailaddress> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emailaddresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of emailaddresses
	 * @param end the upper bound of the range of emailaddresses (not inclusive)
	 * @return the range of emailaddresses
	 * @throws SystemException if a system exception occurred
	 */
	public List<emailaddress> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the emailaddresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of emailaddresses
	 * @param end the upper bound of the range of emailaddresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emailaddresses
	 * @throws SystemException if a system exception occurred
	 */
	public List<emailaddress> findAll(int start, int end,
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

		List<emailaddress> list = (List<emailaddress>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMAILADDRESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMAILADDRESS;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<emailaddress>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<emailaddress>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the emailaddresses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (emailaddress emailaddress : findAll()) {
			remove(emailaddress);
		}
	}

	/**
	 * Returns the number of emailaddresses.
	 *
	 * @return the number of emailaddresses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMAILADDRESS);

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
	 * Initializes the emailaddress persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.tookasoft.portlet.addtocontacts.model.emailaddress")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<emailaddress>> listenersList = new ArrayList<ModelListener<emailaddress>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<emailaddress>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(emailaddressImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = emailaddressPersistence.class)
	protected emailaddressPersistence emailaddressPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_EMAILADDRESS = "SELECT emailaddress FROM emailaddress emailaddress";
	private static final String _SQL_COUNT_EMAILADDRESS = "SELECT COUNT(emailaddress) FROM emailaddress emailaddress";
	private static final String _ORDER_BY_ENTITY_ALIAS = "emailaddress.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No emailaddress exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(emailaddressPersistenceImpl.class);
	private static emailaddress _nullemailaddress = new emailaddressImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<emailaddress> toCacheModel() {
				return _nullemailaddressCacheModel;
			}
		};

	private static CacheModel<emailaddress> _nullemailaddressCacheModel = new CacheModel<emailaddress>() {
			public emailaddress toEntityModel() {
				return _nullemailaddress;
			}
		};
}