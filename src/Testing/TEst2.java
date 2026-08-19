package Testing;

import java.util.*;

public class TEst2 {
    private static final int MOD = 998244353;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            int xorSum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                xorSum ^= a[i];
            }

            if (xorSum == 0) {
                System.out.println(0);
                continue;
            }

            int highestBit = 31 - Integer.numberOfLeadingZeros(xorSum);

            int m = 0;
            for (int i = 0; i < n; i++) {
                if (((a[i] >> highestBit) & 1) == 1) {
                    m++;
                }
            }

            long ans = 1;
            long base = 2;
            int exp = m - 1;

            while (exp > 0) {
                if ((exp & 1) == 1) {
                    ans = (ans * base) % MOD;
                }
                base = (base * base) % MOD;
                exp >>= 1;
            }
            System.out.println(ans);
        }
    }
}
