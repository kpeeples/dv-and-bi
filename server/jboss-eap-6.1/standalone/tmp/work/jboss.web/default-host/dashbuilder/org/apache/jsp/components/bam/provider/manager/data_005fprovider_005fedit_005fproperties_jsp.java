package org.apache.jsp.components.bam.provider.manager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.dashboard.LocaleManager;
import org.jboss.dashboard.ui.components.DataProviderHandler;
import org.jboss.dashboard.ui.formatters.DataProviderFormatter;
import java.util.Locale;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Map;

public final class data_005fprovider_005fedit_005fproperties_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fargs_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fformUrl_0026_005ffriendly_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005fbean_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fargs_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fformUrl_0026_005ffriendly_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005fbean_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.release();
    _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname.release();
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.release();
    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.release();
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fargs_005fnobody.release();
    _005fjspx_005ftagPool_005ffactory_005fformUrl_0026_005ffriendly_005fnobody.release();
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005fbean_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.release();
    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody.release();
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

    java.lang.Object _jspx_selected_1 = null;
    java.lang.Object _jspx_keys_2 = null;
    java.lang.Object _jspx_values_3 = null;
    java.lang.Object _jspx_propertyId_1 = null;

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
      out.write("\n");
      //  i18n:bundle
      java.util.ResourceBundle bundle = null;
      org.apache.taglibs.i18n.BundleTag _jspx_th_i18n_005fbundle_005f0 = (org.apache.taglibs.i18n.BundleTag) _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.get(org.apache.taglibs.i18n.BundleTag.class);
      _jspx_th_i18n_005fbundle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fbundle_005f0.setParent(null);
      // /components/bam/provider/manager/data_provider_edit_properties.jsp(30,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setId("bundle");
      // /components/bam/provider/manager/data_provider_edit_properties.jsp(30,0) name = baseName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setBaseName("org.jboss.dashboard.displayer.messages");
      // /components/bam/provider/manager/data_provider_edit_properties.jsp(30,0) name = locale type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
      out.write('\n');
      out.write('\n');
      //  mvc:formatter
      org.jboss.dashboard.ui.taglib.formatter.FormatterTag _jspx_th_mvc_005fformatter_005f0 = (org.jboss.dashboard.ui.taglib.formatter.FormatterTag) _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FormatterTag.class);
      _jspx_th_mvc_005fformatter_005f0.setPageContext(_jspx_page_context);
      _jspx_th_mvc_005fformatter_005f0.setParent(null);
      // /components/bam/provider/manager/data_provider_edit_properties.jsp(34,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_mvc_005fformatter_005f0.setName("org.jboss.dashboard.ui.formatters.DataProviderFormatter");
      int _jspx_eval_mvc_005fformatter_005f0 = _jspx_th_mvc_005fformatter_005f0.doStartTag();
      if (_jspx_eval_mvc_005fformatter_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_mvc_005fformatter_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_mvc_005fformatter_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_mvc_005fformatter_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_mvc_005ffragment_005f0(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("    ");
          //  mvc:fragment
          org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f1 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f1.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /components/bam/provider/manager/data_provider_edit_properties.jsp(39,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f1.setName("outputTitle");
          int _jspx_eval_mvc_005ffragment_005f1 = _jspx_th_mvc_005ffragment_005f1.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f1.doInitBody();
            }
            do {
              out.write("\n");
              out.write("        ");
              //  mvc:fragmentValue
              org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f0 = (org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f0.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f1);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(40,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f0.setName("providerName");
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(40,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f0.setId("providerName");
              int _jspx_eval_mvc_005ffragmentValue_005f0 = _jspx_th_mvc_005ffragmentValue_005f0.doStartTag();
              if (_jspx_eval_mvc_005ffragmentValue_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object providerName = null;
                if (_jspx_eval_mvc_005ffragmentValue_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_mvc_005ffragmentValue_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_mvc_005ffragmentValue_005f0.doInitBody();
                }
                providerName = (java.lang.Object) _jspx_page_context.findAttribute("providerName");
                do {
                  out.write("\n");
                  out.write("        <tr>\n");
                  out.write("            <td class=\"skn-title3\">");
                  //  i18n:message
                  org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f0 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fargs_005fnobody.get(org.apache.taglibs.i18n.MessageTag.class);
                  _jspx_th_i18n_005fmessage_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_i18n_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f0);
                  // /components/bam/provider/manager/data_provider_edit_properties.jsp(42,35) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_i18n_005fmessage_005f0.setKey(DataProviderHandler.I18N_PREFFIX + "editingProviderProperties");
                  // /components/bam/provider/manager/data_provider_edit_properties.jsp(42,35) name = args type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_i18n_005fmessage_005f0.setArgs(new Object[] {providerName});
                  int _jspx_eval_i18n_005fmessage_005f0 = _jspx_th_i18n_005fmessage_005f0.doStartTag();
                  if (_jspx_th_i18n_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fargs_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fargs_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f0);
                  out.write(" <br><br></td>\n");
                  out.write("        </tr>\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f0.doAfterBody();
                  providerName = (java.lang.Object) _jspx_page_context.findAttribute("providerName");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_mvc_005ffragmentValue_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_mvc_005ffragmentValue_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f0);
              out.write("\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f1);
          out.write("\n");
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_mvc_005ffragment_005f2(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("    ");
          //  mvc:fragment
          org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f3 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f3.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /components/bam/provider/manager/data_provider_edit_properties.jsp(55,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f3.setName("outputStartProperties");
          int _jspx_eval_mvc_005ffragment_005f3 = _jspx_th_mvc_005ffragment_005f3.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f3.doInitBody();
            }
            do {
              out.write("\n");
              out.write("        <tr><td width=\"100%\">\n");
              out.write("        <table class=\"skn-table_border\" cellspacing=\"1\" cellpadding=\"4\" border=\"0\" align=\"center\" width=\"100%\">\n");
              out.write("        <tr class=\"skn-table_header\">\n");
              out.write("            <td>\n");
              out.write("                ");
              //  i18n:message
              org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f1 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
              _jspx_th_i18n_005fmessage_005f1.setPageContext(_jspx_page_context);
              _jspx_th_i18n_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f3);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(60,16) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_i18n_005fmessage_005f1.setKey(DataProviderHandler.I18N_PREFFIX + "header_properties");
              int _jspx_eval_i18n_005fmessage_005f1 = _jspx_th_i18n_005fmessage_005f1.doStartTag();
              if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_i18n_005fmessage_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_i18n_005fmessage_005f1.doInitBody();
                }
                do {
                  out.write("!!! Acciones");
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
              out.write("            </td>\n");
              out.write("            <td>\n");
              out.write("                ");
              //  i18n:message
              org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f2 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
              _jspx_th_i18n_005fmessage_005f2.setPageContext(_jspx_page_context);
              _jspx_th_i18n_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f3);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(63,16) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_i18n_005fmessage_005f2.setKey(DataProviderHandler.I18N_PREFFIX + "header_type");
              int _jspx_eval_i18n_005fmessage_005f2 = _jspx_th_i18n_005fmessage_005f2.doStartTag();
              if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_i18n_005fmessage_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_i18n_005fmessage_005f2.doInitBody();
                }
                do {
                  out.write("!!! Nombre");
                  int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_i18n_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f2);
              out.write("\n");
              out.write("            </td>\n");
              out.write("            <td colspan=\"2\">\n");
              out.write("                ");
              //  i18n:message
              org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f3 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
              _jspx_th_i18n_005fmessage_005f3.setPageContext(_jspx_page_context);
              _jspx_th_i18n_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f3);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(66,16) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_i18n_005fmessage_005f3.setKey(DataProviderHandler.I18N_PREFFIX + "header_name");
              int _jspx_eval_i18n_005fmessage_005f3 = _jspx_th_i18n_005fmessage_005f3.doStartTag();
              if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_i18n_005fmessage_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_i18n_005fmessage_005f3.doInitBody();
                }
                do {
                  out.write("!!! Nombre");
                  int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_i18n_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f3);
              out.write("\n");
              out.write("            </td>\n");
              out.write("        </tr>\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f3);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f3);
          out.write("\n");
          out.write("    ");
          //  mvc:fragment
          org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f4 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f4.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /components/bam/provider/manager/data_provider_edit_properties.jsp(70,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f4.setName("outputStartRow");
          int _jspx_eval_mvc_005ffragment_005f4 = _jspx_th_mvc_005ffragment_005f4.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f4.doInitBody();
            }
            do {
              out.write("\n");
              out.write("        ");
              //  mvc:fragmentValue
              org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f1 = (org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f1.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f4);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(71,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f1.setName("index");
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(71,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f1.setId("index");
              int _jspx_eval_mvc_005ffragmentValue_005f1 = _jspx_th_mvc_005ffragmentValue_005f1.doStartTag();
              if (_jspx_eval_mvc_005ffragmentValue_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object index = null;
                if (_jspx_eval_mvc_005ffragmentValue_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_mvc_005ffragmentValue_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_mvc_005ffragmentValue_005f1.doInitBody();
                }
                index = (java.lang.Object) _jspx_page_context.findAttribute("index");
                do {
                  out.write("\n");
                  out.write("        ");

                String className, altClass;
                if (((Integer) index).intValue() % 2 == 0) {
                    className = "skn-even_row";
                    altClass = "skn-even_row_alt";
                } else {
                    className = "skn-odd_row";
                    altClass = "skn-odd_row_alt";
                }
            
                  out.write("\n");
                  out.write("            <tr class=\"");
                  out.print(className);
                  out.write("\" onmouseover=\"className='");
                  out.print(altClass);
                  out.write("'\" onmouseout=\"className='");
                  out.print(className);
                  out.write("'\">\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f1.doAfterBody();
                  index = (java.lang.Object) _jspx_page_context.findAttribute("index");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_mvc_005ffragmentValue_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_mvc_005ffragmentValue_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f1);
              out.write("\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f4);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f4);
          out.write("\n");
          out.write("\n");
          out.write("    ");
          //  mvc:fragment
          org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f5 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f5.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /components/bam/provider/manager/data_provider_edit_properties.jsp(86,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f5.setName("outputEmpty");
          int _jspx_eval_mvc_005ffragment_005f5 = _jspx_th_mvc_005ffragment_005f5.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f5.doInitBody();
            }
            do {
              out.write("\n");
              out.write("        <td>\n");
              out.write("            ");
              //  i18n:message
              org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f4 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
              _jspx_th_i18n_005fmessage_005f4.setPageContext(_jspx_page_context);
              _jspx_th_i18n_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f5);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(88,12) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_i18n_005fmessage_005f4.setKey(DataProviderHandler.I18N_PREFFIX + "noProperties");
              int _jspx_eval_i18n_005fmessage_005f4 = _jspx_th_i18n_005fmessage_005f4.doStartTag();
              if (_jspx_eval_i18n_005fmessage_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_i18n_005fmessage_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_i18n_005fmessage_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_i18n_005fmessage_005f4.doInitBody();
                }
                do {
                  out.write("!!!No existen propiedades");
                  int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_i18n_005fmessage_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_i18n_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f4);
              out.write("\n");
              out.write("        </td>\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f5);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f5);
          out.write("\n");
          out.write("\n");
          out.write("    ");
          //  mvc:fragment
          org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f6 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f6.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /components/bam/provider/manager/data_provider_edit_properties.jsp(92,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f6.setName("outputPropertyId");
          int _jspx_eval_mvc_005ffragment_005f6 = _jspx_th_mvc_005ffragment_005f6.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f6.doInitBody();
            }
            do {
              out.write("\n");
              out.write("            <td width=\"150px\">\n");
              out.write("                 <div style=\"width:150px; height:18px; text-align:left; overflow:hidden; vertical-align:middle\"\n");
              out.write("                         title=\"");
              //  mvc:fragmentValue
              org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f2 = (org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f2.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f6);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(95,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f2.setName("propertyId");
              int _jspx_eval_mvc_005ffragmentValue_005f2 = _jspx_th_mvc_005ffragmentValue_005f2.doStartTag();
              if (_jspx_th_mvc_005ffragmentValue_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fnobody.reuse(_jspx_th_mvc_005ffragmentValue_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fnobody.reuse(_jspx_th_mvc_005ffragmentValue_005f2);
              out.write("\">\n");
              out.write("                     ");
              //  mvc:fragmentValue
              org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f3 = (org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f3.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f6);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(96,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f3.setName("propertyId");
              int _jspx_eval_mvc_005ffragmentValue_005f3 = _jspx_th_mvc_005ffragmentValue_005f3.doStartTag();
              if (_jspx_th_mvc_005ffragmentValue_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fnobody.reuse(_jspx_th_mvc_005ffragmentValue_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fnobody.reuse(_jspx_th_mvc_005ffragmentValue_005f3);
              out.write("\n");
              out.write("                 </div>\n");
              out.write("            </td>\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f6);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f6);
          out.write("\n");
          out.write("\n");
          out.write("    ");
          //  mvc:fragment
          org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f7 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f7.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /components/bam/provider/manager/data_provider_edit_properties.jsp(101,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f7.setName("outputPropertyTypeText");
          int _jspx_eval_mvc_005ffragment_005f7 = _jspx_th_mvc_005ffragment_005f7.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f7.doInitBody();
            }
            do {
              out.write("\n");
              out.write("            ");
              //  mvc:fragmentValue
              org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f4 = (org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f4.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f7);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(102,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f4.setName("propertyType");
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(102,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f4.setId("propertyType");
              int _jspx_eval_mvc_005ffragmentValue_005f4 = _jspx_th_mvc_005ffragmentValue_005f4.doStartTag();
              if (_jspx_eval_mvc_005ffragmentValue_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object propertyType = null;
                if (_jspx_eval_mvc_005ffragmentValue_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_mvc_005ffragmentValue_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_mvc_005ffragmentValue_005f4.doInitBody();
                }
                propertyType = (java.lang.Object) _jspx_page_context.findAttribute("propertyType");
                do {
                  out.write("\n");
                  out.write("                <td width=\"100px\" >\n");
                  out.write("                    <div style=\"width:100px; height:18px; text-align:left; overflow:hidden; vertical-align:middle\"\n");
                  out.write("                         title=\"");
                  //  i18n:message
                  org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f5 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.i18n.MessageTag.class);
                  _jspx_th_i18n_005fmessage_005f5.setPageContext(_jspx_page_context);
                  _jspx_th_i18n_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f4);
                  // /components/bam/provider/manager/data_provider_edit_properties.jsp(105,32) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_i18n_005fmessage_005f5.setKey((String) propertyType);
                  int _jspx_eval_i18n_005fmessage_005f5 = _jspx_th_i18n_005fmessage_005f5.doStartTag();
                  if (_jspx_th_i18n_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f5);
                    return;
                  }
                  _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f5);
                  out.write("\">\n");
                  out.write("                         ");
                  //  i18n:message
                  org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f6 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.i18n.MessageTag.class);
                  _jspx_th_i18n_005fmessage_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_i18n_005fmessage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f4);
                  // /components/bam/provider/manager/data_provider_edit_properties.jsp(106,25) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_i18n_005fmessage_005f6.setKey((String) propertyType);
                  int _jspx_eval_i18n_005fmessage_005f6 = _jspx_th_i18n_005fmessage_005f6.doStartTag();
                  if (_jspx_th_i18n_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f6);
                  out.write("\n");
                  out.write("                     </div>\n");
                  out.write("\n");
                  out.write("                </td>\n");
                  out.write("            ");
                  int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f4.doAfterBody();
                  propertyType = (java.lang.Object) _jspx_page_context.findAttribute("propertyType");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_mvc_005ffragmentValue_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_mvc_005ffragmentValue_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f4);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f4);
              out.write("\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f7);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f7);
          out.write("\n");
          out.write("    ");
          //  mvc:fragment
          org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f8 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f8.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /components/bam/provider/manager/data_provider_edit_properties.jsp(112,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f8.setName("outputPropertyTypeCombo");
          int _jspx_eval_mvc_005ffragment_005f8 = _jspx_th_mvc_005ffragment_005f8.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f8.doInitBody();
            }
            do {
              out.write("\n");
              out.write("        ");
              //  mvc:fragmentValue
              org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f5 = (org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f5.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f8);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(113,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f5.setName("propertyId");
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(113,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f5.setId("propertyId");
              int _jspx_eval_mvc_005ffragmentValue_005f5 = _jspx_th_mvc_005ffragmentValue_005f5.doStartTag();
              if (_jspx_eval_mvc_005ffragmentValue_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object propertyId = null;
                if (_jspx_eval_mvc_005ffragmentValue_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_mvc_005ffragmentValue_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_mvc_005ffragmentValue_005f5.doInitBody();
                }
                propertyId = (java.lang.Object) _jspx_page_context.findAttribute("propertyId");
                do {
                  out.write("\n");
                  out.write("        ");
                  //  mvc:fragmentValue
                  org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f6 = (org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag.class);
                  _jspx_th_mvc_005ffragmentValue_005f6.setPageContext(_jspx_page_context);
                  _jspx_th_mvc_005ffragmentValue_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f5);
                  // /components/bam/provider/manager/data_provider_edit_properties.jsp(114,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f6.setName("selected");
                  // /components/bam/provider/manager/data_provider_edit_properties.jsp(114,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f6.setId("selected");
                  int _jspx_eval_mvc_005ffragmentValue_005f6 = _jspx_th_mvc_005ffragmentValue_005f6.doStartTag();
                  if (_jspx_eval_mvc_005ffragmentValue_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.Object selected = null;
                    if (_jspx_eval_mvc_005ffragmentValue_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_mvc_005ffragmentValue_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_mvc_005ffragmentValue_005f6.doInitBody();
                    }
                    selected = (java.lang.Object) _jspx_page_context.findAttribute("selected");
                    do {
                      out.write("\n");
                      out.write("        ");
                      //  mvc:fragmentValue
                      org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f7 = (org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag.class);
                      _jspx_th_mvc_005ffragmentValue_005f7.setPageContext(_jspx_page_context);
                      _jspx_th_mvc_005ffragmentValue_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f6);
                      // /components/bam/provider/manager/data_provider_edit_properties.jsp(115,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_mvc_005ffragmentValue_005f7.setName("keys");
                      // /components/bam/provider/manager/data_provider_edit_properties.jsp(115,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                      _jspx_th_mvc_005ffragmentValue_005f7.setId("keys");
                      int _jspx_eval_mvc_005ffragmentValue_005f7 = _jspx_th_mvc_005ffragmentValue_005f7.doStartTag();
                      if (_jspx_eval_mvc_005ffragmentValue_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        java.lang.Object keys = null;
                        if (_jspx_eval_mvc_005ffragmentValue_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_mvc_005ffragmentValue_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_mvc_005ffragmentValue_005f7.doInitBody();
                        }
                        keys = (java.lang.Object) _jspx_page_context.findAttribute("keys");
                        do {
                          out.write("\n");
                          out.write("            ");
                          //  mvc:fragmentValue
                          org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f8 = (org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag.class);
                          _jspx_th_mvc_005ffragmentValue_005f8.setPageContext(_jspx_page_context);
                          _jspx_th_mvc_005ffragmentValue_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f7);
                          // /components/bam/provider/manager/data_provider_edit_properties.jsp(116,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_mvc_005ffragmentValue_005f8.setName("values");
                          // /components/bam/provider/manager/data_provider_edit_properties.jsp(116,12) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                          _jspx_th_mvc_005ffragmentValue_005f8.setId("values");
                          int _jspx_eval_mvc_005ffragmentValue_005f8 = _jspx_th_mvc_005ffragmentValue_005f8.doStartTag();
                          if (_jspx_eval_mvc_005ffragmentValue_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            java.lang.Object values = null;
                            if (_jspx_eval_mvc_005ffragmentValue_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_mvc_005ffragmentValue_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_mvc_005ffragmentValue_005f8.doInitBody();
                            }
                            values = (java.lang.Object) _jspx_page_context.findAttribute("values");
                            do {
                              out.write("\n");
                              out.write("                <td width=\"100px\">\n");
                              out.write("                    <select class=\"skn-input\" name=\"");
                              out.print(DataProviderHandler.PARAM_PROPERTY_TYPE+"_"+propertyId);
                              out.write("\">\n");
                              out.write("                        ");

                            String[] strKeys = (String[]) keys;
                            String[] strValues = (String[]) values;
                            for (int x = 0; x < strKeys.length; x++) {
                                String key = strKeys[x];
                                String value = strValues[x];
                                boolean optionSelected = false;
                                if (value.equals("domain."+selected)) optionSelected = true;
                        
                              out.write("\n");
                              out.write("                        <option value=\"");
                              out.print(key);
                              out.write('"');
                              out.write(' ');
                              out.print(optionSelected ? "selected" : "");
                              out.write('>');
                              //  i18n:message
                              org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f7 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.i18n.MessageTag.class);
                              _jspx_th_i18n_005fmessage_005f7.setPageContext(_jspx_page_context);
                              _jspx_th_i18n_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f8);
                              // /components/bam/provider/manager/data_provider_edit_properties.jsp(128,87) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                              _jspx_th_i18n_005fmessage_005f7.setKey((String) value);
                              int _jspx_eval_i18n_005fmessage_005f7 = _jspx_th_i18n_005fmessage_005f7.doStartTag();
                              if (_jspx_th_i18n_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f7);
                              return;
                              }
                              _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f7);
                              out.write("</option>\n");
                              out.write("                        ");

                            }
                        
                              out.write("\n");
                              out.write("                    </select>\n");
                              out.write("                </td>\n");
                              out.write("            ");
                              int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f8.doAfterBody();
                              values = (java.lang.Object) _jspx_page_context.findAttribute("values");
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_mvc_005ffragmentValue_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_mvc_005ffragmentValue_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f8);
                            return;
                          }
                          _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f8);
                          out.write("\n");
                          out.write("        ");
                          int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f7.doAfterBody();
                          keys = (java.lang.Object) _jspx_page_context.findAttribute("keys");
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_mvc_005ffragmentValue_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_mvc_005ffragmentValue_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f7);
                        return;
                      }
                      _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f7);
                      out.write("\n");
                      out.write("        ");
                      int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f6.doAfterBody();
                      selected = (java.lang.Object) _jspx_page_context.findAttribute("selected");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_mvc_005ffragmentValue_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_mvc_005ffragmentValue_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f6);
                    return;
                  }
                  _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f6);
                  out.write("\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f5.doAfterBody();
                  propertyId = (java.lang.Object) _jspx_page_context.findAttribute("propertyId");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_mvc_005ffragmentValue_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_mvc_005ffragmentValue_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f5);
              out.write("\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f8);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f8);
          out.write("\n");
          out.write("\n");
          out.write("    ");
          //  mvc:fragment
          org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f9 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f9.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /components/bam/provider/manager/data_provider_edit_properties.jsp(140,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f9.setName("outputPropertyTitle");
          int _jspx_eval_mvc_005ffragment_005f9 = _jspx_th_mvc_005ffragment_005f9.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f9.doInitBody();
            }
            do {
              out.write("\n");
              out.write("        ");
              //  mvc:fragmentValue
              org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f9 = (org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag.class);
              _jspx_th_mvc_005ffragmentValue_005f9.setPageContext(_jspx_page_context);
              _jspx_th_mvc_005ffragmentValue_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f9);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(141,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f9.setName("value");
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(141,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_mvc_005ffragmentValue_005f9.setId("value");
              int _jspx_eval_mvc_005ffragmentValue_005f9 = _jspx_th_mvc_005ffragmentValue_005f9.doStartTag();
              if (_jspx_eval_mvc_005ffragmentValue_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object value = null;
                if (_jspx_eval_mvc_005ffragmentValue_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_mvc_005ffragmentValue_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_mvc_005ffragmentValue_005f9.doInitBody();
                }
                value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                do {
                  out.write("\n");
                  out.write("        ");
                  //  mvc:fragmentValue
                  org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag _jspx_th_mvc_005ffragmentValue_005f10 = (org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag) _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.get(org.jboss.dashboard.ui.taglib.formatter.FragmentValueTag.class);
                  _jspx_th_mvc_005ffragmentValue_005f10.setPageContext(_jspx_page_context);
                  _jspx_th_mvc_005ffragmentValue_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f9);
                  // /components/bam/provider/manager/data_provider_edit_properties.jsp(142,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f10.setName("propertyId");
                  // /components/bam/provider/manager/data_provider_edit_properties.jsp(142,8) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
                  _jspx_th_mvc_005ffragmentValue_005f10.setId("propertyId");
                  int _jspx_eval_mvc_005ffragmentValue_005f10 = _jspx_th_mvc_005ffragmentValue_005f10.doStartTag();
                  if (_jspx_eval_mvc_005ffragmentValue_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    java.lang.Object propertyId = null;
                    if (_jspx_eval_mvc_005ffragmentValue_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_mvc_005ffragmentValue_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_mvc_005ffragmentValue_005f10.doInitBody();
                    }
                    propertyId = (java.lang.Object) _jspx_page_context.findAttribute("propertyId");
                    do {
                      out.write("\n");
                      out.write("        <td nowrap=\"nowrap\" colspan=\"2\">\n");
                      out.write("          ");

            Locale[] locales = LocaleManager.lookup().getPlatformAvailableLocales();
            for (int i = 0; i < locales.length; i++) {
              Locale locale = locales[i];
          
                      out.write("\n");
                      out.write("          <input id=\"");
                      if (_jspx_meth_factory_005fencode_005f1(_jspx_th_mvc_005ffragmentValue_005f10, _jspx_page_context))
                        return;
                      out.print( "_" + propertyId + "_" + locale.toString());
                      out.write("\"\n");
                      out.write("                 name='name");
                      out.print("/"+propertyId + "/" + locale.toString());
                      out.write("'\n");
                      out.write("                 class=\"skn-input\"\n");
                      out.write("                 style='");
                      out.print("width:250px;"+ (locale.getLanguage().equals(LocaleManager.currentLang()) ? "display:inline;" : "display:none;"));
                      out.write("'\n");
                      out.write("                 value='");
                      out.print(StringUtils.defaultString((value == null || "".equals(value)) ? "" : (String)((Map) value).get(locale)));
                      out.write("'>\n");
                      out.write("          ");
 } 
                      out.write("\n");
                      out.write("                    <select class=\"skn-input\" onchange=\"\n");
                      out.write("                    var elements = this.form.elements;\n");
                      out.write("                    var selectedOption = this.options[this.selectedIndex];\n");
                      out.write("                    for(i =0 ; i<elements.length; i++){\n");
                      out.write("                        var element = elements[i];\n");
                      out.write("                        if (element.tagName.toUpperCase() == 'INPUT' && element.type.toUpperCase()=='TEXT') {\n");
                      out.write("                            if (element.id.substring(0,element.id.lastIndexOf('_')) == '");
                      if (_jspx_meth_factory_005fencode_005f2(_jspx_th_mvc_005ffragmentValue_005f10, _jspx_page_context))
                        return;
                      out.write("' + '");
                      out.print( "_" + propertyId);
                      out.write("') {\n");
                      out.write("                                if(element.id == '");
                      if (_jspx_meth_factory_005fencode_005f3(_jspx_th_mvc_005ffragmentValue_005f10, _jspx_page_context))
                        return;
                      out.write("' + '");
                      out.print( "_" + propertyId + "_");
                      out.write("' + selectedOption.value ){\n");
                      out.write("                                    element.style.display= 'inline';\n");
                      out.write("                                } else {\n");
                      out.write("                                    element.style.display= 'none';\n");
                      out.write("                                }\n");
                      out.write("                            }\n");
                      out.write("                        }\n");
                      out.write("                    }\">\n");
                      out.write("              ");

                for (int i = 0; i < locales.length; i++) {
                  Locale locale = locales[i];
              
                      out.write("\n");
                      out.write("                  <option ");
                      out.print( locale.getLanguage().equals(LocaleManager.currentLang()) ? "selected" : "");
                      out.write(" value=\"");
                      out.print(locale);
                      out.write("\">\n");
                      out.write("                    ");
                      out.print(StringUtils.capitalize(locale.getDisplayName(locale)));
                      out.write("\n");
                      out.write("                  </option>\n");
                      out.write("              ");
 } 
                      out.write("\n");
                      out.write("              </select>\n");
                      out.write("        </td>\n");
                      out.write("        ");
                      int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f10.doAfterBody();
                      propertyId = (java.lang.Object) _jspx_page_context.findAttribute("propertyId");
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_mvc_005ffragmentValue_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_mvc_005ffragmentValue_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f10);
                    return;
                  }
                  _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f10);
                  out.write("\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_mvc_005ffragmentValue_005f9.doAfterBody();
                  value = (java.lang.Object) _jspx_page_context.findAttribute("value");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_mvc_005ffragmentValue_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_mvc_005ffragmentValue_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fmvc_005ffragmentValue_0026_005fname_005fid.reuse(_jspx_th_mvc_005ffragmentValue_005f9);
              out.write("\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f9.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f9);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f9);
          out.write("\n");
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_mvc_005ffragment_005f10(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_mvc_005ffragment_005f11(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("    ");
          //  mvc:fragment
          org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f12 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
          _jspx_th_mvc_005ffragment_005f12.setPageContext(_jspx_page_context);
          _jspx_th_mvc_005ffragment_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
          // /components/bam/provider/manager/data_provider_edit_properties.jsp(193,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
          _jspx_th_mvc_005ffragment_005f12.setName("outputButtons");
          int _jspx_eval_mvc_005ffragment_005f12 = _jspx_th_mvc_005ffragment_005f12.doStartTag();
          if (_jspx_eval_mvc_005ffragment_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_mvc_005ffragment_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_mvc_005ffragment_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_mvc_005ffragment_005f12.doInitBody();
            }
            do {
              out.write("\n");
              out.write("        <tr>\n");
              out.write("            <td width=\"100%\" align=\"center\" style=\"padding-top:10px;\">\n");
              out.write("               <input class=\"skn-button\" type=\"button\" value=\"");
              //  i18n:message
              org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f8 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
              _jspx_th_i18n_005fmessage_005f8.setPageContext(_jspx_page_context);
              _jspx_th_i18n_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f12);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(196,62) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_i18n_005fmessage_005f8.setKey(DataProviderHandler.I18N_PREFFIX + "save");
              int _jspx_eval_i18n_005fmessage_005f8 = _jspx_th_i18n_005fmessage_005f8.doStartTag();
              if (_jspx_eval_i18n_005fmessage_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_i18n_005fmessage_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_i18n_005fmessage_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_i18n_005fmessage_005f8.doInitBody();
                }
                do {
                  out.write("!!!Guardar");
                  int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f8.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_i18n_005fmessage_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_i18n_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f8);
                return;
              }
              _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f8);
              out.write("\"\n");
              out.write("                       onclick=\"submitAjaxForm(this.form);\">&nbsp;\n");
              out.write("               <input class=\"skn-button_alt\" type=\"button\" value=\"");
              //  i18n:message
              org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f9 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
              _jspx_th_i18n_005fmessage_005f9.setPageContext(_jspx_page_context);
              _jspx_th_i18n_005fmessage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f12);
              // /components/bam/provider/manager/data_provider_edit_properties.jsp(198,66) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
              _jspx_th_i18n_005fmessage_005f9.setKey(DataProviderHandler.I18N_PREFFIX + "cancel");
              int _jspx_eval_i18n_005fmessage_005f9 = _jspx_th_i18n_005fmessage_005f9.doStartTag();
              if (_jspx_eval_i18n_005fmessage_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_i18n_005fmessage_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_i18n_005fmessage_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_i18n_005fmessage_005f9.doInitBody();
                }
                do {
                  out.write("!!!Cancelar");
                  int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f9.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_i18n_005fmessage_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_i18n_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f9);
                return;
              }
              _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f9);
              out.write("\"\n");
              out.write("                                onclick=\"submitAjaxForm(document.getElementById('");
              if (_jspx_meth_factory_005fencode_005f4(_jspx_th_mvc_005ffragment_005f12, _jspx_page_context))
                return;
              out.write("'))\"/>\n");
              out.write("               <input id=\"");
              if (_jspx_meth_factory_005fencode_005f5(_jspx_th_mvc_005ffragment_005f12, _jspx_page_context))
                return;
              out.write("\" type=\"hidden\" value=\"false\" name=\"");
              if (_jspx_meth_factory_005fbean_005f0(_jspx_th_mvc_005ffragment_005f12, _jspx_page_context))
                return;
              out.write("\">\n");
              out.write("            </td>\n");
              out.write("        </tr>\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f12.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_mvc_005ffragment_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_mvc_005ffragment_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f12);
            return;
          }
          _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f12);
          out.write("\n");
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_mvc_005ffragment_005f13(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_mvc_005ffragment_005f14(_jspx_th_mvc_005fformatter_005f0, _jspx_page_context))
            return;
          out.write('\n');
          int evalDoAfterBody = _jspx_th_mvc_005fformatter_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_mvc_005fformatter_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_mvc_005fformatter_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname.reuse(_jspx_th_mvc_005fformatter_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fmvc_005fformatter_0026_005fname.reuse(_jspx_th_mvc_005fformatter_005f0);
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

  private boolean _jspx_meth_mvc_005ffragment_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f0 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f0.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(35,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f0.setName("outputStart");
    int _jspx_eval_mvc_005ffragment_005f0 = _jspx_th_mvc_005ffragment_005f0.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("      <table border=\"0\" style=\"margin:0px;\" cellspacing=\"0\" width=\"650px\">\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f0);
    return false;
  }

  private boolean _jspx_meth_mvc_005ffragment_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f2 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f2.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(47,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f2.setName("outputFormStart");
    int _jspx_eval_mvc_005ffragment_005f2 = _jspx_th_mvc_005ffragment_005f2.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        <tr>\n");
        out.write("            <td>\n");
        out.write("                <form action=\"");
        if (_jspx_meth_factory_005fformUrl_005f0(_jspx_th_mvc_005ffragment_005f2, _jspx_page_context))
          return true;
        out.write("\" method=\"post\" id=\"");
        if (_jspx_meth_factory_005fencode_005f0(_jspx_th_mvc_005ffragment_005f2, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("                ");
        if (_jspx_meth_factory_005fhandler_005f0(_jspx_th_mvc_005ffragment_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f2);
    return false;
  }

  private boolean _jspx_meth_factory_005fformUrl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:formUrl
    org.jboss.dashboard.ui.taglib.factory.FormURLTag _jspx_th_factory_005fformUrl_005f0 = (org.jboss.dashboard.ui.taglib.factory.FormURLTag) _005fjspx_005ftagPool_005ffactory_005fformUrl_0026_005ffriendly_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.FormURLTag.class);
    _jspx_th_factory_005fformUrl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fformUrl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f2);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(50,30) name = friendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fformUrl_005f0.setFriendly(false);
    int _jspx_eval_factory_005fformUrl_005f0 = _jspx_th_factory_005fformUrl_005f0.doStartTag();
    if (_jspx_th_factory_005fformUrl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fformUrl_0026_005ffriendly_005fnobody.reuse(_jspx_th_factory_005fformUrl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fformUrl_0026_005ffriendly_005fnobody.reuse(_jspx_th_factory_005fformUrl_005f0);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f0 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f2);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(50,85) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f0.setName("editDataProviderPropertiesForm");
    int _jspx_eval_factory_005fencode_005f0 = _jspx_th_factory_005fencode_005f0.doStartTag();
    if (_jspx_th_factory_005fencode_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f0);
    return false;
  }

  private boolean _jspx_meth_factory_005fhandler_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:handler
    org.jboss.dashboard.ui.taglib.factory.HandlerTag _jspx_th_factory_005fhandler_005f0 = (org.jboss.dashboard.ui.taglib.factory.HandlerTag) _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005fbean_005faction_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.HandlerTag.class);
    _jspx_th_factory_005fhandler_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fhandler_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f2);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(51,16) name = bean type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fhandler_005f0.setBean("org.jboss.dashboard.ui.components.DataProviderHandler");
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(51,16) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fhandler_005f0.setAction("storeDataProviderProperties");
    int _jspx_eval_factory_005fhandler_005f0 = _jspx_th_factory_005fhandler_005f0.doStartTag();
    if (_jspx_th_factory_005fhandler_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005fbean_005faction_005fnobody.reuse(_jspx_th_factory_005fhandler_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005fbean_005faction_005fnobody.reuse(_jspx_th_factory_005fhandler_005f0);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f1 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f1.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f10);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(149,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f1.setName("listName");
    int _jspx_eval_factory_005fencode_005f1 = _jspx_th_factory_005fencode_005f1.doStartTag();
    if (_jspx_th_factory_005fencode_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f1);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f2 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f2.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f10);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(161,88) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f2.setName("listName");
    int _jspx_eval_factory_005fencode_005f2 = _jspx_th_factory_005fencode_005f2.doStartTag();
    if (_jspx_th_factory_005fencode_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f2);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragmentValue_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f3 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f3.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragmentValue_005f10);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(162,50) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f3.setName("listName");
    int _jspx_eval_factory_005fencode_005f3 = _jspx_th_factory_005fencode_005f3.doStartTag();
    if (_jspx_th_factory_005fencode_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f3);
    return false;
  }

  private boolean _jspx_meth_mvc_005ffragment_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f10 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f10.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(184,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f10.setName("outputEndRow");
    int _jspx_eval_mvc_005ffragment_005f10 = _jspx_th_mvc_005ffragment_005f10.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f10.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        </tr>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f10);
    return false;
  }

  private boolean _jspx_meth_mvc_005ffragment_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f11 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f11.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(188,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f11.setName("outputEndProperties");
    int _jspx_eval_mvc_005ffragment_005f11 = _jspx_th_mvc_005ffragment_005f11.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f11.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        </table>\n");
        out.write("        </td></tr>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f11);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f4 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f4.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f12);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(199,81) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f4.setName("goToShowPageForm");
    int _jspx_eval_factory_005fencode_005f4 = _jspx_th_factory_005fencode_005f4.doStartTag();
    if (_jspx_th_factory_005fencode_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f4);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f5 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f5.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f12);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(200,26) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f5.setName("editCreateFormSubmitted");
    int _jspx_eval_factory_005fencode_005f5 = _jspx_th_factory_005fencode_005f5.doStartTag();
    if (_jspx_th_factory_005fencode_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f5);
    return false;
  }

  private boolean _jspx_meth_factory_005fbean_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:bean
    org.jboss.dashboard.ui.taglib.factory.BeanTag _jspx_th_factory_005fbean_005f0 = (org.jboss.dashboard.ui.taglib.factory.BeanTag) _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.BeanTag.class);
    _jspx_th_factory_005fbean_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fbean_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f12);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(200,110) name = property type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fbean_005f0.setProperty("saveButtonPressed");
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(200,110) name = bean type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fbean_005f0.setBean("org.jboss.dashboard.ui.components.DataProviderHandler");
    int _jspx_eval_factory_005fbean_005f0 = _jspx_th_factory_005fbean_005f0.doStartTag();
    if (_jspx_th_factory_005fbean_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody.reuse(_jspx_th_factory_005fbean_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fbean_0026_005fproperty_005fbean_005fnobody.reuse(_jspx_th_factory_005fbean_005f0);
    return false;
  }

  private boolean _jspx_meth_mvc_005ffragment_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f13 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f13.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(205,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f13.setName("outputFormEnd");
    int _jspx_eval_mvc_005ffragment_005f13 = _jspx_th_mvc_005ffragment_005f13.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f13.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        </table>\n");
        out.write("        </form>\n");
        out.write("        <form action=\"");
        if (_jspx_meth_factory_005fformUrl_005f1(_jspx_th_mvc_005ffragment_005f13, _jspx_page_context))
          return true;
        out.write("\" method=\"post\" id=\"");
        if (_jspx_meth_factory_005fencode_005f6(_jspx_th_mvc_005ffragment_005f13, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("            ");
        if (_jspx_meth_factory_005fhandler_005f1(_jspx_th_mvc_005ffragment_005f13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </form>\n");
        out.write("        <script defer>\n");
        out.write("            setAjax('");
        if (_jspx_meth_factory_005fencode_005f7(_jspx_th_mvc_005ffragment_005f13, _jspx_page_context))
          return true;
        out.write("');\n");
        out.write("            setAjax('");
        if (_jspx_meth_factory_005fencode_005f8(_jspx_th_mvc_005ffragment_005f13, _jspx_page_context))
          return true;
        out.write("');\n");
        out.write("        </script>\n");
        out.write("         </td>\n");
        out.write("        </tr>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f13);
    return false;
  }

  private boolean _jspx_meth_factory_005fformUrl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:formUrl
    org.jboss.dashboard.ui.taglib.factory.FormURLTag _jspx_th_factory_005fformUrl_005f1 = (org.jboss.dashboard.ui.taglib.factory.FormURLTag) _005fjspx_005ftagPool_005ffactory_005fformUrl_0026_005ffriendly_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.FormURLTag.class);
    _jspx_th_factory_005fformUrl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fformUrl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f13);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(208,22) name = friendly type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fformUrl_005f1.setFriendly(false);
    int _jspx_eval_factory_005fformUrl_005f1 = _jspx_th_factory_005fformUrl_005f1.doStartTag();
    if (_jspx_th_factory_005fformUrl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fformUrl_0026_005ffriendly_005fnobody.reuse(_jspx_th_factory_005fformUrl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fformUrl_0026_005ffriendly_005fnobody.reuse(_jspx_th_factory_005fformUrl_005f1);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f6 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f6.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f13);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(208,77) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f6.setName("goToShowPageForm");
    int _jspx_eval_factory_005fencode_005f6 = _jspx_th_factory_005fencode_005f6.doStartTag();
    if (_jspx_th_factory_005fencode_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f6);
    return false;
  }

  private boolean _jspx_meth_factory_005fhandler_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:handler
    org.jboss.dashboard.ui.taglib.factory.HandlerTag _jspx_th_factory_005fhandler_005f1 = (org.jboss.dashboard.ui.taglib.factory.HandlerTag) _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005fbean_005faction_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.HandlerTag.class);
    _jspx_th_factory_005fhandler_005f1.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fhandler_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f13);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(209,12) name = bean type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fhandler_005f1.setBean("org.jboss.dashboard.ui.components.DataProviderHandler");
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(209,12) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fhandler_005f1.setAction("cancel");
    int _jspx_eval_factory_005fhandler_005f1 = _jspx_th_factory_005fhandler_005f1.doStartTag();
    if (_jspx_th_factory_005fhandler_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005fbean_005faction_005fnobody.reuse(_jspx_th_factory_005fhandler_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fhandler_0026_005fbean_005faction_005fnobody.reuse(_jspx_th_factory_005fhandler_005f1);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f7 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f7.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f13);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(212,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f7.setName("editDataProviderPropertiesForm");
    int _jspx_eval_factory_005fencode_005f7 = _jspx_th_factory_005fencode_005f7.doStartTag();
    if (_jspx_th_factory_005fencode_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f7);
    return false;
  }

  private boolean _jspx_meth_factory_005fencode_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005ffragment_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f8 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f8.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005ffragment_005f13);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(213,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f8.setName("goToShowPageForm");
    int _jspx_eval_factory_005fencode_005f8 = _jspx_th_factory_005fencode_005f8.doStartTag();
    if (_jspx_th_factory_005fencode_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f8);
    return false;
  }

  private boolean _jspx_meth_mvc_005ffragment_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_mvc_005fformatter_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mvc:fragment
    org.jboss.dashboard.ui.taglib.formatter.FragmentTag _jspx_th_mvc_005ffragment_005f14 = (org.jboss.dashboard.ui.taglib.formatter.FragmentTag) _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.get(org.jboss.dashboard.ui.taglib.formatter.FragmentTag.class);
    _jspx_th_mvc_005ffragment_005f14.setPageContext(_jspx_page_context);
    _jspx_th_mvc_005ffragment_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_mvc_005fformatter_005f0);
    // /components/bam/provider/manager/data_provider_edit_properties.jsp(219,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_mvc_005ffragment_005f14.setName("outputEnd");
    int _jspx_eval_mvc_005ffragment_005f14 = _jspx_th_mvc_005ffragment_005f14.doStartTag();
    if (_jspx_eval_mvc_005ffragment_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_mvc_005ffragment_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_mvc_005ffragment_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_mvc_005ffragment_005f14.doInitBody();
      }
      do {
        out.write("\n");
        out.write("      </table>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_mvc_005ffragment_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_mvc_005ffragment_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_mvc_005ffragment_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fmvc_005ffragment_0026_005fname.reuse(_jspx_th_mvc_005ffragment_005f14);
    return false;
  }
}
