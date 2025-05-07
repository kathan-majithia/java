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
    void deposit(int d){
        System.out.println("Old balance : " + bal);
        bal += d;
        System.out.println("New Balance : " + bal);
    }
    void withdraw(int w) throws ArithmeticException,NotEnoughMoneyException{
        if (w > bal)
            throw new ArithmeticException("Withdraw money is more than balance.");
        if (w - bal < 500)
            throw new NotEnoughMoneyException("Minimum balance should be greater than 500");  
        System.out.println("Old balance : " + bal);
        bal -= w;
        System.out.println("New Balance : " + bal);     
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

