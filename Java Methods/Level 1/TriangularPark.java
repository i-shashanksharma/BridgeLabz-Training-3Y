import java.util.Scanner;
public class TriangularPark {
    public static int calculateRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1 of triangle:");
        int a = sc.nextInt();
        System.out.println("Enter side 2 of triangle:");
        int b = sc.nextInt();
        System.out.println("Enter side 3 of triangle:");
        int c = sc.nextInt();

        System.out.println("Rounds needed: " + calculateRounds(a, b, c));
    }
}
