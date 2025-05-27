
// Define a class that implements Runnable
class MessagePrinter implements Runnable {
    private String message;

    public MessagePrinter(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        // Print the message 5 times
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        // Create Runnable objects
        Runnable task1 = new MessagePrinter("Thread 1 is running");
        Runnable task2 = new MessagePrinter("Thread 2 is running");

        // Create Thread objects
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
