import java.util.*;

class Book implements Comparable<Book>{
    int id;
    String title,author,publisher;

    Book(int i,String t,String a,String p){
        id = i;
        title = t;
        author = a;
        publisher = p;
    }
    public int compareTo(Book b){
        if (this.id == b.id)
            return 0;
        else if(this.id > b.id)
            return 1;
        else
            return -1;    
    }
    public String toString(){
        return "Book {" + "\nid = "+ id + "\n,title = " + title + "\n, author = " + 
        author + "\n, publisher = " + publisher + "\n}\n";
    }

    public static void main(String... args){
        Book b1 = new Book(12,"Maze Runner","James Dashner","Penguin");
        Book b2 = new Book(25,"Attack on Titan","Hajime Isayama","Manga");
        Book b3 = new Book(7,"Diary of a Wimpy Kid","Jeff Kinney","Amulet");

        ArrayList<Book> al = new ArrayList<>();
        al.add(b1);
        al.add(b2);
        al.add(b3);

        Collections.sort(al);

        System.out.println("Sorting Books on the basis of Book id : ");
        System.out.println(al);
        
    }
}




