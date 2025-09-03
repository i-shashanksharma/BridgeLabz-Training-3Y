import java.util.Scanner;
public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println("Enter divisor:");
        int d = sc.nextInt();

        int[] result = findRemainderAndQuotient(n, d);
        System.out.println("Quotient: " + result[1] + " Remainder: " + result[0]);
    }
}
