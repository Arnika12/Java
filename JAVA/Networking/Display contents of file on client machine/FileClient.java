import java.io.*;
import java.net.Socket;

public class FileClient {

    public static void main(String[] args) {
        try {
            Socket s = new Socket(localhost, 8080);
            System.out.println("Connected to server.");

            DataInputStream input = new DataInputStream(s.getInputStream());
            DataOutputStream output = new DataOutputStream(s.getOutputStream());

            String fileName = "/home/mitacsc/ArnikaFYMSCCA/abc.txt"; 
            output.writeUTF(fileName);
            output.flush();

            // Receive response from server
            boolean fileExists = input.readBoolean();

            if (fileExists) {
                // File exists, so receive and display its contents
                BufferedReader br = new BufferedReader(new InputStreamReader(input));
                String line;
                System.out.println("Contents of " + fileName + ":");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                System.out.println("Error: File " + fileName + " not found on the server.");
            }

            s.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

