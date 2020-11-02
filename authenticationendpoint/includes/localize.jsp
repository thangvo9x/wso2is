<%--
  ~ Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
  ~
  ~ WSO2 Inc. licenses this file to you under the Apache License,
  ~ Version 2.0 (the "License"); you may not use this file except
  ~ in compliance with the License.
  ~ You may obtain a copy of the License at
  ~
  ~    http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing,
  ~ software distributed under the License is distributed on an
  ~ "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  ~ KIND, either express or implied.  See the License for the
  ~ specific language governing permissions and limitations
  ~ under the License.
--%>

<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ page import="org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil" %>
<%@ page import="org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl" %>
<%@ page import="java.nio.charset.StandardCharsets" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<%
    String lang = null;
    String lang_param = null;
    String langCode = "vi";
    String uns = "";

    Cookie cookie = null;
    Cookie[] cookies = null;
    cookies = request.getCookies();
    if( cookies != null ){
        for (int i = 0; i < cookies.length; i++){
          cookie = cookies[i];
          //System.out.println("AAAAA: " + cookie.getName() + "-----BBBB: " + cookie.getValue());
          if(cookie.getName().equals("lang") && cookie.getValue() != null){
            langCode = cookie.getValue();
          }
          if(cookie.getName().equals("uns") && cookie.getValue() != null){
            uns = cookie.getValue();
          }
        }
    }
    Locale local = new Locale(langCode);

    String BUNDLE = "org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, local, new EncodedControl(StandardCharsets.UTF_8.toString()));
%>
  <!-- Link switch language -->
  <script>
      function setCookie(locale) {
          //console.log("lang=" + locale + "; path=/;");
          var username_ = document.getElementById('usernameUserInput').value;
          document.cookie = "lang=" + locale + "; path=/;";
          document.cookie = "uns=" + username_ + ";";
          location.reload();
      }
  </script>
  <div style="position: absolute; top: 5px; right: 5px;">
      <% if (langCode != null && langCode.equals("en")) { %>
          <div style="font-size:18px"><a style="cursor: pointer;" onclick="setCookie('vi')" lang="vi">Việt Nam</a></div>
      <%} else { %>
          <div style="font-size:18px"><a style="cursor: pointer;" onclick="setCookie('en')" lang="en">English</a></div>
      <% } %>
  </div>