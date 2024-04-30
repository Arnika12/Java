<!-- Write a JSP application to accept the details of Emp (Eno, EName, Salary) and 
insert   it into table and display appropriate message on browser.   -->

<%@ page import="java.sql.*" %>

<%
String no = request.getParameter("no");
String name = request.getParameter("nm");
int salary = Integer.parseInt(request.getParameter("salary"));
%>

<%
try{
	Class.forName("org.postgresql.Driver");
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/test","postgres","");
	Statement st=con.createStatement();
	String query="insert into product(Eno, EName, Salary) values("+no +" ,' "+name+"',"+ salary+")";
	if(st.executeUpdate(query)>0)
	{
		out.write("Records inserted");
	}else{
		out.write("insertion failed");
}
}catch(Exception e)
{
	out.write("Exception : "+e);
}
%>
