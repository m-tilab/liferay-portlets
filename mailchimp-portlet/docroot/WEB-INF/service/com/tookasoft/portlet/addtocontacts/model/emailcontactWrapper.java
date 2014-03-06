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

package com.tookasoft.portlet.addtocontacts.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link emailcontact}.
 * </p>
 *
 * @author    tookasoft
 * @see       emailcontact
 * @generated
 */
public class emailcontactWrapper implements emailcontact,
	ModelWrapper<emailcontact> {
	public emailcontactWrapper(emailcontact emailcontact) {
		_emailcontact = emailcontact;
	}

	public Class<?> getModelClass() {
		return emailcontact.class;
	}

	public String getModelClassName() {
		return emailcontact.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("emailId", getEmailId());
		attributes.put("createDate", getCreateDate());
		attributes.put("email", getEmail());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long emailId = (Long)attributes.get("emailId");

		if (emailId != null) {
			setEmailId(emailId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	/**
	* Returns the primary key of this emailcontact.
	*
	* @return the primary key of this emailcontact
	*/
	public long getPrimaryKey() {
		return _emailcontact.getPrimaryKey();
	}

	/**
	* Sets the primary key of this emailcontact.
	*
	* @param primaryKey the primary key of this emailcontact
	*/
	public void setPrimaryKey(long primaryKey) {
		_emailcontact.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the email ID of this emailcontact.
	*
	* @return the email ID of this emailcontact
	*/
	public long getEmailId() {
		return _emailcontact.getEmailId();
	}

	/**
	* Sets the email ID of this emailcontact.
	*
	* @param emailId the email ID of this emailcontact
	*/
	public void setEmailId(long emailId) {
		_emailcontact.setEmailId(emailId);
	}

	/**
	* Returns the create date of this emailcontact.
	*
	* @return the create date of this emailcontact
	*/
	public java.util.Date getCreateDate() {
		return _emailcontact.getCreateDate();
	}

	/**
	* Sets the create date of this emailcontact.
	*
	* @param createDate the create date of this emailcontact
	*/
	public void setCreateDate(java.util.Date createDate) {
		_emailcontact.setCreateDate(createDate);
	}

	/**
	* Returns the email of this emailcontact.
	*
	* @return the email of this emailcontact
	*/
	public java.lang.String getEmail() {
		return _emailcontact.getEmail();
	}

	/**
	* Sets the email of this emailcontact.
	*
	* @param email the email of this emailcontact
	*/
	public void setEmail(java.lang.String email) {
		_emailcontact.setEmail(email);
	}

	public boolean isNew() {
		return _emailcontact.isNew();
	}

	public void setNew(boolean n) {
		_emailcontact.setNew(n);
	}

	public boolean isCachedModel() {
		return _emailcontact.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_emailcontact.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _emailcontact.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _emailcontact.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_emailcontact.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _emailcontact.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_emailcontact.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new emailcontactWrapper((emailcontact)_emailcontact.clone());
	}

	public int compareTo(emailcontact emailcontact) {
		return _emailcontact.compareTo(emailcontact);
	}

	@Override
	public int hashCode() {
		return _emailcontact.hashCode();
	}

	public com.liferay.portal.model.CacheModel<emailcontact> toCacheModel() {
		return _emailcontact.toCacheModel();
	}

	public emailcontact toEscapedModel() {
		return new emailcontactWrapper(_emailcontact.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _emailcontact.toString();
	}

	public java.lang.String toXmlString() {
		return _emailcontact.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_emailcontact.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public emailcontact getWrappedemailcontact() {
		return _emailcontact;
	}

	public emailcontact getWrappedModel() {
		return _emailcontact;
	}

	public void resetOriginalValues() {
		_emailcontact.resetOriginalValues();
	}

	private emailcontact _emailcontact;
}