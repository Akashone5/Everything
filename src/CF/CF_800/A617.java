package CF.CF_800;

import java.util.*;
public class A617 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=5;i>=1;i--){
            int r=n%i;
            count=count+n/i;
            n=r;
            }

        System.out.print(count);
    }
}
