import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 0, 7, -5, 4, 10, 3, 6  };
        System.out.println("Исходный массив: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Зеркально перевернутый массив: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
