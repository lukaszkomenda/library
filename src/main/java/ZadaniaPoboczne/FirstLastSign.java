package ZadaniaPoboczne;

import java.util.Scanner;

public class FirstLastSign {
    public static void main(String[] args) {
        /*
        4) Napisz program który usunie pierwszy i ostatni znak podanego napisu
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Wpisz słowo:");
        String word = s.nextLine();

        System.out.println("Słowo bez pierwszej i ostatniej litery to: " +
                wordWithoutFirstAndLastLetters(word));

    }
    private static StringBuilder wordWithoutFirstAndLastLetters (String word){
        StringBuilder wordNew = new StringBuilder();
        char[] arrayWord = word.toCharArray();

        for (int i = 1; i < arrayWord.length - 1; i++) {
            wordNew.append(arrayWord[i]);
        }
        return wordNew;
    }

}
