package com.tookasoft.portlet.addtocontacts;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;

import com.ecwid.mailchimp.MailChimpClient;
import com.ecwid.mailchimp.MailChimpException;
import com.ecwid.mailchimp.method.list.ListSubscribeMethod;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.tookasoft.portlet.addtocontacts.model.emailcontact;
import com.tookasoft.portlet.addtocontacts.service.emailcontactLocalServiceUtil;

public class AddToContactsPortlet extends MVCPortlet {

	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {

		String cmd = ParamUtil.getString(actionRequest, "cmd");

		PortletPreferences preferences = null;
		try {
			preferences = PortletPreferencesFactoryUtil.getPortletSetup(actionRequest);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			_log.error(e.getMessage(), e);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			_log.error(e.getMessage(), e);
		}

		String apiKey = preferences.getValue("apikey", StringPool.BLANK);
		String listId = preferences.getValue("listid", StringPool.BLANK);

		if (cmd.equals(Constants.ADD)) {

			String email = ParamUtil.getString(actionRequest, "email");

			if (Validator.isEmailAddress(email)) {

				MailChimpClient mailChimpClient = new MailChimpClient();

				try {

					long emailId = CounterLocalServiceUtil.increment();

					emailcontact emailcontact = emailcontactLocalServiceUtil.createemailcontact(emailId);
					
					emailcontact.setEmail(email);
					emailcontact.setCreateDate(new Date());
					
					emailcontactLocalServiceUtil.addemailcontact(emailcontact);

					ListSubscribeMethod listSubscribeMethod = new ListSubscribeMethod();

					listSubscribeMethod.apikey = apiKey;// "fe38326bf53cc92a8bc9b92fd1dabf5d-us3";
					listSubscribeMethod.id = listId;// "649d406602";
					listSubscribeMethod.email_address = email;
					listSubscribeMethod.double_optin = false;
					listSubscribeMethod.update_existing = true;

					mailChimpClient.execute(listSubscribeMethod);
					
					SessionMessages.add(actionRequest, "email-address-added-successfully");
					
				} catch (MailChimpException e) {
					_log.error(e.getMessage(), e);
				} catch (IllegalArgumentException e) {					

					SessionErrors.add(actionRequest,
							IllegalArgumentException.class);
				} catch (SystemException e) {
					_log.error(e.getMessage(), e);
				}

				mailChimpClient.close();

			} else {
				actionResponse.setRenderParameter("isError", "true");

			}
		}

		super.processAction(actionRequest, actionResponse);
	}

	private Log _log = LogFactoryUtil.getLog(AddToContactsPortlet.class);

}
