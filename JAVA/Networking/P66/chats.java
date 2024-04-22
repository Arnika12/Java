import java.io.*;
import java.net.*;
import java.util.*;

public class chats {
    private static ArrayList<PrintWriter> clients = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected.");

                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                clients.add(out);

                Thread clientThread = new Thread(new ClientHandler(in, out));
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private BufferedReader in;
        private PrintWriter out;

        public ClientHandler(BufferedReader in, PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        public void run() {
            try {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Client: " + inputLine);
                    broadcast(inputLine, out);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                clients.remove(out);
            }
        }
    }

    private static void broadcast(String message, PrintWriter sender) {
        for (PrintWriter client : clients) {
            if (client != sender) {
                client.println(message);
            }
        }
    }
}