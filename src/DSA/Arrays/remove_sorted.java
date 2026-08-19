package DSA.Arrays;
import java.util.*;
public class remove_sorted {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Set<Integer> arr1=new TreeSet<>();
        for(int num:arr)
            arr1.add(num);
     /*   for(int i=0;i<arr1.size();i++){
            Syste
        }*/
      List<Integer> list=new ArrayList<>(arr1);
      System.out.print(list.get(1));
    }
}
