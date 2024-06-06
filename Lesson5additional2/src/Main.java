public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 1, 2, 4, 4, 1, 7},
                {5, 1, 1, 4, 6, 9, 1, 3},
                {8, 8, 4, 1, 9, 2, 3, 3},
                {2, 6, 8, 7, 6, 0, 6, 9},
                {2, 1, 5, 4, 0, 5, 6, 3},
                {7, 1, 4, 9, 6, 3, 8, 9},
                {9, 0, 2, 4, 9, 7, 4, 6},
                {6, 3, 7, 7, 9, 3, 8, 9}
        };

        System.out.println("Исходный массив:");
        printMatrix(matrix);

        rotate90(matrix);
        System.out.println("Поворот на 90 градусов:");
        printMatrix(matrix);

        rotate90(matrix);
        System.out.println("Поворот на 180 градусов:");
        printMatrix(matrix);

        rotate90(matrix);
        System.out.println("Поворот на 270 градусов:");
        printMatrix(matrix);
    }

    // Поворот на 90 градусов по часовой стрелке
    public static void rotate90(int[][] matrix) {
        int n = matrix.length;

        // Транспонирование матрицы
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Реверсирование каждой строки
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }

    // Вывод матрицы
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
