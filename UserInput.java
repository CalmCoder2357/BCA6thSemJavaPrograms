import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

    public static void main(String[] args) throws IOException {
        // Create a BufferedReader object to read from standard input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user for input
        System.out.print("Enter your name: ");

        // Read the user's input as a string
        String name = reader.readLine();

        // Print the user's input
        System.out.println("Hello, " + name + "!");
    }
}