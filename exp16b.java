import java.io.*;
import java.net.*;
import java.util.*;

class MyServer2 {
    String validate(String userName, String password) {
        if (userName.equals("Soham") && password.equals("1234"))
            return "Validated! Correct user";
        return "Not Validated!";
    }
    MyServer2(){
        try{
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket client = serverSocket.accept();
            BufferedReader clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter clientWriter = new PrintWriter(client.getOutputStream(),true);
            String receivedString1,receivedString2;
            receivedString1 = clientReader.readLine();
            receivedString2 = clientReader.readLine();
            clientWriter.println(validate(receivedString1, receivedString2));
            clientWriter.flush();
        } catch(Exception e) {}
    }
}
class MyClient2 {
    MyClient2() {
        try{
            Socket client = new Socket("localhost",3000);
            BufferedReader clientReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter serverWriter = new PrintWriter(client.getOutputStream(),true);
            System.out.println("Enter username :");
            serverWriter.println(clientReader.readLine());
            serverWriter.flush();
            System.out.println("Enter password :");
            serverWriter.println(clientReader.readLine());
            serverWriter.flush();
            System.out.println(serverReader.readLine());
        } catch(Exception e) {}
    }
}
public class exp16b {
    public static void main(String[] args) {
        System.out.println("1 = Server\n2 = Client");
        switch((new Scanner(System.in)).nextLine()) {
            case "1":
                new MyServer2();
                break;
            case "2":
                new MyClient2();
                break;
        }
    }
}