/*1. Write a client-server program which displays the server machine’s date and time on the client machine.*/

//Client side code 

import java.io.*;
import java.net.*;
class DateClient
{
    public static void main(String args[]) throws Exception
    {
    try
    {
        Socket soc=new Socket("localhost",5555);        
        BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println(br.readLine());
    }    
    catch(Exception e){
    	System.out.println("Error"+e);
}
}
}

