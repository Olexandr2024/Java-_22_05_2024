import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int number1, number2, number3, number4, maxNumber;


        System.out.println("Введите число 1:");
        number1 = sc.nextInt();
        System.out.println("Введите число 2:");
        number2 = sc.nextInt();
        System.out.println("Введите число 3:");
        number3 = sc.nextInt();
        System.out.println("Введите число 4:");
        number4 = sc.nextInt();


        maxNumber = number1;

        if (number2 > maxNumber) {
            maxNumber = number2;
        }
        if (number3 > maxNumber) {
            maxNumber = number3;
        }
        if (number4 > maxNumber) {
            maxNumber = number4;
        }


        System.out.println("Самое большое число = " + maxNumber);
    }
}