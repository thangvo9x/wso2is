/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-11-02 03:47:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;

public final class cookie_005fpolicy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/includes/product-footer.jsp", Long.valueOf(1604288050000L));
    _jspx_dependants.put("/includes/localize.jsp", Long.valueOf(1583495516000L));
    _jspx_dependants.put("/includes/cookie-policy-content.jsp", Long.valueOf(1583495516000L));
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
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
  }

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
  }

  public void _jspDestroy() {
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
      out.write("    \n");
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
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <main>\n");
      out.write("        <div id=\"app-header\" class=\"ui borderless top fixed app-header menu\">\n");
      out.write("            <div class=\"ui container\">\n");
      out.write("                <div class=\"header item product-logo\">\n");
      out.write("                    <!-- product-title -->\n");
      out.write("                    ");

                        File productTitleFile = new File(getServletContext().getRealPath("extensions/product-title.jsp"));
                        if (productTitleFile.exists()) {
                    
      out.write("\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-title.jsp", out, false);
      out.write("\n");
      out.write("                    ");
 } else { 
      out.write("\n");
      out.write("                        ");
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
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"app-content\" style=\"padding-top: 62px;\">\n");
      out.write("            <div class=\"ui container\">\n");
      out.write("                <!-- page content -->\n");
      out.write("                ");

                File cookiePolicyFile = new File(getServletContext().getRealPath("extensions/cookie-policy-content.jsp"));
                if (cookiePolicyFile.exists()) {
                
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/cookie-policy-content.jsp", out, false);
      out.write("\n");
      out.write("                ");
 } else { 
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- page content -->\n");
      out.write("<div class=\"ui grid\">\n");
      out.write("    <div class=\"two column row\"></div>\n");
      out.write("        <div class=\"four wide computer four wide tablet column\">\n");
      out.write("            <div id=\"toc\" class=\"ui segment toc\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"twelve wide computer twelve wide tablet column\">\n");
      out.write("            <!-- content -->\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <h1>\n");
      out.write("                        ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "wso2.identity.server"));
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "privacy.policy.cookies"));
      out.write("\n");
      out.write("                    </h1>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <div id=\"cookiePolicy\">\n");
      out.write("                        <h4><a href=\"http://wso2.org/library/identity-server\">About WSO2 Identity Server</a></h4>\n");
      out.write("                        <p>WSO2 Identity Server (referred to as &ldquo;WSO2 IS&rdquo; within this policy) is an open source Identity Management and Entitlement Server that is based on open standards and specifications.</p>\n");
      out.write("\n");
      out.write("                        <h2 id=\"cookie-policy\">Cookie Policy</h2>\n");
      out.write("                        <p>WSO2 IS uses cookies so that it can provide the best user experience for you and identify you for security purposes. If you disable cookies, some of the services will (most probably) be inaccessible to you. </p>\n");
      out.write("\n");
      out.write("                        <h2 id=\"how-wso2-is-5.8.0-processes-cookies\">How does WSO2 IS process cookies?</h2>\n");
      out.write("                        <p>WSO2 IS stores and retrieves information on your browser using cookies. This information is used to provide a better experience. Some cookies serve the primary purposes of allowing a user to log in to the system, maintaining sessions, and keeping track of activities you do within the login session.</p>\n");
      out.write("                        <p>The primary purpose of some cookies used in WSO2 IS is to personally identify you as this is the main function of the WSO2 Identity Server. However the cookie lifetime ends once your session ends i.e., after you log-out, or after the session expiry time has elapsed.</p>\n");
      out.write("                        <p>Some cookies are simply used to give you a more personalised web experience and these cookies can not be used to personally identify you or your activities.</p>\n");
      out.write("                        <p>This cookie policy is part of the <a href=\"privacy_policy.do\">WSO2 IS Privacy Policy.</a></p>\n");
      out.write("\n");
      out.write("                        <h2 id=\"what-is-a-cookie\">What is a cookie?</h2>\n");
      out.write("                        <p>A browser cookie is a small piece of data that is stored on your device to help websites and mobile apps remember things about you. Other technologies, including web storage and identifiers associated with your device, may be used for similar purposes. In this policy, we use the term &ldquo;cookies&rdquo; to discuss all of these technologies.</p>\n");
      out.write("\n");
      out.write("                        <h2 id=\"what-does-wso2-is-5.8.0-use-cookies-for\">What does WSO2 IS use cookies for?</h2>\n");
      out.write("                        <p>Cookies are used for two purposes in WSO2 IS.</p>\n");
      out.write("                        <ol>\n");
      out.write("                            <li>To identify you and provide security (as this is the main function of WSO2 IS).</li>\n");
      out.write("                            <li>To provide a satisfying user experience.</li>\n");
      out.write("                        </ol>\n");
      out.write("\n");
      out.write("                        <p>WSO2 IS uses cookies for the following purposes listed below.</p>\n");
      out.write("                        <h3 id=\"preferences\">Preferences</h3>\n");
      out.write("                        <p>WSO2 IS uses these cookies to remember your settings and preferences, and to auto-fill the form fields to make your interactions with the site easier. </p>\n");
      out.write("                        <p>These cookies can not be used to personally identify you.</p>\n");
      out.write("                        <h3 id=\"security\">Security</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>WSO2 IS uses selected cookies to identify and prevent security risks.\n");
      out.write("                                For example, WSO2 IS may use these cookies to store your session information in order \n");
      out.write("                                to prevent others from changing your password without your username and password.<br><br>\n");
      out.write("                            </li>\n");
      out.write("                            <li>WSO2 IS uses session cookies to maintain your active session.<br><br></li>\n");
      out.write("                            <li>WSO2 IS may use temporary cookies when performing multi-factor authentication and \n");
      out.write("                                federated authentication.<br><br>\n");
      out.write("                            </li>\n");
      out.write("                            <li>WSO2 IS may use permanent cookies to detect that you have previously used the same \n");
      out.write("                                device to log in. This is to to calculate the &ldquo;risk level&rdquo; associated \n");
      out.write("                                with your current login attempt. This is primarily to protect you and your account \n");
      out.write("                                from possible attack.\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <h3 id=\"performance\">Performance</h3>\n");
      out.write("                        <p>WSO2 IS may use cookies to allow &ldquo;Remember Me&rdquo; functionalities.</p>\n");
      out.write("\n");
      out.write("                        <h3 id=\"analytics\">Analytics</h3>\n");
      out.write("                        <p>WSO2 IS as a product does not use cookies for analytical purposes.</p>\n");
      out.write("\n");
      out.write("                        <h3 id=\"third-party-cookies\">Third party cookies</h3>\n");
      out.write("                        <p>Using WSO2 IS may cause some third-party cookies to be set in your browser. WSO2 IS has no control over how any of them operate. The third-party cookies that may be set include:</p>\n");
      out.write("                        <ul>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>Any social login sites. For example, third-party cookies may be set when WSO2 IS is configured to use &ldquo;social&rdquo; or &ldquo;federated&rdquo; login, and you opt to login with your &ldquo;Social Account&rdquo;.</li>\n");
      out.write("                                <li>Any third party federated login.</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </ul>\n");
      out.write("                        <p>WSO2 strongly advises you to refer the respective cookie policy of such sites carefully as WSO2 has no knowledge or use on these cookies.</p>\n");
      out.write("\n");
      out.write("                        <h2 id=\"what-type-of-cookies-does-5.8.0-use\">What type of cookies does WSO2 IS use?</h2>\n");
      out.write("                        <p>WSO2 IS uses persistent cookies and session cookies. A persistent cookie helps WSO2 IS to recognize you as an existing user so that it is easier to return to WSO2 or interact with WSO2 IS without signing in again. After you sign in, a persistent cookie stays in your browser and will be read by WSO2 IS when you return to WSO2 IS.</p>\n");
      out.write("                        <p>A session cookie is a cookie that is erased when the user closes the web browser. The session cookie is stored in temporary memory and is not retained after the browser is closed. Session cookies do not collect information from the user's computer.</p>\n");
      out.write("\n");
      out.write("                        <h2 id=\"how-do-i-control-my-cookies\">How do I control my cookies?</h2>\n");
      out.write("                        <p>Most browsers allow you to control cookies through their settings preferences. However, if you limit the given ability for websites to set cookies, you may worsen your overall user experience since it will no longer be personalized to you. It may also stop you from saving customized settings like login information.</p>\n");
      out.write("                        <p>Most likely, disabling cookies will make you unable to use authentication and authorization functionalities offered by WSO2 IS.</p>\n");
      out.write("                        <p>If you have any questions or concerns regarding the use of cookies, please contact the entity or individuals (or their data protection officer, if applicable) of the organization running this WSO2 IS instance.</p>\n");
      out.write("\n");
      out.write("                        <h2 id=\"what-are-the-cookies-used\">What are the cookies used?</h2>\n");
      out.write("                        <table class=\"ui celled table\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>\n");
      out.write("                                        <p>Cookie Name</p>\n");
      out.write("                                    </th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <p>Purpose</p>\n");
      out.write("                                    </th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <p>Retention</p>\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>JSESSIONID</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>To keep your session data in order to give you a good user experience.</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>Session</p>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>MSGnnnnnnnnnn</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>To keep some messages that are shown to you in order to give you a good user experience.</p>\n");
      out.write("                                        <p>The &ldquo;nnnnnnnnnn&rdquo; reference in this cookie represents a random number e.g., MSG324935932.</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>Session</p>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>requestedURI</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>The URI you are accessing.</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>Session</p>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>current-breadcrumb</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>To keep your active page in session in order to give you a good user experience.</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <p>Session</p>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        <h2 id=\"disclaimer\">Disclaimer</h2>\n");
      out.write("                        <p>This cookie policy is only for the illustrative purposes of the product WSO2 IS. The content in the policy is technically correct at the time of the product shipment. The organization which runs this WSO2 IS instance has full authority and responsibility with regard to the effective Cookie Policy. </p>\n");
      out.write("                        <p>WSO2, its employees, partners, and affiliates do not have access to and do not require, store, process or control any of the data, including personal data contained in WSO2 IS. All data, including personal data is controlled and processed by the entity or individual running WSO2 IS.  WSO2, its employees partners and affiliates are not a data processor or a data controller within the meaning of any data privacy regulations.  WSO2 does not provide any warranties or undertake any responsibility or liability in connection with the lawfulness or the manner and purposes for which WSO2 IS is used by such entities or persons. </p>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /content -->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
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
      out.write("    <script type=\"text/javascript\" src=\"js/u2f-api.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        var ToC = \"<nav role='navigation' class='table-of-contents'>\" + \"<h4>On this page:</h4>\" + \"<ul class='ui list nav'>\";\n");
      out.write("        var newLine, el, title, link;\n");
      out.write("\n");
      out.write("        $(\"#cookiePolicy h2, #cookiePolicy h3\").each(function() {\n");
      out.write("            el = $(this);\n");
      out.write("            title = el.text();\n");
      out.write("            link = \"#\" + el.attr(\"id\");\n");
      out.write("\n");
      out.write("            if (el.is(\"h3\")){\n");
      out.write("                newLine = \"<li class='sub'>\" + \"<a href='\" + link + \"'>\" + title + \"</a>\" + \"</li>\";\n");
      out.write("            } else {\n");
      out.write("                newLine = \"<li>\" + \"<a href='\" + link + \"'>\" + title + \"</a>\" + \"</li>\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ToC += newLine;\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        ToC += \"</ul>\" + \"</nav>\";\n");
      out.write("\n");
      out.write("        $(\"#toc\").append(ToC);\n");
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
