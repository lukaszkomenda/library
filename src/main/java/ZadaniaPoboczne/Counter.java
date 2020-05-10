package ZadaniaPoboczne;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {
    public static void main(String[] args) {
        /*
        (TRUDNE i dla chętnych) Napisz program który w tablicy int'ow
        znajdzie wartość (jeszcze trudniejsze: znajdzie wszystkie wartości)
         która pojaiwła się parzystą ilość razy i wyświetli je na ekreanie.
         */

        int[] array = {1,2,3,5,6,1,2,3};

        arrayOfGeminateNumber(array);

    }
    private static void arrayOfGeminateNumber (int[] array){

        Map<Integer, Integer> intsCounter = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            intsCounter.merge(array[i], 1, Integer::sum);
        }
        List<Integer> evenTimesOccurredNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : intsCounter.entrySet()) {
            if (e.getValue() % 2 == 0) {
                Integer key = e.getKey();
                evenTimesOccurredNumbers.add(key);
            }
        }
        evenTimesOccurredNumbers.forEach(System.out::println);



    }

}
