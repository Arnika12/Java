<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Number to Word Converter</title>
</head>
<body>
<font color="red">
<%
    String s1 = request.getParameter("num");
    int n = s1.length();
    int i = 0;
    do {
        char ch = s1.charAt(i);
        switch (ch) {
            case '0':
                out.println("Zero");
                break;
            case '1':
                out.println("One");
                break;
            case '2':
                out.println("Two");
                break;
            case '3':
                out.println("Three");
                break;
            case '4':
                out.println("Four");
                break;
            case '5':
                out.println("Five");
                break;
            case '6':
                out.println("Six");
                break;
            case '7':
                out.println("Seven");
                break;
            case '8':
                out.println("Eight");
                break;
            case '9':
                out.println("Nine");
                break;
        }
        i++;
    } while (i < n);
%>
</font>
</body>
</html>

