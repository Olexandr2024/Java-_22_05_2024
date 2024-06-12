import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = sc.nextLine();

        // Нахождение самого короткого слова
        String shortestWord = findShortestWord(text);

        System.out.println("Вовочка писал слово - «" + shortestWord + "»");
    }

    public static String findShortestWord(String text) {
        int length = text.length();

        for (int wordLength = 1; wordLength <= length; wordLength++) {
            String candidate = text.substring(0, wordLength);
            if (text.replace(candidate, "").isEmpty()) {
                return candidate;
            }
        }
        return text;  // Если не нашлось, возвращаем исходный текст (хотя такого быть не должно)
    }
}
