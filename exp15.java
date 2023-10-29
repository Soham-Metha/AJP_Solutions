import java.net.*;

class exp15 {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://www.google.com:80/");
        System.out.println(u.getProtocol());
        System.out.println(u.getHost());
        System.out.println(u.getPort());
        System.out.println(u.getFile());
    }
}