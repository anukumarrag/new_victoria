<%-- 
    Document   : CheckDate
    Created on : Feb 9, 2015, 5:59:25 PM
    Author     : Developer
--%>

<%@page import="hotel.Guest"%>
<%@page import="java.util.Iterator"%>
<%@page import="bill.Check"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <style>
            table, td, th {
            border: 1px solid black;
            }

            table {
            width: 100%;
          }

             th {
    text-align: center;
     }
     td{
         text-align: center;
     }
     h1{
         text-align: center;
     }
     h3{
         text-align: center;
         color: #0044cc;
         font-family: Times New Roman;
     }
            
        </style>
    </head>
    <body>
        <% 
                      String s=request.getParameter("date1");
                       String s1=request.getParameter("date2");
                       if(s==null || s.trim().equals("")|| s1==null || s1.trim().equals("")){
                      out.print("Please enter Your Date");
                        }else{
                    try{ 
                        //String search1=request.getParameter("val");
                    
                     String date1=request.getParameter("date1");
                     String date2=request.getParameter("date2");
                     List list=Check.getDate(date1,date2);
                        
                     //out.println(list);
                      if(list.size()==0)
                      {
                          out.println("Record Not Found");
                      }
                      else{
                 %>
        
             <h3>Result From(
             <%=date1%>   To     <%=date2%>)</h3>
            <div class="container">       
             <table class="table table-hover">
             <thead>
                 <tr><th>Mobile</th><th>Name</th><th>Address</th><th>Email</th><th>DOCI</th><th>DOB</th></tr></thead>
            <%
              
             Iterator itr=list.iterator();
             while(itr.hasNext())
             {
               Guest guest=(Guest)itr.next();
               
                 %>
            
             <tbody><tr><td><%=guest.getMobile()%></td>
                <td><%=guest.getName()%></td>
                <td><%=guest.getAddress()%></td>
                <td><%=guest.getEmail()%></td>
                <td><%=guest.getDoci()%></td>
                <td><%=guest.getDob()%></td></tr>
                 
           <% }%><%}%>
           <%}
                    catch(Exception e)
                    {
                        out.println("Connection Problem...."+e);
                    }
                       }
           %>
             </tbody> </table></div>
    </body>
</html>
