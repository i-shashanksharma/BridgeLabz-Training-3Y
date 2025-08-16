import java.util.Scanner;
class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("Maximum possible handshakes are " + handshakes);
    }
}
