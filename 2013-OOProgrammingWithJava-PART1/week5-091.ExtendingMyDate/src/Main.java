
public class Main {

    public static void main(String[] args) {
        // test your code here
        MyDate day = new MyDate(25, 2, 2011);
        MyDate newDate = day.afterNumberOfDays(365);
        System.out.println(day);
        System.out.println(newDate);
    }
}
