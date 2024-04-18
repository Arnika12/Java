
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.GregorianCalendar"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Greeting</title>
</head>
<body>
    <h1>Greeting</h1>
    <%-- Get the current time --%>
    <%
        Calendar calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        String username = request.getParameter("username");
        String greeting = "";
        String colorClass = "";

        if (hour >= 6 && hour < 12) {
            greeting = "Good morning";
            colorClass = "morning";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Good afternoon";
            colorClass = "afternoon";
        } else {
            greeting = "Good evening";
            colorClass = "evening";
        }

        // Display greeting message with username and current date/time
        out.println("<p class='" + colorClass + "'>" + greeting + ", " + username + "</p>");
        out.println("<p>Today’s date: " + calendar.get(Calendar.DATE) + "/"
                + (calendar.get(Calendar.MONTH) + 1) + "/"
                + calendar.get(Calendar.YEAR) + "</p>");
        out.println("<p>Current time: " + calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND) + "</p>");
    %>
</body>
</html>
