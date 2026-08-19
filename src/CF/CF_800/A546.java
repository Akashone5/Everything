package CF.CF_800;

import java.util.*;
public class A546 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long k=sc.nextLong();
        long n=sc.nextLong();
        long w=sc.nextLong();
        long sum=0;
        for(int i=1;i<=w;i++){
            sum=sum+i*k;
        }
        if(sum<=n){
            System.out.println("0");
        }
        else if(sum>n) {
            System.out.println(sum -n);
        }
    }
}
