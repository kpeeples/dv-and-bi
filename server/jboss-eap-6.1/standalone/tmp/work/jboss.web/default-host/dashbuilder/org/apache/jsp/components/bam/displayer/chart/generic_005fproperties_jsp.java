package org.apache.jsp.components.bam.displayer.chart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.dashboard.displayer.chart.AbstractChartDisplayer;
import org.jboss.dashboard.ui.components.AbstractChartDisplayerEditor;
import org.jboss.dashboard.LocaleManager;
import java.util.ResourceBundle;
import java.util.Locale;
import org.jboss.dashboard.domain.Domain;
import org.jboss.dashboard.displayer.DataDisplayerRenderer;
import org.jboss.dashboard.displayer.DataDisplayerFeature;

public final class generic_005fproperties_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      //  i18n:bundle
      java.util.ResourceBundle bundle = null;
      org.apache.taglibs.i18n.BundleTag _jspx_th_i18n_005fbundle_005f0 = (org.apache.taglibs.i18n.BundleTag) _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.get(org.apache.taglibs.i18n.BundleTag.class);
      _jspx_th_i18n_005fbundle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fbundle_005f0.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(30,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setId("bundle");
      // /components/bam/displayer/chart/generic_properties.jsp(30,0) name = baseName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setBaseName("org.jboss.dashboard.displayer.messages");
      // /components/bam/displayer/chart/generic_properties.jsp(30,0) name = locale type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
    ResourceBundle i18n = ResourceBundle.getBundle("org.jboss.dashboard.displayer.messages", locale);

    AbstractChartDisplayerEditor editor = (AbstractChartDisplayerEditor) request.getAttribute("editor");
    AbstractChartDisplayer displayer = (AbstractChartDisplayer) editor.getDataDisplayer();
    int intervalsSortCriteria = displayer.getIntervalsSortCriteria();
    int intervalsSortOrder = displayer.getIntervalsSortOrder();
    DataDisplayerRenderer renderer = displayer.getDataDisplayerRenderer();

      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.SHOW_TITLE)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" width=\"33%\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f0 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f0.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(44,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f0.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "showTitle");
      int _jspx_eval_i18n_005fmessage_005f0 = _jspx_th_i18n_005fmessage_005f0.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f0.doInitBody();
        }
        do {
          out.write("!!Mostrar titulo");
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
      out.write("    <td height=\"15\" width=\"66%\" align=\"left\">\n");
      out.write("        ");

            boolean showTitle = false;
            if (displayer.isShowTitle()) showTitle = true;
        
      out.write("\n");
      out.write("        <input name=\"showTitle\" id=\"");
      if (_jspx_meth_factory_005fencode_005f0(_jspx_page_context))
        return;
      out.write("\" type=\"checkbox\" value=\"true\" ");
      out.print(showTitle ? "checked" : "");
      out.write("\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
 } 
      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.ROUND_TO_INTEGER)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f1 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f1.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(60,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f1.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "axisInteger");
      int _jspx_eval_i18n_005fmessage_005f1 = _jspx_th_i18n_005fmessage_005f1.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f1.doInitBody();
        }
        do {
          out.write("!!Valores enteros");
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
      out.write("    <td height=\"15\" width=\"66%\" align=\"left\">\n");
      out.write("        ");

            boolean axisInteger = false;
            if (displayer.isAxisInteger()) axisInteger = true;
        
      out.write("\n");
      out.write("        <input name=\"axisInteger\" id=\"");
      if (_jspx_meth_factory_005fencode_005f1(_jspx_page_context))
        return;
      out.write("\" type=\"checkbox\" value=\"true\" ");
      out.print(axisInteger ? "checked" : "");
      out.write("\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
 } 
      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.SET_CHART_WIDTH)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f2 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f2.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(76,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f2.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "width");
      int _jspx_eval_i18n_005fmessage_005f2 = _jspx_th_i18n_005fmessage_005f2.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f2.doInitBody();
        }
        do {
          out.write("!!Anchura");
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
      out.write("    </td>\n");
      out.write("    <td align=\"left\">\n");
      out.write("        <input class=\"skn-input\" name=\"width\" type=\"text\" size=\"14\" value=\"");
      out.print( displayer.getWidth() );
      out.write("\"\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
 } 
      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.SET_CHART_HEIGHT)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f3 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f3.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(88,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f3.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "height");
      int _jspx_eval_i18n_005fmessage_005f3 = _jspx_th_i18n_005fmessage_005f3.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f3.doInitBody();
        }
        do {
          out.write("!!Altura");
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
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    <td align=\"left\">\n");
      out.write("        <input class=\"skn-input\" name=\"height\" type=\"text\" size=\"14\" value=\"");
      out.print( displayer.getHeight() );
      out.write("\"\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
 } 
      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.SET_FOREGRND_COLOR)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f4 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f4.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f4.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(100,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f4.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "color");
      int _jspx_eval_i18n_005fmessage_005f4 = _jspx_th_i18n_005fmessage_005f4.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f4.doInitBody();
        }
        do {
          out.write("!!Color externo");
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
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    <td  align=\"left\">\n");
      out.write("        <input class=\"skn-input\" name=\"color\" type=\"text\" size=\"14\" value=\"");
      out.print(displayer.getColor());
      out.write("\" onClick=\"startColorPicker(this);\" onkeyup=\"maskedHex(this)\"\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
      out.write("<!-- TODO: Background color hidden. Resolve this bug in the future. \n");
      out.write("<tr>\n");
      out.write("    <td align=\"left\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f5 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f5.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(111,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f5.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "backgroundColor");
      int _jspx_eval_i18n_005fmessage_005f5 = _jspx_th_i18n_005fmessage_005f5.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f5.doInitBody();
        }
        do {
          out.write("!!Color de fondo");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f5);
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    <td>\n");
      out.write("        <input class=\"skn-input\" name=\"backgroundColor\" type=\"text\" onClick=\"startColorPicker(this);\" onkeyup=\"maskedHex(this)\"\n");
      out.write("                size=\"14\" value=\"");
      out.print(displayer.getBackgroundColor());
      out.write("\" onChange=\"submitAjaxForm(this.form);\">\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
      out.write("-->\n");
 } 
      out.write('\n');
      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.SHOW_LEGEND)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" width=\"33%\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f6 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f6.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f6.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(124,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f6.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "showLegend");
      int _jspx_eval_i18n_005fmessage_005f6 = _jspx_th_i18n_005fmessage_005f6.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f6.doInitBody();
        }
        do {
          out.write("!!Show legend");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f6);
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    <td height=\"15\" width=\"66%\" align=\"left\">\n");
      out.write("        ");

            boolean showLegend = false;
            if (displayer.isShowLegend()) showLegend = true;
        
      out.write("\n");
      out.write("        <input name=\"showLegend\" id=\"");
      if (_jspx_meth_factory_005fencode_005f2(_jspx_page_context))
        return;
      out.write("\" type=\"checkbox\" value=\"true\" ");
      out.print(showLegend ? "checked" : "");
      out.write("\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
 } 
      out.write('\n');
      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.SHOW_LEGEND_POSITION)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f7 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f7.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f7.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(141,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f7.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "legendAnchor");
      int _jspx_eval_i18n_005fmessage_005f7 = _jspx_th_i18n_005fmessage_005f7.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f7.doInitBody();
        }
        do {
          out.write("!!Leyenda");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f7);
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    <td align=\"left\">\n");
      out.write("        <select name=\"legendAnchor\" class=\"skn-input\" style=\"width:95px;\"\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("            ");

                String sinLeyenda = "";
                if (!displayer.isShowLegend()) sinLeyenda = "selected";
            
      out.write("\n");
      out.write("             <option value=\"-1\" ");
      out.print( sinLeyenda );
      out.write(">\n");
      out.write("                ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f8 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f8.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f8.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(152,16) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f8.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "legendAnchor." +  "noLegend" );
      int _jspx_eval_i18n_005fmessage_005f8 = _jspx_th_i18n_005fmessage_005f8.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f8.doInitBody();
        }
        do {
          out.write("!!!Sin leyenda");
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
      out.write("\n");
      out.write("            </option>\n");
      out.write("        ");

            String[] legendAnchor = new String[] {"north", "south", "east", "west"};
            String[] legendAnchorDescrip = new String[] {
                    i18n.getString(AbstractChartDisplayerEditor.I18N_PREFFIX + "legendAnchor." + "north"),
                    i18n.getString(AbstractChartDisplayerEditor.I18N_PREFFIX + "legendAnchor." + "south"),
                    i18n.getString(AbstractChartDisplayerEditor.I18N_PREFFIX + "legendAnchor." + "east"),
                    i18n.getString(AbstractChartDisplayerEditor.I18N_PREFFIX + "legendAnchor." + "west")};
            for (int i = 0; i < legendAnchor.length; i++) {
                String selected = "";
                if (displayer.isShowLegend() && legendAnchor[i].equals(displayer.getLegendAnchor())) selected = "selected";
        
      out.write("\n");
      out.write("                <option value=\"");
      out.print( legendAnchor[i] );
      out.write('"');
      out.write(' ');
      out.print( selected );
      out.write('>');
      out.print( legendAnchorDescrip[i] );
      out.write("</option>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        </select>\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
 } 
      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.ALIGN_CHART)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f9 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f9.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f9.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(176,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f9.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "graphicAlign");
      int _jspx_eval_i18n_005fmessage_005f9 = _jspx_th_i18n_005fmessage_005f9.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f9.doInitBody();
        }
        do {
          out.write("!!Alinear grafico a");
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
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    <td align=\"left\">\n");
      out.write("        <select name=\"graphicAlign\" class=\"skn-input\" style=\"width:95px;\"\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("        ");

            String[] graphicAlign = new String[] {"left", "center", "right"};
            String[] graphicAlignDescrip = new String[] {
                    i18n.getString(AbstractChartDisplayerEditor.I18N_PREFFIX + "graphicAlign." + "left"),
                    i18n.getString(AbstractChartDisplayerEditor.I18N_PREFFIX + "graphicAlign." + "center"),
                    i18n.getString(AbstractChartDisplayerEditor.I18N_PREFFIX + "graphicAlign." + "right")};
            for (int i = 0; i < graphicAlign.length; i++) {
                String selected = "";
                if (graphicAlign[i].equals(displayer.getGraphicAlign())) selected = "selected";
        
      out.write("\n");
      out.write("                <option value=\"");
      out.print( graphicAlign[i] );
      out.write('"');
      out.write(' ');
      out.print( selected );
      out.write('>');
      out.print( graphicAlignDescrip[i] );
      out.write("</option>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        </select>\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
 } 
      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.SET_MARGIN_LEFT)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f10 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f10.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f10.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(203,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f10.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "margin_left");
      int _jspx_eval_i18n_005fmessage_005f10 = _jspx_th_i18n_005fmessage_005f10.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f10.doInitBody();
        }
        do {
          out.write("!!Margin Left");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f10);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f10);
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    <td align=\"left\">\n");
      out.write("        <input class=\"skn-input\" name=\"marginLeft\" type=\"text\" size=\"14\" value=\"");
      out.print( displayer.getMarginLeft() );
      out.write("\"\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
 } 
      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.SET_MARGIN_RIGHT)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f11 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f11.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f11.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(215,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f11.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "margin_right");
      int _jspx_eval_i18n_005fmessage_005f11 = _jspx_th_i18n_005fmessage_005f11.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f11.doInitBody();
        }
        do {
          out.write("!!Margin Right");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f11);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f11);
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    <td align=\"left\">\n");
      out.write("        <input class=\"skn-input\" name=\"marginRight\" type=\"text\" size=\"14\" value=\"");
      out.print( displayer.getMarginRight() );
      out.write("\"\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
 } 
      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.SET_MARGIN_TOP)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f12 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f12.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f12.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(227,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f12.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "margin_top");
      int _jspx_eval_i18n_005fmessage_005f12 = _jspx_th_i18n_005fmessage_005f12.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f12.doInitBody();
        }
        do {
          out.write("!!Margin Top");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f12.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f12);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f12);
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    <td align=\"left\">\n");
      out.write("        <input class=\"skn-input\" name=\"marginTop\" type=\"text\" size=\"14\" value=\"");
      out.print( displayer.getMarginTop() );
      out.write("\"\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
 } 
      out.write('\n');
 if (renderer.isFeatureSupported(displayer, DataDisplayerFeature.SET_MARGIN_BOTTOM)) { 
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td height=\"15\" align=\"left\" nowrap=\"nowrap\">\n");
      out.write("        ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f13 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f13.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f13.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(239,8) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f13.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "margin_bottom");
      int _jspx_eval_i18n_005fmessage_005f13 = _jspx_th_i18n_005fmessage_005f13.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f13.doInitBody();
        }
        do {
          out.write("!!Margin Bottom");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f13.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f13);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f13);
      out.write(":\n");
      out.write("    </td>\n");
      out.write("    <td align=\"left\">\n");
      out.write("        <input class=\"skn-input\" name=\"marginBottom\" type=\"text\" size=\"14\" value=\"");
      out.print( displayer.getMarginBottom() );
      out.write("\"\n");
      out.write("          onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("        >\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
 } 
      out.write("\n");
      out.write("<tr>\n");
      out.write("  <td height=\"15\" nowrap=\"nowrap\" align=\"left\" >\n");
      out.write("    ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f14 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f14.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f14.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(250,4) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f14.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "intervalsSortCriteria");
      int _jspx_eval_i18n_005fmessage_005f14 = _jspx_th_i18n_005fmessage_005f14.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f14.doInitBody();
        }
        do {
          out.write("!!Sort intervals by");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f14.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f14);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f14);
      out.write(":\n");
      out.write("  </td>\n");
      out.write("  <td height=\"15\" nowrap=\"nowrap\" align=\"left\">\n");
      out.write("    <select class=\"skn-input\" name=\"intervalsSortCriteria\" style=\"width:95px;\"\n");
      out.write("      onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("    >\n");
      out.write("      <option value=\"");
      out.print( AbstractChartDisplayer.INTERVALS_SORT_CRITERIA_LABEL );
      out.write('"');
      out.write(' ');
      out.print( AbstractChartDisplayer.INTERVALS_SORT_CRITERIA_LABEL == intervalsSortCriteria ? "selected": "" );
      out.write('>');
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f15 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f15.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f15.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(256,184) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f15.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "intervalsSortCriteria.label");
      int _jspx_eval_i18n_005fmessage_005f15 = _jspx_th_i18n_005fmessage_005f15.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f15.doInitBody();
        }
        do {
          out.write("!!Label");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f15.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f15);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f15);
      out.write("</option>\n");
      out.write("      <option value=\"");
      out.print( AbstractChartDisplayer.INTERVALS_SORT_CRITERIA_VALUE );
      out.write('"');
      out.write(' ');
      out.print( AbstractChartDisplayer.INTERVALS_SORT_CRITERIA_VALUE == intervalsSortCriteria ? "selected": "" );
      out.write('>');
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f16 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f16.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f16.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(257,184) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f16.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "intervalsSortCriteria.value");
      int _jspx_eval_i18n_005fmessage_005f16 = _jspx_th_i18n_005fmessage_005f16.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f16.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f16.doInitBody();
        }
        do {
          out.write("!!Value");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f16.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f16 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f16);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f16);
      out.write("</option>\n");
      out.write("    </select>\n");
      out.write("  </td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("  <td height=\"15\" nowrap=\"nowrap\" align=\"left\" >\n");
      out.write("    ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f17 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f17.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f17.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(263,4) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f17.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "intervalsSortOrder");
      int _jspx_eval_i18n_005fmessage_005f17 = _jspx_th_i18n_005fmessage_005f17.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f17.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f17.doInitBody();
        }
        do {
          out.write("!!Sort order");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f17.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f17 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f17);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f17);
      out.write(":\n");
      out.write("  </td>\n");
      out.write("  <td height=\"15\" nowrap=\"nowrap\" align=\"left\">\n");
      out.write("    <select class=\"skn-input\" name=\"intervalsSortOrder\" style=\"width:95px;\"\n");
      out.write("      onChange=\"return bam_kpiedit_submitProperties(this);\"\n");
      out.write("    >\n");
      out.write("      <option value=\"");
      out.print( AbstractChartDisplayer.INTERVALS_SORT_ORDER_NONE );
      out.write('"');
      out.write(' ');
      out.print( AbstractChartDisplayer.INTERVALS_SORT_ORDER_NONE == intervalsSortOrder ? "selected": "" );
      out.write('>');
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f18 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f18.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f18.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(269,173) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f18.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "intervalsSortOrder.none");
      int _jspx_eval_i18n_005fmessage_005f18 = _jspx_th_i18n_005fmessage_005f18.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f18.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f18.doInitBody();
        }
        do {
          out.write("!!None");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f18.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f18 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f18);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f18);
      out.write("</option>\n");
      out.write("      <option value=\"");
      out.print( AbstractChartDisplayer.INTERVALS_SORT_ORDER_ASC );
      out.write('"');
      out.write(' ');
      out.print( AbstractChartDisplayer.INTERVALS_SORT_ORDER_ASC == intervalsSortOrder ? "selected": "" );
      out.write('>');
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f19 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f19.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f19.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(270,171) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f19.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "intervalsSortOrder.ascendant");
      int _jspx_eval_i18n_005fmessage_005f19 = _jspx_th_i18n_005fmessage_005f19.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f19.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f19.doInitBody();
        }
        do {
          out.write("!!Ascendant");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f19.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f19 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f19);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f19);
      out.write("</option>\n");
      out.write("      <option value=\"");
      out.print( AbstractChartDisplayer.INTERVALS_SORT_ORDER_DESC );
      out.write('"');
      out.write(' ');
      out.print( AbstractChartDisplayer.INTERVALS_SORT_ORDER_DESC == intervalsSortOrder ? "selected": "" );
      out.write('>');
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f20 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f20.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f20.setParent(null);
      // /components/bam/displayer/chart/generic_properties.jsp(271,173) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f20.setKey( AbstractChartDisplayerEditor.I18N_PREFFIX + "intervalsSortOrder.descendant");
      int _jspx_eval_i18n_005fmessage_005f20 = _jspx_th_i18n_005fmessage_005f20.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f20.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f20.doInitBody();
        }
        do {
          out.write("!!Descendant");
          int evalDoAfterBody = _jspx_th_i18n_005fmessage_005f20.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_i18n_005fmessage_005f20 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_i18n_005fmessage_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f20);
        return;
      }
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f20);
      out.write("</option>\n");
      out.write("    </select>\n");
      out.write("  </td>\n");
      out.write("</tr>\n");
      out.write("<script defer=\"true\">\n");
      out.write("  // On page load ensure color picker is hidden.\n");
      out.write("\thideColorPicker();\n");
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

  private boolean _jspx_meth_factory_005fencode_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  factory:encode
    org.jboss.dashboard.ui.taglib.factory.EncodeTag _jspx_th_factory_005fencode_005f0 = (org.jboss.dashboard.ui.taglib.factory.EncodeTag) _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.get(org.jboss.dashboard.ui.taglib.factory.EncodeTag.class);
    _jspx_th_factory_005fencode_005f0.setPageContext(_jspx_page_context);
    _jspx_th_factory_005fencode_005f0.setParent(null);
    // /components/bam/displayer/chart/generic_properties.jsp(51,36) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f0.setName("showTitle");
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
    // /components/bam/displayer/chart/generic_properties.jsp(67,38) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f1.setName("axisInteger");
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
    // /components/bam/displayer/chart/generic_properties.jsp(131,37) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_factory_005fencode_005f2.setName("showLegend");
    int _jspx_eval_factory_005fencode_005f2 = _jspx_th_factory_005fencode_005f2.doStartTag();
    if (_jspx_th_factory_005fencode_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffactory_005fencode_0026_005fname_005fnobody.reuse(_jspx_th_factory_005fencode_005f2);
    return false;
  }
}
