import java.util.Scanner;
public class GreatestFactorForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int gf = 1;
        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) {
                gf = i;
                break;
            }
        }
        System.out.println("Greatest factor: " + gf);
    }
}
