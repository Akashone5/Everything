package CF.CF_800;

import java.util.*;
public class B677 {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int h=sc.nextInt();
       int k=sc.nextInt();
       int arr[]=new int[n];
       int count=2;
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();

       }
       for(int i=0;i<n-1;i++){
        if(arr[i]>k) {
            int extra = arr[i] - k;
            if (arr[i + 1] + extra >= h) {

                count = count + 2;
            } else count++;

        }

       }
       System.out.println(count);
    }

}
