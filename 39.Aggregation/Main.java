import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of it's structure,
        //               but the contained objects can exist independantly.
        
        Book book1 = new Book("48 Laws Of Power", 400);
        Book book2 = new Book("Harry Potter and the Prisoner of Azkaban", 350);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        Library library = new Library("Central Library", 1999, books);
        library.display();
    }
}