import java.util.*;
public class Main {
    public static void main(String[] args) {
        ObServer.BookLibrary bookLibrary = new ObServer.BookLibrary();
        ObServer.user user=new ObServer.user("vuthenam");
        ObServer.user user2=new ObServer.user("TranVan");
        bookLibrary.addObserver(user);
        bookLibrary.addObserver(user2);
        bookLibrary.addBook(new Book("vuthenma","2323",2323));
        bookLibrary.addBook(new Book("TranVan","2323",2323323));
        bookLibrary.removeBook(new Book("TranVan","2323",2323323));
        }
    }

