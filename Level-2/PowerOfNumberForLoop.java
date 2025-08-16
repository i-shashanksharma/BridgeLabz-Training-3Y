import java.util.Scanner;
public class PowerOfNumberForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter power: ");
        int p = sc.nextInt();
        if (num > 0 && p >= 0) {
            int result = 1;
            for (int i = 1; i <= p; i++) result *= num;
            System.out.println("Result: " + result);
        } else System.out.println("Invalid input");
    }
}
