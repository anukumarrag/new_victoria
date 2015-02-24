<%@page import="hotel.Guest"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>New Guet in Victoria club Hotel</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/stylish-portfolio.css" rel="stylesheet">
  <link rel="stylesheet" type="text/css" href="datepicker/jquery.datetimepicker.css"/>
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
 <%
    Guest guest=(Guest)session.getAttribute("guest");
    
    
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
	
            <div class="container">    
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
<div class="panel-heading">
    <div class="panel-title"><h2 class="info success">welcome in victoria club hotel</h2></div>
    <!--<div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div>-->
</div>     

<div style="padding-top:30px" class="panel-body" >

    <div style="display: inline; font-size: large; padding: 4px;" class="alert alert-info col-sm-12" > 
   <i class=" glyphicon glyphicon-phone"></i>
    &nbsp;<%= session.getAttribute("mobile") %>
    
    
    </div>

     
    <div style="display: inline; font-size: large; padding: 4px;" class="alert alert-info col-sm-12" > 
     <span style="text-align:left;">
                            <label style="font-family: sans-serif;  line-height: .5em; padding-left: 15%;">     Name :- <%=guest.getName() %>     </label>   <br/>
                                <label style="font-family: sans-serif;   line-height: 1em;padding-left: 15%;">    Address :- <%=guest.getAddress()%>     </label>   <br/>
                                <label style="font-family: sans-serif;   line-height: .5em;padding-left: 15%;">    DOB :- <%=guest.getDob() %>     </label>   
                              
                                <% 
                                if(request.getParameterMap().containsKey("msg")){ %>       
                                <label style="font-family: sans-serif; font-size: 1em; background-color: greenyellow; color: #EF9E10; line-height: 3em;padding-left: 15%; margin-top: 2%;">   <%=request.getParameter("msg")%>     </label> 
                               
                               <%}%>
                    
                        
                        </span>
    
    
    </div>    
   
    

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

    
    
    <!--  form calender -->
    <script src="datepicker/jquery.datetimepicker.js"></script>


<script>

$('#datetimepicker2').datetimepicker({
   
	yearOffset:0,
	timepicker:false,
	format:'Y-m-d',
	formatDate:'Y-m-d',
//	minDate:'-1970-01-06', // last 6 days is minimum date
	maxDate:'+1970-01-01' // and today is maximum date calendar
});
$('#datetimepicker3').datetimepicker({
	yearOffset:0,
	timepicker:false,
	format:'Y-m-d',
	formatDate:'Y-m-d',
//	minDate:'-1970-01-06', // last 6 days is minimum date
	maxDate:'+1970-01-01' // and today is maximum date calendar
});

</script>



<script src="js/jquery.validate.js"></script>

<script type="text/javascript">//<![CDATA[ 
$(window).load(function(){
$(document).ready(function () {

    $('#register-form').validate({
        rules: {
            name:{
                required:true
                
            },
            address: {
                minlength: 10,
                required: true
            },
            email:{
                required:true,
                email:true
            },
            dob:{
                required:true
            
            },
            doa:{
                required:false
            
            }
        },
        highlight: function (element) {
            $(element).closest('.group').removeClass('success').addClass('error');
        },
        success: function (element) {
            element.addClass('valid')
                .closest('.group').removeClass('error').addClass('success');
        }
    });

});
});//]]>  

</script>

</body>

</html>
