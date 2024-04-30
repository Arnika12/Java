import java.io.*;
import java.net.*;

public class chatserver {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started and waiting for clients...");
            
            // Accept client connections
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Server continuously listens for messages from client
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Client: " + message);
            }

            // Close resources
            in.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
