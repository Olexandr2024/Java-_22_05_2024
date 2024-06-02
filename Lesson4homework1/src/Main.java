import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите число n (4 < n < 16):");
        int n = sc.nextInt();


        if (n <= 4 || n >= 16) {
            System.out.println("Число должно быть больше 4 и меньше 16.");
        } else {
            long factorial = 1;


            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }


            System.out.println("Факториал числа " + n + " = " + factorial);
        }


    }
}
