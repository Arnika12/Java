import java.io.*;
import java.net.*;
import java.util.*;

public class DataServer{
public static void main(String args[]) throws Exception {
	ServerSocket s = new ServerSocket(5555);
	while(true){
		System.out.println("Waitingfor connection");
		Socket soc = s.accept();
		DataOutputStream out = new DataOutputStream(soc.getOutputStream());
		out.writeBytes ("Server date :" + (new Date()).toString() + "\n");
		out.close();
		soc.close();
	}
	}}
