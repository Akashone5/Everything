package CF.CF_800;

import java.util.*;
public class A1030 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int count=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
               count++;
            }
        }
        if(count>0){
            System.out.print("HARD");
        }
        else System.out.print("EASY");
    }
}
