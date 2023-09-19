import org.example.Book;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Fantasy");
    }

    @Test
    public void hasName() {
        assertEquals("Harry Potter and the Philosopher's Stone", book.getName());
    }

    @Test
    public void hasAuthor() {
        assertEquals("J.K. Rowling", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Fantasy", book.getGenre());
    }

}
