package org.apache.jsp.components.bam.displayer.domain;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.dashboard.domain.numeric.NumericDomain;
import org.jboss.dashboard.LocaleManager;
import org.jboss.dashboard.domain.DomainConfiguration;
import org.jboss.dashboard.domain.AbstractDomain;

public final class numeric_005fdomain_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.release();
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.release();
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
      //  i18n:bundle
      java.util.ResourceBundle bundle = null;
      org.apache.taglibs.i18n.BundleTag _jspx_th_i18n_005fbundle_005f0 = (org.apache.taglibs.i18n.BundleTag) _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.get(org.apache.taglibs.i18n.BundleTag.class);
      _jspx_th_i18n_005fbundle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fbundle_005f0.setParent(null);
      // /components/bam/displayer/domain/numeric_domain_details.jsp(27,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setId("bundle");
      // /components/bam/displayer/domain/numeric_domain_details.jsp(27,0) name = baseName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setBaseName("org.jboss.dashboard.displayer.messages");
      // /components/bam/displayer/domain/numeric_domain_details.jsp(27,0) name = locale type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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

    DomainConfiguration domainConfig =  (DomainConfiguration) request.getAttribute("domainConfig");

      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td height=\"15\" nowrap=\"nowrap\" align=\"left\" class=\"skn-even_row\">\n");
      out.write("                ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f0 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f0.setParent(null);
      // /components/bam/displayer/domain/numeric_domain_details.jsp(33,16) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f0.setKey( NumericDomain.I18N_PREFFIX + "numericTamInterval");
      int _jspx_eval_i18n_005fmessage_005f0 = _jspx_th_i18n_005fmessage_005f0.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f0.doInitBody();
        }
        do {
          out.write("!!Tamano del intervalo");
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
      out.write("        </td>\n");
      out.write("        <td nowrap=\"nowrap\" align=\"left\">\n");
      out.write("            <select name=\"numericTamInterval\" class=\"skn-input\" style=\"width:120px;\">\n");
      out.write("            ");

                String tamPredefinido = "";
                if (domainConfig.getNumericTamInterval().equals("-1") ) tamPredefinido = "selected";
            
      out.write("\n");
      out.write("                 <option value=\"-1\" ");
      out.print( tamPredefinido );
      out.write(">\n");
      out.write("                    ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f1 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f1.setParent(null);
      // /components/bam/displayer/domain/numeric_domain_details.jsp(42,20) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f1.setKey( AbstractDomain.I18N_PREFFIX + "tamPredefined");
      int _jspx_eval_i18n_005fmessage_005f1 = _jspx_th_i18n_005fmessage_005f1.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f1.doInitBody();
        }
        do {
          out.write("!!!TamaÃ±o predefinido");
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
      out.write("                </option>\n");
      out.write("            ");

                //TODO: Get the description of the intervals from the formatter
                String[] numericIntervals = new String[] {"1/1.000.000.000","1/1.000.000","1/100.000","1/10.000","1/1.000","1/100","1/10",
                        "1","10","100","1.000","10.000","100.000","1.000.000","1.000.000.000"};
                for (int i = 0; i < numericIntervals.length; i++) {
                    String selected = "";
                    if (i == Integer.parseInt(domainConfig.getNumericTamInterval())) selected = "selected";
            
      out.write("\n");
      out.write("                    <option value=\"");
      out.print( i );
      out.write('"');
      out.write(' ');
      out.print( selected );
      out.write(">\n");
      out.write("                        ");
      out.print( numericIntervals[i] );
      out.write("\n");
      out.write("                    </option>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </select>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td height=\"15\" nowrap=\"nowrap\" align=\"left\" class=\"skn-even_row\">\n");
      out.write("                ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f2 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f2.setParent(null);
      // /components/bam/displayer/domain/numeric_domain_details.jsp(63,16) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f2.setKey( NumericDomain.I18N_PREFFIX + "numericMinValue");
      int _jspx_eval_i18n_005fmessage_005f2 = _jspx_th_i18n_005fmessage_005f2.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f2.doInitBody();
        }
        do {
          out.write("!!Valor minimo");
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
      out.write("        </td>\n");
      out.write("        <td nowrap=\"nowrap\" align=\"left\">\n");
      out.write("            ");
 String minValue = domainConfig.getNumericMinValue(); 
      out.write("\n");
      out.write("            <input class=\"skn-input\" name=\"numericMinValue\" type=\"text\" size=\"10\" value=\"");
      out.print( minValue == null || minValue.trim().equals("") ? "" : minValue );
      out.write("\">\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td height=\"15\" nowrap=\"nowrap\" align=\"left\" class=\"skn-even_row\">\n");
      out.write("                ");
      //  i18n:message
      org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f3 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
      _jspx_th_i18n_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fmessage_005f3.setParent(null);
      // /components/bam/displayer/domain/numeric_domain_details.jsp(72,16) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fmessage_005f3.setKey( NumericDomain.I18N_PREFFIX + "numericMaxValue");
      int _jspx_eval_i18n_005fmessage_005f3 = _jspx_th_i18n_005fmessage_005f3.doStartTag();
      if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_i18n_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_i18n_005fmessage_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_i18n_005fmessage_005f3.doInitBody();
        }
        do {
          out.write("!!Valor maximo");
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
      out.write("        </td>\n");
      out.write("        <td nowrap=\"nowrap\" align=\"left\">\n");
      out.write("            ");
 String maxValue = domainConfig.getNumericMaxValue(); 
      out.write("\n");
      out.write("            <input class=\"skn-input\" name=\"numericMaxValue\" type=\"text\" size=\"10\" value=\"");
      out.print( maxValue == null || maxValue.trim().equals("") ? "" : maxValue );
      out.write("\">\n");
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
}
