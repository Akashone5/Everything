package DSA.Arrays;
import java.util.*;

public class Prefix_Sum {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    int lsum=0;

    for(int i=0;i<n;i++){
        if(lsum==sum-arr[i])
            System.out.print(true);
        lsum+=arr[i];
        sum-=arr[i];
    }
    //System.out.print(false);

}
}
