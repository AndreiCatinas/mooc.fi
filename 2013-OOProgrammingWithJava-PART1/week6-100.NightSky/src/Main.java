
public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky NightSky = new NightSky(0.1, 60, 20);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
