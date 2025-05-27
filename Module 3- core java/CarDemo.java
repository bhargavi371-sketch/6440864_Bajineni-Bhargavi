
// Define the Car class
class Car {
    String make;
    String model;
    int year;

    // Constructor to initialize the car object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Create Car objects
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2018);

        // Call displayDetails() method on each object
        System.out.println("Details of car1:");
        car1.displayDetails();

        System.out.println("\nDetails of car2:");
        car2.displayDetails();
    }
}
