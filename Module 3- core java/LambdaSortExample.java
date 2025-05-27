
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<>();
        names.add("Bhargavi");
        names.add("Bhavani");
        names.add("Abhi");
        names.add("Sai");

        // Sort using lambda expression
        Collections.sort(names, (a, b) -> a.compareTo(b));

        // Display sorted list
        System.out.println("Sorted list of names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
