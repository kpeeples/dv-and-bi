package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.dashboard.ui.UIServices;
import org.jboss.dashboard.ui.components.js.JSIncluder;

public final class js_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005fcontext_0026_005furi_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fmvc_005fcontext_0026_005furi_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fmvc_005fcontext_0026_005furi_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    JSIncluder jsIncluder = UIServices.lookup().getJsIncluder();
    String[] jsFiles = jsIncluder.getJsFilesToIncludeInHeader();
    for (int i = 0; i < jsFiles.length; i++) {
        String jsFile = jsFiles[i];

      out.write("\n");
      out.write("    <script src='");
      //  mvc:context
      org.jboss.dashboard.ui.taglib.ContextTag _jspx_th_mvc_005fcontext_005f0 = (org.jboss.dashboard.ui.taglib.ContextTag) _005fjspx_005ftagPool_005fmvc_005fcontext_0026_005furi_005fnobody.get(org.jboss.dashboard.ui.taglib.ContextTag.class);
      _jspx_th_mvc_005fcontext_005f0.setPageContext(_jspx_page_context);
      _jspx_th_mvc_005fcontext_005f0.setParent(null);
      // /templates/js.jsp(28,17) name = uri type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_mvc_005fcontext_005f0.setUri( jsFile );
      int _jspx_eval_mvc_005fcontext_005f0 = _jspx_th_mvc_005fcontext_005f0.doStartTag();
      if (_jspx_th_mvc_005fcontext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fmvc_005fcontext_0026_005furi_005fnobody.reuse(_jspx_th_mvc_005fcontext_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fmvc_005fcontext_0026_005furi_005fnobody.reuse(_jspx_th_mvc_005fcontext_005f0);
      out.write("'></script>\n");

    }

      out.write("\n");
      out.write("<script  language=\"Javascript\" type=\"text/javascript\">\n");

    String[] jspFiles = jsIncluder.getJspFilesToIncludeInHeader();
    for (int i = 0; i < jspFiles.length; i++) {
        String jspFile = jspFiles[i];

      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response,  jspFile , out, true);
      out.write('\n');

    }

      out.write("\n");
      out.write("</script>");
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
