import java.util.Scanner;
class CPU {
    double price;

    CPU(double p) {
        price = p;
    }
    class Processor {
        double cores, cache;
        String manufacturer;

        Processor(double c, double ca, String m) {
            cores = c;
            cache = ca;
            manufacturer = m;
        }
        double getCache() {
            return cache;
        }
        void displayProcessorDetail() {
            System.out.println("\nProcessor details...");
            System.out.println("Cores : " + cores + " : Manufacturer : " + manufacturer);
        }
    }
    protected class RAM {
        double memory;
        String manufacturer;
        double clockSpeed;

        RAM(double c, double ca, String m) {
            memory = c;
            clockSpeed = ca;
            manufacturer = m;
        }
        double getClockSpeed() {
            return clockSpeed;
        }
        void displayRAMDetail() {
            System.out.println("\nRAM details...");
            System.out.println("Memory : " + memory + " : Manufacturer : " + manufacturer);
        }
    }
}
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

