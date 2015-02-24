<%@page import="hotel.Guest"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Victoria club Hotel</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/stylish-portfolio.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
     
    
</head>

<body>

    <!-- Navigation -->
    <%@include file="menu.jsp" %>
<%
        Guest guest=(Guest)session.getAttribute("guest");
        if(guest==null)
            response.sendRedirect("home");
        %>
    <!-- Header -->
    <header id="top" class="header">
        
        
        <div class="text-vertical-center">
<!--            <h2>Victoria Club Hotel</h2>-->

<!--            <h3>Free Bootstrap Themes &amp; Templates</h3>
            <br>-->
            <!--<a href="#about" class="btn btn-dark btn-lg">Find Out More</a> --> 
	
            <div class="container">    
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Bill Submit</div>
                        <!--<div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div>-->
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >

                         <div style="display: inline; font-size: large; padding: 4px;" class="alert alert-info col-sm-12" > 
   <i class=" glyphicon glyphicon-phone"></i>
    &nbsp;<%= session.getAttribute("mobile") %>
    
    
    </div>
                         <%if(guest!=null){ %>
                        
                         <form name="myform" class="form-horizontal" role="form" method="post" action="./Processing"  novalidate="novalidate">    
                         <input type="hidden" name="mobile" value="<%=guest.getMobile()%>"> 
                       <input type="hidden" name="action" value="bill"  />       
                            <div style="margin-bottom: 15px" class="input-group">
                                        <span class=" input-group-addon"><i class="pull-left glyphicon glyphicon-user"> &nbsp; Name:-</i>
                                             <%=guest.getName() %>             </span>                          
                            </div>
                                
                            <div style="margin-bottom: 15px; " class="input-group">
                                        <span class=" input-group-addon"><i class="pull-left glyphicon glyphicon-map-marker"> &nbsp; Address:-</i>
                                            <%=guest.getAddress()%>             </span>                          
                            </div>
                            
                            <div style="margin-bottom: 15px" class="input-group">
                                <span class="input-group-addon" style="word-wrap: break-word; word-break: break-all;"><i class="pull-left glyphicon glyphicon-cog"> &nbsp; DOB :-</i>
                                             <%=guest.getDob() %>             </span>                          
                            </div>
                              
         <div style="margin-bottom: 15px" class="input-group">
                    <span class=" input-group-addon"><i class="pull-left glyphicon glyphicon-briefcase"></i></span>   
                    <input name="amount"   class="form-control"  type="number"  placeholder="enter amount">
        		        	                    
        </div> 
                            
                              
         <div style="margin-bottom: 15px" class="input-group">
                    <span class=" input-group-addon"><i class="pull-left glyphicon glyphicon-list-alt"></i></span>   
                    <textarea name="description" class="form-control" placeholder="Bill description.... "></textarea>
        		        	                    
        </div> 
                                
                                         <input type="hidden" name="action" value="bill"  /> 
                                        
                                    <div class="col-sm-12 controls"> 
                                        <input type="submit" class="btn btn-success" value="Submit Bill"> 
                                      <!-- <a id="btn-fblogin" href="#" class="btn btn-primary">Login with Facebook</a> -->

                                    </div>
                                </div>

							     
                            </form>     
     <% }
                         else{
                             response.sendRedirect("./home");
                         }
     %>
    

                    </div>                     
            </div>  
        </div>
       
    </div>
            
            
            

  

		
		
     </div>
	 
	 
	
    </header>

  
    <!-- Footer  
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-10 col-lg-offset-1 text-center">
                    <h4><strong>Start Bootstrap</strong>
                    </h4>
                    <p>3481 Melrose Place<br>Beverly Hills, CA 90210</p>
                    <ul class="list-unstyled">
                        <li><i class="fa fa-phone fa-fw"></i> (123) 456-7890</li>
                        <li><i class="fa fa-envelope-o fa-fw"></i>  <a href="mailto:name@example.com">name@example.com</a>
                        </li>
                    </ul>
                    <br>
                    <ul class="list-inline">
                        <li>
                            <a href="#"><i class="fa fa-facebook fa-fw fa-3x"></i></a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-twitter fa-fw fa-3x"></i></a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-dribbble fa-fw fa-3x"></i></a>
                        </li>
                    </ul>
                    <hr class="small">
                    <p class="text-muted">Copyright &copy; Your Website 2014</p>
                </div>
            </div>
        </div>
    </footer>

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Custom Theme JavaScript -->
    
    
    
    
    <script>
    // Closes the sidebar menu
    $("#menu-close").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });

    // Opens the sidebar menu
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });

    // Scrolls to the selected menu item on the page
 //   $(function() {
     //   $('a[href*=#]:not([href=#])').click(function() {
     //       if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') || location.hostname == this.hostname) {

      //          var target = $(this.hash);
      //          target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
      //          if (target.length) {
       //             $('html,body').animate({
       //                 scrollTop: target.offset().top
        //            }, 1000);
        //            return false;
         //       }
        //    }
      //  });
   // });  -->
    </script>

    
    
    <!--  form validation -->
    
</body>

</html>
