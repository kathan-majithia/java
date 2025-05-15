import java.io.*;

public class P_10_2 {
    public static void main(String... args) {
        try(BufferedReader red = new BufferedReader(new FileReader("P_10_2.java"))){
            String line;
            while((line = red.readLine()) != null)
                System.out.println(line);
        }catch(IOException e){
            System.out.println(e);
        }     
    }
}
