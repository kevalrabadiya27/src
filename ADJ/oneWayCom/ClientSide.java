package ADJ.oneWayCom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSide {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost",888);
        InputStream ins = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(ins));
        String ReceivedMeg = br.readLine();
        System.out.println(ReceivedMeg);
        br.close();
        s.close();
    }
}
