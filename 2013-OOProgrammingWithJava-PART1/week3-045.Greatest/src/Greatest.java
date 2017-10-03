
public class Greatest {

    public static int greatest(int n1, int n2, int n3) {
        if (Math.max(n1, n2) > Math.max(n2, n3)) {
            return Math.max(n1, n2);
        }
        else if (Math.max(n1, n2) < Math.max(n2, n3)) {
            return Math.max(n2, n3);
        }
        return Math.max(n1, n2);
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}