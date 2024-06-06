import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rn = new Random();
    int[] firstArray = new int[15];
    for (int i = 0; i < firstArray.length; i++) {
        firstArray[i] = rn.nextInt(100);
    }
    int[] secondArray = new int[firstArray.length * 2];

    for (int i = 0; i < firstArray.length; i++) {
        secondArray[i] = firstArray[i];
    }
    for (int i = 0; i < firstArray.length; i++) {
        secondArray[firstArray.length + i] = firstArray[i] * 2;
    }
        System.out.println("Первый массив: " + Arrays.toString(firstArray));
        System.out.println("Второй массив: " + Arrays.toString(secondArray));
    }



}