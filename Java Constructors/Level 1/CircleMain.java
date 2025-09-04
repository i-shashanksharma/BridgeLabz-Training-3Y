public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        System.out.println("Default radius: " + c1.radius);
        System.out.println("Custom radius: " + c2.radius);
    }
}
