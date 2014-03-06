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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.tookasoft.portlet.addtocontacts.model.emailcontact;

import java.util.List;

/**
 * The persistence utility for the emailcontact service. This utility wraps {@link emailcontactPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tookasoft
 * @see emailcontactPersistence
 * @see emailcontactPersistenceImpl
 * @generated
 */
public class emailcontactUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(emailcontact emailcontact) {
		getPersistence().clearCache(emailcontact);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<emailcontact> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<emailcontact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<emailcontact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static emailcontact update(emailcontact emailcontact, boolean merge)
		throws SystemException {
		return getPersistence().update(emailcontact, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static emailcontact update(emailcontact emailcontact, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(emailcontact, merge, serviceContext);
	}

	/**
	* Caches the emailcontact in the entity cache if it is enabled.
	*
	* @param emailcontact the emailcontact
	*/
	public static void cacheResult(
		com.tookasoft.portlet.addtocontacts.model.emailcontact emailcontact) {
		getPersistence().cacheResult(emailcontact);
	}

	/**
	* Caches the emailcontacts in the entity cache if it is enabled.
	*
	* @param emailcontacts the emailcontacts
	*/
	public static void cacheResult(
		java.util.List<com.tookasoft.portlet.addtocontacts.model.emailcontact> emailcontacts) {
		getPersistence().cacheResult(emailcontacts);
	}

	/**
	* Creates a new emailcontact with the primary key. Does not add the emailcontact to the database.
	*
	* @param emailId the primary key for the new emailcontact
	* @return the new emailcontact
	*/
	public static com.tookasoft.portlet.addtocontacts.model.emailcontact create(
		long emailId) {
		return getPersistence().create(emailId);
	}

	/**
	* Removes the emailcontact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param emailId the primary key of the emailcontact
	* @return the emailcontact that was removed
	* @throws com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException if a emailcontact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.tookasoft.portlet.addtocontacts.model.emailcontact remove(
		long emailId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException {
		return getPersistence().remove(emailId);
	}

	public static com.tookasoft.portlet.addtocontacts.model.emailcontact updateImpl(
		com.tookasoft.portlet.addtocontacts.model.emailcontact emailcontact,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(emailcontact, merge);
	}

	/**
	* Returns the emailcontact with the primary key or throws a {@link com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException} if it could not be found.
	*
	* @param emailId the primary key of the emailcontact
	* @return the emailcontact
	* @throws com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException if a emailcontact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.tookasoft.portlet.addtocontacts.model.emailcontact findByPrimaryKey(
		long emailId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException {
		return getPersistence().findByPrimaryKey(emailId);
	}

	/**
	* Returns the emailcontact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param emailId the primary key of the emailcontact
	* @return the emailcontact, or <code>null</code> if a emailcontact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.tookasoft.portlet.addtocontacts.model.emailcontact fetchByPrimaryKey(
		long emailId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(emailId);
	}

	/**
	* Returns all the emailcontacts.
	*
	* @return the emailcontacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.tookasoft.portlet.addtocontacts.model.emailcontact> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.tookasoft.portlet.addtocontacts.model.emailcontact> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.tookasoft.portlet.addtocontacts.model.emailcontact> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the emailcontacts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of emailcontacts.
	*
	* @return the number of emailcontacts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static emailcontactPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (emailcontactPersistence)PortletBeanLocatorUtil.locate(com.tookasoft.portlet.addtocontacts.service.ClpSerializer.getServletContextName(),
					emailcontactPersistence.class.getName());

			ReferenceRegistry.registerReference(emailcontactUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(emailcontactPersistence persistence) {
	}

	private static emailcontactPersistence _persistence;
}