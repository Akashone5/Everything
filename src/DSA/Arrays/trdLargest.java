package DSA.Arrays;
import java.util.Scanner;
public class trdLargest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
       int max=Integer.MIN_VALUE;;
        int sec=Integer.MIN_VALUE;;
        int trd=Integer.MIN_VALUE;;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max||nums[i]==sec||nums[i]==trd){
                continue;
            }
            if(nums[i]>max){
                trd=sec;
                sec=max;
                max=nums[i];
            }

            else if(nums[i]>sec){
                trd=sec;
                sec=nums[i];
            }
           else if(nums[i]>trd){
                trd=nums[i];
            }

        }
        System.out.println(trd);
}}
