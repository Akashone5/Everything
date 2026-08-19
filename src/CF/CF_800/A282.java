package CF.CF_800;

import java.util.*;
public class A282 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        String s[] = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {


            String ch = s[i];
            if (ch.contains("+")) {
                x++;
            } else if (ch.contains("-")) {
                x--;
            }
        }


        System.out.println(x);

}}
