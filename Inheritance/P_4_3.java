 interface Property{
    public void computePrice();
 }
 class Bungalow implements Property{
    String name;
    double constructionArea;
    double landArea;

    Bungalow(String n,double ca,double la){
        name = n;
        constructionArea = ca;
        landArea = la;
    }
    public void computePrice(){
        double tot = 0;
        tot += (500 * constructionArea);
        System.out.println("Construction cost : Rs." + tot);
        System.out.println("Additional cost : Rs." + (200 * landArea));
        tot += 200 * landArea;
        System.out.println("Land Cost : Rs." + (400 * landArea));
        tot += 400 * landArea;

        System.out.println("Total cost for bungalow of "+name+
        " having\nConstruction Area = " + constructionArea + 
        "sq feet\nLand area : " + landArea+ "sq feet is Rs. " + tot);
    }
 }
 class P_4_3{

    public static void main(String... args) {
        Bungalow b = new Bungalow("Kathan",1500,200);
        Flat f = new Flat("Nisarg", 1000);
        b.computePrice();
        f.computePrice();
    }
 }

 