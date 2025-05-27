
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a string
        System.out.print("Enter a string to write to the file: ");
        String userInput = scanner.nextLine();

        try {
            // Create FileWriter object to write to output.txt
            FileWriter writer = new FileWriter("output.txt");

            // Write user input to the file
            writer.write(userInput);
            writer.close();

            System.out.println("Data has been written to output.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
