/*Write a program to accept a list of file names on the client machine and check how
many exist on the server. Display appropriate messages on the client side.*/

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class FilelistClient {

    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 8080;

        try {
            Socket soc = new Socket("localhost", 8080);
            System.out.println("Connected to server.");

            // Get input and output streams
            DataInputStream input = new DataInputStream(soc.getInputStream());
            DataOutputStream output = new DataOutputStream(soc.getOutputStream());

            // Prepare a list of file names
            List<String> fileNames = new ArrayList<>();
            fileNames.add("1.txt"); 
            fileNames.add("2.txt");
            fileNames.add("3.txt");

            // Send the number of file names to the server
            output.writeInt(fileNames.size());
            output.flush();

            // Send each file name to the server
            for (String fileName : fileNames) {
                output.writeUTF(fileName);
                output.flush();
            }

            // Receive the count of existing files from the server
            int existingFileCount = input.readInt();
            System.out.println("Number of existing files on the server: " + existingFileCount);

            soc.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

