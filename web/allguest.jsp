<%@page import="guest.AllGuest"%>
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
     
    <style type="text/css">
            	.row{
		    margin-top:40px;
		    padding: 0 10px;
		}
		.clickable{
		    cursor: pointer;   
		}

		.panel-heading div {
			margin-top: -18px;
			font-size: 15px;
		}
		.panel-heading div span{
			margin-left:5px;
		}
		.panel-body{
			display: none;
		}
        
    </style>
</head>

<body>
 <%
        if(null==session.getAttribute("username"))
        {
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
		

  <div class="container" style="margin-top:6%;">
    
    	<div class="row">
			<div class="col-md-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">All Guest</h3>
						<div class="pull-right">
							<span class="clickable filter" data-toggle="tooltip" title="Toggle table filter" data-container="body">
								<i class="glyphicon glyphicon-filter"></i>
							</span>
						</div>
					</div>
					<div class="panel-body">
						<input type="text" class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Filter Developers" />
					</div>
					<table class="table table-hover" id="dev-table">
						<thead>
							<tr style="background-color:#CCE6FF; font-weight:900">
                    <td width="1%" style="padding-right: 40px;">#</td>
                  <td>mobile</td>
                  <td>Name</td>
                  <td>Address</td>
                  <td>Email</td>
                  <td width="150px">D.O.B</td>
                   <td width="150px">Anniversary</td>
                  <td width="150px"> </td>
							</tr>
						</thead>
						<tbody>
                                                    
                                                     <%
               int pageno=1;
               try{
                   pageno=Integer.parseInt(request.getParameter("pageno"));
               }
               catch(Exception eee){
                   
               }
               
               
               %>
                  <%= new AllGuest().getGuest(pageno,20)%>
 							 
						</tbody>
					</table>
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

    
    
    <!--  form table -->
    <script>
        (function(){
    'use strict';
	var $ = jQuery;
	$.fn.extend({
		filterTable: function(){
			return this.each(function(){
				$(this).on('keyup', function(e){
					$('.filterTable_no_results').remove();
					var $this = $(this), search = $this.val().toLowerCase(), target = $this.attr('data-filters'), $target = $(target), $rows = $target.find('tbody tr');
					if(search == '') {
						$rows.show(); 
					} else {
						$rows.each(function(){
							var $this = $(this);
							$this.text().toLowerCase().indexOf(search) === -1 ? $this.hide() : $this.show();
						});
						if($target.find('tbody tr:visible').size() === 0) {
							var col_count = $target.find('tr').first().find('td').size();
							var no_results = $('<tr class="filterTable_no_results"><td colspan="'+col_count+'">No results found</td></tr>');
							$target.find('tbody').append(no_results);
						}
					}
				});
			});
		}
	});
	$('[data-action="filter"]').filterTable();
})(jQuery);

$(function(){
    // attach table filter plugin to inputs
	$('[data-action="filter"]').filterTable();
	
	$('.container').on('click', '.panel-heading span.filter', function(e){
		var $this = $(this), 
				$panel = $this.parents('.panel');
		
		$panel.find('.panel-body').slideToggle();
		if($this.css('display') != 'none') {
			$panel.find('.panel-body input').focus();
		}
	});
	$('[data-toggle="tooltip"]').tooltip();
});
        
    </script>
    
</body>

</html>
