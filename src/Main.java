
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>(Arrays.asList("ACURA", "AUDI", "BENTLEY", "BMW", "BUGATTI", "FORD", "LAMBORGHINI", "BMW", "SUBARU"));
        ArrayList<Character> suka = new ArrayList<>(Arrays.asList('A', 'B', 'W'));
        for (int i = 0; i < cars.size(); i++) {
            if (suka.contains(cars.get(i).charAt(0))) {

                System.out.println(cars.get(i));
            }

        }
        System.out.println("helLLPOow worRLDDd".toUpperCase());
    }

}
