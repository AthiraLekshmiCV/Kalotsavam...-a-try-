/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */

public class admin extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
         String username = "";
         String role = "";
          
        try {

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/amritakalotsavam", "postgres", "shiva");
            Statement stmt = conn.createStatement();       
       
       //         String password = request.getParameter("password");
                String name = request.getParameter("uname");
         
                String password = request.getParameter("pass");
                HttpSession session = request.getSession(true);
                
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
    catch(Exception e){out.println(e);}
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
