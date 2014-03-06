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

import com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException;
import com.tookasoft.portlet.addtocontacts.model.emailcontact;
import com.tookasoft.portlet.addtocontacts.model.impl.emailcontactImpl;
import com.tookasoft.portlet.addtocontacts.model.impl.emailcontactModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the emailcontact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tookasoft
 * @see emailcontactPersistence
 * @see emailcontactUtil
 * @generated
 */
public class emailcontactPersistenceImpl extends BasePersistenceImpl<emailcontact>
	implements emailcontactPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link emailcontactUtil} to access the emailcontact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = emailcontactImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(emailcontactModelImpl.ENTITY_CACHE_ENABLED,
			emailcontactModelImpl.FINDER_CACHE_ENABLED, emailcontactImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(emailcontactModelImpl.ENTITY_CACHE_ENABLED,
			emailcontactModelImpl.FINDER_CACHE_ENABLED, emailcontactImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(emailcontactModelImpl.ENTITY_CACHE_ENABLED,
			emailcontactModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the emailcontact in the entity cache if it is enabled.
	 *
	 * @param emailcontact the emailcontact
	 */
	public void cacheResult(emailcontact emailcontact) {
		EntityCacheUtil.putResult(emailcontactModelImpl.ENTITY_CACHE_ENABLED,
			emailcontactImpl.class, emailcontact.getPrimaryKey(), emailcontact);

		emailcontact.resetOriginalValues();
	}

	/**
	 * Caches the emailcontacts in the entity cache if it is enabled.
	 *
	 * @param emailcontacts the emailcontacts
	 */
	public void cacheResult(List<emailcontact> emailcontacts) {
		for (emailcontact emailcontact : emailcontacts) {
			if (EntityCacheUtil.getResult(
						emailcontactModelImpl.ENTITY_CACHE_ENABLED,
						emailcontactImpl.class, emailcontact.getPrimaryKey()) == null) {
				cacheResult(emailcontact);
			}
			else {
				emailcontact.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all emailcontacts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(emailcontactImpl.class.getName());
		}

		EntityCacheUtil.clearCache(emailcontactImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the emailcontact.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(emailcontact emailcontact) {
		EntityCacheUtil.removeResult(emailcontactModelImpl.ENTITY_CACHE_ENABLED,
			emailcontactImpl.class, emailcontact.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<emailcontact> emailcontacts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (emailcontact emailcontact : emailcontacts) {
			EntityCacheUtil.removeResult(emailcontactModelImpl.ENTITY_CACHE_ENABLED,
				emailcontactImpl.class, emailcontact.getPrimaryKey());
		}
	}

	/**
	 * Creates a new emailcontact with the primary key. Does not add the emailcontact to the database.
	 *
	 * @param emailId the primary key for the new emailcontact
	 * @return the new emailcontact
	 */
	public emailcontact create(long emailId) {
		emailcontact emailcontact = new emailcontactImpl();

		emailcontact.setNew(true);
		emailcontact.setPrimaryKey(emailId);

		return emailcontact;
	}

	/**
	 * Removes the emailcontact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param emailId the primary key of the emailcontact
	 * @return the emailcontact that was removed
	 * @throws com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException if a emailcontact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public emailcontact remove(long emailId)
		throws NoSuchemailcontactException, SystemException {
		return remove(Long.valueOf(emailId));
	}

	/**
	 * Removes the emailcontact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the emailcontact
	 * @return the emailcontact that was removed
	 * @throws com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException if a emailcontact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public emailcontact remove(Serializable primaryKey)
		throws NoSuchemailcontactException, SystemException {
		Session session = null;

		try {
			session = openSession();

			emailcontact emailcontact = (emailcontact)session.get(emailcontactImpl.class,
					primaryKey);

			if (emailcontact == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchemailcontactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(emailcontact);
		}
		catch (NoSuchemailcontactException nsee) {
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
	protected emailcontact removeImpl(emailcontact emailcontact)
		throws SystemException {
		emailcontact = toUnwrappedModel(emailcontact);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, emailcontact);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(emailcontact);

		return emailcontact;
	}

	@Override
	public emailcontact updateImpl(
		com.tookasoft.portlet.addtocontacts.model.emailcontact emailcontact,
		boolean merge) throws SystemException {
		emailcontact = toUnwrappedModel(emailcontact);

		boolean isNew = emailcontact.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, emailcontact, merge);

			emailcontact.setNew(false);
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

		EntityCacheUtil.putResult(emailcontactModelImpl.ENTITY_CACHE_ENABLED,
			emailcontactImpl.class, emailcontact.getPrimaryKey(), emailcontact);

		return emailcontact;
	}

	protected emailcontact toUnwrappedModel(emailcontact emailcontact) {
		if (emailcontact instanceof emailcontactImpl) {
			return emailcontact;
		}

		emailcontactImpl emailcontactImpl = new emailcontactImpl();

		emailcontactImpl.setNew(emailcontact.isNew());
		emailcontactImpl.setPrimaryKey(emailcontact.getPrimaryKey());

		emailcontactImpl.setEmailId(emailcontact.getEmailId());
		emailcontactImpl.setCreateDate(emailcontact.getCreateDate());
		emailcontactImpl.setEmail(emailcontact.getEmail());

		return emailcontactImpl;
	}

	/**
	 * Returns the emailcontact with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the emailcontact
	 * @return the emailcontact
	 * @throws com.liferay.portal.NoSuchModelException if a emailcontact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public emailcontact findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the emailcontact with the primary key or throws a {@link com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException} if it could not be found.
	 *
	 * @param emailId the primary key of the emailcontact
	 * @return the emailcontact
	 * @throws com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException if a emailcontact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public emailcontact findByPrimaryKey(long emailId)
		throws NoSuchemailcontactException, SystemException {
		emailcontact emailcontact = fetchByPrimaryKey(emailId);

		if (emailcontact == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + emailId);
			}

			throw new NoSuchemailcontactException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				emailId);
		}

		return emailcontact;
	}

	/**
	 * Returns the emailcontact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the emailcontact
	 * @return the emailcontact, or <code>null</code> if a emailcontact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public emailcontact fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the emailcontact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param emailId the primary key of the emailcontact
	 * @return the emailcontact, or <code>null</code> if a emailcontact with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public emailcontact fetchByPrimaryKey(long emailId)
		throws SystemException {
		emailcontact emailcontact = (emailcontact)EntityCacheUtil.getResult(emailcontactModelImpl.ENTITY_CACHE_ENABLED,
				emailcontactImpl.class, emailId);

		if (emailcontact == _nullemailcontact) {
			return null;
		}

		if (emailcontact == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				emailcontact = (emailcontact)session.get(emailcontactImpl.class,
						Long.valueOf(emailId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (emailcontact != null) {
					cacheResult(emailcontact);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(emailcontactModelImpl.ENTITY_CACHE_ENABLED,
						emailcontactImpl.class, emailId, _nullemailcontact);
				}

				closeSession(session);
			}
		}

		return emailcontact;
	}

	/**
	 * Returns all the emailcontacts.
	 *
	 * @return the emailcontacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<emailcontact> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emailcontacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of emailcontacts
	 * @param end the upper bound of the range of emailcontacts (not inclusive)
	 * @return the range of emailcontacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<emailcontact> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the emailcontacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of emailcontacts
	 * @param end the upper bound of the range of emailcontacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emailcontacts
	 * @throws SystemException if a system exception occurred
	 */
	public List<emailcontact> findAll(int start, int end,
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

		List<emailcontact> list = (List<emailcontact>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMAILCONTACT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMAILCONTACT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<emailcontact>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<emailcontact>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the emailcontacts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (emailcontact emailcontact : findAll()) {
			remove(emailcontact);
		}
	}

	/**
	 * Returns the number of emailcontacts.
	 *
	 * @return the number of emailcontacts
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMAILCONTACT);

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
	 * Initializes the emailcontact persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.tookasoft.portlet.addtocontacts.model.emailcontact")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<emailcontact>> listenersList = new ArrayList<ModelListener<emailcontact>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<emailcontact>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(emailcontactImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = emailcontactPersistence.class)
	protected emailcontactPersistence emailcontactPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_EMAILCONTACT = "SELECT emailcontact FROM emailcontact emailcontact";
	private static final String _SQL_COUNT_EMAILCONTACT = "SELECT COUNT(emailcontact) FROM emailcontact emailcontact";
	private static final String _ORDER_BY_ENTITY_ALIAS = "emailcontact.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No emailcontact exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(emailcontactPersistenceImpl.class);
	private static emailcontact _nullemailcontact = new emailcontactImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<emailcontact> toCacheModel() {
				return _nullemailcontactCacheModel;
			}
		};

	private static CacheModel<emailcontact> _nullemailcontactCacheModel = new CacheModel<emailcontact>() {
			public emailcontact toEntityModel() {
				return _nullemailcontact;
			}
		};
}