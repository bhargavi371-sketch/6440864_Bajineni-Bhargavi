import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for marks
        System.out.print("Enter marks out of 100: ");
        int marks = scanner.nextInt();

        // Determine and display the grade
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade: C");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: D");
        } else if (marks >= 0 && marks < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid input. Please enter marks between 0 and 100.");
        }

        scanner.close();
    }
}

