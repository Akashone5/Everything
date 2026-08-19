package CF.CF_800;

import java.util.*;
public class A160 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        int sem=0;
        int temp=0;
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<n;i++){
            while(sem<sum)
           temp=sum-arr[i];
            sem=arr[i];
            count++;
        }
        System.out.print(count);
    }
}
