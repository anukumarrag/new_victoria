<%@page import="setting.Database"%>
<%
if(request.getParameterMap().containsKey("id")){
    int status=0;
    if(null!=session && session.getAttribute("mobile")!=null)
    {
        status=Database.doAdmincheckout(request.getParameter("id"));
        if(status==1){
            response.sendRedirect("./action");
        }
        else{
            response.sendRedirect("./error");
                    
        }
        
    }
}

%>