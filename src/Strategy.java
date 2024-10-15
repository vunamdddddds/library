import java.util.Collections;
import java.util.*;
public class Strategy {

    interface StrategyBook{
        void sort(List<Book> books);
    }

    class SortByTitle implements StrategyBook{

        @Override
        public void sort(List<Book> books) {
            Collections.sort(books,Comparator.comparing(Book::getTitle));
        }
    }
    static class SortByAuthor implements StrategyBook{

        @Override
        public void sort(List<Book> books) {
            Collections.sort(books,Comparator.comparing(Book::getAuthor));
        }
    }
    static class SortByYear implements StrategyBook{

        @Override
        public void sort(List<Book> books) {
            Collections.sort(books,Comparator.comparing(Book::getYear));
        }
    }

}
