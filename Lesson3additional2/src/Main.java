import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите шестизначное число:");
        String number = scanner.next();

        if (number.length() == 6) {
            boolean isPalindrome = true;
            for (int i = 0; i < number.length() / 2; i++) {
                if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("Число " + number + " является палиндромом.");
            } else {
                System.out.println("Число " + number + " не является палиндромом.");
            }
        } else {
            System.out.println("Введите корректное шестизначное число.");
        }
    }
}
