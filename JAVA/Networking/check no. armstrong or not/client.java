import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());

            System.out.print("Enter a number: ");
            int number = Integer.parseInt(userInput.readLine());

            // Send number to server
            out.writeInt(number);
            out.flush(); // Flush the output stream

            // Receive result from server
            boolean isArmstrong = in.readBoolean();

            if (isArmstrong) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
