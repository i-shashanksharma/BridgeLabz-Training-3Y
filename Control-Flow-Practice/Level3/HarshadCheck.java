import java.util.Scanner;

public class HarshadCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // calculate sum of digits
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        // check Harshad condition
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number");
        }
    }
}
