class Strbuf{

    public static void main(String... args) {
        char c[] = {'K','a','t','h','a','n'};
        String s = new String(c);
        StringBuffer sb = new StringBuffer("KATH");

        System.out.println("String : " + s);
        System.out.println("Length : " + s.length());
        System.out.println("Char at 1 : " + s.charAt(1));
        System.out.println("Replace : " + s.replace('a', 'e'));
        System.out.println("UPPER : " + s.toUpperCase());
        
    }
}


