/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
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
public class GetSession extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);

        try {
            /*
             * TODO output your page here. You may use following sample code.
             */

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetSession</title>");
            out.println("</head>");
            out.println(" <body  background = \"images/artsfon.com-53139.jpg\">");
            if (session == null) {
                out.println("<p><h1><b>You are not logged in</b></h1></p>");
            }
           
       // Enumeration names = session.getAttributeNames();
       String s = "";
       String n="";
        //  while (names.hasMoreElements()) {
       //  String name = (String) names.nextElement();
      //    Object value = session.getAttribute(name);
          n = session.getAttribute("username").toString();
          s = session.getAttribute("role").toString();
        //  }

       
            if(s.equals("student")){
            out.println("<p>Welcome "+ n +" </p>");
            String newURL = response.encodeURL("events.jsp");
            
            out.println("Click <a href=\"" + newURL + "\">Register for the cultural extravaganza</a> ");
            out.println("</body></html>");
            }
            if(s.equals("admin"))
            {
             out.println("<p align=center>Welcome "+ n +" </p>");
            String newURL = response.encodeURL("https://drive.google.com/folderview?id=0B7QV7ihtzE17YlB4dnlBNE03RHc&usp=sharing");
           out.println("Click to  <a href=\"" + newURL + "\">UPLOAD RESULTS</a> ");
            out.println("</body></html>");
            String new1=response.encodeUrl("index.jsp");
            out.println("Click to  <a href=\"" + new1 + "\">LOGOUT</a> ");
            session.invalidate();
               
           
            
            
            
            
            }          
        

        }
        finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
