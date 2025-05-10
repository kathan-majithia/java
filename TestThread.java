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
public class TestThread {
    public static void main(String... args) {
        Queuee q = new Queuee(15);  
        

    }
}

