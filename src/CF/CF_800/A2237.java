package CF.CF_800;

import java.util.*;
public class A2237 {
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            long sum=0;

            int n=sc.nextInt();
           int min=Integer.MAX_VALUE;
           for(int k=0;k<n;k++){
               int tower=sc.nextInt();
               if(tower<min){
                   min=tower;
               }
               sum+=min;
           }
            System.out.println(sum);
            }


    }
}
