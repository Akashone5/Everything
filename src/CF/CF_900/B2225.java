package CF.CF_900;
import java.util.*;
public class B2225 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            String ss = sc.next();
            int countA = 0;
            int countB = 0;
            for (int j = 0; j < ss.length(); j++) {
                char gg = ss.charAt(j);
                if (gg == 'a') {
                    countA++;
                } else if (gg == 'b') {
                    countB++;
                }
            }
            if (Math.abs(countA - countB) <= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }}