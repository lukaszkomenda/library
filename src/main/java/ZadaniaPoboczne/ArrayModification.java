package ZadaniaPoboczne;

import java.util.Arrays;

public class ArrayModification {
    public static void main(String[] args) {
        /*
        5) Napisz metodę która przyjmie tablicę stringów i zmodyfikuje ją w następujący sposób:
        - wszyystkie litery w kazdym ze stringów powinny mieć zmienione wielkości
        (mała->duża, duża->mała)
        - wszystkie cyfry z wyjątkiem 0 powinny być "odbite od 10" ( 3 -> 7, 5->5, 9->1, 0->0)
        - cała tablica powinna zostać odwrócona (pierwszy element ostatnim, drugi przedostatinim...)
         */

        String[] arrayOfText = {"10 Downing Street", "Al. Ujazdowskie 1/3, 00-583 Warszawa",
                                "ul. Wiejska 4/6/8 00-902 Warszawa"};

//        System.out.println(Arrays.toString(ArrayOfNewText(arrayOfText)));

//        String text = "10 Downing Street";

        convertArray(arrayOfText);

    }
    private static StringBuilder modifatesentence(String sentence){
        StringBuilder arrayOfNewText = new StringBuilder();

        char[] arrayOfSign = sentence.toCharArray();

        for(char sign : arrayOfSign) {
                boolean isNumber = Character.isDigit(sign);
                boolean isLetter = Character.isLetter(sign);
                boolean isLowerCase = Character.isLowerCase(sign);

                if (isNumber){
                    int numberOfSign = Character.getNumericValue(sign);
                    if (numberOfSign != 0){
                        numberOfSign += -10;
                    }
                    arrayOfNewText.append(numberOfSign);
                } else if (isLetter){
                    if (isLowerCase){
                        arrayOfNewText.append(Character.toUpperCase(sign));
                    } else {
                        arrayOfNewText.append(Character.toLowerCase(sign));
                    }
                } else {
                    arrayOfNewText.append(sign);
                }
        }

        return arrayOfNewText;
    }

    private static void convertArray (String[] array){
        for (int i = 0; i < array.length; i++) {
            String text = array[i];
            System.out.println(modifatesentence(text));
        }
    }
}
