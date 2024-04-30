/*Write a java program to accept the details of Teacher(TID, TName, Salary) 
    and store it into  the database. (PreparedStatement Interface).    */


import java.sql.*;
import java.io.*;

public class PSForTeacher
{
  public static void main(String args[])
  {
    try
    {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection conn=null ; 
	  Statement stmt=null; 
	  ResultSet rs=null;

       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");


	  if(con==null)
		System.out.println("Connection Failed");
	  else
		System.out.println("Connection Successfull");
	
	PreparedStatement ps=con.prepareStatement("insert into College values(? , ? , ? )");
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	
	do{
		System.out.println("Enter Teacher ID : ");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter Teacher Name : ");
		String name=br.readLine();
		System.out.println("Enter Teacher Salary : ");
		int salary=Integer.parseInt(br.readLine());
		
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setFloat(3,salary);
		
		int i=ps.executeUpdate();
		System.out.println(i+ " records updated ");
		System.out.println("Do you want to continue (y/n) : ");
		String s=br.readLine();
		
		if(s.startsWith("n")){
			break;
		}
	}
		
	while(true);
	
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
	
