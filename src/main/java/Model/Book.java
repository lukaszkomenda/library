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
        try {
            this.isbn = validateISBN(isbn);
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
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
        return "\nid: " + id +
                "\nauthor: " + author +
                "\ntitle: " + title +
                "\nisbn: " + isbn;
    }

    private String validateISBN(String isbn) throws BookException {
        if (isIsbnCorrectByLength(isbn)){
            if (isIsbnCorrectByFirstNumbers(isbn)){
                if (isIsbnCorrectByChecksum(isbn)){
                    return isbn;
                } else {
                    throw new BookException("Błędny ISBN - nieodpowiednia suma kontrolna." +
                            "\n" + id +
                            "\n" + author +
                            "\n" + title +
                            "\n"+ isbn + "\n");
                }
            } else {
                throw new BookException("Błędny ISBN - nieodpowiednie pierwsze trzy cyfry.\n" +
                        "\n" + id +
                        "\n" + author +
                        "\n" + title +
                        "\n"+ isbn + "\n");
            }
        } else {
            throw new BookException("Błędny ISBN - nieodpowiednia liczba cyfr.\n" +
                    "\n" + id +
                    "\n" + author +
                    "\n" + title +
                    "\n"+ isbn + "\n");
        }
    }

    private boolean isIsbnCorrectByLength(String isbn) {
        if (isbn.length() == 13) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isIsbnCorrectByFirstNumbers(String isbn) {
        String firstNumbers = "978";

        if (firstNumbers.equals(isbn.substring(0,3))) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isIsbnCorrectByChecksum(String isbn) {

        char[] array = isbn.toCharArray();
        int result1 = 0;
        int checksum = 0;

        for (int i = 0; i < array.length; i++) {
            char sign = array[i];
            boolean isSign = Character.isDigit(sign);

            if (isSign) {
                int value = Character.getNumericValue(sign);

                if (i == array.length - 1) {
                    checksum += value;
                } else if (i % 2 == 0) {
                    result1 += value;
                } else {
                    result1 = result1 + (value * 3);
                }
            }
        }
        double result2 = result1 % 10;
        double result3 = 10 - result2;
        double result4 = result3 % 10;

        if (result4 == checksum) {
            return true;
        } else {
            return false;
        }
    }
}

