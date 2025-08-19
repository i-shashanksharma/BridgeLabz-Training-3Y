import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        String str = Long.toString(num);
        int[] digits = new int[str.length()];
        int[] freq = new int[10];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }

        for (int d : digits) {
            freq[d]++;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}
