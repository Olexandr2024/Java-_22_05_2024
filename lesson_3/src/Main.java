import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        // Ввод сторон треугольника
        System.out.println("Введите длину стороны a:");
        double a = scanner.nextDouble();

        System.out.println("Введите длину стороны b:");
        double b = scanner.nextDouble();

        System.out.println("Введите длину стороны c:");
        double c = scanner.nextDouble();

        // Проверка условия существования треугольника
        boolean isTriangle = (a + b > c) && (a + c > b) && (b + c > a);

        // Вывод результата
        if (isTriangle) {
            System.out.println("Треугольник с такими сторонами существует.");
        } else {
            System.out.println("Треугольника с такими сторонами не существует.");
        }
    }
}