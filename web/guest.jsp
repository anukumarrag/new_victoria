<%-- 
    Document   : guest
    Created on : Feb 9, 2015, 1:11:56 PM
    Author     : Developer
--%>

<%@page import="java.util.Iterator"%>
<%@page import="bill.Check"%>
<%@page import="java.util.List"%>
<%@page import="hotel.Guest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guest Page</title>
    </head>
    <body>
       <% 
                     int min=Integer.parseInt(request.getParameter("min"));
                     int max=Integer.parseInt(request.getParameter("max"));
                     List list=Check.getDetails(min,max);
                        
                       //out.println(list);
                 %>
        
             <h1>Show Guest Details</h1>
            <table border="1">
                <tr><th>Mobile</th><th>Name</th><th>Address</th><th>Email</th><th>Date</th><th>Date</th><th>Amount</th></tr>
            <%
              
             Iterator itr=list.iterator();
             while(itr.hasNext())
             {
               Guest guest=(Guest)itr.next();
               
                 %>
            
              <tr><td><%=guest.getMobile()%></td>
                <td><%=guest.getName()%></td>
                <td><%=guest.getAddress()%></td>
                <td><%=guest.getEmail()%></td>
                <td><%=guest.getDoa()%></td>
                <td><%=guest.getDob()%></td>
                <td><%=guest.getAmount()%></td></tr>
                 
            <% }
           %>
        </table>
    </body>
</html>
