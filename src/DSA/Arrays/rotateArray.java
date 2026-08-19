package DSA.Arrays;

import java.util.*;
public class rotateArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=3;
         k=k%n;
        int arr1[]=new int[n];

        for(int i=k;i<n;i++){
            int temp=arr[i];
            arr1[i-k]=temp;

        }
        for(int i=0;i<k;i++){
            int temp=arr[i];
            arr1[n-k+i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]);
        }
    }
}
