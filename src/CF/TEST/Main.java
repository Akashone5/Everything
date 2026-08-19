package CF.TEST;
    import java.util.*;


    public class Main {
        public static long gcd(long a, long b) {
            while (b != 0) {
                long temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                long arr[] = new long[3];
                for (int i = 0; i < 3; i++) {
                    arr[i] = sc.nextLong();
                }
                Arrays.sort(arr);
                long diff1 = arr[1] - arr[0];
                long diff2 = arr[2] - arr[1];
                long minPossibleRange = gcd(diff1, diff2);
                long initialRange = arr[2] - arr[0];
                System.out.println(Math.min(initialRange, minPossibleRange));
            }
        }
    }


