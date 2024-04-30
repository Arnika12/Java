import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            // Connect to server
            Socket socket = new Socket("localhost", 1234);

            // Create input and output streams
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Client continuously sends messages to server
            String message;
            while ((message = userInput.readLine()) != null) {
                out.println(message);
            }

            // Close resources
            userInput.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
