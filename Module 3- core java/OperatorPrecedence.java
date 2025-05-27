
public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;        // Multiplication before addition
        int result2 = (10 + 5) * 2;      // Parentheses change the order
        int result3 = 20 / 4 + 3 * 2;    // Division and multiplication before addition
        int result4 = 100 - 10 / 2 + 3;  // Division first, then subtraction and addition

        // Display the results
        System.out.println("Result 1 (10 + 5 * 2) = " + result1);     // 10 + 10 = 20
        System.out.println("Result 2 ((10 + 5) * 2) = " + result2);   // 15 * 2 = 30
        System.out.println("Result 3 (20 / 4 + 3 * 2) = " + result3); // 5 + 6 = 11
        System.out.println("Result 4 (100 - 10 / 2 + 3) = " + result4); // 100 - 5 + 3 = 98
    }
}
