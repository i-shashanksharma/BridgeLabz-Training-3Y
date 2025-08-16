import java.util.Scanner;
public class SumByWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;
        while (true) {
            System.out.print("Enter a number: ");
            num = sc.nextDouble();
            if (num == 0) break;
            total = total+num;
        }
        System.out.println("Total = " + total);
    }
}