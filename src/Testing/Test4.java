package Testing;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            long totalTriplets = 0;

            for (int b = 1; b <= n; b++) {
                long multiples = n / b;
                totalTriplets += multiples * multiples;
            }

            System.out.println(totalTriplets);
        }

        scanner.close();
    }
}
