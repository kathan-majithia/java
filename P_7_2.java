import java.util.Scanner;

public class P_7_2{
    public static void main(String... args) throws ArithmeticException3{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integers to be entered : ");
        int n = sc.nextInt();

        int sum = 0;
        try{
        if (n == 0)
            throw new ArithmeticException("Number of integers is zero.");
        System.out.println("Enter numbers : ");
        for(int i=0;i<n;i++){
            String t = sc.next();
            int ti = Integer.parseInt(t);
            if (ti < 0)
                throw new ArithmeticException("Value is negative.");
 
            sum += ti;
        }
        System.out.println("Average : " + (sum / (double)n));
        }
        catch(ArithmeticException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}

