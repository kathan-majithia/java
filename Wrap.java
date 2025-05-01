class Wrap{
        public static void main(String... args){
        Integer on = 200;
        Character co = 'K';
        Boolean bo = true;

        System.out.println("Integer value : " + on);
        System.out.println("Char value : " + co);
        System.out.println("Boolean value : " + bo);    

        System.out.println("Binary : " + Integer.toBinaryString(120));
        System.out.println("MAX : " + Integer.MAX_VALUE);
        System.out.println("MIN : " + Integer.MIN_VALUE);
        System.out.println("REVERSE : " + Integer.reverse(345));
        System.out.println("SIZE : " + Integer.SIZE);
        System.out.println("HEX : " + Integer.toHexString(120));
    }
}
