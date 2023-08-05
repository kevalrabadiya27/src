package ADJ;
import java.net.*;

public class AdvDemo {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("www.darshan.ac.in");
            InetAddress host = InetAddress.getLocalHost();
            System.out.println("Host "+host);
        }catch (UnknownHostException e){
            System.out.println(e);
        }
    }
}
