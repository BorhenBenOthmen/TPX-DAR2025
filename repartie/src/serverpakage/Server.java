package serverpakage;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Le serveur attend la connexion d'un client...");

            Socket socket = serverSocket.accept();
            System.out.println("Un client est connecté.");

            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            PrintWriter out = new PrintWriter(os, true);

            String message = in.readLine();
            int x = Integer.parseInt(message);
            System.out.println("Le serveur a reçu : " + x);

            int resultat = x * 5;
            System.out.println("Résultat calculé : " + resultat);

            out.println(resultat);
            System.out.println("Résultat envoyé au client.");

            in.close();
            out.close();
            socket.close();
            serverSocket.close();
            System.out.println("Connexion fermée côté serveur.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
