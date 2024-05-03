import java.net.*;
import java.io.*;

public class server {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(8070);
            System.out.println("Waiting for client...");

            Socket s = ss.accept();
            System.out.println("Client connected");

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());

			String filename=dis.readUTF();
			System.out.println("RECEIVED REQUEST FOR FILE "+ filename);

			File f=new File(filename);
			if(f.exists()){
				dout.writeBoolean(true);

				BufferedReader br=new BufferedReader(new FileReader(filename));
				String line;
				if((line = br.readLine()) != null){
					dout.writeUTF(line);
				}
				br.close();
			}
			else{
				dout.writeBoolean(false);
			}
			s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
