package serverpakage;
import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            /* creation de l'objet ServerSocket */
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("le serveur attend la connexion d'un client");
            Socket socket = serverSocket.accept();/*apres la cnx d'un client un objet socket sera cree cote serveur */
            System.out.println("un client est connecte");
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}