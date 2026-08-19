package CF.CF_800;
import java.util.*;
public class A1328 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int count=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a%b==0){
                System.out.println(0);
            }
            else{



            System.out.println(b-(a%b));
        }
    }}
}
