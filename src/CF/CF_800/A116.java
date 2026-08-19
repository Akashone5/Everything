package CF.CF_800;

import java.util.*;
public class A116 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int sum1=0;
        int r=0;
        int tram=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
            sum1=sum1+arr1[i];
            sum2=sum2+arr2[i];
            tram=tram-arr1[i]+arr2[i];
           r= Math.max(tram,r);
        }
System.out.print(r);
    }
}
