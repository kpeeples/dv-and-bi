package org.apache.jsp.components.bam.provider.manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.dashboard.DataDisplayerServices;
import org.jboss.dashboard.LocaleManager;
import org.jboss.dashboard.ui.components.DataProviderHandler;
import org.apache.commons.lang.StringEscapeUtils;
import org.jboss.dashboard.provider.DataProviderType;

public final class data_005fprovider_005ftypes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.release();
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.release();
    _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody.release();
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.release();
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
      //  i18n:bundle
      java.util.ResourceBundle bundle = null;
      org.apache.taglibs.i18n.BundleTag _jspx_th_i18n_005fbundle_005f0 = (org.apache.taglibs.i18n.BundleTag) _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.get(org.apache.taglibs.i18n.BundleTag.class);
      _jspx_th_i18n_005fbundle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fbundle_005f0.setParent(null);
      // /components/bam/provider/manager/data_provider_types.jsp(28,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setId("bundle");
      // /components/bam/provider/manager/data_provider_types.jsp(28,0) name = baseName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setBaseName("org.jboss.dashboard.displayer.messages");
      // /components/bam/provider/manager/data_provider_types.jsp(28,0) name = locale type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setLocale(LocaleManager.currentLocale());
      int _jspx_eval_i18n_005fbundle_005f0 = _jspx_th_i18n_005fbundle_005f0.doStartTag();
      bundle = (java.util.ResourceBundle) _jspx_page_context.findAttribute("bundle");
      if (_jspx_th_i18n_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.reuse(_jspx_th_i18n_005fbundle_005f0);
        return;
      }
      bundle = (java.util.ResourceBundle) _jspx_page_context.findAttribute("bundle");
      _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.reuse(_jspx_th_i18n_005fbundle_005f0);
      out.write('\n');

    DataProviderType[] providerTypes = DataDisplayerServices.lookup().getDataProviderManager().getDataProviderTypes();
    DataProviderHandler dph = DataProviderHandler.lookup();
    String currentTypeUid = dph.getCurrentProviderTypeUid();

    if (providerTypes.length == 0) {

      out.write("\n");
      out.write("    ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f0 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f0.setParent(null);
      // /components/bam/provider/manager/data_provider_types.jsp(36,4) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f0.setKey(DataProviderHandler.I18N_PREFFIX + "noDataProviderTypes");
      int _jspx_eval_i18n_005fmessage_005f0 = _jspx_th_i18n_005fmessage_005f0.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f0.doInitBody();
        }
        do {
          out.write("!!! No existen tipos de proveedores de datos");
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
      out.write('\n');

    } else {

      out.write("\n");
      out.write("    <select class=\"skn-input\" name=\"");
      if (_jspx_meth_factory_005fbean_005f0(_jspx_page_context))
        return;
      out.write("\"\n");
      out.write("    id=\"");
      if (_jspx_meth_factory_005fencode_005f0(_jspx_page_context))
        return;
      out.write('"');
      out.write(' ');
 if (!dph.isCreate()) {
      out.write(" disabled ");
} 
      out.write("\n");
      out.write("    onchange=\"document.getElementById('");
      if (_jspx_meth_factory_005fencode_005f1(_jspx_page_context))
        return;
      out.write("').value = 'true'; submitAjaxForm(this.form)\">\n");
      out.write("        <option value=\"-1\" ");
if (currentTypeUid == null) {
      out.write(" selected ");
} 
      out.write(" >\n");
      out.write("            ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f1 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f1.setParent(null);
      // /components/bam/provider/manager/data_provider_types.jsp(44,12) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f1.setKey(DataProviderHandler.I18N_PREFFIX + "chooseDataProviderType");
      int _jspx_eval_i18n_005fmessage_005f1 = _jspx_th_i18n_005fmessage_005f1.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f1.doInitBody();
        }
        do {
          out.write("!!!Escoger tipo");
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
      out.write("\n");
      out.write("        </option>\n");

    for (int i = 0; i < providerTypes.length; i++) {
        DataProviderType providerType = providerTypes[i];
        String uid = StringEscapeUtils.escapeHtml(providerType.getUid());
        String description = StringEscapeUtils.escapeHtml(providerType.getDescription(LocaleManager.currentLocale()));
        String selected = (currentTypeUid != null && currentTypeUid.equals(uid) ? "selected" : "");

      out.write("\n");
      out.write("        <option value=\"");
      out.print( uid );
      out.write('"');
      out.write(' ');
      out.print( selected );
      out.write('>');
      out.print( description );
      out.write("</option>\n");

    }

      out.write("\n");
      out.write("    </select>\n");
      out.write("    <input id=\"");
      if (_jspx_meth_factory_005fencode_005f2(_jspx_page_context))
        return;
      out.write("\" type=\"hidden\" name=\"");
      if (_jspx_meth_factory_005fbean_005f1(_jspx_page_context))
        return;
      out.write("\" value=\"false\"/>\n");

    }

      out.write('\n');
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

  private boolean _jspx_meth_factory_005fbean_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:bean
    org.jboss.dashboard.ui.taglib.factory.BeanTag _jspx_th_factory_005fbean_005f0 = (org.jboss.dashboard.ui.taglib.factory.BeanTag) _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.BeanTag.class);
    _jspx_th_factory_005fbean_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fbean_005f0.setParent(null);
    // /components/bam/provider/manager/data_provider_types.jsp(40,36) name = bean type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fbean_005f0.setBean("org.jboss.dashboard.ui.components.DataProviderHandler");
    // /components/bam/provider/manager/data_provider_types.jsp(40,36) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fbean_005f0.setProperty("currentProviderTypeUid");
    int _jspx_eval_factory_005fbean_005f0 = _jspx_th_factory_005fbean_005f0.doStartTag();
    if (_jspx_th_factory_005fbean_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody.reuse(_jspx_th_factory_005fbean_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody.reuse(_jspx_th_factory_005fbean_005f0);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f0 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f0.setParent(null);
    // /components/bam/provider/manager/data_provider_types.jsp(41,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f0.setName("typesSelect");
    int _jspx_eval_factory_005fencode_005f0 = _jspx_th_factory_005fencode_005f0.doStartTag();
    if (_jspx_th_factory_005fencode_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f0);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f1 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f1.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f1.setParent(null);
    // /components/bam/provider/manager/data_provider_types.jsp(42,39) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f1.setName("providerTypeChangedInput");
    int _jspx_eval_factory_005fencode_005f1 = _jspx_th_factory_005fencode_005f1.doStartTag();
    if (_jspx_th_factory_005fencode_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f1);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f2 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f2.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f2.setParent(null);
    // /components/bam/provider/manager/data_provider_types.jsp(58,15) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f2.setName("providerTypeChangedInput");
    int _jspx_eval_factory_005fencode_005f2 = _jspx_th_factory_005fencode_005f2.doStartTag();
    if (_jspx_th_factory_005fencode_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f2);
    return false;
  }

  private boolean _jspx_meth_factory_005fbean_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:bean
    org.jboss.dashboard.ui.taglib.factory.BeanTag _jspx_th_factory_005fbean_005f1 = (org.jboss.dashboard.ui.taglib.factory.BeanTag) _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.BeanTag.class);
    _jspx_th_factory_005fbean_005f1.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fbean_005f1.setParent(null);
    // /components/bam/provider/manager/data_provider_types.jsp(58,86) name = bean type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fbean_005f1.setBean("org.jboss.dashboard.ui.components.DataProviderHandler");
    // /components/bam/provider/manager/data_provider_types.jsp(58,86) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fbean_005f1.setProperty("currentProviderTypeChanged");
    int _jspx_eval_factory_005fbean_005f1 = _jspx_th_factory_005fbean_005f1.doStartTag();
    if (_jspx_th_factory_005fbean_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody.reuse(_jspx_th_factory_005fbean_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody.reuse(_jspx_th_factory_005fbean_005f1);
    return false;
  }
}
