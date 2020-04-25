package Model;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void printAllBooks() {
        for (Book book: books) {
            System.out.println(book);
        }
    }

    public void deleteBookById(Long id){
        for (int i = 0; i < books.length; i++) {
            
        }
    }
}
