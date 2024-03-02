public class Car {

    private String make;
    private String model;
    private int year;

    // Default constructor
    public Car() {
        this.make = "Mustang";
        this.model = "GT 1969";
        this.year = 1969;
        System.out.println("Default constructor called. Creating car with unknown details.");
    }

    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("Parameterized constructor called. Creating car: " + make + " " + model + " (" + year + ")");
    }

    // Getters (optional)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        // Create a car object using the default constructor
        Car car1 = new Car();

        // Display car1 details
        System.out.println("\nCar 1 details:");
        System.out.println("Make: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());

        // Create a car object using the parameterized constructor
        Car car2 = new Car("Honda", "Civic", 2023);

        // Display car2 details
        System.out.println("\nCar 2 details:");
        System.out.println("Make: " + car2.getMake());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Year: " + car2.getYear());
    }
}