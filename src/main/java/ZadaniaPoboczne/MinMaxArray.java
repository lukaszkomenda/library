package ZadaniaPoboczne;

public class MinMaxArray {
    public static void main(String[] args) {
        /*
        Napisz program który zwróci najmniejszy i największy element z podanej tablicy Intów.
         */

        int[] array = {1,5,7};

        System.out.println("Największa wartość to: " + MaxValue(array));
        System.out.println("Najmniejsza wartość to: " + MinValue(array));

    }
    private static int MaxValue (int[] array){
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]){
                max = array[i];
            }
        }
        return max;
    }

    private static int MinValue (int[] array){
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
