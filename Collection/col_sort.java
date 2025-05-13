import java.util.*;

public class col_sort {

    public static void main(String... args){
        int ar[] = {5,2,1,6,8};
        System.out.print("Before sorted array : ");
        for(int a : ar)
            System.out.print(" " + a);
        Arrays.sort(ar);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(2);
        al.add(1);
        al.add(6);
        al.add(8);

        System.out.print("Before sorted : " + al);

        al.sort(null);

        System.out.print("After sorted : " + al);
    }
}