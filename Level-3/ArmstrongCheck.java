import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number; // store original number
        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // get last digit
            sum += digit * digit * digit; // add cube of digit to sum
            number = number / 10; // remove last digit
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number");
        }
    }
}
