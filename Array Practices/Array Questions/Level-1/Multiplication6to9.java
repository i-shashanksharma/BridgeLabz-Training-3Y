import java.util.Scanner;
public class Multiplication6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number (just to start, ignored in logic): ");
        int number = sc.nextInt();
        int[] table = new int[4*10];
        int idx = 0;
        for (int n = 6; n <= 9; n++) {
            for (int i = 1; i <= 10; i++) {
                table[idx++] = n * i;
                System.out.println(n + " * " + i + " = " + (n*i));
            }
        }
    }
}
