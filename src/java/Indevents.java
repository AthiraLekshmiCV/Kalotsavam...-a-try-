/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.faces.view.Location;
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

public class Indevents extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);
        String pass = "";
         String username = "";
         String role = "";
          
        try {

             Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/amritakalotsavam", "postgres", "shiva");
            Statement stmt = conn.createStatement();       
       
       //         String password = request.getParameter("password");
            
            
             out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetSession</title>");
            out.println("</head>");
            out.println(" <body  background = \"images/artsfon.com-53139.jpg\">");
            
            String sql="";
            String n1=request.getParameter("roll");
           
                       // out.println("<p>asasd</p>");

            String house=request.getParameter("hnme");
            //String house1=house.toUpperCase();
           //ut.println("hello");
        
               String [] names=request.getParameterValues("c");
                                      
               Random rn = new Random();
               int n = rn.nextInt(100-1) +1;
              
               for(int i=0;i<names.length;i++){
                    if(names[i].equals("rc")){
                        out.println("hello");
                        sql="insert into rc values('"+n1 +"','"+house +"')";
                        stmt.executeUpdate(sql);
                        
                    }
                        if(names[i].equals("ec")){
                        out.println("hello");
                        sql="insert into ec values('"+n1 +"','"+house +"')";
                        stmt.executeUpdate(sql);
                        
                    }
                   if(names[i].equals("pd")){
                       
                        sql="insert into tv values('"+n1 +"','"+house +"')";
                        stmt.executeUpdate(sql);
                     
                      
                    }
                    if(names[i].equals("kr")){
                       
                        sql="insert into gm values('"+n1 +"','"+house +"',)";
                        stmt.executeUpdate(sql);
                        
                    }
                        if(names[i].equals("cld")){
                    
                        sql="insert into ms values('"+n1 +"','"+house +"')";
                        stmt.executeUpdate(sql);
                       
                    }
                    if(names[i].equals("sc")){
                        out.println("hello");
                        sql="insert into sc values('"+n1 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
                    
                    
                    }
                   if(names[i].equals("fd")){
                        out.println("hello");
                        sql="insert into fd values('"+n1 +"','"+house +"')";
                        stmt.executeUpdate(sql);
                       
                    }
                    if(names[i].equals("ml")){
                        out.println("hello");
                        sql="insert into ml values('"+n1 +"','"+house +"')";
                        stmt.executeUpdate(sql);
                       
                    }
                
                        

        }
        
  
        if(names.length!=0){
            
            out.println("<p><h1>You have successfully Registered</h1></p>");
            String newURL = response.encodeURL("index.jsp");
            out.println(" <a href=\"" + newURL + "\">LOGOUT");
            out.println("</body></html>");
            session.invalidate();
               
              
               
        }
        else{
             out.println("<p><h1>OOps</h1></p>");
             String newURL = response.encodeURL("Indevents.jsp");
             out.println(" <a href=\"" + newURL + "\">TRY AGAIN");
             out.println("</body></html>");
        
        
        }
        }
    catch(ClassNotFoundException e){out.println(e);} catch (SQLException e) {
        // out.println(e);
         out.println("<p><h1>OOps</h1></p>");
         String newURL = response.encodeURL("Indevents.jsp");
         out.println(" <a href=\"" + newURL + "\">TRY AGAIN");
         out.println("</body></html>");
        
        }catch (NullPointerException e)
    {
        System.out.println("Null!!!");
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
