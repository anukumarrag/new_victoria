
<%@page import="hotel.Guest"%>
<%@page import="java.util.Iterator"%>
<%@page import="bill.Check"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
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
            
        </style>
    </head>
    <body>
        <%       
                String s=request.getParameter("val");
                if(s==null || s.trim().equals("")){
                out.print("Please enter Your Address");
                }else{
                //String search=request.getParameter("search");
               // out.print(id);
                    try{ 
                     String search1=request.getParameter("val");
                     //out.println(search1);
                     String search=search1.replaceAll("\\s+ ", "");
                     List list=Check.getSearch(search);
                        
//                      out.println(list);
                      if(list.size()==0)
                      {
                          out.println("Record Not Found");
                      }
                      else{
                 %>
        
             <h1>Show Search Record</h1>
             <div class="container">       
             <table class="table table-hover">
             <thead>
             <tr>
             <tr><th>Mobile</th><th>Name</th><th>Address</th><th>Email</th><th>DOA</th><th>DOB</th></tr></thead>
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
                <td><%=guest.getDoa()%></td>
                <td><%=guest.getDob()%></td></tr>
                 
              <% }%><%}%>
              <%}
                    catch(Exception e)
                    {
                        out.println("Connection Problem...."+e);
                    }}
           %>
              </tbody> </table></div>
    </body>
</html>
