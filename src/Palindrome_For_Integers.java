public class Palindrome_For_Integers {

    public static void main(String[] args) {
        int number = 12121; // Change this number to test different cases
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;      // Get the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            num = num / 10;           // Remove the last digit
        }

        return original == reversed;  // Compare original and reversed
    }
}
