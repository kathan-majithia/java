import java.util.Stack;
import java.util.Scanner;

class GenericStack{
    public static void main(String... args){
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nEnter 1 to push element : ");
            System.out.println("Enter 2 to pop element : ");
            System.out.println("Enter 3 to peek element : ");
            System.out.println("Enter 4 to exit : ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1: System.out.println("Enter element : ");
                        int ele = sc.nextInt();
                        st.push(ele);
                        break;
                case 2:System.out.println("Poped element : " + st.pop());
                        break;
                case 3:System.out.println("Top most element : " + st.peek());
                        break;        
                case 4:System.exit(0);;
            }
        }
    }
}

