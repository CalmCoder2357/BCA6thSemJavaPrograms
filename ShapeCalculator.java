import java.util.Scanner;

class Shape {
    public double getArea() {
        System.out.println("Please provide the necessary dimensions for the shape.");
        return 0; // This method should be overridden for specific shapes
    }
}

class Circle extends Shape {
    @Override
    public double getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the circle's radius: ");
        double radius = scanner.nextDouble();
        scanner.close();

        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    @Override
    public double getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rectangle's length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the rectangle's width: ");
        double width = scanner.nextDouble();
        scanner.close();

        return length * width;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the shape (Circle or Rectangle): ");
        String shapeChoice = scanner.nextLine();

        Shape shape;
        if (shapeChoice.equalsIgnoreCase("Circle")) {
            shape = new Circle();
        } else if (shapeChoice.equalsIgnoreCase("Rectangle")) {
            shape = new Rectangle();
        } else {
            System.out.println("Invalid choice. Please choose Circle or Rectangle.");
            scanner.close();
            return; // Exit program if invalid choice
        }

        double area = shape.getArea();
        System.out.println("The area of the " + shapeChoice + " is: " + area);

        scanner.close();
    }
}