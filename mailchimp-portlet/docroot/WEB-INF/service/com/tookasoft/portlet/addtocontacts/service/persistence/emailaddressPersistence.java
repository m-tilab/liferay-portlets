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

import com.tookasoft.portlet.addtocontacts.model.emailaddress;

/**
 * The persistence interface for the emailaddress service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tookasoft
 * @see emailaddressPersistenceImpl
 * @see emailaddressUtil
 * @generated
 */
public interface emailaddressPersistence extends BasePersistence<emailaddress> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link emailaddressUtil} to access the emailaddress persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the emailaddress in the entity cache if it is enabled.
	*
	* @param emailaddress the emailaddress
	*/
	public void cacheResult(
		com.tookasoft.portlet.addtocontacts.model.emailaddress emailaddress);

	/**
	* Caches the emailaddresses in the entity cache if it is enabled.
	*
	* @param emailaddresses the emailaddresses
	*/
	public void cacheResult(
		java.util.List<com.tookasoft.portlet.addtocontacts.model.emailaddress> emailaddresses);

	/**
	* Creates a new emailaddress with the primary key. Does not add the emailaddress to the database.
	*
	* @param emailId the primary key for the new emailaddress
	* @return the new emailaddress
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailaddress create(
		long emailId);

	/**
	* Removes the emailaddress with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param emailId the primary key of the emailaddress
	* @return the emailaddress that was removed
	* @throws com.tookasoft.portlet.addtocontacts.NoSuchemailaddressException if a emailaddress with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailaddress remove(
		long emailId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tookasoft.portlet.addtocontacts.NoSuchemailaddressException;

	public com.tookasoft.portlet.addtocontacts.model.emailaddress updateImpl(
		com.tookasoft.portlet.addtocontacts.model.emailaddress emailaddress,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emailaddress with the primary key or throws a {@link com.tookasoft.portlet.addtocontacts.NoSuchemailaddressException} if it could not be found.
	*
	* @param emailId the primary key of the emailaddress
	* @return the emailaddress
	* @throws com.tookasoft.portlet.addtocontacts.NoSuchemailaddressException if a emailaddress with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailaddress findByPrimaryKey(
		long emailId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tookasoft.portlet.addtocontacts.NoSuchemailaddressException;

	/**
	* Returns the emailaddress with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param emailId the primary key of the emailaddress
	* @return the emailaddress, or <code>null</code> if a emailaddress with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailaddress fetchByPrimaryKey(
		long emailId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the emailaddresses.
	*
	* @return the emailaddresses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.tookasoft.portlet.addtocontacts.model.emailaddress> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.tookasoft.portlet.addtocontacts.model.emailaddress> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.tookasoft.portlet.addtocontacts.model.emailaddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the emailaddresses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of emailaddresses.
	*
	* @return the number of emailaddresses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}