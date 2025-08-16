import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int originalNumber = number;

        if (number == 0) {
            count = 1; // special case for 0
        } else {
            while (number != 0) {
                number = number / 10; // remove last digit
                count++; // increase digit count
            }
        }

        System.out.println("The number " + originalNumber + " has " + count + " digits.");
    }
}
