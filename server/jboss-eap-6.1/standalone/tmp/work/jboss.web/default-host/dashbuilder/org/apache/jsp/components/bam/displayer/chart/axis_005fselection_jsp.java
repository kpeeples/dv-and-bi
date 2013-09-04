package org.apache.jsp.components.bam.displayer.chart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.dashboard.LocaleManager;
import org.jboss.dashboard.ui.components.AbstractChartDisplayerEditor;

public final class axis_005fselection_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody.release();
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.release();
    _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.release();
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
      //  i18n:bundle
      org.apache.taglibs.i18n.BundleTag _jspx_th_i18n_005fbundle_005f0 = (org.apache.taglibs.i18n.BundleTag) _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody.get(org.apache.taglibs.i18n.BundleTag.class);
      _jspx_th_i18n_005fbundle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fbundle_005f0.setParent(null);
      // /components/bam/displayer/chart/axis_selection.jsp(22,0) name = baseName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setBaseName("org.jboss.dashboard.displayer.messages");
      // /components/bam/displayer/chart/axis_selection.jsp(22,0) name = locale type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setLocale(LocaleManager.currentLocale());
      int _jspx_eval_i18n_005fbundle_005f0 = _jspx_th_i18n_005fbundle_005f0.doStartTag();
      if (_jspx_th_i18n_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody.reuse(_jspx_th_i18n_005fbundle_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody.reuse(_jspx_th_i18n_005fbundle_005f0);
      out.write("\n");
      out.write("\n");
      out.write("<!-- Domain axis selection and edition -->\n");
      out.write("<tr>\n");
      out.write("    <td align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f0 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f0.setParent(null);
      // /components/bam/displayer/chart/axis_selection.jsp(27,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f0.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "domain");
      int _jspx_eval_i18n_005fmessage_005f0 = _jspx_th_i18n_005fmessage_005f0.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f0.doInitBody();
        }
        do {
          out.write("!!Domain");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f0);
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    ");
      if (_jspx_meth_mvc_005finclude_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</tr>\n");
      out.write("<!-- Range axis selection and edition -->\n");
      out.write("<tr>\n");
      out.write("    <td align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f1 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f1.setParent(null);
      // /components/bam/displayer/chart/axis_selection.jsp(34,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f1.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "range");
      int _jspx_eval_i18n_005fmessage_005f1 = _jspx_th_i18n_005fmessage_005f1.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f1.doInitBody();
        }
        do {
          out.write("!!Range");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f1);
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    ");
      if (_jspx_meth_mvc_005finclude_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</tr>");
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

  private boolean _jspx_meth_mvc_005finclude_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:include
    org.jboss.dashboard.ui.taglib.JSPIncludeTag _jspx_th_mvc_005finclude_005f0 = (org.jboss.dashboard.ui.taglib.JSPIncludeTag) _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.get(org.jboss.dashboard.ui.taglib.JSPIncludeTag.class);
    _jspx_th_mvc_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005finclude_005f0.setParent(null);
    // /components/bam/displayer/chart/axis_selection.jsp(29,4) name = page type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f0.setPage("../domain/domain_selector_component.jsp");
    // /components/bam/displayer/chart/axis_selection.jsp(29,4) name = flush type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f0.setFlush(new Boolean(true));
    int _jspx_eval_mvc_005finclude_005f0 = _jspx_th_mvc_005finclude_005f0.doStartTag();
    if (_jspx_th_mvc_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_mvc_005finclude_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:include
    org.jboss.dashboard.ui.taglib.JSPIncludeTag _jspx_th_mvc_005finclude_005f1 = (org.jboss.dashboard.ui.taglib.JSPIncludeTag) _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.get(org.jboss.dashboard.ui.taglib.JSPIncludeTag.class);
    _jspx_th_mvc_005finclude_005f1.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005finclude_005f1.setParent(null);
    // /components/bam/displayer/chart/axis_selection.jsp(36,4) name = page type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f1.setPage("../range/range_selector_component.jsp");
    // /components/bam/displayer/chart/axis_selection.jsp(36,4) name = flush type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f1.setFlush(new Boolean(true));
    int _jspx_eval_mvc_005finclude_005f1 = _jspx_th_mvc_005finclude_005f1.doStartTag();
    if (_jspx_th_mvc_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f1);
    return false;
  }
}
