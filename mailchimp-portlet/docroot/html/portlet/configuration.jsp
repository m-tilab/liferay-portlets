<%@ include file="/html/portlet/init.jsp" %>

<liferay-portlet:actionURL var="actionURL" portletConfiguration="true">
	<liferay-portlet:param name="<%=Constants.CMD%>" value="<%=Constants.ADD%>" />
</liferay-portlet:actionURL>

<aui:form method="post" action="<%=actionURL %>">
	<aui:input name="mailchimp-apikey" type="text" value="<%= apikey %>" />
	<aui:input name="mailchimp-listid" type="text" value="<%= listId %>"/>
	
	<aui:input type="submit" value="submit" label="<%= LanguageUtil.get(themeDisplay.getLocale(), \"save\") %>"  name="submit"/>
</aui:form>