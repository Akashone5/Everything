package CF.TEST;
import java.util.*;
public class Riptide {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0) {
            int count = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            while (a != b && b != c) {
                if (a > b && b > c) {
                    c = c + 1;
                    a = a - 1;
                    count++;
                }
               else if (b > c && c > a) {
                    b = b - 1;
                    a = a + 1;
                    count++;
                }
               else if (c > a && a > b) {
                    c = c - 1;
                    b = b + 1;
                    count++;
                } else if (a < b && b < c) {
                    a++;
                    c--;
                    count++;
                } else if (b < a && a < c) {
                    b++;
                    c--;
                    count++;
                } else if (c < b && b < a) {
                    b++;
                    a--;
                    count++;
                }
            }

            System.out.print(count);
        }
    }
}
