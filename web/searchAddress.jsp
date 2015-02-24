
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    <script>
         var request;
         function sendInfo()
           {
         var v=document.form.sch.value;
         var url="searchRecord.jsp?val="+v;

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
        <form name="form" >
            <table> 
            <fieldset>
                <legend>Search Guest</legend>
                <label for="sch1">Search Guest: </label>
                <input id="sch1" type="text" name="sch" placeholder="Please Enter Address" onkeyup="sendInfo()" >
                
<!--                <input type="submit" value="Search" ">-->
            </fieldset>
           
        </table>
        </form>
        <span id="gp"> </span>
        <%--<jsp:include page="searchRecord.jsp" />--%>
    </body>
</html>
