import java.net.*;
import java.util.*;

class exp15a {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://www.google.com/");
        URLConnection connection = u.openConnection();
        Long d = connection.getDate();
        if (d==0) System.out.println("Date is not available");
        else System.out.println("Date : "+(new Date(d)));
        System.out.println(connection.getContentType());
        d = connection.getExpiration();
        if (d==0) System.out.println("Expiration Date is not available");
        else System.out.println("Date : "+(new Date(d)));
        d = connection.getLastModified();
        if (d==0) System.out.println("Last Modified Date is not available");
        else System.out.println("Date : "+(new Date(d)));
        int ln = connection.getContentLength();
        if (ln==0) System.out.println("Length is not available");
        else System.out.println("Length : "+ln);
    }
}