<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Greeting</title>
</head>
<body>
    <%-- Get the user name from the request --%>
    <% String username = request.getParameter("username"); %>
    
    <%-- Get the current hour of the day --%>
    <% int hour = java.time.LocalTime.now().getHour(); %>
    
    <%-- Greeting logic based on the current hour --%>
    <% if (hour >= 6 && hour < 12) { %>
        <h2>Good morning, <%= username %>!</h2>
    <% } else if (hour >= 12 && hour < 17) { %>
        <h2>Good afternoon, <%= username %>!</h2>
    <% } else if (hour >= 17 && hour < 20) { %>
        <h2>Good evening, <%= username %>!</h2>
    <% } else { %>
        <h2>Good night, <%= username %>!</h2>
    <% } %>
</body>
</html>
