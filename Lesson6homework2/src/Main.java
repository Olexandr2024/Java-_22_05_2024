import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку из слов, разделенных пробелами: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Самое длинное слово: " + longestWord);

        sc.close();
    }
}
