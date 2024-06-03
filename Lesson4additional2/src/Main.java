import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите максимальную ширину (нечетное число): ");
        int width = sc.nextInt();

        // Проверка на нечетность введенного числа
        if (width % 2 == 0) {
            System.out.println("Пожалуйста, введите нечетное число.");
            return;
        }

        int mid = width / 2 + 1; // Средняя строка

        // Верхняя часть песочных часов
        for (int i = 0; i < mid; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Нижняя часть песочных часов
        for (int i = mid - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
