import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started and waiting for client...");
            
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected.");

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                // Read number from client
                int number = Integer.parseInt(in.readLine());
                
                // Check if the number is Armstrong
                boolean isArmstrong = isArmstrong(number);

                // Send result to client
                out.writeBoolean(isArmstrong);

                socket.close();
                System.out.println("Client disconnected.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0;
        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }

        return result == num;
    }
}
