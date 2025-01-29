import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader_ex {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading inputs
        System.out.print("Enter your name: ");
        String name = reader.readLine(); // Reads a line of text

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.readLine()); // Converts string to integer

        System.out.print("Enter your salary: ");
        double salary = Double.parseDouble(reader.readLine()); // Converts string to double

        // Display the input
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
