import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вершины треугольника
        double x1 = 0, y1 = 0;
        double x2 = 4, y2 = 4;
        double x3 = 6, y3 = 1;

        // Ввод координат точки
        System.out.println("Введите координаты точки (x и y):");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // Площадь треугольника ABC
        double areaABC = area(x1, y1, x2, y2, x3, y3);

        // Площадь треугольников PAB, PBC и PCA
        double areaPAB = area(x, y, x1, y1, x2, y2);
        double areaPBC = area(x, y, x2, y2, x3, y3);
        double areaPCA = area(x, y, x3, y3, x1, y1);

        // Проверка лежит ли точка внутри треугольника
        if (areaABC == areaPAB + areaPBC + areaPCA) {
            System.out.println("Точка (" + x + ", " + y + ") лежит внутри треугольника.");
        } else {
            System.out.println("Точка (" + x + ", " + y + ") не лежит внутри треугольника.");
        }
    }

    // Метод для вычисления площади треугольника по координатам вершин
    public static double area(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2.0);
    }
}