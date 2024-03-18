// 5. Write a server program which echoes messages sent by the client. 
//     The process continues till the client types “END”.

import java.io.*;
import java.net.*;

class ServerDemo
{
    public static void main(String a[]) throws Exception
    {
        ServerSocket ss = new ServerSocket(5500);
        System.out.println("Server is waiting for client : ");
        Socket s =ss.accept();
        System.out.println("Client is connected");
        DataInputStream ios=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2;
        while(true)
        {
            s1 = (String)ios.readUTF();
            if(s1.equals("end") || s1.equals("END"))
            {
                System.out.println("chatting terminated");
                break;
            }
            System.out.println("Client "+s1);
            System.out.println("Server ...");
            s2 = br.readLine();
            dos.writeUTF(s2);
            if(s2.equals("end") || s2.equals("END"))
            {
                System.out.println("chatting terminated");
                break;
            }          
        }
    }
}
