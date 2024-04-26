/* 3. Write a program which sends the name of a text file from the client to server and
displays the contents of the file on the client machine. If the file is not found, display an
error message.*/
    
// Server side code

import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) {

        try {
            ServerSocket serverSoc = new ServerSocket(8070);
            System.out.println("Server is running on port " + 8070);

            while (true) {
                // Accept incoming connection
                Socket clientSoc = serverSoc.accept();
                System.out.println("Client connected.");

                // Get input and output streams
                DataInputStream input = new DataInputStream(clientSoc.getInputStream());
                DataOutputStream output = new DataOutputStream(clientSoc.getOutputStream());

                // Receive the file name from the client
                String fileName = input.readUTF();
                System.out.println("Received request for file: " + fileName);

                // Check if the file exists
                File file = new File(fileName);
                if (file.exists() && file.isFile()) 
                {
                    output.writeBoolean(true); // Indicate that the file exists

                    // Send the contents of the file to the client
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = br.readLine()) != null) {
                        output.writeBytes(line + "\n");
                    }
                    br.close();
                } 
                else {
                    output.writeBoolean(false); // Indicate that the file does not exist
                }

                clientSoc.close();
                System.out.println("Client disconnected.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

