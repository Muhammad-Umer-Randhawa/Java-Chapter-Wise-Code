import java.util.ArrayList;
public class Library {
    private String name;
    private int year;
    private ArrayList<Book> books;

    Library(String name, int year, ArrayList<Book> books){
        this.name = name;
        this.year = year;
        this.books = books;
    }
    void display(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books available: ");
        for(Book book: books){
            System.out.println(book.display());
            
        }
    }
}
