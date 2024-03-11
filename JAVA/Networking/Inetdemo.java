						// InetAddress Demo
// 2. Write a program to find primary IP address of the host name which you passed as a parameter

import java.io.*;
import java.net.*;

public class Inetdemo
{
public static void main(String args[]) throws Exception 
{
	try
	{
		System.out.println("Enter Website Address(for eg:www.google.com):");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		InetAddress ip = InetAddress.getByName(str);
		
		//InetAddress ip = InetAddress.getByName("www.google.com");
		
		System.out.println("Host Name : "+ ip.getHostName());
		System.out.println("IP Address : "+ ip.getHostAddress());
	}
	catch(UnknownHostException ex){
		System.out.println("Error :" +ex);
	}
	catch(Exception e){
		System.out.println("Error :" +e);
	}
}
}
