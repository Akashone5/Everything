package CF.CF_800;

import java.util.*;
public class B200 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        float arr[]=new float[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();}
        for(int i=0;i<n;i++){
            sum=sum+(arr[i]);
        }

        System.out.printf("%.12f",sum/n);


    }
}
