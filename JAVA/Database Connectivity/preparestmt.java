//using prepare statement

import java.sql.*;
import java.util.*;

public class preparestmt
{
public static void main(String args[])
{
try{
Class.forName("org.postgresql.Driver");
Connection con=null;
ResultSet rs=null;
Statement stmt=null;
PreparedStatement ps=null;

con=DriverManager.getConnection("jdbc:postgresql:test","postgres","");

if(con==null){
	System.out.println("Connection error");
}
else{
	Scanner s=new Scanner(System.in);
	ps=con.prepareStatement("Insert into Employee values (?,?)");
	
	do{
		System.out.println("Enter employee id : ");
		int id=s.nextInt();
		System.out.println("Enter employee name : ");
		String name=s.next();
		
		ps.setInt(1,id);
		ps.setString(2,name);
		
		int i =ps.executeUpdate();
		System.out.println(i + "records updated");
		System.out.println("DO YOU WANT TO CONTINUE ( y/n) : ");
		String str=s.next();
		
		if(str.startsWith("n")){
			break;
	}
	}
	while(true);
		con.close();
	
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
