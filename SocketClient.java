import java.io.*;
import java.net.*;

public class SocketClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 5000;

        try (Socket socket = new Socket(serverAddress, port)) {
            System.out.println("Connected to server.");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true
            );

            output.println("Hello Server!");

            String serverResponse = input.readLine();
            System.out.println("Server says: " + serverResponse);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}