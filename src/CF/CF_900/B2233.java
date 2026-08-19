package CF.CF_900;
import java.util.*;
public class B2233 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){

            int n=sc.nextInt();
            StringBuilder sb=new StringBuilder();

            if(n%2==0){
           for(int i=0;i<=n;i=i+2){

                   sb.append(i+2).append(" ").append(i+1).append(" ").append(i+1).append(" ").append(i+2).append(" ").
                           append(i+1).append(" ").append(i+2).append(" ").append(i+2).append(" ").append(i+1);
               }}
               else {
               sb.append("3 3 2 1 1 2 1 2 2 3 1 3 ");
                   for(int i=3;i<=n;i=i+2){
                       sb.append(i+2).append(" ").append(i+1).append(" ").append(i+1).append(" ").append(i+2).
                               append(" ").append(i+1).append(" ").append(i+2).append(" ").append(i+2).append(" ").append(i+1);

                   }
           }
               System.out.println(sb.toString().trim());
        }
    }
}
