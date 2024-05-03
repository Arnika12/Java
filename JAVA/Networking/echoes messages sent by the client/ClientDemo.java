import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            String message;
            do {
                // Read input from user
                System.out.print("Enter message (type END to finish): ");
                message = scanner.nextLine();

                // Send message to server
                out.println(message);

                // Receive echo from server
                String echo = in.readLine();
                System.out.println("Server: " + echo);
            } while (!message.equals("END"));

            // Close resources
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
