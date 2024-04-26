//server code

import java.io.*;
import java.net.*;

public class server{
public static void main(String args[]){

try{
	ServerSocket ss = new ServerSocket(8060);
	System.out.println("Waiting for client");

	Socket s = ss.accept();
	System.out.println("Client connected");

	DataInputStream dis = new DataInputStream (s.getInputStream());
	DataOutputStream dout = new DataOutputStream(s.getOutputStream());

	String fileName = dis.readUTF();
	System.out.println("Received file"+ fileName);

	//check file
	File file = new File(fileName);
	if(file.exists() && file.isFile())
	{
		dout.writeBoolean(true);
		
		//print file content on client side
		BufferedReader br =  new BufferedReader(new FileReader(file));
		String line;
		if(( line = br.readLine()) != null){
			dout.writeUTF(line);
		}
		dout.writeUTF(null);
		br.close();
	}
	else
	{
		dout.writeBoolean(false);
	}

}
catch(IOException e)
{
	e.printStackTrace();
}
}
}