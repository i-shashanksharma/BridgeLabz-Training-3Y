import java.util.Scanner;
public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter height of Amar: ");
        double heightAmar = scanner.nextDouble();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter height of Akbar: ");
        double heightAkbar = scanner.nextDouble();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter height of Anthony: ");
        double heightAnthony = scanner.nextDouble();
        String youngest = (ageAmar < ageAkbar && ageAmar < ageAnthony) ? "Amar" :
                          (ageAkbar < ageAnthony) ? "Akbar" : "Anthony";
        String tallest = (heightAmar > heightAkbar && heightAmar > heightAnthony) ? "Amar" :
                         (heightAkbar > heightAnthony) ? "Akbar" : "Anthony";
        System.out.println("Youngest friend is: " + youngest);
        System.out.println("Tallest friend is: " + tallest);
    }
}