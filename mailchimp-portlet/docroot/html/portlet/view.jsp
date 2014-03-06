<%@ include file="/html/portlet/init.jsp" %>

<liferay-portlet:actionURL var="actionURL" portletConfiguration="true">
	<liferay-portlet:param name="<%=Constants.CMD%>" value="<%= Constants.ADD %>" />
</liferay-portlet:actionURL>

<%
boolean isError = GetterUtil.getBoolean(ParamUtil.getBoolean(renderRequest, "isError") , false);
%>
<div class="box-container news-section clearfix">
	<header class="box-header clearfix">
        <h3>
            <span class="title-icon subscribe-icon"></span> 
            <%=portletDisplay.getPortletSetup().getValue("portletSetupTitle_fa_IR", portletDisplay.getTitle()) %>
        </h3>
    </header>
    <div class="subscription-wrapper clearfix">
    
    <liferay-ui:error exception="<%= java.lang.IllegalArgumentException.class %>" message="please-enter-correct-apikey-or-listid"></liferay-ui:error>
    
    <liferay-ui:success key="email-address-added-successfully" message="email-address-added-successfully"></liferay-ui:success>
    
    <%
    if(listId.equals(StringPool.BLANK) || apikey.equals(StringPool.BLANK)){
    %>
    	<div class="portlet-msg-info">
    		<%=LanguageUtil.get(locale, "please-first-setup-portlet-configuration") %>
    	</div>
    <%	
    }
    else{
    %>
    
	    <% if (isError) { %>
		    <div class="portlet-msg-error">
		    	<%=LanguageUtil.get(locale, "wrong") %>
		    </div>
	    <% } %>
		<aui:form action="<%=actionURL%>" method="post">
			<ul>
				<li>
					<aui:input cssClass="subs" name="email" type="text" placeholder="email" label="">
						<aui:validator name="required"/>
					</aui:input>					
				</li>
				<li>
					<aui:input cssClass="subscribe" name="" type="submit" value="<%= LanguageUtil.get(themeDisplay.getLocale(), \"save\") %>"/>
				</li>
			</ul>
		</aui:form>
	<%
    }
	%>
	</div>
</div>

