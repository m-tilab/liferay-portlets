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
 * This class is a wrapper for {@link emailaddress}.
 * </p>
 *
 * @author    tookasoft
 * @see       emailaddress
 * @generated
 */
public class emailaddressWrapper implements emailaddress,
	ModelWrapper<emailaddress> {
	public emailaddressWrapper(emailaddress emailaddress) {
		_emailaddress = emailaddress;
	}

	public Class<?> getModelClass() {
		return emailaddress.class;
	}

	public String getModelClassName() {
		return emailaddress.class.getName();
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
	* Returns the primary key of this emailaddress.
	*
	* @return the primary key of this emailaddress
	*/
	public long getPrimaryKey() {
		return _emailaddress.getPrimaryKey();
	}

	/**
	* Sets the primary key of this emailaddress.
	*
	* @param primaryKey the primary key of this emailaddress
	*/
	public void setPrimaryKey(long primaryKey) {
		_emailaddress.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the email ID of this emailaddress.
	*
	* @return the email ID of this emailaddress
	*/
	public long getEmailId() {
		return _emailaddress.getEmailId();
	}

	/**
	* Sets the email ID of this emailaddress.
	*
	* @param emailId the email ID of this emailaddress
	*/
	public void setEmailId(long emailId) {
		_emailaddress.setEmailId(emailId);
	}

	/**
	* Returns the create date of this emailaddress.
	*
	* @return the create date of this emailaddress
	*/
	public java.util.Date getCreateDate() {
		return _emailaddress.getCreateDate();
	}

	/**
	* Sets the create date of this emailaddress.
	*
	* @param createDate the create date of this emailaddress
	*/
	public void setCreateDate(java.util.Date createDate) {
		_emailaddress.setCreateDate(createDate);
	}

	/**
	* Returns the email of this emailaddress.
	*
	* @return the email of this emailaddress
	*/
	public java.lang.String getEmail() {
		return _emailaddress.getEmail();
	}

	/**
	* Sets the email of this emailaddress.
	*
	* @param email the email of this emailaddress
	*/
	public void setEmail(java.lang.String email) {
		_emailaddress.setEmail(email);
	}

	public boolean isNew() {
		return _emailaddress.isNew();
	}

	public void setNew(boolean n) {
		_emailaddress.setNew(n);
	}

	public boolean isCachedModel() {
		return _emailaddress.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_emailaddress.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _emailaddress.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _emailaddress.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_emailaddress.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _emailaddress.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_emailaddress.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new emailaddressWrapper((emailaddress)_emailaddress.clone());
	}

	public int compareTo(emailaddress emailaddress) {
		return _emailaddress.compareTo(emailaddress);
	}

	@Override
	public int hashCode() {
		return _emailaddress.hashCode();
	}

	public com.liferay.portal.model.CacheModel<emailaddress> toCacheModel() {
		return _emailaddress.toCacheModel();
	}

	public emailaddress toEscapedModel() {
		return new emailaddressWrapper(_emailaddress.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _emailaddress.toString();
	}

	public java.lang.String toXmlString() {
		return _emailaddress.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_emailaddress.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public emailaddress getWrappedemailaddress() {
		return _emailaddress;
	}

	public emailaddress getWrappedModel() {
		return _emailaddress;
	}

	public void resetOriginalValues() {
		_emailaddress.resetOriginalValues();
	}

	private emailaddress _emailaddress;
}