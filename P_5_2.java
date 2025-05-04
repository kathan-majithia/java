
class Meth_outer{
    void call(){
        System.out.println("Calling from method local outer class.");
        class Meth_Inner{
            void in_call(){
                System.out.println("Calling from Method local inner class.");
            }
        }
        Meth_Inner mi = new Meth_Inner();
        mi.in_call();
    }
}


public class P_5_2{
    public static void main(String... args) {
        Meth_outer mo = new Meth_outer();
        mo.call();

        Ano_Inner aio = new Ano_Inner(){
            public void call(){
                System.out.println("Calling inside Anonymous inner class.");
            }
        };

        aio.call();
        
    }
}