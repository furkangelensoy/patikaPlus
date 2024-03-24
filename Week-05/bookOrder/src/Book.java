
public class Book implements Comparable<Book> {
    private String name;
    private int numberOfPages;
    private String authorName;
    private String releaseDate;

    public Book(String name, int numberOfPages, String authorName, String releaseDate) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.getName());
    }
}
