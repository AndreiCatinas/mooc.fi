
public class Main {

    public static void main(String[] args) {
        // test method here
        //int[] array = {5, 1, 3, 4, 2};
       // System.out.println(sum(array));
        int[] array = {5, 1, 3, 4, 2, 5, 7, 8, 17, 15};
        printElegantly(array);
    }

    public static int sum(int[] array) {
        // Write code here
        int s = 0;
        
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        return s;
    }
    
    public static void printElegantly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
