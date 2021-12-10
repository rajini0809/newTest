package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class course_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sj_head_jqueryui_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sjg_gridColumn_title_sortable_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_id_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sjg_grid_rownumbers_rowNum_rowList_pager_id_href_gridModel_dataType_caption;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sj_head_jqueryui_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sjg_gridColumn_title_sortable_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_id_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sjg_grid_rownumbers_rowNum_rowList_pager_id_href_gridModel_dataType_caption = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sj_head_jqueryui_nobody.release();
    _jspx_tagPool_sjg_gridColumn_title_sortable_name_nobody.release();
    _jspx_tagPool_s_url_id_action_nobody.release();
    _jspx_tagPool_sjg_grid_rownumbers_rowNum_rowList_pager_id_href_gridModel_dataType_caption.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>course Page</title>\n");
      out.write("        ");
      if (_jspx_meth_sj_head_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_sjg_grid_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sj_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sj:head
    com.jgeppert.struts2.jquery.views.jsp.ui.HeadTag _jspx_th_sj_head_0 = (com.jgeppert.struts2.jquery.views.jsp.ui.HeadTag) _jspx_tagPool_sj_head_jqueryui_nobody.get(com.jgeppert.struts2.jquery.views.jsp.ui.HeadTag.class);
    _jspx_th_sj_head_0.setPageContext(_jspx_page_context);
    _jspx_th_sj_head_0.setParent(null);
    _jspx_th_sj_head_0.setJqueryui("true");
    int _jspx_eval_sj_head_0 = _jspx_th_sj_head_0.doStartTag();
    if (_jspx_th_sj_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sj_head_jqueryui_nobody.reuse(_jspx_th_sj_head_0);
      return true;
    }
    _jspx_tagPool_sj_head_jqueryui_nobody.reuse(_jspx_th_sj_head_0);
    return false;
  }

  private boolean _jspx_meth_s_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_url_0 = (org.apache.struts2.views.jsp.URLTag) _jspx_tagPool_s_url_id_action_nobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent(null);
    _jspx_th_s_url_0.setId("hello");
    _jspx_th_s_url_0.setAction("abc");
    int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
    if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_0);
      return true;
    }
    _jspx_tagPool_s_url_id_action_nobody.reuse(_jspx_th_s_url_0);
    return false;
  }

  private boolean _jspx_meth_sjg_grid_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sjg:grid
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridTag _jspx_th_sjg_grid_0 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridTag) _jspx_tagPool_sjg_grid_rownumbers_rowNum_rowList_pager_id_href_gridModel_dataType_caption.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridTag.class);
    _jspx_th_sjg_grid_0.setPageContext(_jspx_page_context);
    _jspx_th_sjg_grid_0.setParent(null);
    _jspx_th_sjg_grid_0.setId("gridtable");
    _jspx_th_sjg_grid_0.setCaption("Courses");
    _jspx_th_sjg_grid_0.setDataType("json");
    _jspx_th_sjg_grid_0.setHref("%{hello}");
    _jspx_th_sjg_grid_0.setPager("true");
    _jspx_th_sjg_grid_0.setGridModel("courseList");
    _jspx_th_sjg_grid_0.setRowList("10,15,20");
    _jspx_th_sjg_grid_0.setRowNum("15");
    _jspx_th_sjg_grid_0.setRownumbers("true");
    int _jspx_eval_sjg_grid_0 = _jspx_th_sjg_grid_0.doStartTag();
    if (_jspx_eval_sjg_grid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sjg_grid_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sjg_grid_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sjg_grid_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_sjg_gridColumn_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sjg_grid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_sjg_gridColumn_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sjg_grid_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            \n");
        out.write("           \n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_sjg_grid_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sjg_grid_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sjg_grid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sjg_grid_rownumbers_rowNum_rowList_pager_id_href_gridModel_dataType_caption.reuse(_jspx_th_sjg_grid_0);
      return true;
    }
    _jspx_tagPool_sjg_grid_rownumbers_rowNum_rowList_pager_id_href_gridModel_dataType_caption.reuse(_jspx_th_sjg_grid_0);
    return false;
  }

  private boolean _jspx_meth_sjg_gridColumn_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_grid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_gridColumn_0 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _jspx_tagPool_sjg_gridColumn_title_sortable_name_nobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_gridColumn_0.setPageContext(_jspx_page_context);
    _jspx_th_sjg_gridColumn_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_grid_0);
    _jspx_th_sjg_gridColumn_0.setName("id");
    _jspx_th_sjg_gridColumn_0.setTitle("id");
    _jspx_th_sjg_gridColumn_0.setSortable("false");
    int _jspx_eval_sjg_gridColumn_0 = _jspx_th_sjg_gridColumn_0.doStartTag();
    if (_jspx_th_sjg_gridColumn_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sjg_gridColumn_title_sortable_name_nobody.reuse(_jspx_th_sjg_gridColumn_0);
      return true;
    }
    _jspx_tagPool_sjg_gridColumn_title_sortable_name_nobody.reuse(_jspx_th_sjg_gridColumn_0);
    return false;
  }

  private boolean _jspx_meth_sjg_gridColumn_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sjg_grid_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sjg:gridColumn
    com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag _jspx_th_sjg_gridColumn_1 = (com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag) _jspx_tagPool_sjg_gridColumn_title_sortable_name_nobody.get(com.jgeppert.struts2.jquery.grid.views.jsp.ui.GridColumnTag.class);
    _jspx_th_sjg_gridColumn_1.setPageContext(_jspx_page_context);
    _jspx_th_sjg_gridColumn_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sjg_grid_0);
    _jspx_th_sjg_gridColumn_1.setName("ccourse");
    _jspx_th_sjg_gridColumn_1.setTitle("course");
    _jspx_th_sjg_gridColumn_1.setSortable("false");
    int _jspx_eval_sjg_gridColumn_1 = _jspx_th_sjg_gridColumn_1.doStartTag();
    if (_jspx_th_sjg_gridColumn_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sjg_gridColumn_title_sortable_name_nobody.reuse(_jspx_th_sjg_gridColumn_1);
      return true;
    }
    _jspx_tagPool_sjg_gridColumn_title_sortable_name_nobody.reuse(_jspx_th_sjg_gridColumn_1);
    return false;
  }
}
