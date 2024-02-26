import java.io.*;
import java.net.*;

public class TextServer{
public static void main(String args[]) throws Exception 
{
try
{
	ServerSocket ss = new ServerSocket(2222);
	Socket soc = ss.accept();
	DataInputStream dis = new DataInputStream(soc.getInputStream());
	String str = (String)dis.readUTF();
	System.out.println("Message = " + str);
	ss.close();
	}
	
	catch(Exception e)
	{
    		System.out.println("Error"+e);}
	}
}
