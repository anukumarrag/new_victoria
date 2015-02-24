/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hotel.Guest;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import setting.Database;
import sms.SendSms;

/**
 *
 * @author anurag
 */
public class Processing extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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
        try {
         String action =request.getParameter("action");
         HttpSession ses=request.getSession();
         if(action!=null && action.isEmpty()==false){
             switch(action){
                 case "search":
                 {
                     String mobile=request.getParameter("mobile");
                      ses.setAttribute("mobile", mobile);
                     
                      int isNew=new Database().isGuestexist( mobile);
                     if(isNew==0){
                         RequestDispatcher rd = request.getRequestDispatcher("newguest");
                         rd.include(request, response);
                       // response.sendRedirect("newguest");
                     }
                     else{
                         if(isNew>0){
                           RequestDispatcher rd = request.getRequestDispatcher("action");
                           rd.include(request, response);
                           ses.setAttribute("guest", Database.getGuest(mobile));
                         }
                         else
                              response.sendRedirect("error");
                     }
                    
                 }
                  break; 
                 
                 
                  case "newguest":{
                      String name=request.getParameter("name");
                      String mobile=request.getParameter("mobile");
                       String address=request.getParameter("address");
                        String email=request.getParameter("email");
                         String dob=request.getParameter("dob");
                          String doa=request.getParameter("doa");
                            ses.setAttribute("mobile", mobile);
                           
                        try{ Database d=new Database();
                        int status= d.newGuest(name,mobile,address,email,dob,doa);
                        if(status==0){
                             RequestDispatcher rd=request.getRequestDispatcher("error");
                            rd.include(request, response);
                        }
                        else{
                             ses.setAttribute("guest", Database.getGuest(mobile));
                            RequestDispatcher rd=request.getRequestDispatcher("action");
                            rd.include(request, response);
                        }
                         
                        }
                        catch(IOException | ServletException e){
                            e.printStackTrace();
                        }
                  }
                     break; 
                 
                
                 case "checkin":
                 {
                     String mobile=request.getParameter("mobile");
                      ses.setAttribute("mobile", mobile);
                      Guest guest=(Guest)ses.getAttribute("guest");
                      try{ Database d=new Database();
                        int status= d.checkIN(mobile);
                        if(status==0){
                             RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
                             rd.include(request, response);
                        }
                        else{
                            if(status==2){
                            // it is while the guest have already checkin or miss to check out previous guest
                              RequestDispatcher rd=request.getRequestDispatcher("notice.jsp");
                             rd.include(request, response);   
                                
                            }
                            else{
                            RequestDispatcher rd=request.getRequestDispatcher("./welcome?msg=Thanks For Check In ");
                            rd.include(request, response);
                             SendSms.sendSmsCheckin(guest.getMobile(), guest.getName());
                            }
                        }
                         
                        }
                        catch(IOException | ServletException e){
                            e.printStackTrace();
                        } 
                     
                     
                     
                 }
                     break; 
                     
                 case "checkout":
                 {
                      Guest guest=(Guest)ses.getAttribute("guest");
                    int status=Database.doCheckout(guest.getMobile()); 
                     if(status==1){
                         RequestDispatcher rd=request.getRequestDispatcher("./welcome?msg=Thanks For staying !!");
                         rd.include(request, response);
                         SendSms.sendSmsCheckout(guest.getMobile(), guest.getName());
                     }
                     else{
                          RequestDispatcher rd=request.getRequestDispatcher("./error");
                           rd.include(request, response);
                     }
                 }
                     break; 
                     
                case "bill":
                 {
                    Guest guest=(Guest)ses.getAttribute("guest");
                    String amount=request.getParameter("amount");
                    String description=request.getParameter("description");
                    int status=Database.insertBill(guest.getMobile(),amount,description); 
                     if(status==1){
                         RequestDispatcher rd=request.getRequestDispatcher("./welcome?msg=Bill has submitted !!");
                         rd.include(request, response);
                        // SendSms.sendSmsbill(guest.getMobile(), guest.getName(),amount);
                     }
                     else{
                          RequestDispatcher rd=request.getRequestDispatcher("./error");
                           rd.include(request, response);
                     }
                 }
                     break;
                    
                 default:
                    response.sendRedirect("./error");
             }
            // out.print(" valid action ");
         }
         else{
            response.sendRedirect("home");
         }
            
        }
        catch(IOException | SQLException | ServletException ee){
            out.print(ee);
            ee.printStackTrace();
    }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
