import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class spam {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Get the elements of the array from the user
        double[] numbers = new double[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Close the Scanner
        scanner.close();

        // Calculate mean, median, and mode
        double mean = calculateMean(numbers);
        double median = calculateMedian(numbers);
        double mode = calculateMode(numbers);

        // Display the results
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }

    // Remaining methods remain the same...
}
