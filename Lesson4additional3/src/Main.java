import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число для нахождения квадратного корня: ");
        double number = sc.nextDouble();

        if (number < 0) {
            System.out.println("Число должно быть неотрицательным.");
            return;
        }

        System.out.println("Введите точность вычисления: ");
        double epsilon = sc.nextDouble();

        double sqrtValue = sqrt(number, epsilon);
        System.out.println("Квадратный корень числа " + number + " = " + sqrtValue);
        System.out.println("Проверка с Math.sqrt: " + Math.sqrt(number));

    }
    public static double sqrt(double a, double err) {
        double x0 = a;
        double x1 = 0.5 * (x0 + a / x0);
        double d = Math.abs(x1 - x0);
        while (d >= 2 * err && d * d >= 2 * err) {
            x0 = x1;
            x1 = 0.5 * (x0 + a / x0);
            d = Math.abs(x1 - x0);
        }
        return x1;
    }
}