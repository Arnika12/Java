<!-- 4. Write a JSP program to perform Arithmetic operations such as Addition, Subtraction, 
Multiplication and Division. Design a HTML to accept two numbers in text box and radio 
buttons to display operations. On submit display result as per the selected operation on next
 page using JSP.  -->

 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Arithmetic Operations</title>
</head>
<body>
    <h1>Arithmetic Operations</h1>
    <form method="post" action="result.jsp">
        Enter first number: <input type="number" name="num1"><br>
        Enter second number: <input type="number" name="num2"><br>
        Select operation:
        <input type="radio" name="operation" value="addition" checked> Addition
        <input type="radio" name="operation" value="subtraction"> Subtraction
        <input type="radio" name="operation" value="multiplication"> Multiplication
        <input type="radio" name="operation" value="division"> Division<br>
        <input type="submit" value="Calculate">
    </form>
</body>
</html>
