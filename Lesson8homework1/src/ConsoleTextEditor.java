import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        System.out.println("Welcome to the console text editor.");
        System.out.println("Type your text below. Type ':wq' on a new line to save and quit.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals(":wq")) {
                break;
            }
            text.append(input).append(System.lineSeparator());
        }

        System.out.print("Enter the filename to save: ");
        String filename = scanner.nextLine();

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(text.toString());
            System.out.println("Text saved to " + filename);
        } catch (IOException e) {
            System.err.println("An error occurred while saving the file: " + e.getMessage());
        }
    }
}
