package com.tookasoft.portlet.addtocontacts;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.portlet.LiferayPortletConfig;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

public class ConfigurationActionImpl extends DefaultConfigurationAction {

	private static String CONFIGURATION_JSP = "/html/portlet/configuration.jsp";

	@Override
	public String render(PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {

		return CONFIGURATION_JSP;
	}

	@Override
	public void processAction(PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {

		String cmd = ParamUtil.getString(actionRequest, "cmd");

		String portletResource = ParamUtil.getString(actionRequest,
				"portletResource");

		LiferayPortletConfig liferayPortletConfig = (LiferayPortletConfig) portletConfig;

		PortletPreferences preferences = PortletPreferencesFactoryUtil
				.getPortletSetup(actionRequest, portletResource);

		if (cmd.equals(Constants.ADD)) {

			String listid = ParamUtil.getString(actionRequest, "mailchimp-listid");
			String apiKey = ParamUtil.getString(actionRequest, "mailchimp-apikey");

			preferences.setValue("listid", listid);
			preferences.setValue("apikey", apiKey);

			preferences.store();

			SessionMessages.add(actionRequest,
					liferayPortletConfig.getPortletId()
							+ SessionMessages.KEY_SUFFIX_REFRESH_PORTLET,
					portletResource);

			SessionMessages.add(actionRequest,
					liferayPortletConfig.getPortletId()
							+ SessionMessages.KEY_SUFFIX_UPDATED_CONFIGURATION);

		}

		super.processAction(portletConfig, actionRequest, actionResponse);
	}

}
