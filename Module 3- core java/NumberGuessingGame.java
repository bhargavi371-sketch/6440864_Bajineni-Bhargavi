
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        System.out.println("Secret Number (for debugging): " + secretNumber);

        int guess;

        System.out.println("Guess the number (between 1 and 100):");

        while (true) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

                System.out.println("Debug -> guess: " + guess + ", secretNumber: " + secretNumber);

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + secretNumber);
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Try again!");
                } else {
                    System.out.println("Too high. Try again!");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // consume invalid input
            }
        }

        scanner.close();
    }
}
