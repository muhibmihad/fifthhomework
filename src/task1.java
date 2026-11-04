
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int radius = input.nextInt();

            if (radius > max) {
                max = radius;
                count = 1;
            } else if (radius == max) {
                count++;
            }
        }

        System.out.println(max + " - " + count);

        input.close();
    }
}
