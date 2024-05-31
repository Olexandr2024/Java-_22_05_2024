import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Введите длину стороны a:");
     int a = sc.nextInt();
     System.out.println("Введите длину стороны b:");
     int b = sc.nextInt();
     System.out.println("Введите длину стороны с:");
     int c = sc.nextInt();

     if ((a + b > c) && (a + c > b) && (b + c > a)) {
         System.out.println("Треугольник с такими сторонами существует.");
     } else {
         System.out.println("Треугольник с такими сторонами не существует.");
     }

    }
}