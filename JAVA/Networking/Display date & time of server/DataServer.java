/*1. Write a client-server program which displays the server machine’s date and time on the client machine.*/

//Server side code 

import java.io.*;
import java.net.*;
import java.util.*;

public class DataServer{
public static void main(String args[]) throws Exception {
	ServerSocket s = new ServerSocket(5555);
	while(true){
		System.out.println("Waiting for connection");
		Socket soc = s.accept();
		DataOutputStream out = new DataOutputStream(soc.getOutputStream());
		out.writeBytes ("Server date :" + (new Date()).toString() + "\n");
		current_time = datetime.now().strftime("%Y-%m-%d %H:%M:%S");
		out.writeBytes ("Server time :" + current_time + "\n");
		out.close();
		soc.close();
	}
	}}
