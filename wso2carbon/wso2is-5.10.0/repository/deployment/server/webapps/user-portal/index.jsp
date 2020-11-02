<!--
* Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
-->

<%@ page import="static org.wso2.carbon.identity.core.util.IdentityUtil.getServerURL" %>
<%@ page import="static org.wso2.carbon.utils.multitenancy.MultitenantConstants.TENANT_AWARE_URL_PREFIX"%>
<%@ page import="static org.wso2.carbon.utils.multitenancy.MultitenantConstants.SUPER_TENANT_DOMAIN_NAME"%>

<!doctype html>
<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
        <link href="/user-portal/libs/styles/css/wso2-default.css" rel="stylesheet" type="text/css"/>

        <title>WSO2 Identity Server</title>

        <!-- runtime config -->
        <script src="/user-portal/runtime-config.js"></script>
        <!-- runtime config -->

        <script>
            var getTenantPrefix = function() {
                return "<%=TENANT_AWARE_URL_PREFIX%>";
            };

            var getSuperTenant = function() {
                return "<%=SUPER_TENANT_DOMAIN_NAME%>";
            };

            var getTenantName = function() {
                var paths = window.location.pathname.split("/");
                var tenantIndex = paths.indexOf(getTenantPrefix());

                if (tenantIndex > 0) {
                    var tenantName = paths[tenantIndex + 1];
                    return (tenantName) ? tenantName : "";
                } else {
                    return "";
                }
            };

            var getTenantPath = function(tenantName) {
                return (tenantName !== "") ? "/" + getTenantPrefix() + "/" + tenantName : "";
            };

            /**
             * =====================================================
             * Update below details according to your configuration
             * =====================================================
             */

            // Update below with tenant user-portal application/service-provider details
            var serverOriginAddress = "<%=getServerURL("", true, true)%>";
            var clientOriginAddress = "<%=getServerURL("", true, true)%>";

            var tenantName = getTenantName();
            var defaultUserPortalClientID = "USER_PORTAL";
            var tenantUserPortalClientID = defaultUserPortalClientID + "_" + tenantName;

            /** ===================================================== */

            if (!window.userConfig) {
                window.userConfig = {};
            }

            window["runConfig"] = {
                appBaseName: window.userConfig.appBaseName || getTenantPath(tenantName) + 
                    "/user-portal",
                clientHost: window.userConfig.clientHost || clientOriginAddress + getTenantPath(tenantName),
                clientOrigin: window.userConfig.clientOrigin || clientOriginAddress,
                clientID: window.userConfig.clientID ||
                    (getTenantPath(tenantName) === ("/" + getTenantPrefix() + "/" + tenantName)) ?
                    tenantUserPortalClientID : defaultUserPortalClientID,
                serverHost: window.userConfig.serverHost || serverOriginAddress + getTenantPath(tenantName),
                serverOrigin: window.userConfig.serverOrigin || serverOriginAddress,
                tenant: window.userConfig.tenant || (tenantName === "") ? getSuperTenant() : tenantName,
                tenantPath: window.userConfig.tenantPath || getTenantPath(tenantName)
            };
        </script>
    <link rel="shortcut icon" href="/user-portal/favicon.ico"></head>
    <body>
        <noscript>
            You need to enable JavaScript to run this app.
        </noscript>
        <div id="root"></div>
    <script type="text/javascript" src="/user-portal/main.js?06ef502de8ed11293737"></script></body>
</html>
