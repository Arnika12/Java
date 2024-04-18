<!-- 1. Write a Program to make use of following JSP implicit objects:
        i. out: To display current Date and Time.
        ii. request: To get header information.
        iii. response: To Add Cookie
        iv. config: get the parameters value defined in
        v. application: get the parameter value defined in
        vi. session: Display Current Session ID
        vii. pageContext: To set and get the attributes.
        viii. page: get the name of Generated Servlet -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Implicit Objects Example</title>
</head>
<body>
<h1>JSP Implicit Objects Example</h1>

<%
    // i. out: To display current Date and Time
    out.println("Current Date and Time: " + new java.util.Date() + "<br>");
    
    // ii. request: To get header information
    String userAgent = request.getHeader("User-Agent");
    out.println("User-Agent: " + userAgent + "<br>");
    
    // iii. response: To Add Cookie
    Cookie cookie = new Cookie("testCookie", "exampleValue");
    response.addCookie(cookie);
    out.println("Cookie added successfully.<br>");
    
    // iv. config: get the parameters value defined in
    String configParam = getServletConfig().getInitParameter("configParam");
    out.println("Config Parameter Value: " + configParam + "<br>");
    
    // v. application: get the parameter value defined in
    String appParam = getServletContext().getInitParameter("appParam");
    out.println("Application Parameter Value: " + appParam + "<br>");
    
    // vi. session: Display Current Session ID
    out.println("Current Session ID: " + session.getId() + "<br>");
    
    // vii. pageContext: To set and get the attributes
    pageContext.setAttribute("exampleAttribute", "exampleValue");
    String retrievedAttribute = (String) pageContext.getAttribute("exampleAttribute");
    out.println("Retrieved Attribute Value: " + retrievedAttribute + "<br>");
    
    // viii. page: get the name of Generated Servlet
    out.println("Name of Generated Servlet: " + page + "<br>");
%>

</body>
</html>
