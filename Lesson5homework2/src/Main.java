import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();


        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива [" + i + "]: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Ваш массив:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }


    }
}