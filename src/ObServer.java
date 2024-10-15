import java.util.ArrayList;
import java.util.List;

public class ObServer {
    interface Observer {
        void update(String message);
    }  // tạo 1 interface phương thức update truyền vào tham sô
   public static class user implements Observer {      // tạo 1 class người dùng
      private   String name;
        public user(String name) {
            this.name = name;
        }
        public void update(String message) {
            System.out.println(this.name + ": " + message);
        }
    }
    static class BookLibrary{   // 1 thư viên chung mọi hoạt động thêm xóa sẽ được thưc thi trong đây
        private List<Book> books = new ArrayList<Book>();  // tạo 1 danh  sách chứa sách
        private List<Observer> observers=new ArrayList<>();  // tạo 1 danh sách chua
        public void addObserver(Observer observer) {
            observers.add(observer);
        }
        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }
        public void notifyObservers(String message, String title) {
            for (Observer observer : observers) {
                observer.update(message);
            }
        }

        public void addBook(Book book) {
            books.add(book);
            notifyObservers("addBook",book.getTitle());
        }
        public void removeBook(Book book) {
            books.remove(book);
            notifyObservers("removeBook",book.getTitle());


        }

    }

}


