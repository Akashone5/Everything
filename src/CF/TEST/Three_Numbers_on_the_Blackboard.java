package CF.TEST;
import java.util.*;
public class Three_Numbers_on_the_Blackboard {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long arr[]=new long[3];
            for(int i=0;i<3;i++){
                arr[i]=sc.nextLong();
            }
            Arrays.sort(arr);
            long range=arr[2]-arr[0];

            System.out.println(Math.min(range,arr[1]));
        }
    }
}
