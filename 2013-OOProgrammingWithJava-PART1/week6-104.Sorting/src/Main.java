
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        //              0   1  2  3  4
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        int small = array[0];
        for (int i = 0; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }
        return small;
    }

    public static int indexOfTheSmallest(int[] array) {
        return indexOfTheSmallestStartingFrom(array, 0);
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int small = array[index];
        int ind = index;
        for (int i = index; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = 0;
        tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            
        }
    }
}
