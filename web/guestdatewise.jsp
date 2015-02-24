<!DOCTYPE html>
<html dir="ltr" lang="en-US">
   <head>
      <meta charset="UTF-8"/>
      <title>A date range picker for Bootstrap</title>
      <link href="calcss/bootstrap.min.css" rel="stylesheet">
      <link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" rel="stylesheet">
      <link rel="stylesheet" type="text/css" media="all" href="calcss/daterangepicker-bs3.css" />
      <script type="text/javascript" src="caljs/jquery.min.js"></script>
      <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
      <script type="text/javascript" src="caljs/moment.js"></script>
      <script type="text/javascript" src="caljs/daterangepicker.js"></script>
       <script type="text/javascript" src="https://www.google.com/jsapi?autoload={'modules':[{'name':'visualization','version':'1','packages':['corechart']}]}"></script>

   </head>
   <body>
 
      <div class="container">
          <div class="span12" style="position: inherit;">

            <div class="well" style="overflow: auto;padding:5px;">

             <span style="font-size:18px; ">
				Page Engagement </span>
               <div id="reportrange" class="pull-right" style="background: #fff;  cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
                  <i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
                  <span></span> <b class="caret"></b>
               </div>

               <script type="text/javascript">
               $(document).ready(function() {

                  var cb = function(start, end, label) {
                    console.log(start.toISOString(), end.toISOString(), label);
                    $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
                    //alert("Callback has fired: [" + start.format('MMMM D, YYYY') + " to " + end.format('MMMM D, YYYY') + ", label = " + label + "]");
                  };

                  var optionSet1 = {
                    startDate: moment().subtract(30, 'days'),
                    endDate: moment().subtract(0, 'days'),
                    minDate: '01/01/2012',
                    maxDate: moment().subtract(0, 'days'),
                   
                    showDropdowns: true,
                    showWeekNumbers: true,
                    timePicker: false,
                    timePickerIncrement: 1,
                    timePicker12Hour: true,
                    ranges: {
                       'Last 7 Days': [moment().subtract(7, 'days'), moment()],
                       'Last 15Days': [moment().subtract(15, 'days'),moment()],
                       'This Month': [moment().startOf('month'), moment().endOf('month')],
                       'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')],
                       'Last Two Month': [moment().subtract(2, 'month').startOf('month'), moment().subtract(0, 'month').endOf('month')]
                    
                       },
                    opens: 'left',
                    buttonClasses: ['btn btn-default'],
                    applyClass: 'btn-small btn-primary',
                    cancelClass: 'btn-small',
                    format: 'MM/DD/YYYY',
                    separator: ' to ',
                    locale: {
                        applyLabel: 'Submit',
                        cancelLabel: 'Clear',
                        fromLabel: 'From',
                        toLabel: 'To',
                        customRangeLabel: 'Custom',
                        daysOfWeek: ['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr','Sa'],
                        monthNames: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
                        firstDay: 1
                    }
                  };

               
               

                  $('#reportrange span').html(moment().subtract(8, 'days').format('MMMM D, YYYY') + ' - ' + moment().format('MMMM D, YYYY'));

                  $('#reportrange').daterangepicker(optionSet1, cb);

                  $('#reportrange').on('show.daterangepicker', function() { console.log("show event fired"); });
                  $('#reportrange').on('hide.daterangepicker', function() { console.log("hide event fired"); });
                  $('#reportrange').on('apply.daterangepicker', function(ev, picker) { 
                      var since=picker.startDate.format('YYYY-MM-DD');
                      var untill=picker.endDate.add(1, 'days').format('YYYY-MM-DD');
                    console.log("apply event fired, start/end dates are " 
                     +since + untill+ picker.startDate.format('MMMM D, YYYY') 
                      + " to " 
                      + picker.endDate.format('MMMM D, YYYY')
                    ); 
            
            // action after date has selected....
           
            loaddata(since,untill);
            
            
            
            
                  });
                  $('#reportrange').on('cancel.daterangepicker', function(ev, picker) { console.log("cancel event fired"); });

                  $('#options1').click(function() {
                    $('#reportrange').data('daterangepicker').setOptions(optionSet1, cb);
                  });

                

               });
               </script>
<script>
function loaddata(since,untill)
{
    
    var url="CheckDate.jsp?date1="+since+"&date2="+untill;
         if(window.XMLHttpRequest){
         request=new XMLHttpRequest();
          }
         else if(window.ActiveXObject){
         request=new ActiveXObject("Microsoft.XMLHTTP");
         }

        try
      {
       request.onreadystatechange=getInfo;
       request.open("GET",url,true);
       request.send();
      }
          catch(e)
       {
        alert("Unable to connect to server");
        }
        return false;
   }
   
       function getInfo(){
       if(request.readyState==4){
      var val=request.responseText;
        document.getElementById('gp').innerHTML=val;
      }
 }
</script>
               
 </div>
 <span id="gp"> </span>
         </div>
      </div>

	 
  
 
	 
	  
   </body>
</html>

