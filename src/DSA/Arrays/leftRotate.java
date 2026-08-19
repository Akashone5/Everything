package DSA.Arrays;
import java.util.*;
public class leftRotate {
    public static void rotate(int n,int arr[]){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    static void leftRotate(int n,int arr[],int d){
        d=d%n;
        for(int i=0;i<d;i++){
            rotate(n,arr);
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
