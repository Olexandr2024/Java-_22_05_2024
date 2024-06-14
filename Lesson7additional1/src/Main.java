import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        String[] goods = new String[] { "Snikers", "Mars", "Kontik", "Twix" };
        int[] price = new int[] { 30, 30, 20, 25 };
        int[] count = new int[] { 40, 25, 30, 30 };

        String del = ";";
        File file = new File("report.csv");

        saveReport(file, del, goods, price, count);
    }

    public static void saveReport(File file, String del, String[] goods, int[] price, int[] count) {
        try (PrintWriter pw = new PrintWriter(file)) {

            for (int i = 0; i < goods.length; i++) {
                pw.println(goods[i] + del + price[i] + del + count[i]);
            }

        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}