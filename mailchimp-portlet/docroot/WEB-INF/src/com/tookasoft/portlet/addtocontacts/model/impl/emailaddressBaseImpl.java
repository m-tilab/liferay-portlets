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

import com.liferay.portal.kernel.exception.SystemException;

import com.tookasoft.portlet.addtocontacts.model.emailaddress;
import com.tookasoft.portlet.addtocontacts.service.emailaddressLocalServiceUtil;

/**
 * The extended model base implementation for the emailaddress service. Represents a row in the &quot;addtocontactsportlet_emailaddress&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link emailaddressImpl}.
 * </p>
 *
 * @author tookasoft
 * @see emailaddressImpl
 * @see com.tookasoft.portlet.addtocontacts.model.emailaddress
 * @generated
 */
public abstract class emailaddressBaseImpl extends emailaddressModelImpl
	implements emailaddress {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a emailaddress model instance should use the {@link emailaddress} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			emailaddressLocalServiceUtil.addemailaddress(this);
		}
		else {
			emailaddressLocalServiceUtil.updateemailaddress(this);
		}
	}
}