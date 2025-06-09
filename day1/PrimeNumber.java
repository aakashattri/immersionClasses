import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        scanner.close();
    }

    // Method to check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0, 1, and negative numbers are not prime
        if (n == 2) return true;  // 2 is the only even prime number
        if (n % 2 == 0) return false; // eliminate even numbers

        // Check only odd divisors up to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
