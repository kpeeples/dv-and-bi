package org.apache.jsp.components.bam.displayer.chart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.dashboard.displayer.chart.AbstractChartDisplayer;
import org.jboss.dashboard.ui.components.chart.PieChartEditor;
import org.jboss.dashboard.LocaleManager;
import org.jboss.dashboard.factory.Factory;
import org.jboss.dashboard.ui.components.DataDisplayerViewer;
import org.jboss.dashboard.ui.UIBeanLocator;

public final class piechart_005feditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fuseComponent_0026_005fbean_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fuseComponent_0026_005fbean_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody.release();
    _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.release();
    _005fjspx_005ftagPool_005ffactory_005fuseComponent_0026_005fbean_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  i18n:bundle
      org.apache.taglibs.i18n.BundleTag _jspx_th_i18n_005fbundle_005f0 = (org.apache.taglibs.i18n.BundleTag) _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody.get(org.apache.taglibs.i18n.BundleTag.class);
      _jspx_th_i18n_005fbundle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fbundle_005f0.setParent(null);
      // /components/bam/displayer/chart/piechart_editor.jsp(29,0) name = baseName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setBaseName("org.jboss.dashboard.displayer.messages");
      // /components/bam/displayer/chart/piechart_editor.jsp(29,0) name = locale type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setLocale(LocaleManager.currentLocale());
      int _jspx_eval_i18n_005fbundle_005f0 = _jspx_th_i18n_005fbundle_005f0.doStartTag();
      if (_jspx_th_i18n_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody.reuse(_jspx_th_i18n_005fbundle_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fbaseName_005fnobody.reuse(_jspx_th_i18n_005fbundle_005f0);
      out.write('\n');

    PieChartEditor editor = (PieChartEditor) Factory.lookup("org.jboss.dashboard.ui.components.PieChartEditor");
    request.setAttribute("editor", editor);

    AbstractChartDisplayer displayer = (AbstractChartDisplayer) editor.getDataDisplayer();
    DataDisplayerViewer viewer = UIBeanLocator.lookup().getViewer(displayer);

      out.write("\n");
      out.write("<table width=\"100%\" cellspacing=\"2\">\n");
      out.write("    <tr>\n");
      out.write("        <!-- Include the properties -->\n");
      out.write("        <td align=\"right\" valign=\"top\">\n");
      out.write("            <table cellspacing=\"2\" width=\"250px\">\n");
      out.write("                <!-- Domain and axis selection -->\n");
      out.write("                ");
      if (_jspx_meth_mvc_005finclude_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                <!-- Select the renderer -->\n");
      out.write("                ");
      if (_jspx_meth_mvc_005finclude_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                <!-- Select the type of the pie -->\n");
      out.write("                ");
      if (_jspx_meth_mvc_005finclude_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("                <!-- Select the type of the pie -->                \n");
      out.write("                ");
      if (_jspx_meth_mvc_005finclude_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("                <!-- Include the width, height, etc properties -->\n");
      out.write("                ");
      if (_jspx_meth_mvc_005finclude_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 <!-- Submit button -->\n");
      out.write("                 ");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </td>\n");
      out.write("        <!-- Include the graphic -->\n");
      out.write("        <td valign=\"top\">\n");
      out.write("            ");
      //  factory:useComponent
      org.jboss.dashboard.ui.taglib.factory.UseComponentTag _jspx_th_factory_005fuseComponent_005f0 = (org.jboss.dashboard.ui.taglib.factory.UseComponentTag) _005fjspx_005ftagPool_005ffactory_005fuseComponent_0026_005fbean_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.UseComponentTag.class);
      _jspx_th_factory_005fuseComponent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_factory_005fuseComponent_005f0.setParent(null);
      // /components/bam/displayer/chart/piechart_editor.jsp(62,12) name = bean type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_factory_005fuseComponent_005f0.setBean( viewer.getName() );
      int _jspx_eval_factory_005fuseComponent_005f0 = _jspx_th_factory_005fuseComponent_005f0.doStartTag();
      if (_jspx_th_factory_005fuseComponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005ffactory_005fuseComponent_0026_005fbean_005fnobody.reuse(_jspx_th_factory_005fuseComponent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005ffactory_005fuseComponent_0026_005fbean_005fnobody.reuse(_jspx_th_factory_005fuseComponent_005f0);
      out.write("\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
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
    // /components/bam/displayer/chart/piechart_editor.jsp(43,16) name = page type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f0.setPage("axis_selection.jsp");
    // /components/bam/displayer/chart/piechart_editor.jsp(43,16) name = flush type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    // /components/bam/displayer/chart/piechart_editor.jsp(45,16) name = page type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f1.setPage("renderer_selection.jsp");
    // /components/bam/displayer/chart/piechart_editor.jsp(45,16) name = flush type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f1.setFlush(new Boolean(true));
    int _jspx_eval_mvc_005finclude_005f1 = _jspx_th_mvc_005finclude_005f1.doStartTag();
    if (_jspx_th_mvc_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f1);
    return false;
  }

  private boolean _jspx_meth_mvc_005finclude_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:include
    org.jboss.dashboard.ui.taglib.JSPIncludeTag _jspx_th_mvc_005finclude_005f2 = (org.jboss.dashboard.ui.taglib.JSPIncludeTag) _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.get(org.jboss.dashboard.ui.taglib.JSPIncludeTag.class);
    _jspx_th_mvc_005finclude_005f2.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005finclude_005f2.setParent(null);
    // /components/bam/displayer/chart/piechart_editor.jsp(47,16) name = page type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f2.setPage("chart_type_selection.jsp");
    // /components/bam/displayer/chart/piechart_editor.jsp(47,16) name = flush type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f2.setFlush(new Boolean(true));
    int _jspx_eval_mvc_005finclude_005f2 = _jspx_th_mvc_005finclude_005f2.doStartTag();
    if (_jspx_th_mvc_005finclude_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f2);
    return false;
  }

  private boolean _jspx_meth_mvc_005finclude_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:include
    org.jboss.dashboard.ui.taglib.JSPIncludeTag _jspx_th_mvc_005finclude_005f3 = (org.jboss.dashboard.ui.taglib.JSPIncludeTag) _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.get(org.jboss.dashboard.ui.taglib.JSPIncludeTag.class);
    _jspx_th_mvc_005finclude_005f3.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005finclude_005f3.setParent(null);
    // /components/bam/displayer/chart/piechart_editor.jsp(50,16) name = page type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f3.setPage("domain_properties.jsp");
    // /components/bam/displayer/chart/piechart_editor.jsp(50,16) name = flush type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f3.setFlush(new Boolean(true));
    int _jspx_eval_mvc_005finclude_005f3 = _jspx_th_mvc_005finclude_005f3.doStartTag();
    if (_jspx_th_mvc_005finclude_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f3);
    return false;
  }

  private boolean _jspx_meth_mvc_005finclude_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:include
    org.jboss.dashboard.ui.taglib.JSPIncludeTag _jspx_th_mvc_005finclude_005f4 = (org.jboss.dashboard.ui.taglib.JSPIncludeTag) _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.get(org.jboss.dashboard.ui.taglib.JSPIncludeTag.class);
    _jspx_th_mvc_005finclude_005f4.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005finclude_005f4.setParent(null);
    // /components/bam/displayer/chart/piechart_editor.jsp(53,16) name = page type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f4.setPage("generic_properties.jsp");
    // /components/bam/displayer/chart/piechart_editor.jsp(53,16) name = flush type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005finclude_005f4.setFlush(new Boolean(true));
    int _jspx_eval_mvc_005finclude_005f4 = _jspx_th_mvc_005finclude_005f4.doStartTag();
    if (_jspx_th_mvc_005finclude_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005finclude_0026_005fpage_005fflush_005fnobody.reuse(_jspx_th_mvc_005finclude_005f4);
    return false;
  }
}
