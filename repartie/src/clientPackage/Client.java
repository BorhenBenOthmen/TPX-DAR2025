package clientPackage;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("Je suis un client pas encore connecté…");

        try {
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Je suis un client connecté.");

            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            PrintWriter out = new PrintWriter(os, true);
            int x;
            Scanner sc = new Scanner(System.in);
            do {
            	System.out.print("Entrez un entier x : ");
            	 x = sc.nextInt();
            	out.println(x);
                System.out.println("Nombre envoyé au serveur.");

                String reponse = in.readLine();
                System.out.println("Résultat reçu du serveur : " + reponse);

            }while(x != 0);
            
            in.close();
            out.close();
            socket.close();
            sc.close();
            System.out.println("Connexion fermée côté client.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
