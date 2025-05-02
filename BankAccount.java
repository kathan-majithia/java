import java.util.Scanner;

class BankAccount{
    String de_name,acc_type;
    int acc_no;
    double balance;
    Scanner sc = new Scanner(System.in);

    BankAccount(){}
    
    void BalanceInquiry(){
        System.out.println("\nTotal balance of " + de_name + " having " + acc_type+
            "account with Account number " + acc_no + " = " + balance);
    }
    public static void main(String... args) {
        int s = 1;
        Scanner sc = new Scanner(System.in);
        BankAccount nis = new BankAccount();
        boolean run = true;
        while (run) { 
        System.out.println("\nEnter 1 to create account\nEnter 2 to deposit amount\nEnter 3 to withdraw money"+
            "\nEnter 4 to check Balance\nAnything else to exit : ");
        int ch = sc.nextInt();
            switch(ch){
                case 1:nis = new BankAccount(s++);
                    nis.createAcc();;
                    break;
                case 2:nis.Deposit();break;
                case 3:nis.withdraw();break;
                case 4:nis.BalanceInquiry();break;
                case 5: run = false;       
            }
        }
    }
}