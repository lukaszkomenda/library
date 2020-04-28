package ZadaniaPoboczne;

import java.util.Scanner;

public class LiczbyRzymskie {

    private static final char[] roman = {'I', 'V', 'X'};

    public static void main(String[] args) {
        /*
        Napisz program który umożliwi dodanie 2 liczb w systemie
        rzymskim a następnie wyświetli wynik rónież w tym systemie. Przykład:

        Wprowadź pierwszą liczbę: I
        Wprowadź drugą liczbę: II
        Wynik to: III


        Wprowadź pierwszą liczbę: II
        Wprowadź drugą liczbę: VII
        Wynik to: IX
        */

        Scanner s = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę rzymską:");
        String roman1 = s.nextLine();
        System.out.println("Wpisz drugą liczbę rzymską:");
        String roman2 = s.nextLine();

        int wynik = romanConvert(roman1) + romanConvert(roman2);

        System.out.println("Wynik to: " + toRomanNumeral(wynik));


    }

    private static int romanConvert(String roman) {

        int number = 0;
        String romanNumeral = roman.toUpperCase();

        for (int i = 0; i < romanNumeral.length(); i++) {
            char convertToArabic = roman.charAt(i);

            switch (convertToArabic) {
                case 'M':
                    number += 1000;
                    break;
                case 'D':
                    number += 500;
                    break;
                case 'C':
                    number += 100;
                    break;
                case 'L':
                    number += 50;
                    break;
                case 'X':
                    number += 10;
                    break;
                case 'V':
                    number += 5;
                    break;
                case 'I':
                    number += 1;
                    break;
            }
            if (romanNumeral.contains("IV")) {
                number -= 2;
            }
            if (romanNumeral.contains("IX")) {
                number -= 2;
            }
            if (romanNumeral.contains("XL")) {
                number -= 10;
            }
            if (romanNumeral.contains("XC")) {
                number -= 10;
            }
            if (romanNumeral.contains("CD")) {
                number -= 100;
            }
            if (romanNumeral.contains("CM")) {
                number -= 100;
            }
        }
        return number;
    }

    private static String toRomanNumeral (int number){
        if (number < 1 || number > 3999){
            return "Błędna liczba.";
        }

        String s = "";

        while (number >= 1000){
            s += "M";
            number -= 1000;
        }
        while (number >= 900){
            s += "CM";
            number -= 900;
        }

        while (number >= 500) {
            s += "D";
            number -= 500;
        }
        while (number >= 400) {
            s += "CD";
            number -= 400;
        }
        while (number >= 100) {
            s += "C";
            number -= 100;
        }
        while (number >= 90) {
            s += "XC";
            number -= 90;
        }
        while (number >= 50) {
            s += "L";
            number -= 50;
        }
        while (number >= 40) {
            s += "XL";
            number -= 40;
        }
        while (number >= 10) {
            s += "X";
            number -= 10;
        }
        while (number >= 9) {
            s += "IX";
            number -= 9;
        }
        while (number >= 5) {
            s += "V";
            number -= 5;
        }
        while (number >= 4) {
            s += "IV";
            number -= 4;
        }
        while (number >= 1) {
            s += "I";
            number -= 1;
        }
        return s;
    }
}
