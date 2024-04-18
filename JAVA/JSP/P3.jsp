<!-- 3. Create a JSP page to accept a number from a user and display it in words: 
   Example: 123 – One Two Three. --> 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Number to Words</title>
</head>
<body>
    <h1>Number to Words</h1>
    <form method="post">
        Enter a number: <input type="number" name="number">
        <input type="submit" value="Convert">
    </form>

    <%-- Java code to convert number to words --%>
    <%
        // Array of words for numbers from 0 to 9
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        
        // Get the number from the form
        String numberStr = request.getParameter("number");
        
        if (numberStr != null && !numberStr.isEmpty()) {
            try {
                int number = Integer.parseInt(numberStr);
                
                // Convert number to words
                String result = "";
                while (number > 0) {
                    int digit = number % 10;
                    result = words[digit] + " " + result;
                    number /= 10;
                }
                
                out.println("<p>Number in words: " + result.trim() + "</p>");
            } catch (NumberFormatException e) {
                out.println("<p>Please enter a valid number.</p>");
            }
        } else {
            out.println("<p>Please enter a number.</p>");
        }
    %>
</body>
</html>
