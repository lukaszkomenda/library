import Model.Book;
import Model.Library;
import Model.LibraryException;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner S;

    public static void main(String[] args) {
        Library library = createLibraryWithBooks();

        menu();

        S = new Scanner(System.in);

        while (true) {
            System.out.println("\nWybierz właściwą opcję:");
            int option = S.nextInt();
            switch (option) {
                case 1:
                    library.printAllBooks();
                    break;
                case 2:
                    System.out.println("Wpisz autora książki:");
                    String author = S.nextLine();
                    author = S.next();
                    System.out.println("Wpisz tytuł książki:");
                    String title = S.nextLine();
                    title = S.next();
                    System.out.println("Wpisz ISBN książki:");
                    String isbn = S.nextLine();
                    isbn = S.next();
                    library.addBook(author, title, isbn);
                    System.out.println("Dodano książkę");
                    break;
                case 3:
                    System.out.println("Wybierz id książki: ");
                    Long deleteOption = S.nextLong();
                    try {
                        library.deleteBookById(deleteOption);
                        System.out.println("Usunięto książkę");
                    } catch (LibraryException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Wybierz poprawną opcję.");
            }
        }
    }


    private static void menu() {
        System.out.println("Witaj w bibliotece! Co mogę dla ciebie zrobić? \n" +
                "1) Wyświetl wszystkie książki \n" +
                "2) Dodaj książkę \n" +
                "3) Usuń książkę");
    }

    private static Library createLibraryWithBooks() {
        return new Library(new Book[]{
                new Book("Juliusz Słowacki", "Balladyna", "9788373272170"),
                new Book("Jan Brzechwa", "Akademia pana Kleska", "9788371530326"),
                new Book("Arkady Fiedler", "Dywizjon 303", "9788381271738"),
                new Book("Henryk Sienkiewicz", "Latarnik", "9788387139803"),
                new Book("Juliusz Słowacki", "Kordian", "9788389524027")
        });
    }

}
