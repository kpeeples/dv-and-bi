package org.apache.jsp.components.bam.displayer.range;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.dashboard.LocaleManager;
import java.util.Locale;
import org.jboss.dashboard.domain.Domain;
import org.jboss.dashboard.domain.AbstractDomain;
import org.jboss.dashboard.ui.components.AbstractChartDisplayerEditor;
import org.jboss.dashboard.domain.RangeConfiguration;
import java.util.Iterator;
import org.jboss.dashboard.function.ScalarFunction;
import org.jboss.dashboard.domain.RangeConfigurationParser;
import org.jboss.dashboard.displayer.chart.AbstractChartDisplayer;

public final class range_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.release();
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.release();
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
      // /components/bam/displayer/range/range_details.jsp(33,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setId("bundle");
      // /components/bam/displayer/range/range_details.jsp(33,0) name = baseName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setBaseName("org.jboss.dashboard.displayer.messages");
      // /components/bam/displayer/range/range_details.jsp(33,0) name = locale type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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

    Locale locale = LocaleManager.currentLocale();
    RangeConfiguration rangeConfig = (RangeConfiguration) request.getAttribute("rangeConfig");

      out.write("\n");
      out.write("    <tr>\n");
      out.write("         <td height=\"15\" nowrap=\"nowrap\" align=\"left\" class=\"skn-even_row\">\n");
      out.write("\n");
      out.write("                ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f0 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f0.setParent(null);
      // /components/bam/displayer/range/range_details.jsp(41,16) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f0.setKey( AbstractDomain.I18N_PREFFIX + "description");
      int _jspx_eval_i18n_005fmessage_005f0 = _jspx_th_i18n_005fmessage_005f0.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f0.doInitBody();
        }
        do {
          out.write("!!Descripcion");
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
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td nowrap=\"nowrap\" align=\"left\">\n");
      out.write("            <input class=\"skn-input\" name=\"descripRangeDetails\" type=\"text\" value=\"");
      out.print( rangeConfig.getName(locale) );
      out.write("\">\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("         <td height=\"15\" nowrap=\"nowrap\" align=\"left\"  class=\"skn-even_row\">\n");
      out.write("\n");
      out.write("                ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f1 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f1.setParent(null);
      // /components/bam/displayer/range/range_details.jsp(51,16) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f1.setKey( AbstractDomain.I18N_PREFFIX + "scalarFunction");
      int _jspx_eval_i18n_005fmessage_005f1 = _jspx_th_i18n_005fmessage_005f1.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f1.doInitBody();
        }
        do {
          out.write("!!Funcion escalar a aplicar");
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
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td nowrap=\"nowrap\" align=\"left\">\n");
      out.write("            <select name=\"scalarFunctionCode\" class=\"skn-input\" style=\"width:120px;\">\n");
      out.write("            ");

                Domain rangeDomain = rangeConfig.getRangeProperty().getDomain();
                for (ScalarFunction scalarFunction : rangeDomain.getScalarFunctionsSupported()) {
                    String selected = "";
                    if (scalarFunction.getCode().equals(rangeConfig.getScalarFunctionCode())) selected = "selected";
            
      out.write("\n");
      out.write("                    <option value=\"");
      out.print( scalarFunction.getCode() );
      out.write('"');
      out.write(' ');
      out.print( selected );
      out.write('>');
      out.print( scalarFunction.getName(locale) );
      out.write("</option>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </select>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("         <td height=\"15\" nowrap=\"nowrap\" align=\"left\" class=\"skn-even_row\">\n");
      out.write("\n");
      out.write("                ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f2 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f2.setParent(null);
      // /components/bam/displayer/range/range_details.jsp(72,16) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f2.setKey( AbstractDomain.I18N_PREFFIX + "unit");
      int _jspx_eval_i18n_005fmessage_005f2 = _jspx_th_i18n_005fmessage_005f2.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f2.doInitBody();
        }
        do {
          out.write("!!Unidad");
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
      out.write(":\n");
      out.write("            \n");
      out.write("        </td>\n");
      out.write("        ");

            String unit = rangeConfig.getUnit(locale);
            if (unit == null || unit.trim().equals("") || unit.indexOf(AbstractChartDisplayer.UNIT_VALUE_TAG) == -1) unit = AbstractChartDisplayer.UNIT_VALUE_TAG;
        
      out.write("\n");
      out.write("        <td nowrap=\"nowrap\" align=\"left\">\n");
      out.write("            <input class=\"skn-input\" name=\"unit\" type=\"text\" value=\"");
      out.print( unit );
      out.write("\">\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td align=\"center\" colspan=\"2\" style=\"padding-bottom:10px; padding-top:10px\">\n");
      out.write("            <input type=\"hidden\" name=\"");
      out.print(AbstractChartDisplayerEditor.RANGE_SAVE_BUTTON_PRESSED);
      out.write("\" id=\"");
      if (_jspx_meth_factory_005fencode_005f0(_jspx_page_context))
        return;
      out.write("\" value=\"false\">\n");
      out.write("            <input class= \"skn-button\" type=\"button\" value=\"");
      if (_jspx_meth_i18n_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("\" onclick=\"document.getElementById('");
      if (_jspx_meth_factory_005fencode_005f1(_jspx_page_context))
        return;
      out.write("').value='true'; bam_kpiedit_submitProperties(this.form);\">\n");
      out.write("            <input class= \"skn-button\" type=\"button\" value=\"");
      if (_jspx_meth_i18n_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("\" onclick=\"window.");
      if (_jspx_meth_factory_005fencode_005f2(_jspx_page_context))
        return;
      out.write("(); return false;\">\n");
      out.write("        </td>\n");
      out.write("    </tr>");
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

  private boolean _jspx_meth_factory_005fencode_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f0 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f0.setParent(null);
    // /components/bam/displayer/range/range_details.jsp(85,104) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f0.setName("updateRangeDetails");
    int _jspx_eval_factory_005fencode_005f0 = _jspx_th_factory_005fencode_005f0.doStartTag();
    if (_jspx_th_factory_005fencode_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f0);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f3 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f3.setParent(null);
    // /components/bam/displayer/range/range_details.jsp(86,60) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f3.setKey("dataProviderComponent.save");
    int _jspx_eval_i18n_005fmessage_005f3 = _jspx_th_i18n_005fmessage_005f3.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f3.doInitBody();
      }
      do {
        out.write("!!Guardar");
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
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f3);
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
    // /components/bam/displayer/range/range_details.jsp(86,167) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f1.setName("updateRangeDetails");
    int _jspx_eval_factory_005fencode_005f1 = _jspx_th_factory_005fencode_005f1.doStartTag();
    if (_jspx_th_factory_005fencode_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f1);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f4 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f4.setParent(null);
    // /components/bam/displayer/range/range_details.jsp(87,60) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f4.setKey("dataProviderComponent.cancel");
    int _jspx_eval_i18n_005fmessage_005f4 = _jspx_th_i18n_005fmessage_005f4.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f4.doInitBody();
      }
      do {
        out.write("!!Cancelar");
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
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f4);
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
    // /components/bam/displayer/range/range_details.jsp(87,152) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f2.setName("editRange");
    int _jspx_eval_factory_005fencode_005f2 = _jspx_th_factory_005fencode_005f2.doStartTag();
    if (_jspx_th_factory_005fencode_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f2);
    return false;
  }
}
