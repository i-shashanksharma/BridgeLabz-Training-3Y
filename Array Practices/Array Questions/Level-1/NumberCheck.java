import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int n : arr) {
            if (n > 0) {
                if (n % 2 == 0) System.out.println(n + " is positive and even");
                else System.out.println(n + " is positive and odd");
            } else if (n < 0) {
                System.out.println(n + " is negative");
            } else {
                System.out.println("Zero");
            }
        }
        if (arr[0] == arr[arr.length-1]) System.out.println("Equal");
        else if (arr[0] > arr[arr.length-1]) System.out.println("First greater");
        else System.out.println("Last greater");
    }
}
