// 5. Write a server program which echoes messages sent by the client. 
//     The process continues till the client types “END”.

import java.io.*;
import java.net.*;

class ClientDemo {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5500);
            System.out.println("Client connected to server.");

            DataInputStream ios = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String message;
            while (true) {
                System.out.println("Enter message to send to server:");
                message = br.readLine();
                dos.writeUTF(message);
                if (message.equalsIgnoreCase("end")) {
                    System.out.println("Chatting terminated.");
                    break;
                }
                String response = ios.readUTF();
                System.out.println("Server response: " + response);
            }
            // Close resources
            dos.close();
            ios.close();
            s.close();
        } catch (IOException e) {
            // Handle IO exceptions
            System.err.println("Error: " + e.getMessage());
        }
    }
}
