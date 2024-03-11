/* 4. Write a program to accept a list of file names on the client machine and check how many exist on the server. 
      Display appropriate messages on the client side.*/

//Server side code 

import java.io.*;
import java.net.ServerSocket;
import java.net.*;
import java.util.*;

public class FilelistServer {

    public static void main(String[] args) {

        try {
        	  ServerSocket serverSoc = new ServerSocket(8080);
            System.out.println("Server is running on port " + 8080);

            while (true) {
                Socket clientSoc = serverSoc.accept();
                System.out.println("Client connected.");

                DataInputStream input = new DataInputStream(clientSoc.getInputStream());
                DataOutputStream output = new DataOutputStream(clientSoc.getOutputStream());

                // Receive the number of file names from the client
                int numberOfFiles = input.readInt();

                // Create a set to store unique file names
                Set<String> uniqueFileNames = new HashSet<>();

                // Receive each file name from the client
                for (int i = 0; i < numberOfFiles; i++) {
                    String fileName = input.readUTF();
                    uniqueFileNames.add(fileName);
                }

                // Check how many files exist on the server
                int existingFileCount = countExistingFiles(uniqueFileNames);

                // Send the count of existing files to the client
                output.writeInt(existingFileCount);
                output.flush();

                // Close the connection
                clientSoc.close();
                System.out.println("Client disconnected.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
        private static int countExistingFiles(Set<String> fileNames) {
        return fileNames.size();
    }
    
}

