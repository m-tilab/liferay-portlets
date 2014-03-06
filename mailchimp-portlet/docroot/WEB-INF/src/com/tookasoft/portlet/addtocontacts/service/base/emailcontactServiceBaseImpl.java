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

package com.tookasoft.portlet.addtocontacts.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.tookasoft.portlet.addtocontacts.model.emailcontact;
import com.tookasoft.portlet.addtocontacts.service.emailcontactLocalService;
import com.tookasoft.portlet.addtocontacts.service.emailcontactService;
import com.tookasoft.portlet.addtocontacts.service.persistence.emailcontactPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the emailcontact remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.tookasoft.portlet.addtocontacts.service.impl.emailcontactServiceImpl}.
 * </p>
 *
 * @author tookasoft
 * @see com.tookasoft.portlet.addtocontacts.service.impl.emailcontactServiceImpl
 * @see com.tookasoft.portlet.addtocontacts.service.emailcontactServiceUtil
 * @generated
 */
public abstract class emailcontactServiceBaseImpl extends BaseServiceImpl
	implements emailcontactService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.tookasoft.portlet.addtocontacts.service.emailcontactServiceUtil} to access the emailcontact remote service.
	 */

	/**
	 * Returns the emailcontact local service.
	 *
	 * @return the emailcontact local service
	 */
	public emailcontactLocalService getemailcontactLocalService() {
		return emailcontactLocalService;
	}

	/**
	 * Sets the emailcontact local service.
	 *
	 * @param emailcontactLocalService the emailcontact local service
	 */
	public void setemailcontactLocalService(
		emailcontactLocalService emailcontactLocalService) {
		this.emailcontactLocalService = emailcontactLocalService;
	}

	/**
	 * Returns the emailcontact remote service.
	 *
	 * @return the emailcontact remote service
	 */
	public emailcontactService getemailcontactService() {
		return emailcontactService;
	}

	/**
	 * Sets the emailcontact remote service.
	 *
	 * @param emailcontactService the emailcontact remote service
	 */
	public void setemailcontactService(emailcontactService emailcontactService) {
		this.emailcontactService = emailcontactService;
	}

	/**
	 * Returns the emailcontact persistence.
	 *
	 * @return the emailcontact persistence
	 */
	public emailcontactPersistence getemailcontactPersistence() {
		return emailcontactPersistence;
	}

	/**
	 * Sets the emailcontact persistence.
	 *
	 * @param emailcontactPersistence the emailcontact persistence
	 */
	public void setemailcontactPersistence(
		emailcontactPersistence emailcontactPersistence) {
		this.emailcontactPersistence = emailcontactPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return emailcontact.class;
	}

	protected String getModelClassName() {
		return emailcontact.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = emailcontactPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = emailcontactLocalService.class)
	protected emailcontactLocalService emailcontactLocalService;
	@BeanReference(type = emailcontactService.class)
	protected emailcontactService emailcontactService;
	@BeanReference(type = emailcontactPersistence.class)
	protected emailcontactPersistence emailcontactPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private emailcontactServiceClpInvoker _clpInvoker = new emailcontactServiceClpInvoker();
}