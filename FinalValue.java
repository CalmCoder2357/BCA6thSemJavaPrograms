import java.util.Scanner;

public class FinalValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from the user
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // Calculate final value using compound interest formula
        double finalValue = principal * Math.pow(1 + (rate / 100), years);

        // Display the final value
        System.out.println("Final value after " + years + " years: " + finalValue);

        scanner.close();
    }
}