import java.util.*;

public class col_sort {

    public static void main(String... args){
        int ar[] = {5,2,1,6,8};
        System.out.print("Before sorted array : ");
        for(int a : ar)
            System.out.print(" " + a);
        Arrays.sort(ar);

    }
}