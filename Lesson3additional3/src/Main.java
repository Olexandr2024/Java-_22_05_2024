import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Запрашиваем у пользователя координаты точки
        System.out.println("Введите координату x:");
        double x = sc.nextDouble();
        System.out.println("Введите координату y:");
        double y = sc.nextDouble();

        // Создаем точку и круг с радиусом 4 и центром в (0, 0)
        Point point = new Point(x, y);
        Circle circle = new Circle(new Point(0, 0), 4);

        // Проверяем, находится ли точка внутри круга
        if (pointInCircle(circle, point)) {
            System.out.println("Точка " + point + " находится внутри круга.");
        } else {
            System.out.println("Точка " + point + " находится снаружи круга.");
        }

        sc.close();
    }

    public static boolean pointInCircle(Circle circle, Point point) {
        double differenceX = point.getX() - circle.getCenter().getX();
        double differenceY = point.getY() - circle.getCenter().getY();
        return (Math.pow(differenceX, 2) + Math.pow(differenceY, 2)) <= Math.pow(circle.getRadius(), 2);
    }
}
