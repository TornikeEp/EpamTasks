public class Book {

    private String name;
    private int releaseYear;
    private int pages;

    public Book(String name, int releaseYear, int pages) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", pages=" + pages +
                '}';
    }
}
