public class Main {

    public static void main(String[] args) {
        int length = 5;
        int width = 3;
        drawRectangle(length, width);
    }

    public static void drawRectangle(int length, int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}