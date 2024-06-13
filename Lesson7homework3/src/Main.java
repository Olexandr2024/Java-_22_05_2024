public class Main {

    public static void main(String[] args) {

        int[] sequence = new int[]{-2, 0, 3, 5, 7, 9, 11, 15, 18, 21};
        int element = 5;


        int index = linearSearch(sequence, element);
        System.out.println("Index of element " + element + ": " + index);


        element = 20;
        index = linearSearch(sequence, element);
        System.out.println("Index of element " + element + ": " + index);
    }

    public static int linearSearch(int[] sequence, int element) {

        for (int i = 0; i < sequence.length; i++) {

            if (sequence[i] == element) {
                return i;
            }
        }

        return -1;
    }
}
