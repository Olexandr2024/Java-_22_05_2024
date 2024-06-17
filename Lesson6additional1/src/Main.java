import java.util.Scanner;

public class Main {

    private static final String[] LESS_THAN_TWENTY = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How much money do you have?");
        String amount = sc.nextLine();

        // Replace comma with dot for parsing
        amount = amount.replace(",", ".");

        // Split the input into dollars and cents
        String[] parts = amount.split("\\.");
        int dollars = Integer.parseInt(parts[0]);
        int cents = 0;

        if (parts.length > 1) {
            // Ensure the cents part is exactly two digits
            String centsPart = parts[1];
            if (centsPart.length() == 1) {
                centsPart += "0";
            }
            cents = Integer.parseInt(centsPart);
        }

        String dollarsText = convert(dollars) + " dollar" + (dollars != 1 ? "s" : "");
        String centsText = convert(cents) + " cent" + (cents != 1 ? "s" : "");

        System.out.println("You have: " + dollarsText + " " + centsText);
    }

    private static String convert(int num) {
        if (num == 0) return "zero";

        if (num < 20) return LESS_THAN_TWENTY[num];
        if (num < 100) return TENS[num / 10] + (num % 10 != 0 ? " " + LESS_THAN_TWENTY[num % 10] : "");
        if (num < 1000) return LESS_THAN_TWENTY[num / 100] + " hundred" + (num % 100 != 0 ? " " + convert(num % 100) : "");

        return "";
    }
}
