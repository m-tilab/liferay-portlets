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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.tookasoft.portlet.addtocontacts.service.emailaddressLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tookasoft
 */
public class emailaddressClp extends BaseModelImpl<emailaddress>
	implements emailaddress {
	public emailaddressClp() {
	}

	public Class<?> getModelClass() {
		return emailaddress.class;
	}

	public String getModelClassName() {
		return emailaddress.class.getName();
	}

	public long getPrimaryKey() {
		return _emailId;
	}

	public void setPrimaryKey(long primaryKey) {
		setEmailId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_emailId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("emailId", getEmailId());
		attributes.put("createDate", getCreateDate());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
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

	public BaseModel<?> getemailaddressRemoteModel() {
		return _emailaddressRemoteModel;
	}

	public void setemailaddressRemoteModel(BaseModel<?> emailaddressRemoteModel) {
		_emailaddressRemoteModel = emailaddressRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			emailaddressLocalServiceUtil.addemailaddress(this);
		}
		else {
			emailaddressLocalServiceUtil.updateemailaddress(this);
		}
	}

	@Override
	public emailaddress toEscapedModel() {
		return (emailaddress)Proxy.newProxyInstance(emailaddress.class.getClassLoader(),
			new Class[] { emailaddress.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		emailaddressClp clone = new emailaddressClp();

		clone.setEmailId(getEmailId());
		clone.setCreateDate(getCreateDate());
		clone.setEmail(getEmail());

		return clone;
	}

	public int compareTo(emailaddress emailaddress) {
		long primaryKey = emailaddress.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		emailaddressClp emailaddress = null;

		try {
			emailaddress = (emailaddressClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = emailaddress.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{emailId=");
		sb.append(getEmailId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.tookasoft.portlet.addtocontacts.model.emailaddress");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>emailId</column-name><column-value><![CDATA[");
		sb.append(getEmailId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _emailId;
	private Date _createDate;
	private String _email;
	private BaseModel<?> _emailaddressRemoteModel;
}