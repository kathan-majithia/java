
import java.io.*;

class Thread1 extends Thread{
    int s,e;
    Thread1(int s,int e){
        this.s = s;
        this.e = e;
    }
    public void run(){
        try{
            for(int i=s;i<=e;i++){
                int fl = 0;
                for(int j = 2;j < i;j++){
                    if (i % 2 == 0){
                        fl = 1;
                        break;
                    }
                }
                if (fl == 0)
                    System.out.println("by thread : " + i);
                    Thread.sleep(0);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}


public class P_8_1{
    public static void main(String... args){
        int s = 2,e = 20;
        Thread1 t1 = new Thread1(s, e);
        Thread2 t2 = new Thread2(s, e);
        t1.start();
        new Thread(t2).start();
    }
}