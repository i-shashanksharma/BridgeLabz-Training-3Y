import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true; // assume number is prime

        if (number <= 1) {
            isPrime = false; // Prime numbers are greater than 1
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) { // divisible by other number
                    isPrime = false;
                    break; // no need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}

