import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filePath = "ascii_art.txt";
        int width = 40;
        int height = 40;
        String pattern = generateCheckerBoardPattern(width, height);

        try {
            writeToFile(filePath, pattern);
            System.out.println("ASCII art successfully written to " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Метод для генерации узора шахматной доски
    private static String generateCheckerBoardPattern(int width, int height) {
        StringBuilder pattern = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if ((x + y) % 2 == 0) {
                    pattern.append('#');
                } else {
                    pattern.append(' ');
                }
            }
            pattern.append('\n');
        }
        return pattern.toString();
    }

    // Метод для записи узора в файл
    private static void writeToFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }
}
