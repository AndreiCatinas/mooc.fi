
public class Main {

    public static void main(String[] args) {
        System.out.println(isAWeekDay("wes"));
        System.out.println(allVowels("aeiouaeiouuioae"));
    }
    
    public static boolean isAWeekDay(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) return true;
        return false;
    }
    
    public static boolean allVowels(String string) {
        if (string.matches("(a|e|i|o|u|ä|ö)+")) return true;
        return false;
    }
    
    public static boolean clockTime(String string) {
        if (string.matches("^([01][0-9]|[2][0-3]):([0-5][0-9]|60):([0-5][0-9]|60)$")) return true;
        return false;
    }
}
