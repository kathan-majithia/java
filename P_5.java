import java.util.Scanner;

public class P_5 {
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of CPU : ");
        double p = sc.nextDouble();
        CPU cp = new CPU(p);
        System.out.println("Enter cores, cache and manufacturer of Processor : ");
        double c = sc.nextDouble();
        double ca = sc.nextDouble();
        String m = sc.next();
        CPU.Processor pr = cp.new Processor(c, ca, m);
        System.out.println("\nEnter memory, clockspeed and manufacturer of RAM : ");
        c = sc.nextDouble();
        ca = sc.nextDouble();
        m = sc.next();
        CPU.RAM ra = cp.new RAM(c, ca, m);

        System.out.println("\nPrice of CPU : $" + cp.price);

        pr.displayProcessorDetail();
        System.out.println("Cache (in mb) : " + pr.cache);

        ra.displayRAMDetail();
        System.out.println("ClockSpeed (in GHZ) : " + ra.clockSpeed);
    }
}

