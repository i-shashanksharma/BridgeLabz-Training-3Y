import java.util.Scanner;
public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);

        c.display();

        sc.close();
    }
}
