// 5. Write a server program which echoes messages sent by the client. 
//     The process continues till the client types “END”.

import java.io.*;
import java.net.*;

class Client
{
            public static void main(String a[]) throws Exception
            {
                        Socket s = new Socket("localhost",1000);
                        System.out.println("client is connected : ");
                        DataInputStream ios=new DataInputStream(s.getInputStream());
                        DataOutputStream dos=new DataOutputStream(s.getOutputStream());

                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        String s1,s2;
                        while(true)
                        {
                                    System.out.println("Server ....");
                                    s1=br.readLine();
                                    dos.writeUTF(s1);
                                    s2=(String)ios.readUTF();
                                    if(s2.equals("end") || s2.equals("END"))
                                    {
                                                System.out.println("chatting terminated");
                                                break;
                                    }
                                    System.out.println("Client "+s2);
                        }
            }
}