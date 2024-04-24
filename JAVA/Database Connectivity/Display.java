//display values from table


import java.sql.*;
import java.io.*;

public class Display{
public static void main (String args[]){

try{
	
	Class.forName("org.postgresql.Driver");
	Connection con=null;
	Statement stmt= null;
	ResultSet rs=null;
	con=DriverManager.getConnection("jdbc:postgresql:test","postgres","");
	
	if(con==null){
		System.out.println("connection error");
	}
	else{
	stmt=con.createStatement();
	rs=stmt.executeQuery("select * from Person;");
	while (rs.next()){
		System.out.println("PID : "+ rs.getInt(1));
		System.out.println("Name : "+ rs.getString(2));
		System.out.println("Gender : "+ rs.getString(3));
		System.out.println("Birth_year : "+ rs.getInt(4));
	}
}
}
catch(ClassNotFoundException e){
	e.printStackTrace();
}
catch(SQLException ex1){
	System.out.println("error"+ex1);
}
catch(Exception ex2){
	System.out.println("error"+ex2);
}
}
}
