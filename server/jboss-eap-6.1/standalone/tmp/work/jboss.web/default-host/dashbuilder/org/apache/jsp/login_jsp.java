package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ResourceBundle;
import org.jboss.dashboard.LocaleManager;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      response.addHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/redhat/base.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/redhat/forms.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/redhat/login-screen.css\">\r\n");
      out.write("    <title>Red Hat BPMS</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"login\">\r\n");
      out.write("    <div id=\"rcue-login-screen\">\r\n");
      out.write("      <img id=\"logo\" src=\"");
      out.print(request.getContextPath());
      out.write("/redhat/login-screen-logo.png\">\r\n");
      out.write("<div id=\"login-wrapper\" class=\"png_bg\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div id=\"login-content\">\r\n");
      out.write("        ");

            ResourceBundle i18nBundle = ResourceBundle.getBundle("org.jboss.dashboard.login", LocaleManager.currentLocale());
            String messageKey = request.getParameter("message");
            if (messageKey == null) messageKey = "login.hint";
        
      out.write("\r\n");
      out.write("     \r\n");
      out.write("        <form action=\"j_security_check\" method=\"POST\">\r\n");
      out.write("         <fieldset>\r\n");
      out.write("         <legend><img src=\"redhat/RH-Product-Name.png\" alt=\"\" /></legend>\r\n");
      out.write("            <p>\r\n");
      out.write("                <label>");
      out.print( i18nBundle.getString("login.username") );
      out.write("</label>\r\n");
      out.write("                <input value=\"\" name=\"j_username\" type=\"text\" autofocus/>\r\n");
      out.write("            </p>\r\n");
      out.write("            <br style=\"clear: both;\"/>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("                <label>");
      out.print( i18nBundle.getString("login.password") );
      out.write("</label>\r\n");
      out.write("                <input name=\"j_password\" type=\"password\"/>\r\n");
      out.write("            </p>\r\n");
      out.write("            <br style=\"clear: both;\"/>\r\n");
      out.write("\r\n");
      out.write("            <p>\r\n");
      out.write("                <input type=\"submit\" value=\"Log In\"/>\r\n");
      out.write("            </p>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
