package CF.CF_800;

import java.util.*;
public class A469 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int arr1[]=new int[p];


        int sum=1;
        int sux=0;

        for(int i=0;i<p;i++){
            arr1[i]=sc.nextInt();
            sum=sum+i;

        }
        sux=sux+arr1[0];
         Arrays.sort(arr1);
        for(int i=1;i<n;i++){
            if(arr1[i]!=arr1[i-1]){
                sux=sux+arr1[i];
            }
        }

// naiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii huiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii
int q=sc.nextInt();
        int arr2[]=new int[q];
        for(int i=0;i<q;i++){
            arr2[i]=sc.nextInt();
        }
        //DSA.Arrays.sort(arr2);
        for(int i=0;i<q;i++){
           if(sum!=sux){
               sux=sux+arr2[i];
               if(sum!=sux){
                   sux=sux-arr2[i];
               }
               else return;
           }
           else return;

        }
        if(sum==sux){
            System.out.print("I become the guy.");
        }
        else if(sum!=sux) System.out.print("Oh, my keyboard!");
    }
}
