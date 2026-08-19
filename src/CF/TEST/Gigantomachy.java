package CF.TEST;
import java.util.*;
public class Gigantomachy {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int b[]=new int[m];
            int v[]=new int[n];
            for(int i=0;i<m;i++){
                b[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                v[i]=sc.nextInt();
            }
            int sum=0;
            int sum2=0;
            for(int i=0;i<m;i++){
                sum+=b[i];
            }
            int count=0;
            for(int i=0;i<n;i++){
                if(v[i]>sum){
                    System.out.print("2");
                    break;
                }
                else System.out.print("1");
            }

        }
    }
}
