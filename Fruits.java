class Fruit {
    String name;
    String color;

    public void ripen() {
        System.out.println("The " + name + " is ripening.");
    }
}

class Apple extends Fruit {
    String variety;

    public void eat() {
        System.out.println("You are eating a delicious " + variety + " apple.");
    }
}

public class Fruits {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.name = "Apple";
        apple.color = "Red";
        apple.variety = "Alphonso";

        apple.ripen(); // Inherited from Fruit
        apple.eat(); // Specific to Apple
    }
}