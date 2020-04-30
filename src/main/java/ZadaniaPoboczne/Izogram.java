package ZadaniaPoboczne;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Izogram {
    public static void main(String[] args) {
        /*
        2)Napisz program który sprawdzi czy podany wyraz jest izogramem
        (nie ma powtarzających się liter). Przykład:

        isIsogram("babol") --> false
        isIsogram("chips") --> true
         */

        System.out.println("Wpisz słowo");
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();

        if (isIsogram(word)){
            System.out.println("Słowo jest uzogramem");
        } else {
            System.out.println("Słowo nie jest uzogramem");
        }

    }
    private static boolean isIsogram (String word){
        String[] array = word.split("");
        //konwertowanie tablicy na listę unikalnych znaków
        Set<String> mySet = new HashSet<String>(Arrays.asList(array));

        if (word.length() == mySet.size()){
            return true;
        } else {
            return false;
        }


    }
}
