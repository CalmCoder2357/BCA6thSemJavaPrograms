import java.util.Scanner;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double side) { // Constructor overloading for a square
        this(side, side);
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);

        // Get input for square (optional)
        System.out.print("Do you want to calculate the area of a square (y/n)? ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter the side length of the square: ");
            double side = scanner.nextDouble();
            Rectangle square = new Rectangle(side);
            double sqArea = square.calculateArea();
            System.out.println("Area of the square: " + sqArea);
        }

        scanner.close();
    }
}