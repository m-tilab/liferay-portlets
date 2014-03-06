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

import com.liferay.portal.service.persistence.BasePersistence;

import com.tookasoft.portlet.addtocontacts.model.emailcontact;

/**
 * The persistence interface for the emailcontact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tookasoft
 * @see emailcontactPersistenceImpl
 * @see emailcontactUtil
 * @generated
 */
public interface emailcontactPersistence extends BasePersistence<emailcontact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link emailcontactUtil} to access the emailcontact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the emailcontact in the entity cache if it is enabled.
	*
	* @param emailcontact the emailcontact
	*/
	public void cacheResult(
		com.tookasoft.portlet.addtocontacts.model.emailcontact emailcontact);

	/**
	* Caches the emailcontacts in the entity cache if it is enabled.
	*
	* @param emailcontacts the emailcontacts
	*/
	public void cacheResult(
		java.util.List<com.tookasoft.portlet.addtocontacts.model.emailcontact> emailcontacts);

	/**
	* Creates a new emailcontact with the primary key. Does not add the emailcontact to the database.
	*
	* @param emailId the primary key for the new emailcontact
	* @return the new emailcontact
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailcontact create(
		long emailId);

	/**
	* Removes the emailcontact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param emailId the primary key of the emailcontact
	* @return the emailcontact that was removed
	* @throws com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException if a emailcontact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailcontact remove(
		long emailId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException;

	public com.tookasoft.portlet.addtocontacts.model.emailcontact updateImpl(
		com.tookasoft.portlet.addtocontacts.model.emailcontact emailcontact,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emailcontact with the primary key or throws a {@link com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException} if it could not be found.
	*
	* @param emailId the primary key of the emailcontact
	* @return the emailcontact
	* @throws com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException if a emailcontact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailcontact findByPrimaryKey(
		long emailId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tookasoft.portlet.addtocontacts.NoSuchemailcontactException;

	/**
	* Returns the emailcontact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param emailId the primary key of the emailcontact
	* @return the emailcontact, or <code>null</code> if a emailcontact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailcontact fetchByPrimaryKey(
		long emailId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the emailcontacts.
	*
	* @return the emailcontacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.tookasoft.portlet.addtocontacts.model.emailcontact> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.tookasoft.portlet.addtocontacts.model.emailcontact> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.tookasoft.portlet.addtocontacts.model.emailcontact> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the emailcontacts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of emailcontacts.
	*
	* @return the number of emailcontacts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}