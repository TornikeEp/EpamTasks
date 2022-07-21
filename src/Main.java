/*
    Task: Create final static collection. Add and change elements.
 */
public class Main {
    public static void main(String[] args) {
        Library.addBook(new Book("Don Quixote", 1605, 400));
        Library.addBook(new Book("Jane Eyre", 1847, 350));
        Library.changePages();
        Library.printBooks();
    }
}
