package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class groupevents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("//window.alert(\"Only 5 members in a group\");\n");
      out.write("\n");
      out.write("function checkboxlimit(checkgroup, limit){\n");
      out.write("var checkgroup=checkgroup;\n");
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
      out.write("        \n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("p{\n");
      out.write("position: fixed;\n");
      out.write("    bottom: 400px;\n");
      out.write("    right: 350px;\n");
      out.write("}\n");
      out.write("div{\n");
      out.write("\n");
      out.write("position: fixed;\n");
      out.write("    bottom: 50px;\n");
      out.write("    right: 450px;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    }\n");
      out.write(" \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body background = \"images/dance1.jpg\">\n");
      out.write("\n");
      out.write("<h1 style=\"color:red\" align =\"center\">Kalothsavam Group Events</h1>\n");
      out.write("<div  name=\"one\" align=\"left|right|center|justify\">\n");
      out.write("\n");
      out.write("<form id=\"world\" name=\"world\" action=\"Groupevents\" method=\"get\">\n");
      out.write("<input type=\"checkbox\" name=\"c\" id=\"c1\"/>Semi classical dance <br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" id=\"c2\"/> Group Song<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\"  id=\"c3\" /> Thiruvathira<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" id=\"c4\" /> Drama<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" id=\"c5\" /> Ganamela<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" id=\"c6\" />Movie spoof<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" id=\"c7\" /> Nostalgia<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" id=\"c8\" /> Classical dance<br />\n");
      out.write("<input type=\"checkbox\" name=\"c\" id=\"c9\" />Mime<br />\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("checkboxlimit(document.forms.world.c, 4)\n");
      out.write("</script>\n");
      out.write("  First member:<br>\n");
      out.write("  <input type=\"text\" name=\"firstmember\" id=\"as\" >\n");
      out.write("  <br>\n");
      out.write("   Second member:<br>\n");
      out.write("  <input type=\"text\" name=\"secondmember\" >\n");
      out.write("  <br>\n");
      out.write("   Third member:<br>\n");
      out.write("  <input type=\"text\" name=\"thirdmember\" >\n");
      out.write("  <br>\n");
      out.write("   Fourth member:<br>\n");
      out.write("  <input type=\"text\" name=\"fourthmember\" >\n");
      out.write("  <br>\n");
      out.write(" Fifth member:<br>\n");
      out.write("  <input type=\"text\" name=\"fifthmember\" >\n");
      out.write("  <br><br>\n");
      out.write(" \n");
      out.write("  <input type=\"submit\" value=\"Submit\" >\n");
      out.write("    <button class=\"float-left submit-button\" >Home</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("<p name=\"Enter your house name\">\n");
      out.write("<select name=\"hnme\">\n");
      out.write("  <option value=\"Amritamayi\">AMRITAMAYI</option>\n");
      out.write("  <option value=\"Anandamayi\">ANANDAMAYI</option>\n");
      out.write("  <option value=\"Chinmayi\">CHINMAYI</option>\n");
      out.write("  <option value=\"Jyothirmayi\">JYOTHIRMAYI</option>\n");
      out.write("</select>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</p>\n");
      out.write("</body>\n");
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
}
