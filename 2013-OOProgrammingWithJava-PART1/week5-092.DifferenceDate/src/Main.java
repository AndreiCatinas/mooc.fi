
public class Main {

    public static void main(String[] args) {
        // write testcode here

        MyDate first = new MyDate(2,6,2010);
        MyDate second = new MyDate(1, 5, 2000);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println(first + " and " + second + " difference in years: " + second.differenceInYears(first));
        
        System.out.println(first + " and " + second + " difference in years: " + first.differenceInYears(second));
        System.out.println(third + " and " + first + " difference in years: " + third.differenceInYears(first));
        System.out.println(first + " and " + third + " difference in years: " + first.differenceInYears(third));
        System.out.println(second + " and " + third + " difference in years: " + second.differenceInYears(third));
        System.out.println(third + " and " + second + " difference in years: " + third.differenceInYears(second));
   
    }
}
