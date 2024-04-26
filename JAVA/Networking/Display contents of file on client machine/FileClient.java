/*3. Write a program which sends the name of a text file from the client to server and
displays the contents of the file on the client machine. If the file is not found, display an
error message. */

// Client Side Code

import java.io.*;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8070);
            System.out.println("Connected to server.");

            DataInputStream input = new DataInputStream(s.getInputStream());
            DataOutputStream output = new DataOutputStream(s.getOutputStream());

            String fileName = "1.txt"; 
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
                br.close();
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

