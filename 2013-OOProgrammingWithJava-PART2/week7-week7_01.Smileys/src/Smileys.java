
public class Smileys {
    
    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        System.out.println("");
        printWithSmileys("Beerbottle");
        System.out.println("");
        printWithSmileys("Interface");
        System.out.println("");
        printWithSmileys("AB");
        System.out.println("");
    }
    
    private static void printSmileyLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }
    
    private static String formatString(String str) {
        String ret = "";
        
        if (str.length() % 2 == 0) {
            return ":) " + str + " :)";
        }
        return ":) " + str + "  :)";
    }
    
    private static void printWithSmileys(String str) {
        str = formatString(str);
        int n = str.length() / 2;
        printSmileyLine(n);
        System.out.println(str);
        printSmileyLine(n);
    }
}
