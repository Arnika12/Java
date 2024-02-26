// Write a socket program that accept text at client side and sends it to server 

import java.io.*;
import java.net.*;
class TextClient
{
    public static void main(String args[]) throws Exception
    {
    try
    {
        Socket soc=new Socket("localhost",2222);        
	   DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
	   dout.writeUTF("Hello Server");
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

