import java.io.*;
import java.net.*;

public class P_11_ser extends Thread{
    final int port = 9999;
    final String ip = "192.168.21.61";
    
    void connect() throws Exception{
        
    }
    public static void main(String... args) {
        P_11_ser ser = new P_11_ser();
        try{
        ser.connect();
    }catch(Exception e){}
    }
}

