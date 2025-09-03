import java.util.Scanner;
public class LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if (year >= 1582) {
            if (isLeapYear(year)) System.out.println(year + " is a Leap Year");
            else System.out.println(year + " is Not a Leap Year");
        } else {
            System.out.println("Year must be >= 1582");
        }
    }
}
