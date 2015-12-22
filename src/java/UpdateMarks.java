/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
public class UpdateMarks extends HttpServlet {

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

        String p1 = request.getParameter("p1");
        String name = request.getParameter("name");
        String reg = request.getParameter("reg");
        String p2 = request.getParameter("p2");
        String ass = request.getParameter("a");

        PrintWriter out = response.getWriter();
        if (session == null) {
                out.println("<p>You are not logged in</p>");
             }
            else {

        try {

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection cn = DriverManager.getConnection("jdbc:odbc:amma1");
        PreparedStatement stmt;
        stmt = cn.prepareStatement("insert into marks values(?,?,?,?,?)");
        stmt.setInt(1,Integer.parseInt(p1));
        stmt.setInt(2,Integer.parseInt(p2));
        stmt.setInt(3,Integer.parseInt(ass));
        stmt.setString(4,name);
        stmt.setString(5,reg);
        stmt.executeUpdate();
        out.println("Data has been inserted successfully !!!");

        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control","no-store");
        String newURL = response.encodeURL("Assessment.html");
        out.println("Click <a href=\"" + newURL + "\">here</a> add another student info");
        String newURL1 = response.encodeURL("Exit");
        out.println("Click <a href=\"" + newURL1 + "\">here</a> to exit");
        out.println("</body></html>");
        }
        catch(Exception e) {out.println(e);}
        finally {
            out.close();
        }

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
