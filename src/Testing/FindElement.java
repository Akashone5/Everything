package Testing;
import java.util.*;
public class FindElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int flag=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
               flag=1;
        index=1;
            }}
        if(flag==0){
             System.out.println("Not Found");}
        else System.out.println("Found"+ " "+ index);

        }
    }

