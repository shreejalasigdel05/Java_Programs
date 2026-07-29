import javax.swing.*;
import java.io.*;
import java.net.*;

public class SocketServer {
    public static void main(String[] args){
        int port=5000;
        try(ServerSocket serverSocket=new ServerSocket(port)){
            System.out.println("Server started on port"+port);
            System.out.println("Waiting for client connection...");

            Socket socket=serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input=new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter output=new PrintWriter(
                    socket.getOutputStream(),true
            );
            String clientMessage=input.readLine();
            System.out.println("Client says: "+clientMessage);

            output.println("Hello Client! Message received.");

            socket.close();
            System.out.println("Connection closed");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
