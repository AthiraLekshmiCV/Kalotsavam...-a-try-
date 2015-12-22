package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;
import java.io.PrintWriter;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("     <html>\n");
      out.write("<head>\n");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/1.css\"/>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("html\n");
      out.write("{\n");
      out.write("background-image: url('images/music-wallpaper22.jpg'); \n");
      out.write("background-repeat: no-repeat; \n");
      out.write("background-size:100%;\n");
      out.write("}\n");
      out.write("#logout{\n");
      out.write("\tfloat:right;\n");
      out.write("\tbackground-image:url('images/music-wallpaper22.jpg');\n");
      out.write("\tborder:none;\n");
      out.write("\tfont-size:30px;\n");
      out.write("\tcursor:pointer;\n");
      out.write("\tcolor:white;\n");
      out.write("\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>HTML Form</title>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function validateForm()\n");
      out.write("{\n");
      out.write("var uname=document.login.user.value;\n");
      out.write("var uname=user.trim();\n");
      out.write("\n");
      out.write("var pass=document.login.pass.value;\n");
      out.write("if(uname == '')\n");
      out.write("{\n");
      out.write("alert (\"Login was unsuccessful, \n");
      out.write("\n");
      out.write("please check your username and password\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if(pass == '')\n");
      out.write("{\n");
      out.write("alert \n");
      out.write("(\"Login was unsuccessful, please check your username and password\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<input id=\"logout\" type=\"button\" value=\"Logout\" onClick=\"location.href='index.jsp'\">\n");
      out.write("<table cellpadding=\"10\" width=\"700\">\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<caption align=\"Top\">\n");
      out.write("<h1 style=\"color:black\">ADMIN LOGIN</h1>\n");
      out.write("</caption>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form method=\"post\" name=\"applform\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<td><font size=\"5\">Username:</font></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("<td><input type=\"text\" name=\"uname\" size=\"30\" maxlength=\"30\" placeholder=\"Enter Your username\" maxlength=\"16\" \n");
      out.write(" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<td><font size=\"5\">Password:</font></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("<td><input type=\"password\" name=\"pass\" size=\"30\" placeholder=\"Password\"  required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>&nbsp;</td>\n");
      out.write("<td><input type=\"submit\" \n");
      out.write("value=\"Submit\" onSubmit=\"validateForm();\">\n");
      out.write("<input type=\"reset\" value=\"Reset\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</form>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");

     response.setContentType("text/html;charset=UTF-8");
        
        
         String username = "";
         String role = "";
          
        try {

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/amritakalotsavam", "postgres", "shiva");
            Statement stmt = conn.createStatement();       
       
       //         String password = request.getParameter("password");
                String name = request.getParameter("uname");
         
                String password = request.getParameter("pass");
                //HttpSession session = request.getSession(true);
                
               String selectUser = "select name from admin where name = '" + name +"'";
              
               PreparedStatement ps = conn.prepareStatement(selectUser);
                

                
                ResultSet rs=ps.executeQuery();
             
               
              while(rs.next()){
                    username=rs.getString(1);
              }
                    
                 role="admin";   
                session.setAttribute("username", username);
                session.setAttribute("pass", password);
                session.setAttribute("role", role);

               

            if(username.equals(name) && password.equals("amrita@123"))
                {
                    RequestDispatcher view1=request.getRequestDispatcher("GetSession");
                    view1.forward(request,response);
                }
            
         else

             {
            RequestDispatcher view1=request.getRequestDispatcher("FailurePage");
            view1.forward(request,response);
               
            }
        }
            catch(Exception e){}

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
