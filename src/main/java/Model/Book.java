package Model;

public class Book {

    private static Long idcounter = 0L;

    Long id;
    String author;
    String title;
    String isbn;

    public Book(String author, String title, String isbn) {
        this.id = idcounter++;
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }


    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "\nid: " + id +
                "\nauthor: " + author +
                "\ntitle: " + title +
                "\nisbn: " + isbn;
    }
}
