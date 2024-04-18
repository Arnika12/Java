
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Arithmetic Result</title>
</head>
<body>
    <h1>Arithmetic Result</h1>
    <%
        // Get parameters from the form
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation");
        
        // Perform the selected operation
        double result = 0;
        String operator = "";
        switch (operation) {
            case "addition":
                result = num1 + num2;
                operator = "+";
                break;
            case "subtraction":
                result = num1 - num2;
                operator = "-";
                break;
            case "multiplication":
                result = num1 * num2;
                operator = "*";
                break;
            case "division":
                if (num2 != 0) {
                    result = num1 / num2;
                    operator = "/";
                } else {
                    out.println("<p>Division by zero is not allowed.</p>");
                }
                break;
        }
    %>
    <p>Result of <%= num1 %> <%= operator %> <%= num2 %> = <%= result %></p>
</body>
</html>
