import java.util.*;

class Kathan_Al{
    public static void main(String... args) {
        
        ArrayList<String> al = new ArrayList<>();
        al.add("Kathan");
        al.add("Majithia");
        al.add("Kamy");
        al.add("Nisarg");
        System.out.println("Size : " + al.size());
        al.remove("Nisarg");
        System.out.println("Content of Array List : " + al);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.addFirst(5);
        ll.remove(1);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Size : " + ll.size());
        System.out.println("Content of Linked List : " + ll);

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(1,"Kathan");
        lhm.put(2,"Kamy");
        lhm.put(3,"Majithia");
        lhm.put(4,"Meet");
        System.out.println("Content of LinkedHashMap : ");
        for(Map.Entry m : lhm.entrySet())
                System.out.println(m);


    }
}





