/*2. Write a program to display information about the ResultSet like number of columns
available in the ResultSet and SQL type of the column. Use Person table. (Use
ResultSetMetaData).*/

import java.sql.*;
import java.io.*;

public class Q2 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
	  	Connection con=null ; 
		Statement stmt= null;
		ResultSet rs=null;
		ResultSetMetaData remd=null;
	
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");

            /*PreparedStatement ps = con.prepareStatement("select * from person");
        
            ResultSet rs= ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
                System.out.println("Total Column:"+rsmd.getColumnCount());
                System.out.println("Column name:"+rsmd.getColumnName(1));
                System.out.println( "Column Type"+rsmd.getColumnTypeName(1));*/
             
	        stmt=con.createStatement();
		rs=stmt.executeQuery("select * from Person;");
		remd=rs.getMetaData();
		System.out.println("total columns : "+ remd.getColumnCount());
		System.out.println("1st column name : "+ remd.getColumnName(1));
		System.out.println("1st column data type : "+ remd.getColumnTypeName(1));
  

            con.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found" + ex);
        } catch (SQLException ex1) {
            System.out.println("SQL Error" + ex1);

        } catch (Exception ex2) {
            System.out.println("Error" + ex2);

        }
    }
}
/*
O/P
Total Column:4
Column name:id
Column Typeint4
*/
