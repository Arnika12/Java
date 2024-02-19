/*6) Write a JDBC program to update number_of_students of “BCA Science” to 1000.
	Create a table Course (Code,name, department,number_of_students). 
	Insert values in the table. */

import java.sql.*;
import java.io.*;

public class Q6
{
  public static void main(String args[])
  {
    try
    {
	  Class.forName("com.mysql.cj.jdbc.Driver");

       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");


	  if(con==null)
		System.out.println("Connection Failed");
	  else
		System.out.println("Connection Successfull");
	
      stmt=con.createStatement();
	 stmt.executeUpdate("UPDATE Course set no_of_student=1000 where department='BCA_Science' ");

	  stmt.close();
	  con.close();
	}

	catch(ClassNotFoundException ex)
	{
		System.out.println("Class not found"+ex);
	}	
	catch(SQLException ex1)
	{
		System.out.println("SQL Error"+ex1);
		
	}
	catch(Exception ex2)
	{
		System.out.println("Error"+ex2);
		
	}

  }
}

