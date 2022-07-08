public class Book {

    private String name;
    private Author author;
    private final Page page = new Page("White", "A4"); //composition

    public Book(String name, Author author) { //aggregation
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPageSize(){
        return this.page.getSize();
    }
}
