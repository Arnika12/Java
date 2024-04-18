<!--6. Write a JSP program to display number of times user has visited the page. (Use cookies) -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Page Visit Counter</title>
</head>
<body>
    <h1>Page Visit Counter</h1>

    <%-- Java code to handle page visit count using cookies --%>
    <%
        // Initialize visit count to 0
        int visitCount = 0;
        
        // Get the existing visit count from the cookie
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(cookie.getValue());
                    break;
                }
            }
        }
        
        // Increment visit count
        visitCount++;
        
        // Set the updated visit count in a cookie
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
        response.addCookie(visitCookie);
    %>

    <%-- Display the visit count --%>
    <p>Welcome! You have visited this page <%= visitCount %> times.</p>
</body>
</html>
