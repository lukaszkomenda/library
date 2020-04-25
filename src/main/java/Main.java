import java.util.Scanner;

public class Main {

    private static Scanner S;

    public static void main(String[] args) {

        menu();

        S = new Scanner(System.in);

        while (true){
            int option = S.nextInt();
            switch (option){
                case 1:
                    System.out.println("Nazwa funkcjonalności nie została zaimplementowana");
                    break;
                case 2:
                    System.out.println("Nazwa funkcjonalności nie została zaimplementowana");
                    break;
                case 3:
                    System.out.println("Nazwa funkcjonalności nie została zaimplementowana");
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
}
