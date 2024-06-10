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
        int cents = parts.length > 1 ? Integer.parseInt(parts[1]) : 0;

        String dollarsText = convert(dollars) + " dollars";
        String centsText = convert(cents) + " cents";

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
