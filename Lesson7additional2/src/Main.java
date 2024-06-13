public class Main {
    public static void main(String[] args) {
        int maxPalindrome = 0;
        int factor1 = 0;
        int factor2 = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) { // Начинаем с j = i, чтобы избежать повторных вычислений
                int product = i * j;
                if (isPalindrome(product) && product > maxPalindrome) {
                    maxPalindrome = product;
                    factor1 = i;
                    factor2 = j;
                }
            }
        }

        System.out.println("The largest palindrome is " + maxPalindrome);
        System.out.println("It is the product of " + factor1 + " and " + factor2);
    }

    private static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
