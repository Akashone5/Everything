package DSA.Arrays;
import java.util.*;
public class SubArray_sum {


        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

            }
            int gsum=sc.nextInt();
            int flag=0;
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=i;j<n;j++){
                    sum+=arr[j];
                if(sum==gsum){
                    flag=1;
                }}
            }
            System.out.print(flag);
        }}


