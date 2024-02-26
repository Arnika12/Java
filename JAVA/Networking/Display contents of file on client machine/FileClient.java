/* Write a program which sends the name of a text file from the client to server and
displays the contents of the file on the client machine. If the file is not found, display an
error message.*/

import java.io.*;
import java.net.*;
public class FileClient
{
    public static void main(String args[]) throws Exception
    {
    try
    {
        Socket soc=new Socket("localhost",2220);        
	   DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
	   
	   System.out.println("Enter Content on Internet of Things:");
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String str = br.readLine();
		
	   dout.writeUTF("str");
	   dout.flush();
	   dout.close();
	   soc.close();
    }    
    catch(Exception e)
    {
    		System.out.println("Error"+e);
    }
}
}

