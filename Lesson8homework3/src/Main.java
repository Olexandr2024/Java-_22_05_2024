import java.io.File;

public class Main {
    public static void main(String[] args) {
        String directoryPath = "your_directory_path_here"; // Замените на путь к вашему каталогу
        listDirectories(directoryPath);
    }

    public static void listDirectories(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The provided path is either invalid or not a directory.");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println("The directory is empty or an I/O error occurred.");
            return;
        }

        System.out.println("Directories in " + directoryPath + ":");
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
    }
}
