package DSA.Searching;
import java.util.*;
public class BinaryAL {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int tar=sc.nextInt();
        ArrayList<Integer> ak=new ArrayList<>();
    for(int i:arr){
        ak.add(i);
    }
   int mm= ak.indexOf(tar);
    System.out.print(mm);
    }
}
