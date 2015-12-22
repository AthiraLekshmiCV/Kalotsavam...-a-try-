/*as
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.sql.*;

import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
public class ViewMarks extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
        PrintWriter out = response.getWriter();
         String pass = "";
         String username = "";
         int p1 = 0,p2 = 0,a;

     try{
        if (session == null) {
                out.println("<p>You are not logged in</p>");
             }
            else {

         Enumeration names = session.getAttributeNames();
       String s = "";
       String n="";
          while (names.hasMoreElements()) {
             String name = (String) names.nextElement();
              Object value = session.getAttribute(name);
            n = session.getAttribute("username").toString();

          }
         out.println("<h2>"+ n+"Your marks</p>");

try{
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("inside the jdbc method");
            Connection cn = DriverManager.getConnection("jdbc:odbc:amma1");
        PreparedStatement stmt;
        stmt = cn.prepareStatement("Select * from marks where name = ?");
      stmt.setString(1,n);
        ResultSet rs = stmt.executeQuery();
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control","no-store");
      while(rs.next()){
                p1=rs.getInt(1);
                p2= rs.getInt(2);
                a = rs.getInt(3);
        }
    out.println("Periodicals 1 == " + p1 + "<br>" );
    out.println("Periodicals 2 == " + p2 + "<br>" );
    String newURL1 = response.encodeURL("Exit");
        out.println("Click <a href=\"" + newURL1 + "\">here</a> to exit");
           }
catch(Exception e){out.print(e);}
                     out.println("<h4>Have a good Day :-) <br>");
          
            }
        }
finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
