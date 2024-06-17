import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input max height: ");
        int maxHeight = sc.nextInt();

        int totalLines = 2 * maxHeight - 1;
        int stars = 0;

        for (int i = 1; i <= totalLines; i++) {
            if (i <= maxHeight) {
                stars++;
            } else {
                stars--;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
