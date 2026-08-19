package DSA.Arrays;
import java.util.*;
public class leftRotate1 {
    public static void leftRotate(int n,int arr[],int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int arr[],int low ,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();

        leftRotate(n,arr,d);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");}
    }

}
