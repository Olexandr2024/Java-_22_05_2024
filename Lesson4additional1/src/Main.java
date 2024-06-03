import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input max height: ");
        int maxHeight = sc.nextInt();

        int totalLinse = 2 * maxHeight - 1;

        for (int i = 1; i <= totalLinse; i++) {
            int stars;
            if (i <= maxHeight) {
                stars = i;
            } else {
                stars = totalLinse - i + 1;
            }
            for (int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
