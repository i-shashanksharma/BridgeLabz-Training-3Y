import java.util.Scanner;
public class SumNaturalNumbers {
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = sc.nextInt();
        int sum1 = sumRecursive(n);
        int sum2 = sumFormula(n);
        System.out.println("Recursive Sum = " + sum1);
        System.out.println("Formula Sum = " + sum2);
    }
}
