import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private int age;
    private static final List<Book> BOOKS = new ArrayList<>();

    static {
        BOOKS.add(new Book("War and Peace", 1869, 500));
        BOOKS.add(new Book("Hamlet", 1599, 400));
        BOOKS.add(new Book("The brothers of karamazov", 1880, 600));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void addBook(Book book) {
        BOOKS.add(book);
    }

    public static void changePages() {
        for (int i = 0; i < BOOKS.size(); i++) {
            Book currentBook = BOOKS.get(i);
            currentBook.setPages(currentBook.getPages() * 2);
        }
    }

    public static void printBooks() {
        BOOKS.forEach(System.out::println);
    }
}
