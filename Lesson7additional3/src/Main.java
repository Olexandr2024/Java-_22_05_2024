import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinations(array, 0, new ArrayList<>(), combinations);

        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    public static void generateCombinations(int[] array, int index, List<Integer> current, List<List<Integer>> combinations) {
        if (index == array.length) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        current.add(array[index]);
        generateCombinations(array, index + 1, current, combinations);

        // Exclude the current element
        current.remove(current.size() - 1);
        generateCombinations(array, index + 1, current, combinations);
    }
}
