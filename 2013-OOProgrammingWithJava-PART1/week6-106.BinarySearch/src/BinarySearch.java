public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int mid = (beginning + end) /2;
            // restrict the search area 
            if (array[mid] == searchedValue) {
                return true;
            }
            else if (searchedValue > array[mid]) {
                beginning = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
}
