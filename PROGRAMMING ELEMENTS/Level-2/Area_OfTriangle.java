import java.util.Scanner;
class Area_OfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseCm = input.nextDouble();
        double heightCm = input.nextDouble();
        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaInches2 = areaCm2 / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaInches2 +
                           " and sq cm is " + areaCm2);
    }
}
