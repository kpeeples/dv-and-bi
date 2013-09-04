package org.apache.jsp.components.bam.modules.i18n;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.dashboard.LocaleManager;
import org.jboss.dashboard.factory.Factory;
import java.util.*;

public final class locale_005fselector_005fcombo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    LocaleManager lm = LocaleManager.lookup();
    Locale current = lm.getCurrentLocale();
    Locale[] locales = lm.getPlatformAvailableLocales();

      out.write("\n");
      out.write("<select name=\"");
      out.print( "localeLang" );
      out.write("\" class=\"skn-input\"\n");
      out.write("         style=\"width:120px; height:18px; text-align:center; overflow:hidden; vertical-align:middle\"\n");
      out.write("         onchange=\"return bam_kpiedit_submitProperties(this);\">\n");

    for (int i = 0; i < locales.length; i++) {
        Locale locale = locales[i];

      out.write("\n");
      out.write("    <option value=\"");
      out.print( locale.getLanguage() );
      out.write('"');
      out.write(' ');
      out.print( locale.getLanguage().equals(current.getLanguage()) ? "selected" : "" );
      out.write(">\n");
      out.write("        ");
      out.print( locale.getDisplayName(current) );
      out.write("\n");
      out.write("    </option>\n");

   }

      out.write("\n");
      out.write("</select>\n");
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
