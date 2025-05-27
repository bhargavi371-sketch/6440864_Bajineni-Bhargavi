
import java.util.List;
import java.util.stream.Collectors;

// Define the Person record
record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        // Create a list of Person records
        List<Person> people = List.of(
            new Person("Bhargavi", 20),
            new Person("Ravi", 17),
            new Person("Anjali", 22),
            new Person("Kiran", 16)
        );

        // Print all people
        System.out.println("All people:");
        people.forEach(System.out::println);

        // Filter and print people who are 18 or older
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("\nPeople aged 18 or older:");
        adults.forEach(System.out::println);
    }
}
