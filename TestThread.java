import java.util.*;

class Queuee{
    int size;
    Queue<Integer> qu;
    Queuee(int si){
        size = si;
        qu = new LinkedList<>();
    }
    public synchronized void nop(){
        notifyAll();
    }
}
class Producer implements Runnable{
    Queuee q;
    Producer(Queuee q){
        this.q = q;
    }
    public void produce(int i) throws InterruptedException{
        synchronized(q){

        while(q.qu.size() == q.size)
            q.wait();
        q.qu.add(i);
        System.out.println("Produced : " + i);
        q.nop();
        }
    }
    public void run(){
        try{
            for(int i=0;i<q.size;i++){
                produce(i);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class TestThread {
    public static void main(String... args) {
        Queuee q = new Queuee(15);  
        

        
    }
}

