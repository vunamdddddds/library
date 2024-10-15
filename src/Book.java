import java.util.*;

public class Book {
    private String title;
    private String author;
    private int Year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.Year = year;
    }
public Book(){

}
    @Override
    public String toString() {
        return title+"by"+author+"("+Year+")";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    static class Libary<T extends Book>{
        private List<T> books=new ArrayList<>();

        public void addBook(T newBook){
            books.add(newBook);
        }
        public List<T> getBooks(){
            return books;
        }

    }
}
