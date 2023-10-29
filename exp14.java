import java.net.*;

public class exp14 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress i = InetAddress.getLocalHost();
        System.out.println(i);
        i = InetAddress.getByName("www.google.com");
        System.out.println(i);
        InetAddress[] j = InetAddress.getAllByName("www.google.com");
        for (InetAddress addr : j) {
            System.out.println(addr);
        }
    }
}
