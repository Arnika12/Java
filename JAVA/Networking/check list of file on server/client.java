import java.io.*;
import java.net.*;

class client
{
            public static void main(String a[]) throws Exception
            {
                        Socket s = new Socket("localhost",1000);
                        System.out.println("client is connected : ");
                        DataInputStream dis=new DataInputStream(s.getInputStream());
                        DataOutputStream dos=new DataOutputStream(s.getOutputStream());

                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        while(true)
                        {
                                    System.out.println("Stop proceesing enter End");
                                    System.out.println("Enter file name : ");
                                    String fname = br.readLine();

                                    dos.writeUTF(fname);
                                    if(fname.equals("End"))
                                    {
                                                break;
                                    }
                                    String msg = (String)dis.readUTF();
                                    if(msg.equals("0"))
                                                System.out.println("File not present ");
                                    else
                                    {
                                                System.out.println("File Present");
                                                //System.out.println(msg);
                                    }
                        }
            }
}