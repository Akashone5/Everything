package CF.CF_800;

import java.util.*;
public class A977 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        while(k>0) {
            int y = n % 10;
            if ((y > 0 && y < 10)) {
                n = n - 1;
                k--;
            } else if (y == 0) {
                n = n / 10;
                k--;
            }
        }
        System.out.print(n);
    }
}
