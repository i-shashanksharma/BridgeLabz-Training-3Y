import java.util.Scanner;
public class PowerOfNumberWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter power: ");
        int p = sc.nextInt();
        int result = 1;
        int counter = 0;
        while (counter < p) {
            result *= num;
            counter++;
        }
        System.out.println("Result: " + result);
    }
}
