package CF.CF_800;

import java.util.*;
public class A158 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        int num=arr[n-1];
        for(int i=0;i<k;i++){

            if(arr[i]>=num&&arr[i]>0){count++;}
        }
        System.out.println(count);
    }
}
