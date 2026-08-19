package DSA.Arrays;
import java.util.*;
public class MAxSubarrayKadane {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

            }
            int maxEnd=arr[0];
            int res=arr[0];
            for(int i=1;i<n;i++){
                maxEnd=Math.max(arr[i],maxEnd+arr[i]);
                res=Math.max(res,maxEnd);
            }

System.out.println(res);
}}
