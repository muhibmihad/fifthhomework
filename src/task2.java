
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] residents = new int[n];

        // Read all data into an array
        for (int i = 0; i < n; i++) {
            residents[i] = input.nextInt();
        }

        int total = 0;
        int left = 0;
        int right = 0;
        int leftHouses = 0;
        int rightHouses = 0;

        // Calculate using the stored data
        for (int i = 0; i < n; i++) {
            total += residents[i];

            if ((i + 1) % 2 == 1) {
                left += residents[i];
                leftHouses++;
            } else {
                right += residents[i];
                rightHouses++;
            }
        }

        System.out.println("Total residents: " + total);
        System.out.println("Residents on the left: " + left);
        System.out.println("Residents on the right: " + right);

        System.out.println("Average per house on the left: "
                + average(left, leftHouses));
        System.out.println("Average per house on the right: "
                + average(right, rightHouses));

        input.close();
    }

    public static String average(int total, int houses) {
        if (houses == 0) {
            return "N/A";
        }

        if (total % houses == 0) {
            return String.valueOf(total / houses);
        }

        return String.valueOf((double) total / houses);
    }
}
