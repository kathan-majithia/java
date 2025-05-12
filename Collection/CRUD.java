import java.util.ArrayList;
import java.util.Scanner;

public class Kathan_sort {
    public static void main(String... args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\nEnter : \n1 to insert,2 to update, 3 to delete,4 to exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:System.out.println("Enter value : ");
                        al.add(sc.nextInt());
                    break;
                case 2:System.out.println("Enter index and value");
                        al.set(sc.nextInt(), sc.nextInt());
                        break;
        }
    }
}



