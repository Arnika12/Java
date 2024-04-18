<!-- 5. Create a JSP page, which accepts user name in a text box and greets the user according to 
        the time on server side. 
        Example: If user name is Admin 
        Output: 
        If it is morning then displaymessage in red color as, 
        Good morning, Admin 
        Today’s date: dd/mm/yyyy format 
        Current time: hh:mm:ss format 
        
        If it is afternoon then display message in green color as, 
        Good afternoon, Admin 
        Today’s date: dd/mm/yyyy format 
        Current time: hh:mm:ss format 
        
        If it is evening then display message in blue color as, 
        Good evening, Admin 
        Today’s date: dd/mm/yyyy format 
        Current time: hh:mm:ss format (Hint: To display date and time use GregorianCalendar and 
       Calendar class)  -->

       
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
                <meta charset="UTF-8">
                <title>Greeting Page</title>
                <style>
                        .morning {
                                color: red;
                        }

                        .afternoon {
                                color: green;
                        }

                        .evening {
                                color: blue;
                        }
                </style>
        </head>

        <body>
                <h1>Greeting Page</h1>
                <form method="post" action="greet.jsp">
                        Enter your name: <input type="text" name="username">
                        <input type="submit" value="Greet">
                </form>
        </body>

        </html>