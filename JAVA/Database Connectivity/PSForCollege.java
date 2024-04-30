/*Write a java program to accept the details of College (CID, CName, Address) and display  
it on next frame. (Use PreparedStatement).  */


import java.sql.*;
import java.io.*;

public class PSForCollege
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
		System.out.println("Enter College ID : ");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter College Name : ");
		String name=br.readLine();
		System.out.println("Enter College Address : ");
		String address=br.readLine();
		
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setFloat(3,address);
		
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
	
