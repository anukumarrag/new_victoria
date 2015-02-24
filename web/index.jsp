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
    <style>
        label.error {
font: bold 11px Arial, sans-serif;
line-height: 1em;
color:#c7254e; 
background: url(images/arrow_error.png) no-repeat 0 center;
border-right: 1px solid #6c0202;
height: 11px;
padding: 8px 15px 11px 20px;
display: block; /* Required as we will use jQuery to fade in the error message */
position: relative; /* Required */
top: 3px;
right: 0; /* Required - initially set all error messages to the right of the form row */
}
 
/* Change the input field styles when an error message is present */
 
        </style>
    
</head>

<body>
<%
                if(session.getAttribute("username")==null){
                    RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                }
                %>
    <!-- Navigation -->
    <%@include file="menu.jsp" %>

    <!-- Header -->
    <header id="top" class="header">
        
        
        <div class="text-vertical-center">
<!--            <h2>Victoria Club Hotel</h2>-->

<!--            <h3>Free Bootstrap Themes &amp; Templates</h3>
            <br>-->
            <!--<a href="#about" class="btn btn-dark btn-lg">Find Out More</a> --> 

            
            
            

   <form name="myform" id="myform" method="post" action="Processing">
               <input name="mobile" type="text" class="input-lg" style="background: url(img/phone.png) #fff no-repeat; color: #000; background-position :0.5em; padding-left: 70px;  " placeholder="Enter Mobile no.."  autofocus="true" size="40" maxlength="10">
                   <input type="hidden" name="action" value="search"/><label></label>
                   <br>  <input type="submit" value="Enter" style="width: 10em; margin-top: 10px;" class="btn-lg btn-success"/>
           
			  </form>


		
		
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
    <script src="js/jquery.validate.js"></script>
    <script type="text/javascript">//<![CDATA[ 
$(window).load(function(){
$(document).ready(function () {

 $('#myform').validate({
        rules: {
            mobile: {
                number:true,
                required: true,
                minlength:10,
                maxlength:10
            }
        }
    });

});
});//]]>  

</script>
</body>

</html>
