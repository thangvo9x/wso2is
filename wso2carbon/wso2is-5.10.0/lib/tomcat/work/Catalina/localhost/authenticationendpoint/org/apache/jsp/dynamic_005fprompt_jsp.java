/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-11-02 03:47:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.google.gson.Gson;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthContextAPIClient;
import org.wso2.carbon.identity.application.authentication.endpoint.util.Constants;
import org.wso2.carbon.identity.application.authentication.endpoint.util.TemplateMgtAPIClient;
import org.wso2.carbon.identity.core.util.IdentityUtil;
import org.wso2.carbon.identity.template.mgt.model.Template;
import java.net.URLEncoder;
import java.io.File;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import org.apache.commons.lang.StringUtils;
import java.util.Map;
import java.util.HashMap;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;

public final class dynamic_005fprompt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(11);
    _jspx_dependants.put("jar:file:/home/wso2carbon/wso2is-5.10.0/repository/deployment/server/webapps/authenticationendpoint/WEB-INF/lib/encoder-jsp-1.2.2.jar!/META-INF/java-encoder.tld", Long.valueOf(1535958792000L));
    _jspx_dependants.put("/includes/product-footer.jsp", Long.valueOf(1604288050000L));
    _jspx_dependants.put("/WEB-INF/lib/encoder-jsp-1.2.2.jar", Long.valueOf(1583495450000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1583495450000L));
    _jspx_dependants.put("/includes/init-url.jsp", Long.valueOf(1583495516000L));
    _jspx_dependants.put("/includes/localize.jsp", Long.valueOf(1583495516000L));
    _jspx_dependants.put("/includes/template-mapper.jsp", Long.valueOf(1583495516000L));
    _jspx_dependants.put("jar:file:/home/wso2carbon/wso2is-5.10.0/repository/deployment/server/webapps/authenticationendpoint/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425978670000L));
    _jspx_dependants.put("/includes/footer.jsp", Long.valueOf(1583495516000L));
    _jspx_dependants.put("/includes/product-title.jsp", Long.valueOf(1604284421000L));
    _jspx_dependants.put("/includes/header.jsp", Long.valueOf(1604055420000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.commons.lang.StringUtils");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("org.owasp.encoder.Encode");
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("com.google.gson.Gson");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.TemplateMgtAPIClient");
    _jspx_imports_classes.add("org.wso2.carbon.identity.core.util.IdentityUtil");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.Constants");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.AuthContextAPIClient");
    _jspx_imports_classes.add("org.wso2.carbon.identity.template.mgt.model.Template");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(), new
            EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

    String identityServerEndpointContextParam = application.getInitParameter("IdentityServerEndpointContextURL");
    String samlssoURL = "../samlsso";
    String commonauthURL = "../commonauth";
    String oauth2AuthorizeURL = "../oauth2/authorize";
    String oidcLogoutURL = "../oidc/logout";
    String openidServerURL = "../openidserver";
    if (StringUtils.isNotBlank(identityServerEndpointContextParam)) {
        samlssoURL = identityServerEndpointContextParam + "/samlsso";
        commonauthURL = identityServerEndpointContextParam + "/commonauth";
        oauth2AuthorizeURL = identityServerEndpointContextParam + "/oauth2/authorize";
        oidcLogoutURL = identityServerEndpointContextParam + "/oidc/logout";
        openidServerURL = identityServerEndpointContextParam + "/oidc/logout";
    }

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Map<String, String> templateMap = new HashMap<>();
    templateMap.put("genericForm", "templates/genericForm.jsp");
    templateMap.put("username", "templates/username.jsp");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String templateId = request.getParameter("templateId");
    String promptId = request.getParameter("promptId");
    String tenantDomain = request.getParameter("tenantDomain");
    
    String authAPIURL = application.getInitParameter(Constants.AUTHENTICATION_REST_ENDPOINT_URL);
    if (StringUtils.isBlank(authAPIURL)) {
        authAPIURL = IdentityUtil.getServerURL("/api/identity/auth/v1.1/", true, true);
    }
    if (!authAPIURL.endsWith("/")) {
        authAPIURL += "/";
    }
    authAPIURL += "context/" + request.getParameter("promptId");
    String contextProperties = AuthContextAPIClient.getContextProperties(authAPIURL);


    Gson gson = new Gson();
    Map data = gson.fromJson(contextProperties, Map.class);
    String templatePath = templateMap.get(templateId);

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <!-- header -->\n");
      out.write("    ");

        File headerFile = new File(getServletContext().getRealPath("extensions/product-title.jsp"));
        if (headerFile.exists()) {
    
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/header.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- localize.jsp MUST already be included in the calling script -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("<link rel=\"icon\" href=\"libs/theme/assets/images/favicon.ico\" type=\"image/x-icon\"/>\n");
      out.write("<link href=\"libs/theme/wso2-default.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<title>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "wso2.identity.server"));
      out.write("</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    html, body {\n");
      out.write("        height: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    body {\n");
      out.write("        flex-direction: column;\n");
      out.write("        display: flex;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main {\n");
      out.write("        flex-shrink: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main.center-segment {\n");
      out.write("        margin: auto;\n");
      out.write("        display: flex;\n");
      out.write("        align-items: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main.center-segment > .ui.container.medium {\n");
      out.write("        max-width: 450px !important;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main.center-segment > .ui.container.large {\n");
      out.write("        max-width: 700px !important;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main.center-segment > .ui.container > .ui.segment {\n");
      out.write("        padding: 3rem;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main.center-segment > .ui.container > .ui.segment .segment-form .buttons {\n");
      out.write("        margin-top: 1em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main.center-segment > .ui.container > .ui.segment .segment-form .buttons.align-right button,\n");
      out.write("    main.center-segment > .ui.container > .ui.segment .segment-form .buttons.align-right input {\n");
      out.write("        margin: 0 0 0 0.25em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main.center-segment > .ui.container > .ui.segment .segment-form .column .buttons.align-left button.link-button,\n");
      out.write("    main.center-segment > .ui.container > .ui.segment .segment-form .column .buttons.align-left input.link-button {\n");
      out.write("        padding: .78571429em 1.5em .78571429em 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main.center-segment > .ui.container > .ui.segment .segment-form {\n");
      out.write("        text-align: left;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main.center-segment > .ui.container > .ui.segment .segment-form .align-center {\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main.center-segment > .ui.container > .ui.segment .segment-form .align-right {\n");
      out.write("        text-align: right;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .cookie-policy-message {\n");
      out.write("        font-size: 14px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    footer {\n");
      out.write("        padding: 2rem 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    body .product-title .product-title-text {\n");
      out.write("        margin: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    body .center-segment .product-title .product-title-text {\n");
      out.write("        margin-top: 2em;\n");
      out.write("        margin-bottom: 1em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .ui.menu.fixed.app-header .product-logo {\n");
      out.write("        padding-left: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* Table of content styling */\n");
      out.write("\n");
      out.write("    main #toc {\n");
      out.write("        position: sticky;\n");
      out.write("        top: 93px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main .ui.segment.toc {\n");
      out.write("        padding: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main .ui.segment.toc ul.ui.list.nav > li.sub {\n");
      out.write("        margin-left: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main .ui.segment.toc ul.ui.list.nav > li > a {\n");
      out.write("        color: rgba(0,0,0,.87);\n");
      out.write("        text-decoration: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main .ui.segment.toc ul.ui.list.nav > li:before {\n");
      out.write("        content: \"\\2219\";\n");
      out.write("        font-weight: bold;\n");
      out.write("        font-size: 1.6em;\n");
      out.write("        line-height: 0.5em;\n");
      out.write("        display: inline-block;\n");
      out.write("        width: 1em;\n");
      out.write("        margin-left: -0.7em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main .ui.segment.toc ul.ui.list.nav > li.sub:before {\n");
      out.write("        content: \"\\2192\";\n");
      out.write("        margin-left: -w1em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main .ui.segment.toc ul.ui.list.nav > li:hover a {\n");
      out.write("        color: #ff5000;\n");
      out.write("        text-decoration: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    main .ui.segment.toc ul.ui.list.nav > li:hover:before {\n");
      out.write("        color: #ff5000;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script src=\"libs/jquery_3.4.1/jquery-3.4.1.js\"></script>\n");
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        var data = JSON.parse(\"");
      out.print(Encode.forJavaScript(contextProperties));
      out.write("\");\n");
      out.write("        var prompt_id = \"");
      out.print(promptId);
      out.write("\";\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <main class=\"center-segment\">\n");
      out.write("        <div class=\"ui container large center aligned middle aligned\">\n");
      out.write("\n");
      out.write("            <!-- product-title -->\n");
      out.write("            ");

                File productTitleFile = new File(getServletContext().getRealPath("extensions/product-title.jsp"));
                if (productTitleFile.exists()) {
            
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-title.jsp", out, false);
      out.write("\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- localize.jsp MUST already be included in the calling script -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"product-title\">\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"ui segment\">\n");
      out.write("                ");

                    if (templatePath != null) {
                
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      boolean _jspx_th_c_005fset_005f0_reused = false;
      try {
        _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fset_005f0.setParent(null);
        // /dynamic_prompt.jsp(95,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setVar("data");
        // /dynamic_prompt.jsp(95,20) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setValue(data);
        // /dynamic_prompt.jsp(95,20) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f0.setScope("request");
        int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
        if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        _jspx_th_c_005fset_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
      }
      out.write("\n");
      out.write("                    ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      boolean _jspx_th_c_005fset_005f1_reused = false;
      try {
        _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
        _jspx_th_c_005fset_005f1.setParent(null);
        // /dynamic_prompt.jsp(96,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f1.setVar("promptId");
        // /dynamic_prompt.jsp(96,20) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f1.setValue(URLEncoder.encode(promptId, StandardCharsets.UTF_8.name()));
        // /dynamic_prompt.jsp(96,20) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fset_005f1.setScope("request");
        int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
        if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f1);
        _jspx_th_c_005fset_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f1_reused);
      }
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, templatePath, out, false);
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");
 } else { 
      out.write("\n");
      out.write("                <h3 class=\"ui header\">\n");
      out.write("                        ");
      out.print(Encode.forHtmlContent("Incorrect Request"));
      out.write("\n");
      out.write("                </h3>\n");
      out.write("\n");
      out.write("                <div class=\"ui visible negative message\">\n");
      out.write("                    <div class=\"header\">");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "attention"));
      out.write(" :</div>\n");
      out.write("                    <p>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "no.template.found"));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <!-- product-footer -->\n");
      out.write("    ");

        File productFooterFile = new File(getServletContext().getRealPath("extensions/product-footer.jsp"));
        if (productFooterFile.exists()) {
    
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- localize.jsp MUST already be included in the calling script -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<footer class=\"footer\" style=\"text-align: center\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <p>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "welcome"));
      out.write(" &copy;\n");
      out.write("            <script>document.write(new Date().getFullYear());</script>\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    ");

        File footerFile = new File(getServletContext().getRealPath("extensions/footer.jsp"));
        if (footerFile.exists()) {
    
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"libs/theme/semantic.min.js\"></script>\n");
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function doLogin() {\n");
      out.write("            var loginForm = document.getElementById('loginForm');\n");
      out.write("            loginForm.submit();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
