public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{2, 3, 5, 1, 0, -1, 4};

        int maximum = findMax(array);
        int minimum = findMin(array);

        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }

    public static int findMax(int[] array) {
        int currentMax = array[0];
        for (int num : array) {
            if (num > currentMax) {
                currentMax = num;
            }
        }
        return currentMax;
    }

    public static int findMin(int[] array) {
        int currentMin = array[0];
        for (int num : array) {
            if (num < currentMin) {
                currentMin = num;
            }
        }
        return currentMin;
    }
}
