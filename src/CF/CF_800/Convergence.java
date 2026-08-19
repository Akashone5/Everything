package CF.CF_800;

import java.util.*;
public class Convergence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int count=0;
        for(int i=0;i<n;i++) {
            int k = sc.nextInt();
            int arr[] = new int[k];
            for (int w = 0; w < k; w++){
                arr[w]=sc.nextInt();}
            Arrays.sort(arr);
          int o=0;
            int l=k-1;
            int count=0;
            while(o<l){
                if(arr[o]==arr[l]){
                    break;
                }count++;
                o++;
                l--;

        }
        System.out.println(count);
        }
    }
}
