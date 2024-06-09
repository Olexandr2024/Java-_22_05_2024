public class Main {

    public static void main(String[] args) {
        double pi = Math.PI;

        for (int i = 2; i <= 11; i++) {
            String format = "%." + i + "f";
            System.out.println(String.format(format, pi));
        }
    }
}
