  <%
         if(null!=session.getAttribute("username")){
         %>
         
         
         <a id="menu-toggle" href="#" class="btn btn-dark btn-lg toggle"><i class="fa fa-bars"></i></a>
    <nav id="sidebar-wrapper">
        <ul class="sidebar-nav">
            <a id="menu-close" href="#" class="btn btn-light btn-lg pull-right toggle"><i class="fa fa-times"></i></a>
        
            
            <li class="sidebar-brand">
                <a href="./home">Home</a>
            </li>
             <li><a href="./allguest.jsp">All Guest</a></li>
            <li><a href="./totalbill.jsp">Bill Details</a></li>
            <li><a href="./searchAddress.jsp">Search</a></li>
<!--            <li class="divider"></li>-->
            <li><a href="#">Change password</a></li>
            
            <%
                  }
         else{
             
        
            %>
         
            
            <%
         
                }
            %>
        </ul>
    </nav>