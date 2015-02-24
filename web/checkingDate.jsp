

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Date Page</title>
         <script>
         var request;
         function sendInfo()
           {
         var v1=document.form.date1.value;
         var v2=document.form.date2.value;
         var url="CheckDate.jsp?date1="+v1+"&date2="+v2;

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
    </head>
    <body>
         <form id="check" name="form">
            <table> 
            <fieldset>
                <legend>Checking Date</legend>
                <label for="in">Enter Date One: </label>
                <input id="in" type="text" name="date1" placeholder="Enter Date 1st"><br>
                <label for="out">Enter Date Two:</label>
                <input id="out" type="text" name="date2" placeholder="Enter Date 2nd"><br>
                <input type="button" value="Submit"onclick=" return sendInfo()">
            </fieldset>
        </table>
        </form>
         <span id="gp"> </span>
    </body>
</html>
