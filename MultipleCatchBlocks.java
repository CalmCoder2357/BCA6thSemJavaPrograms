import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            double number = scanner.nextInt();

            System.out.print("Enter another integer (denominator): ");
            double denominator = scanner.nextInt();

            double result = number / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only!");
        } catch (Exception e) { // This catches any other unexpected exceptions
            System.out.println("An unexpected error occurred!");
            e.printStackTrace();
        } finally {
            scanner.close(); // Close the Scanner resource
            System.out.println("Program execution completed.");
        }
    }
}
