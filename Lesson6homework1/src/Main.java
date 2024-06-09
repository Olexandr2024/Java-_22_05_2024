import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст: ");
        String text = sc.nextLine();

        int count = 0;
        for (char ch : text.toCharArray()) {
            if (ch == 'b' || ch == 'B') {
                count++;
            }
        }

        System.out.println("Символ 'b' встречается " + count + " раз(а).");

        sc.close();
    }
}
