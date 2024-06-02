import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем число, для которого нужно найти квадратный корень
        System.out.println("Введите число:");
        double number = scanner.nextDouble();

        // Запрашиваем начальное приближение
        System.out.println("Введите начальное приближение:");
        double guess = scanner.nextDouble();

        // Устанавливаем точность (разницу между текущим значением и квадратом числа,
        // при которой алгоритм останавливается)
        double epsilon = 0.00001;

        // Инициализируем переменную для хранения текущего приближения
        double currentGuess = guess;

        // Выполняем итерации до тех пор, пока разница между текущим значением и квадратом числа
        // не станет меньше заданной точности
        while (Math.abs(currentGuess * currentGuess - number) >= epsilon) {
            // Обновляем текущее приближение согласно итерационной формуле Герона
            currentGuess = (currentGuess + number / currentGuess) / 2;
        }

        // Выводим найденный корень
        System.out.println("Квадратный корень числа " + number + " = " + currentGuess);

        scanner.close();
    }
}
