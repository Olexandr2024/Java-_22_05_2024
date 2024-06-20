import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        saveArrayToFile(array, "array.txt");
    }

    public static void saveArrayToFile(int[][] array, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    writer.write(array[i][j] + " ");
                }
                writer.write(System.lineSeparator());
            }
            System.out.println("Array saved to " + filename);
        } catch (IOException e) {
            System.err.println("An error occurred while saving the file: " + e.getMessage());
        }
    }
}
