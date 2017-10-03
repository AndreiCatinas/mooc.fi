
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder string = new StringBuilder();
        string.append("{ \n");
        for (int i = 0; i < t.length; i++) {
            if (i % 4 == 0) {
                if (i + 1 != t.length) {
                    string.append(" " + t[i] + ", ");
                } else {
                    string.append(" " + t[i] + "\n");
                }
            } else if (i % 4 == 3 && (i + 1 != t.length)) {
                string.append(t[i] + ",\n");
            } else if (i + 1 == t.length) {
                string.append(t[i] + "\n");
            } else {
                string.append(t[i] + ", ");
            }
        }
        string.append("}");

        return string.toString();
    }
}
