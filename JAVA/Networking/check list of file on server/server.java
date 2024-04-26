import java.io.*;
import java.net.*;

class server
{
            public static void main(String a[]) throws Exception
            {
                        ServerSocket ss = new ServerSocket(1000);
                        System.out.println("Server is waiting for client : ");
                        Socket s =ss.accept();
                        System.out.println("Client is connected");
                        DataInputStream dis=new DataInputStream(s.getInputStream());
                        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
                        while(true)
                        {
                                    String fname =(String)dis.readUTF();
                                    if(fname.equals("End"))
                                    {           break;

                                    }
                                    File f = new File(fname);
                                    if(f.exists())     
                                    {
                                                dos.writeUTF("1");
                                    }
                                    else dos.writeUTF("0");
                        }
            }
}