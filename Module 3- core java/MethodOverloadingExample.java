
public class MethodOverloadingExample {

    // Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Call each overloaded method and display the results
        int sumIntTwo = add(5, 10);
        double sumDoubleTwo = add(5.5, 10.2);
        int sumIntThree = add(3, 6, 9);

        System.out.println("Sum of two integers: " + sumIntTwo);
        System.out.println("Sum of two doubles: " + sumDoubleTwo);
        System.out.println("Sum of three integers: " + sumIntThree);
    }
}
