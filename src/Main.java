/*
    Aggregation and composition task.
    Book has a page.(composition)
    Book has an author.(aggregation)
 */

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Stephen King", 74);
        Book book = new Book("It", author); //Aggregation
        System.out.println("Page size: " + book.getPageSize()); //composition
    }
}
