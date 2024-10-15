import java.util.*;
public class BookInterator implements Iterator<Book> {
private int potition=0;
private List<Book> books;

    public BookInterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return potition<books.size();
    }
    @Override
    public Book next() {
        return books.get(potition++);
    }
}
