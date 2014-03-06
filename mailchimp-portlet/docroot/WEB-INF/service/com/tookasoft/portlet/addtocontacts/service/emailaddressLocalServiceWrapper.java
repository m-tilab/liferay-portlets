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

package com.tookasoft.portlet.addtocontacts.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link emailaddressLocalService}.
 * </p>
 *
 * @author    tookasoft
 * @see       emailaddressLocalService
 * @generated
 */
public class emailaddressLocalServiceWrapper implements emailaddressLocalService,
	ServiceWrapper<emailaddressLocalService> {
	public emailaddressLocalServiceWrapper(
		emailaddressLocalService emailaddressLocalService) {
		_emailaddressLocalService = emailaddressLocalService;
	}

	/**
	* Adds the emailaddress to the database. Also notifies the appropriate model listeners.
	*
	* @param emailaddress the emailaddress
	* @return the emailaddress that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailaddress addemailaddress(
		com.tookasoft.portlet.addtocontacts.model.emailaddress emailaddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.addemailaddress(emailaddress);
	}

	/**
	* Creates a new emailaddress with the primary key. Does not add the emailaddress to the database.
	*
	* @param emailId the primary key for the new emailaddress
	* @return the new emailaddress
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailaddress createemailaddress(
		long emailId) {
		return _emailaddressLocalService.createemailaddress(emailId);
	}

	/**
	* Deletes the emailaddress with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param emailId the primary key of the emailaddress
	* @return the emailaddress that was removed
	* @throws PortalException if a emailaddress with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailaddress deleteemailaddress(
		long emailId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.deleteemailaddress(emailId);
	}

	/**
	* Deletes the emailaddress from the database. Also notifies the appropriate model listeners.
	*
	* @param emailaddress the emailaddress
	* @return the emailaddress that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailaddress deleteemailaddress(
		com.tookasoft.portlet.addtocontacts.model.emailaddress emailaddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.deleteemailaddress(emailaddress);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _emailaddressLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.tookasoft.portlet.addtocontacts.model.emailaddress fetchemailaddress(
		long emailId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.fetchemailaddress(emailId);
	}

	/**
	* Returns the emailaddress with the primary key.
	*
	* @param emailId the primary key of the emailaddress
	* @return the emailaddress
	* @throws PortalException if a emailaddress with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailaddress getemailaddress(
		long emailId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.getemailaddress(emailId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.tookasoft.portlet.addtocontacts.model.emailaddress> getemailaddresses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.getemailaddresses(start, end);
	}

	/**
	* Returns the number of emailaddresses.
	*
	* @return the number of emailaddresses
	* @throws SystemException if a system exception occurred
	*/
	public int getemailaddressesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.getemailaddressesCount();
	}

	/**
	* Updates the emailaddress in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param emailaddress the emailaddress
	* @return the emailaddress that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailaddress updateemailaddress(
		com.tookasoft.portlet.addtocontacts.model.emailaddress emailaddress)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.updateemailaddress(emailaddress);
	}

	/**
	* Updates the emailaddress in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param emailaddress the emailaddress
	* @param merge whether to merge the emailaddress with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the emailaddress that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.tookasoft.portlet.addtocontacts.model.emailaddress updateemailaddress(
		com.tookasoft.portlet.addtocontacts.model.emailaddress emailaddress,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emailaddressLocalService.updateemailaddress(emailaddress, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _emailaddressLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_emailaddressLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _emailaddressLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public emailaddressLocalService getWrappedemailaddressLocalService() {
		return _emailaddressLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedemailaddressLocalService(
		emailaddressLocalService emailaddressLocalService) {
		_emailaddressLocalService = emailaddressLocalService;
	}

	public emailaddressLocalService getWrappedService() {
		return _emailaddressLocalService;
	}

	public void setWrappedService(
		emailaddressLocalService emailaddressLocalService) {
		_emailaddressLocalService = emailaddressLocalService;
	}

	private emailaddressLocalService _emailaddressLocalService;
}