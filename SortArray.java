import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get array size from user
        System.out.print("Enter the number of elements in the list: ");
        int size = scanner.nextInt();

        // 2. Declare and initialize array
        int[] numbers = new int[size];

        // 3. Get user input for each element
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 4. Sort the array
        Arrays.sort(numbers);

        // 5. Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        scanner.close(); // Close the Scanner to prevent resource leaks
    }
}