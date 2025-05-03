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
class Cone implements ThreeDShape {
    private double radius,height;
    public Cone (double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double volume(){
        return (pi * radius * radius * height / 3);
    }
    public void describe(){
        System.out.println("Cone has radius : " + radius + ", height : " + height);
    }
}
class Rectangle implements TwoDShape {
    private double width, height;
    public Rectangle (double width, double height) {
        this.height = height;
        this.width = width;
    }
    public double area(){
        return (height * width);
    }
    public double perimeter(){
        return (2 * (height + width));
    } 
    public void describe(){
        System.out.println("\nRectangle has Height : " + height + ", width : " + width);
    }
}
class Sphere implements ThreeDShape {
    private double radius;
    public Sphere (double radius){
        this.radius = radius;
    }
    public double volume(){
        return (4 * pi * radius * radius * radius);
    }
    public void describe() {
        System.out.println("\nSphere has radius : " + radius);
    }
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

