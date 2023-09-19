import org.example.Book;
import org.example.Library;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    private Library library;

    @Before
    public void before() {
        book1 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Fantasy");
        book2 = new Book("Fantastic Beasts and Where to Find Them", "Newt Scamander", "Educational");
        book3 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        book4 = new Book("A Brief History of Time", "Stepen Hawking", "Science");
        library = new Library("Blackhall Library", 3);
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canCountBooks() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void hasCapacity() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.countBooks());
    }


}
