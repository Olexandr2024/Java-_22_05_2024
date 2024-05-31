import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите четырехзначное число:");
        int number = sc.nextInt();


        if (number < 1000 || number > 9999) {
            System.out.println("Введенное число не является четырехзначным.");
        } else {

            int digit1 = number / 1000;
            int digit2 = (number / 100) % 10;
            int digit3 = (number / 10) % 10;
            int digit4 = number % 10;


            int leftSum = digit1 + digit2;
            int rightSum = digit3 + digit4;


            if (leftSum == rightSum) {
                System.out.println("Это счастливый билет.");
            } else {
                System.out.println("Это не счастливый билет.");
            }
        }


    }
}
