
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int subjects = input.nextInt();
        int students = input.nextInt();

        int[][] grades = new int[students][subjects];

        // Read all student grades
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                grades[i][j] = input.nextInt();
            }
        }

        long[] sums = new long[students];
        boolean[] belowFive = new boolean[students];

        long groupTotal = 0;
        long highestSum = Long.MIN_VALUE;

        // Calculate student totals
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                sums[i] += grades[i][j];

                if (grades[i][j] < 5) {
                    belowFive[i] = true;
                }
            }

            groupTotal += sums[i];

            if (sums[i] > highestSum) {
                highestSum = sums[i];
            }
        }

        DecimalFormat format = new DecimalFormat(
                "0.##########",
                DecimalFormatSymbols.getInstance(Locale.US)
        );

        System.out.println("Student averages:");

        for (int i = 0; i < students; i++) {
            double average = (double) sums[i] / subjects;
            System.out.println(format.format(average));
        }

        double groupAverage =
                (double) groupTotal / (students * (long) subjects);

        System.out.println();
        System.out.println("Group average:");
        System.out.println(format.format(groupAverage));

        System.out.println();
        System.out.println("Highest-performing student:");

        for (int i = 0; i < students; i++) {
            if (sums[i] == highestSum) {
                System.out.println(i + 1);
            }
        }

        System.out.println();
        System.out.println("Students with at least one grade below 5:");

        boolean found = false;

        for (int i = 0; i < students; i++) {
            if (belowFive[i]) {
                System.out.println(i + 1);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }

        input.close();
    }
}
