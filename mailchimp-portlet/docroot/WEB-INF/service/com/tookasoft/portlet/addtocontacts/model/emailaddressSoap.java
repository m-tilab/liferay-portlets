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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.tookasoft.portlet.addtocontacts.service.http.emailaddressServiceSoap}.
 *
 * @author    tookasoft
 * @see       com.tookasoft.portlet.addtocontacts.service.http.emailaddressServiceSoap
 * @generated
 */
public class emailaddressSoap implements Serializable {
	public static emailaddressSoap toSoapModel(emailaddress model) {
		emailaddressSoap soapModel = new emailaddressSoap();

		soapModel.setEmailId(model.getEmailId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setEmail(model.getEmail());

		return soapModel;
	}

	public static emailaddressSoap[] toSoapModels(emailaddress[] models) {
		emailaddressSoap[] soapModels = new emailaddressSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static emailaddressSoap[][] toSoapModels(emailaddress[][] models) {
		emailaddressSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new emailaddressSoap[models.length][models[0].length];
		}
		else {
			soapModels = new emailaddressSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static emailaddressSoap[] toSoapModels(List<emailaddress> models) {
		List<emailaddressSoap> soapModels = new ArrayList<emailaddressSoap>(models.size());

		for (emailaddress model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new emailaddressSoap[soapModels.size()]);
	}

	public emailaddressSoap() {
	}

	public long getPrimaryKey() {
		return _emailId;
	}

	public void setPrimaryKey(long pk) {
		setEmailId(pk);
	}

	public long getEmailId() {
		return _emailId;
	}

	public void setEmailId(long emailId) {
		_emailId = emailId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	private long _emailId;
	private Date _createDate;
	private String _email;
}