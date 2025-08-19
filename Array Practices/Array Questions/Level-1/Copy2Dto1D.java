import java.util.Scanner;
public class Copy2Dto1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at ["+i+"]["+j+"]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] array = new int[rows*cols];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[idx++] = matrix[i][j];
            }
        }
        System.out.print("1D Array: ");
        for (int val : array) System.out.print(val + " ");
    }
}
