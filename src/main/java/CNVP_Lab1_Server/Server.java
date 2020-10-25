package CNVP_Lab1_Server;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static ServerSocket createServerSocket() throws IOException {
        ServerSocket server;
        InetAddress address = InetAddress.getByName("169.254.31.188");
        // System.out.println("");//input ip address or use default
        server = new ServerSocket(5544, 50, address);    //InetAddress.getByName("hbmb"));  //192.168.0.104")
        return server;
    }

    public static void sendData(String receivedData, BufferedWriter writer) throws IOException {
        String dataToSend = DataToSend.getDataToSend(receivedData);
        writer.write(dataToSend + "\n");
        writer.flush();
    }

    public static void sendReceive(ServerSocket server) {

        while (true) {
            try {
                Socket socket = server.accept();
                System.out.println("client is accepted");
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                try {
                    String inputData = reader.readLine();
                    sendData(inputData, writer);

                } finally {
                    socket.close();
                    if (reader != null) {
                        reader.close();
                    }
                    if (writer != null) {
                        writer.close();
                    }
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
