<%-- 
    Document   : check
    Created on : Feb 9, 2015, 11:09:59 AM
    Author     : Developer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Page</title>
    </head>
    <body>
        
        <form id="check" action="guest.jsp" method="post">
            <table> 
            <fieldset>
                <legend>Checking Guest</legend>
                <label for="min">Minimum Range: </label>
                <input id="min" type="text" name="min" placeholder="Enter Minimum Range"><br>
                <label for="max">Maximum Range:</label>
                <input id="max" type="text" name="max" placeholder="Enter Maximum Range"><br>
                <input type="submit" value="Submit">
            </fieldset>
        </table>
        </form>
    </body>
</html>
