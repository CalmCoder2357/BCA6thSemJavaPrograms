public class StaticExample {
    // static variable
    public static int count = 0;

    // static method
    public static void incrementCount() {
        count++;
    }

    // static nested class
    public static class InnerClass {
        public void printCount() {
            System.out.println("Count: " + count);
        }
    }

    public static void main(String[] args) {
        // accessing static variable
        System.out.println("Initial count: " + count);

        // accessing static method
        incrementCount();
        System.out.println("Updated count: " + count);

        // accessing static nested class
        InnerClass inner = new InnerClass();
        inner.printCount();
}
}
