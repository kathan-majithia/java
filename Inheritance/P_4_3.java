 interface Property{
    public void computePrice();
 }
 class P_4_3{

    public static void main(String... args) {
        Bungalow b = new Bungalow("Kathan",1500,200);
        Flat f = new Flat("Nisarg", 1000);
        b.computePrice();
        f.computePrice();
    }
 }

 