
import java.io.*;

public class P_8_1{
    public static void main(String... args){
        int s = 2,e = 20;
        Thread1 t1 = new Thread1(s, e);
        Thread2 t2 = new Thread2(s, e);
        t1.start();
        new Thread(t2).start();
    }
}