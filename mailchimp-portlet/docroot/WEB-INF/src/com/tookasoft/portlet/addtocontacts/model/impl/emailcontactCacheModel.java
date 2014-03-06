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

import com.tookasoft.portlet.addtocontacts.model.emailcontact;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing emailcontact in entity cache.
 *
 * @author tookasoft
 * @see emailcontact
 * @generated
 */
public class emailcontactCacheModel implements CacheModel<emailcontact>,
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

	public emailcontact toEntityModel() {
		emailcontactImpl emailcontactImpl = new emailcontactImpl();

		emailcontactImpl.setEmailId(emailId);

		if (createDate == Long.MIN_VALUE) {
			emailcontactImpl.setCreateDate(null);
		}
		else {
			emailcontactImpl.setCreateDate(new Date(createDate));
		}

		if (email == null) {
			emailcontactImpl.setEmail(StringPool.BLANK);
		}
		else {
			emailcontactImpl.setEmail(email);
		}

		emailcontactImpl.resetOriginalValues();

		return emailcontactImpl;
	}

	public long emailId;
	public long createDate;
	public String email;
}