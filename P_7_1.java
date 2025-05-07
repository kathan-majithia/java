class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException(String m){
        super(m);
    }
}
class Bank{
    int bal;
    public Bank(int b){
        bal = b;
    }
}
public class P_7_1{
    public static void main(String... args){
        Bank b = new Bank(10000);

        b.deposit(4000);
        try{
            b.withdraw(13600);
        }
        catch(Exception e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}

