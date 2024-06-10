import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите максимальную ширину (нечетное число): ");
        int maxHeight = sc.nextInt();

        int totalLines = 2 * maxHeight - 1;
        int stars = 1;

        for (int i = 1; i <= totalLines; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < maxHeight) {
                stars++;
            } else {
                stars--;
            }
        }
    }
}