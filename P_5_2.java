
public class P_5_2{
    public static void main(String... args) {


        Ano_Inner aio = new Ano_Inner(){
            public void call(){
                System.out.println("Calling inside Anonymous inner class.");
            }
        };

        aio.call();
        
    }
}