import java.io.*;
import java.net.*;

public class ServerDemo {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server started. Waiting for client...");

            // Accept client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String message;
            do {
                // Read message from client
                message = in.readLine();
                System.out.println("Client: " + message);

                // Echo message back to client
                out.println("Server: " + message);
            } while (!message.equals("END"));

            // Close resources
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
            System.out.println("Server stopped.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
