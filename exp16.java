import java.io.*;
import java.net.*;
import java.util.*;

class MyServer {
    String isPrime (int num) {
        boolean isPrime = true;
        int i = (int)Math.ceil(Math.sqrt(num));
        while (i>1) {
            if(num!=i && num%i==0) {
                isPrime = false;
                break;
            }
            i--;
        }
        return isPrime?"Prime":"Not Prime";
    }
    MyServer(){
        try{
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket client = serverSocket.accept();
            BufferedReader clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter clientWriter = new PrintWriter(client.getOutputStream(),true);
            int num = Integer.parseInt(clientReader.readLine());
            System.out.println("Entered num : "+num);
            clientWriter.println(isPrime(num));
            clientWriter.flush();
        } catch(Exception e) {}
    }
}
class MyClient {
    MyClient() {
        try{
            Socket client = new Socket("127.0.0.1",3000);
            BufferedReader clientReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter serverWriter = new PrintWriter(client.getOutputStream(),true);
            System.out.println("Enter num : ");
            serverWriter.println(clientReader.readLine());
            serverWriter.flush();
            System.out.println(serverReader.readLine());
        } catch(Exception e) {}
    }
}
public class exp16 {
    public static void main(String[] args) {
        System.out.println("1 = Server\n2 = Client");
        switch((new Scanner(System.in)).nextLine()) {
            case "1":
                new MyServer();
                break;
            case "2":
                new MyClient();
                break;
        }
    }
}