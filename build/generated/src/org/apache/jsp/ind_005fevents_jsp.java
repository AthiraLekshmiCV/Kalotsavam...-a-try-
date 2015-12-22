package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ind_005fevents_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write(" \n");
      out.write("        \n");
      out.write(" <html>\n");
      out.write(" <head>\n");
      out.write("    <title></title>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("function checkboxlimit(checkgroup, limit){\n");
      out.write("\tvar checkgroup=checkgroup;\n");
      out.write("\tvar limit=limit;\n");
      out.write("\tfor (var i=0; i<checkgroup.length; i++){\n");
      out.write("\t\tcheckgroup[i].onclick=function(){\n");
      out.write("\t\tvar checkedcount=0;\n");
      out.write("\t\tfor (var i=0; i<checkgroup.length; i++)\n");
      out.write("\t\t\tcheckedcount+=(checkgroup[i].checked)? 1 : 0;\n");
      out.write("\t\tif (checkedcount>limit){\n");
      out.write("\t\t\talert(\"You can only select a maximum of \"+limit+\" individual events\");\n");
      out.write("\t\t\tthis.checked=false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t};\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("    p{\n");
      out.write("position: fixed;\n");
      out.write("    bottom: 400px;\n");
      out.write("    right: 350px;\n");
      out.write("}\n");
      out.write("div{\n");
      out.write("\n");
      out.write("position: fixed;\n");
      out.write("    bottom: 170px;\n");
      out.write("    right: 450px;\n");
      out.write("}\n");
      out.write("#pp{\n");
      out.write("    \n");
      out.write("    right:100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("  </head>\n");
      out.write("  <body  background = \"images/artsfon.com-53139.jpg\">\n");
      out.write("    <form id=\"world\" name=\"world\" action=\"Indevents\">\n");
      out.write("\n");
      out.write("<h1 style=\"color:red\" align =\"center\">Kalothsavam Individual Events</h1>\n");
      out.write("<div align=\"left|right|center|justify\">\n");
      out.write("Enter your roll number:<br>\n");
      out.write("  <input type=\"text\" name=\"roll\" >\n");
      out.write("  <br>\n");
      out.write("<input type=\"checkbox\" name=\"c\" value=\"s\"/>Recitation <br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" value=\"gs\" /> Elocution<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\"  value=\"tv\"/> Pencil Drawing<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" value=\"dr\"/>Karoke<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" value=\"gm\"/> Classical dance<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" value=\"ms\"/>Semi Classical<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" value=\"ng\"/> fancy dress<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" value=\"cd\"/> Monologue<br />\n");
      out.write("<input type=\"submit\" value=\"Submit\" ><br>\n");
      out.write("\n");
      out.write("<button class=\"float-left submit-button\" >Home</button>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("checkboxlimit(document.forms.world.c, 5)\n");
      out.write("</script>\n");
      out.write("</div>\n");
      out.write("<p name=\"name\" id=\"pp\" >\n");
      out.write("<select name=\"House Name\">\n");
      out.write("  <option value=\"AMRITAMAYI\">Amritamayi</option>\n");
      out.write("  <option value=\"ANANADAMAYI\">Anandamayi</option>\n");
      out.write("  <option value=\"CHINMAYI\">Chinmayi</option>\n");
      out.write("  <option value=\"JYOTHIRMAYI\">Jyothirmayi</option>\n");
      out.write("</select>\n");
      out.write("</p>\n");
      out.write("    </form>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
}
