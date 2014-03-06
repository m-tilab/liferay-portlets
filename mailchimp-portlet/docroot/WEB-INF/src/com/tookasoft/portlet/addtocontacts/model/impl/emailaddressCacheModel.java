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

package com.tookasoft.portlet.addtocontacts.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.tookasoft.portlet.addtocontacts.model.emailaddress;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing emailaddress in entity cache.
 *
 * @author tookasoft
 * @see emailaddress
 * @generated
 */
public class emailaddressCacheModel implements CacheModel<emailaddress>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{emailId=");
		sb.append(emailId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	public emailaddress toEntityModel() {
		emailaddressImpl emailaddressImpl = new emailaddressImpl();

		emailaddressImpl.setEmailId(emailId);

		if (createDate == Long.MIN_VALUE) {
			emailaddressImpl.setCreateDate(null);
		}
		else {
			emailaddressImpl.setCreateDate(new Date(createDate));
		}

		if (email == null) {
			emailaddressImpl.setEmail(StringPool.BLANK);
		}
		else {
			emailaddressImpl.setEmail(email);
		}

		emailaddressImpl.resetOriginalValues();

		return emailaddressImpl;
	}

	public long emailId;
	public long createDate;
	public String email;
}