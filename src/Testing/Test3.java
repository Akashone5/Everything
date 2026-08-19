package Testing;

import java.util.Arrays;
import java.util.Scanner;
    public class Test3{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int c = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                int[] b = new int[n];
                for (int i = 0; i < n; i++) {
                    b[i] = sc.nextInt();
                }
//xugtvubkuj
                long cost1 = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] < b[i]) {
                        cost1 = -1;
                        break;
                    }
                    cost1 += (a[i] - b[i]);
                }
                Arrays.sort(a);
                Arrays.sort(b);
                long cost2 = c;
                for (int i = 0; i < n; i++) {
                    if (a[i] < b[i]) {
                        cost2 = -1;
                        break;
                    }
                    cost2 += (a[i] - b[i]);
                }
                if (cost2 == -1) {
                    System.out.println(-1);
                } else if (cost1 == -1) {
                    System.out.println(cost2);
                } else {
                    System.out.println(Math.min(cost1, cost2));
                }
            }
        }
    }


