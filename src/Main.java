/*
    Task: Create final static collection. Add and change elements.
 */
public class Main {

    /*
        There is no problem to add remove or update elements in static
        final collection. If we try to change reference we will have error.
        Collection is final and not immutable.
     */
    public static void main(String[] args) {
        Library.addBook(new Book("Don Quixote", 1605, 400));
        Library.addBook(new Book("Jane Eyre", 1847, 350));
        Library.changePages();
        Library.printBooks();
    }
}
