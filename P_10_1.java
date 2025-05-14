import java.io.*;
import java.util.Scanner;

public class P_10_1 {
    public static void main(String... args) throws IOException{
        int co = 0;
        FileReader fr = new FileReader("p_10_1.txt");
        Scanner fd = new Scanner(fr);

        String w = "done";

        System.out.println(w + " has occured " + co + " times.");
    }
}

