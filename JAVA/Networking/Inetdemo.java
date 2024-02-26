						// InetAddress Demo
// Write a Java program that demonstrates the use of InetAddress class to obtain the IP address and host name of a website. The program prompts the user to input a website address (e.g., www.google.com) and then displays the corresponding host name and IP address. 

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
