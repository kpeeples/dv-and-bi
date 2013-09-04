package org.apache.jsp.components.bam.provider;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.dashboard.factory.Factory;
import org.jboss.dashboard.ui.components.sql.SQLProviderEditor;
import org.jboss.dashboard.database.DataSourceManager;
import java.util.List;
import java.util.ListIterator;
import org.jboss.dashboard.LocaleManager;
import org.jboss.dashboard.provider.sql.SQLDataLoader;
import org.jboss.dashboard.CoreServices;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.StringEscapeUtils;

public final class sql_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fpanel_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fpanel_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.release();
    _005fjspx_005ftagPool_005fpanel_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.release();
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.release();
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
      //  i18n:bundle
      java.util.ResourceBundle bundle = null;
      org.apache.taglibs.i18n.BundleTag _jspx_th_i18n_005fbundle_005f0 = (org.apache.taglibs.i18n.BundleTag) _005fjspx_005ftagPool_005fi18n_005fbundle_0026_005flocale_005fid_005fbaseName_005fnobody.get(org.apache.taglibs.i18n.BundleTag.class);
      _jspx_th_i18n_005fbundle_005f0.setPageContext(_jspx_page_context);
      _jspx_th_i18n_005fbundle_005f0.setParent(null);
      // /components/bam/provider/sql_edit.jsp(32,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setId("bundle");
      // /components/bam/provider/sql_edit.jsp(32,0) name = baseName type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_i18n_005fbundle_005f0.setBaseName("org.jboss.dashboard.ui.components.sql.messages");
      // /components/bam/provider/sql_edit.jsp(32,0) name = locale type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
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
      //  panel:defineObjects
      org.jboss.dashboard.workspace.Section currentSection = null;
      org.jboss.dashboard.workspace.WorkspaceImpl currentWorkspace = null;
      java.lang.String currentPanelId = null;
      org.jboss.dashboard.workspace.Panel currentPanel = null;
      org.jboss.dashboard.workspace.PanelSession panelSession = null;
      org.jboss.dashboard.ui.panel.PanelProvider panelProvider = null;
      org.jboss.dashboard.ui.panel.PanelDriver panelDriver = null;
      java.util.Locale currentLocale = null;
      java.lang.Boolean isAdminMode = null;
      org.jboss.dashboard.ui.taglib.DefineObjectsTag _jspx_th_panel_005fdefineObjects_005f0 = (org.jboss.dashboard.ui.taglib.DefineObjectsTag) _005fjspx_005ftagPool_005fpanel_005fdefineObjects_005fnobody.get(org.jboss.dashboard.ui.taglib.DefineObjectsTag.class);
      _jspx_th_panel_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_panel_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_panel_005fdefineObjects_005f0 = _jspx_th_panel_005fdefineObjects_005f0.doStartTag();
      currentSection = (org.jboss.dashboard.workspace.Section) _jspx_page_context.findAttribute("currentSection");
      currentWorkspace = (org.jboss.dashboard.workspace.WorkspaceImpl) _jspx_page_context.findAttribute("currentWorkspace");
      currentPanelId = (java.lang.String) _jspx_page_context.findAttribute("currentPanelId");
      currentPanel = (org.jboss.dashboard.workspace.Panel) _jspx_page_context.findAttribute("currentPanel");
      panelSession = (org.jboss.dashboard.workspace.PanelSession) _jspx_page_context.findAttribute("panelSession");
      panelProvider = (org.jboss.dashboard.ui.panel.PanelProvider) _jspx_page_context.findAttribute("panelProvider");
      panelDriver = (org.jboss.dashboard.ui.panel.PanelDriver) _jspx_page_context.findAttribute("panelDriver");
      currentLocale = (java.util.Locale) _jspx_page_context.findAttribute("currentLocale");
      isAdminMode = (java.lang.Boolean) _jspx_page_context.findAttribute("isAdminMode");
      if (_jspx_th_panel_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fpanel_005fdefineObjects_005fnobody.reuse(_jspx_th_panel_005fdefineObjects_005f0);
        return;
      }
      currentSection = (org.jboss.dashboard.workspace.Section) _jspx_page_context.findAttribute("currentSection");
      currentWorkspace = (org.jboss.dashboard.workspace.WorkspaceImpl) _jspx_page_context.findAttribute("currentWorkspace");
      currentPanelId = (java.lang.String) _jspx_page_context.findAttribute("currentPanelId");
      currentPanel = (org.jboss.dashboard.workspace.Panel) _jspx_page_context.findAttribute("currentPanel");
      panelSession = (org.jboss.dashboard.workspace.PanelSession) _jspx_page_context.findAttribute("panelSession");
      panelProvider = (org.jboss.dashboard.ui.panel.PanelProvider) _jspx_page_context.findAttribute("panelProvider");
      panelDriver = (org.jboss.dashboard.ui.panel.PanelDriver) _jspx_page_context.findAttribute("panelDriver");
      currentLocale = (java.util.Locale) _jspx_page_context.findAttribute("currentLocale");
      isAdminMode = (java.lang.Boolean) _jspx_page_context.findAttribute("isAdminMode");
      _005fjspx_005ftagPool_005fpanel_005fdefineObjects_005fnobody.reuse(_jspx_th_panel_005fdefineObjects_005f0);
      out.write('\n');

    // Get the data provider from the data provider viewer and save it in the sql provider editor if it's neccessary
    SQLProviderEditor editor = (SQLProviderEditor) Factory.lookup("org.jboss.dashboard.ui.components.SQLProviderEditor");

    // Get the dataSource and the query
    SQLDataLoader sqlLoader = editor.getSQLDataLoader();
    String currentDataSource = sqlLoader.getDataSource();
    String sqlQuery = sqlLoader.getSQLQuery();

      out.write("\n");
      out.write("\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("    <tr>\n");
      out.write("        <td align=\"left\" style=\"padding-left:20px; padding-right:20px;\">\n");
      out.write("            ");
      if (_jspx_meth_i18n_005fmessage_005f0(_jspx_page_context))
        return;
      out.write(": &nbsp;\n");
      out.write("            <select name=\"dataSource\" title=\"");
      out.print( currentDataSource );
      out.write("\" width=\"65px\" class=\"skn-input\">\n");
      out.write("            ");

                DataSourceManager dataSourceManager = CoreServices.lookup().getDataSourceManager();
                List dataSourcesList = dataSourceManager.getDataSourceNames();
                ListIterator dataSourcesListIterator = dataSourcesList.listIterator();
                while (dataSourcesListIterator.hasNext()) {
                    String selected = "";
                    String dataSource = (String) dataSourcesListIterator.next();
                    if (dataSource.equals(currentDataSource)) selected = "selected";
            
      out.write("\n");
      out.write("                    <option title=\"");
      out.print( dataSource );
      out.write("\" value=\"");
      out.print( dataSource );
      out.write('"');
      out.write(' ');
      out.print( selected );
      out.write('>');
      out.print( dataSource );
      out.write("</option>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </select>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td align=\"left\"  style=\"padding-top:8px; padding-bottom:8px;padding-left:20px; padding-right:20px;\">");
      if (_jspx_meth_i18n_005fmessage_005f1(_jspx_page_context))
        return;
      out.write(": <br/>\n");
      out.write("        <textarea name=\"sqlQuery\" rows=\"10\" cols=\"90\" style=\"width:100%;\">");
      out.print( sqlQuery == null ? "" : sqlQuery );
      out.write("</textarea>\n");
      out.write("\n");

    // Check if the result of the test has been correct or not.
    if (editor.isConfiguredOk()) {

      out.write("\n");
      out.write("            <br>\n");
      out.write("            <font color=green>\n");
      out.write("                ");
 if (editor.getElapsedTime() > 0) { 
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_i18n_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("                    ");
      if (_jspx_meth_i18n_005fmessage_005f3(_jspx_page_context))
        return;
      out.write(':');
      out.write(' ');
      out.print(editor.getElapsedTime());
      out.write(" ms\n");
      out.write("                    <br>\n");
      out.write("                    ");
      if (_jspx_meth_i18n_005fmessage_005f4(_jspx_page_context))
        return;
      out.write(':');
      out.write(' ');
      out.print(editor.getNrows());
      out.write("\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </font>\n");

    }

      out.write("\n");
      out.write("        </td>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("        <td align=\"center\">\n");
      out.write("            <label>\n");
      out.write("                <input class=\"skn-button\" type=\"submit\" value=\"");
      if (_jspx_meth_i18n_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("            </label>\n");
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

  private boolean _jspx_meth_i18n_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f0 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f0.setParent(null);
    // /components/bam/provider/sql_edit.jsp(48,12) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f0.setKey("editor.sql.datasourceToUse");
    int _jspx_eval_i18n_005fmessage_005f0 = _jspx_th_i18n_005fmessage_005f0.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f0.doInitBody();
      }
      do {
        out.write("!!!Datasource a utilizar");
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
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f1 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f1.setParent(null);
    // /components/bam/provider/sql_edit.jsp(67,109) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f1.setKey("editor.sql.query");
    int _jspx_eval_i18n_005fmessage_005f1 = _jspx_th_i18n_005fmessage_005f1.doStartTag();
    if (_jspx_th_i18n_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f2 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f2.setParent(null);
    // /components/bam/provider/sql_edit.jsp(77,5) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f2.setKey("editor.sql.dataSetOk");
    int _jspx_eval_i18n_005fmessage_005f2 = _jspx_th_i18n_005fmessage_005f2.doStartTag();
    if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_i18n_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_i18n_005fmessage_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_i18n_005fmessage_005f2.doInitBody();
      }
      do {
        out.write("!!!Conjunto de datos correcto");
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
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey.reuse(_jspx_th_i18n_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f3 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f3.setParent(null);
    // /components/bam/provider/sql_edit.jsp(79,20) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f3.setKey("editor.sql.elapsedTime");
    int _jspx_eval_i18n_005fmessage_005f3 = _jspx_th_i18n_005fmessage_005f3.doStartTag();
    if (_jspx_th_i18n_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f4 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f4.setParent(null);
    // /components/bam/provider/sql_edit.jsp(81,20) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f4.setKey("editor.sql.numberOfResults");
    int _jspx_eval_i18n_005fmessage_005f4 = _jspx_th_i18n_005fmessage_005f4.doStartTag();
    if (_jspx_th_i18n_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f4);
    return false;
  }

  private boolean _jspx_meth_i18n_005fmessage_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  i18n:message
    org.apache.taglibs.i18n.MessageTag _jspx_th_i18n_005fmessage_005f5 = (org.apache.taglibs.i18n.MessageTag) _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.i18n.MessageTag.class);
    _jspx_th_i18n_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_i18n_005fmessage_005f5.setParent(null);
    // /components/bam/provider/sql_edit.jsp(92,63) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_i18n_005fmessage_005f5.setKey("editor.sql.tryButton");
    int _jspx_eval_i18n_005fmessage_005f5 = _jspx_th_i18n_005fmessage_005f5.doStartTag();
    if (_jspx_th_i18n_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fi18n_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_i18n_005fmessage_005f5);
    return false;
  }
}
