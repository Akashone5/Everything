package DSA.Arrays;
import java.util.*;
public class removeDuplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Set s1=new HashSet(n);
        for(int i=0;i<n;i++){
        s1.add(arr[i]);
        }
        for(int i=0;i<n;i++){
           // if(s1.get(i))
        }
    }
}
