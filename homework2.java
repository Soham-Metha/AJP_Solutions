import java.io.*;
import java.net.*;
import java.util.*;

class server {
    server() {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            System.out.println("Server is up\nconnecting to client");
            Socket client = serverSocket.accept();
            BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter clientPrintWriter = new PrintWriter(client.getOutputStream(), true);
            BufferedReader clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println("Enter Text : ");
            String readString,sendString;
            while(true) {
                if((readString = clientReader.readLine()) != null)
                    System.out.println(readString);
                sendString = keyRead.readLine();
                clientPrintWriter.println(sendString);
                clientPrintWriter.flush();
            }
        } catch(Exception e){ }
    }
}

class client {
    client() {
        try {
            Socket client = new Socket("127.0.0.1", 3000);
            BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter clientPrintWriter = new PrintWriter(client.getOutputStream(), true);
            BufferedReader clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println("Enter Text : ");
            String readString,sendString;
            while(true) {
                sendString = keyRead.readLine();
                clientPrintWriter.println(sendString);
                clientPrintWriter.flush();
                if((readString = clientReader.readLine()) != null)
                    System.out.println(readString);
            }
        } catch(Exception e){ }
    }
}

public class homework2 {
    public static void main(String[] args) throws Exception {
        System.out.println("1. Server \n2. Client");
        switch (Integer.parseInt(new Scanner(System.in).nextLine())) {
            case 1:
                new server();
                break;
            case 2:
                new client();
                break;
            default:
                break;
        }
    }
}