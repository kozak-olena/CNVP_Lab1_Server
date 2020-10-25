package CNVP_Lab1_Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket server = Server.createServerSocket();
            Server.sendReceive(server);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
