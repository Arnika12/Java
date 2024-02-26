							//URL Class Demo
//write a Java program that demonstrates the use of the URL class to extract information from a website URL. The program prompts the user to input a website address (e.g., https://www.facebook.com/profile) and then displays the protocol, host name, port number, and file name of the URL. Review the code and answer the questions below:

import java.io.*;
import java.net.*;

public class URLDemo
{
public static void main(String args[]) throws Exception 
{
	try
	{
		System.out.println("Enter Website Address(for eg: https://www.facebook.com/profile) :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		URL url = new URL(str);
		
		//URL url = new URL("https://www.facebook.com/profile");
		
		System.out.println("Protocol : "+ url.getProtocol());
		System.out.println("Host Name : "+ url.getHost());
		System.out.println("Port Number : "+ url.getPort());
		System.out.println("File Name : "+ url.getFile());
	}
	catch(Exception e){
		System.out.println("Error :" +e);
	}
}
}
