package clientPackage;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("Je suis un client pas encore connecté…");
        try {
            Socket socket = new Socket("localhost", 1234);
            System.out.println("je suis un client connecté");
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}