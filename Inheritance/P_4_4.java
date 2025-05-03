interface GeometricShape {
    double pi = 3.141516;
    public void describe();
}
interface TwoDShape extends GeometricShape {
    public double area();
}
interface ThreeDShape extends GeometricShape {
    public double volume();
}
public class P_4_4{
    public static void main(String... args) {
        Cone c = new Cone(5.4,12);
        Rectangle r = new Rectangle(12, 18);
        Sphere s = new Sphere(4.5);

        c.describe();
        System.out.println("Volume of cone : " + c.volume());

        r.describe();
        System.out.println("Perimeter of rectangle : " + r.perimeter());
        System.out.println("Area : " + r.area());

        s.describe();
        System.out.println("Volume of sphere : " + s.volume());
    }
}

