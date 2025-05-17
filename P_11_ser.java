import java.io.*;
import java.net.*;

public class P_11_ser extends Thread{
    final int port = 9999;
    final String ip = "192.168.21.61";
    
    void connect() throws Exception{
        ServerSocket ss = new ServerSocket(port);
        Socket cs = ss.accept();
        Thread.sleep(1000);

        System.out.println("Client connected : " + cs.getInetAddress().getHostAddress());
        Thread.sleep(1000);

        InputStream is = cs.getInputStream();
        OutputStream os = cs.getOutputStream();

        PrintWriter wr = new PrintWriter(os,true);

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        while((line = br.readLine()) != null)
            System.out.println("Message from client : " + line);
        cs.close();
        ss.close();
        wr.close();

    }
    public static void main(String... args) {
        P_11_ser ser = new P_11_ser();
        try{
        ser.connect();
    }catch(Exception e){}
    }
}

