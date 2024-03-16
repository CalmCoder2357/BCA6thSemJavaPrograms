import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Potential exceptions: division by zero and array index out of bounds
            int result = num1 / num2;  // ArithmeticException if num2 is 0
            int[] numbers = new int[50];
            numbers[100] = result;       // ArrayIndexOutOfBoundsException if accessing beyond array size
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers.");
        } finally {
            scanner.close();  // Close the Scanner resource (optional but good practice)
        }
    }
}