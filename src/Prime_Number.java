public class Prime_Number {

    public static void main(String[] args) {
        int num = 11; // Input number
        boolean isPrime = true; // Assume the number is prime initially

        if (num <= 1) {
            isPrime = false; // Numbers <= 1 are not prime
        } else {
            // Check divisors from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // Found a divisor, number is not prime
                    break;           // Exit loop early
                }
            }
        }
 
        // Output the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
