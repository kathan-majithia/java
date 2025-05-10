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
class Consumer implements Runnable{
    Queuee q;
    int id;
    Consumer(Queuee q,int id){
        this.q = q;
        this.id = id;
    }
    public void consume() throws InterruptedException{
        synchronized(q){

        while(q.qu.isEmpty())
            q.wait();
        int v = q.qu.poll();
        System.out.println("Consumed ("+id+") : " + v);

        q.nop();
        }
    }
    public void run(){
        try{
            for(int i=0;i<q.size;i++){
                consume();
                Thread.sleep(150);
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

