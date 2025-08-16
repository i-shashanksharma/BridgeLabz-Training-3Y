import java.util.Scanner;
class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.println("Area in square inches is " + areaInInches +
                           " and in square centimeters is " + areaInCm);
    }
}
