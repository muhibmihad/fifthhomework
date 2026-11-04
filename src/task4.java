
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        // Read the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Replace both diagonals with 0
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 0;
            matrix[i][n - 1 - i] = 0;
        }

        // Print the modified matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
