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

public class Groupevents extends HttpServlet {

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
         String role = "";
          
        try {

             Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/amritakalotsavam", "postgres", "shiva");
            Statement stmt = conn.createStatement();       
       
       //         String password = request.getParameter("password");
            
            
             out.println("<html>");
            out.println("<head>");
            out.println("<title>Groupevents</title>");
            out.println("</head>");
            out.println("<body>");
            
            String sql="";
            String n1=request.getParameter("firstmember");
            String n2=request.getParameter("secondmember");
            String n3=request.getParameter("thirdmember");
            String n4=request.getParameter("fourthmember");
            String n5=request.getParameter("fifthmember");
                       // out.println("<p>asasd</p>");

            String house=request.getParameter("hnme");
            //String house1=house.toUpperCase();
           //ut.println("hello");
         
               String [] names=request.getParameterValues("c");
                                      
               Random rn = new Random();
               int n = rn.nextInt(100-1) +1;
              
               for(int i=0;i<names.length;i++){
                    if(names[i].equals("s")){
                        
                        sql="insert into groupdance_girls values('"+n1 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
                      
                        sql="insert into groupdance_girls values('"+n2 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
                  

                        sql="insert into groupdance_girls values('"+n3 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
                       


                        sql="insert into groupdance_girls values('"+n4 +"','"+house+"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);

                      
                        sql="insert into groupdance_girls values('"+n5 +"','"+house +"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //("<p>"+n5+"</p>");
                    
                    }
                        if(names[i].equals("g")){
 //("hello");
                        sql="insert into gs values('"+n1 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n1+"</p>");
                        sql="insert into gs values('"+n2 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n2+"</p>");

                        sql="insert into gs values('"+n3 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n3+"</p>");


                        sql="insert into gs values('"+n4 +"','"+house+"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);


                      
                        sql="insert into gs values('"+n5 +"','"+house +"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //("<p>"+n5+"</p>");
                    
                    }
                            if(names[i].equals("t")){
 //("hello");
                        sql="insert into tv values('"+n1 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n1+"</p>");
                        sql="insert into tv values('"+n2 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n2+"</p>");

                        sql="insert into tv values('"+n3 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n3+"</p>");


                        sql="insert into tv values('"+n4 +"','"+house+"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);


                      
                        sql="insert into tv values('"+n5 +"','"+house +"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //("<p>"+n5+"</p>");
                    
                    }
                                if(names[i].equals("gm")){
 //("hello");
                        sql="insert into gm values('"+n1 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n1+"</p>");
                        sql="insert into gm values('"+n2 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n2+"</p>");

                        sql="insert into gm values('"+n3 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n3+"</p>");


                        sql="insert into gm values('"+n4 +"','"+house+"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //

                      
                        sql="insert into gm values('"+n5 +"','"+house +"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //("<p>"+n5+"</p>");
                    
                    }
                        if(names[i].equals("ms")){
 //("hello");
                        sql="insert into ms values('"+n1 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n1+"</p>");
                        sql="insert into ms values('"+n2 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n2+"</p>");

                        sql="insert into ms values('"+n3 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n3+"</p>");


                        sql="insert into ms values('"+n4 +"','"+house+"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //

                      
                        sql="insert into ms values('"+n5 +"','"+house +"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //("<p>"+n5+"</p>");
                    
                    }
                    if(names[i].equals("ng")){
 //("hello");
                        sql="insert into ng values('"+n1 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n1+"</p>");
                        sql="insert into ng values('"+n2 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n2+"</p>");

                        sql="insert into ng values('"+n3 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n3+"</p>");


                        sql="insert into ng values('"+n4 +"','"+house+"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //

                      
                        sql="insert into ng values('"+n5 +"','"+house +"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //("<p>"+n5+"</p>");
                    
                    }
                   if(names[i].equals("cd")){
 //("hello");
                        sql="insert into cd values('"+n1 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n1+"</p>");
                        sql="insert into cd values('"+n2 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n2+"</p>");

                        sql="insert into cd values('"+n3 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n3+"</p>");


                        sql="insert into cd values('"+n4 +"','"+house+"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //

                      
                        sql="insert into cd values('"+n5 +"','"+house +"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //("<p>"+n5+"</p>");
                    
                    }
                      if(names[i].equals("mm")){
 //("hello");
                        sql="insert into mm values('"+n1 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n1+"</p>");
                        sql="insert into mm values('"+n2 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n2+"</p>");

                        sql="insert into mm values('"+n3 +"','"+house +"',"+n +")";
                        stmt.executeUpdate(sql);
 //("<p>"+n3+"</p>");


                        sql="insert into mm values('"+n4 +"','"+house+"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //

                      
                        sql="insert into mm values('"+n5 +"','"+house +"',"+n +")";
                        //stmt.executeUpdate(sql);
                        stmt.executeUpdate(sql);
 //("<p>"+n5+"</p>");
                    
                    }
                        

        }
   //("<p>You have successfully Registered</p>");

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
         String newURL = response.encodeURL("groupevents.jsp");
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
