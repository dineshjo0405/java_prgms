import java.util.Scanner;

public class Stopwatch {
    // Variables to store start and stop times
    private long startTime;
    private long stopTime;

    // Method to start the stopwatch
    public void start() {
        startTime = System.currentTimeMillis();  // Capture the start time
        System.out.println("Stopwatch started.");
    }

    // Method to stop the stopwatch and calculate elapsed time
    public void stop() {
        stopTime = System.currentTimeMillis();  // Capture the stop time
        long elapsedTime = stopTime - startTime;  // Calculate the elapsed time
        System.out.println("Elapsed time: " + (elapsedTime / 1000.0) + " seconds.");
    }

    // Main method to run the stopwatch
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'start' to begin the stopwatch:");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("start")) {
            stopwatch.start();  // Start the stopwatch
        }

        System.out.println("Enter 'stop' to stop the stopwatch:");
        input = scanner.nextLine();

        if (input.equalsIgnoreCase("stop")) {
            stopwatch.stop();  // Stop the stopwatch
        }

        scanner.close();
    }
} 
