import java.io.*;

public class P_10_3 {
    public static void main(String... args) {
        File f = new File("F:\\SEM 4\\12302040501025_Java\\Collection");
        if(f.isDirectory()){
            System.out.println("Dir : " + f.getPath());
            String li[] = f.list();
            System.out.println("File names : ");
            for(int i=0;i<li.length;i++){
                File l = new File(f.getPath() + "//" + li[i]);
                if(l.isFile())
                    System.out.println(li[i]);
            }
        }else{
            System.out.println("It is not a directory");
        }
    }
}
