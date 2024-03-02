import java.util.Scanner;

public class ClothDiscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of cloth (mill/handloom): ");
        String clothType = scanner.nextLine().toLowerCase();

        System.out.println("Enter the price of the cloth: ");
        double price = scanner.nextDouble();

        double discount = calculateDiscount(clothType, price);
        double netAmount = price - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Net amount to be paid: " + netAmount);

        scanner.close();
    }

    public static double calculateDiscount(String clothType, double price) {
        switch (clothType) {
            case "mill":
                if (price <= 100) {
                    return 0;
                } else if (price <= 200) {
                    return price * 0.05;
                } else if (price <= 300) {
                    return price * 0.075;
                } else {
                    return price * 0.1;
                }
            case "handloom":
                if (price <= 100) {
                    return price * 0.05;
                } else if (price <= 200) {
                    return price * 0.075;
                } else if (price <= 300) {
                    return price * 0.1;
                } else {
                    return price * 0.15;
                }
            default:
                System.out.println("Invalid cloth type.");
                return 0; // Handle invalid input
        }
    }
}