package ADJ.oneWayCom;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(888);
        Socket s = ss.accept();
        OutputStream obj = s.getOutputStream();
        PrintStream prt = new PrintStream(obj);
        prt.printf("hello snkwjoi");
        ss.close();
        s.close();
        prt.close();
    }
}
