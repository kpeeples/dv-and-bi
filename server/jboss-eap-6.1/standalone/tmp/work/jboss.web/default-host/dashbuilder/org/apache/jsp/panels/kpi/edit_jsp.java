package org.apache.jsp.panels.kpi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fpanel_005fencode_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fpanel_005flink_0026_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fpanel_005fhidden_0026_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fuseComponent_0026_005fbean_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fpanel_005fencode_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fpanel_005flink_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fpanel_005fhidden_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fuseComponent_0026_005fbean_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fpanel_005fencode_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fpanel_005flink_0026_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fpanel_005fhidden_0026_005faction_005fnobody.release();
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
      out.write("<!-- Submit action of the KPIEditor component-->\n");
      out.write("<form method=\"post\"  id=\"");
      if (_jspx_meth_panel_005fencode_005f0(_jspx_page_context))
        return;
      out.write("\" action=\"");
      if (_jspx_meth_panel_005flink_005f0(_jspx_page_context))
        return;
      out.write('"');
      out.write('>');
      out.write('\n');
      if (_jspx_meth_panel_005fhidden_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_factory_005fuseComponent_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</form>\n");
      out.write("<script defer=\"true\">\n");
      out.write("    setAjax(\"");
      if (_jspx_meth_panel_005fencode_005f1(_jspx_page_context))
        return;
      out.write("\");\n");
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

  private boolean _jspx_meth_panel_005fencode_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  panel:encode
    org.jboss.dashboard.ui.taglib.EncodeTag _jspx_th_panel_005fencode_005f0 = (org.jboss.dashboard.ui.taglib.EncodeTag) _005fjspx_005ftagPool_005fpanel_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.EncodeTag.class);
    _jspx_th_panel_005fencode_005f0.setPageContext(_jspx_page_context);
    _jspx_th_panel_005fencode_005f0.setParent(null);
    // /panels/kpi/edit.jsp(24,25) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_panel_005fencode_005f0.setName("submit");
    int _jspx_eval_panel_005fencode_005f0 = _jspx_th_panel_005fencode_005f0.doStartTag();
    if (_jspx_th_panel_005fencode_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fpanel_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_panel_005fencode_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fpanel_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_panel_005fencode_005f0);
    return false;
  }

  private boolean _jspx_meth_panel_005flink_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  panel:link
    org.jboss.dashboard.ui.taglib.LinkTag _jspx_th_panel_005flink_005f0 = (org.jboss.dashboard.ui.taglib.LinkTag) _005fjspx_005ftagPool_005fpanel_005flink_0026_005faction_005fnobody.get(org.jboss.dashboard.ui.taglib.LinkTag.class);
    _jspx_th_panel_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_panel_005flink_005f0.setParent(null);
    // /panels/kpi/edit.jsp(24,64) name = action type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_panel_005flink_005f0.setAction("submit");
    int _jspx_eval_panel_005flink_005f0 = _jspx_th_panel_005flink_005f0.doStartTag();
    if (_jspx_th_panel_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fpanel_005flink_0026_005faction_005fnobody.reuse(_jspx_th_panel_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fpanel_005flink_0026_005faction_005fnobody.reuse(_jspx_th_panel_005flink_005f0);
    return false;
  }

  private boolean _jspx_meth_panel_005fhidden_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  panel:hidden
    org.jboss.dashboard.ui.taglib.HiddenLinkTag _jspx_th_panel_005fhidden_005f0 = (org.jboss.dashboard.ui.taglib.HiddenLinkTag) _005fjspx_005ftagPool_005fpanel_005fhidden_0026_005faction_005fnobody.get(org.jboss.dashboard.ui.taglib.HiddenLinkTag.class);
    _jspx_th_panel_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_panel_005fhidden_005f0.setParent(null);
    // /panels/kpi/edit.jsp(25,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_panel_005fhidden_005f0.setAction("submit");
    int _jspx_eval_panel_005fhidden_005f0 = _jspx_th_panel_005fhidden_005f0.doStartTag();
    if (_jspx_th_panel_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fpanel_005fhidden_0026_005faction_005fnobody.reuse(_jspx_th_panel_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fpanel_005fhidden_0026_005faction_005fnobody.reuse(_jspx_th_panel_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_factory_005fuseComponent_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:useComponent
    org.jboss.dashboard.ui.taglib.factory.UseComponentTag _jspx_th_factory_005fuseComponent_005f0 = (org.jboss.dashboard.ui.taglib.factory.UseComponentTag) _005fjspx_005ftagPool_005ffactory_005fuseComponent_0026_005fbean_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.UseComponentTag.class);
    _jspx_th_factory_005fuseComponent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fuseComponent_005f0.setParent(null);
    // /panels/kpi/edit.jsp(26,4) name = bean type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fuseComponent_005f0.setBean("org.jboss.dashboard.ui.components.KPIEditor");
    int _jspx_eval_factory_005fuseComponent_005f0 = _jspx_th_factory_005fuseComponent_005f0.doStartTag();
    if (_jspx_th_factory_005fuseComponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fuseComponent_0026_005fbean_005fnobody.reuse(_jspx_th_factory_005fuseComponent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fuseComponent_0026_005fbean_005fnobody.reuse(_jspx_th_factory_005fuseComponent_005f0);
    return false;
  }

  private boolean _jspx_meth_panel_005fencode_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  panel:encode
    org.jboss.dashboard.ui.taglib.EncodeTag _jspx_th_panel_005fencode_005f1 = (org.jboss.dashboard.ui.taglib.EncodeTag) _005fjspx_005ftagPool_005fpanel_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.EncodeTag.class);
    _jspx_th_panel_005fencode_005f1.setPageContext(_jspx_page_context);
    _jspx_th_panel_005fencode_005f1.setParent(null);
    // /panels/kpi/edit.jsp(29,13) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_panel_005fencode_005f1.setName("submit");
    int _jspx_eval_panel_005fencode_005f1 = _jspx_th_panel_005fencode_005f1.doStartTag();
    if (_jspx_th_panel_005fencode_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fpanel_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_panel_005fencode_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fpanel_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_panel_005fencode_005f1);
    return false;
  }
}
