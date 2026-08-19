package DSA.Mathematics;
import java.util.*;
public class Seive_of_Erathosthenes {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
              for(int j=i*2;j<n;j=j+i){
                  isPrime[j]=false;
              }
            }}

        for(int i=2;i<n;i++){
            if(isPrime[i]){
           count++;
        }}
        System.out.print(count);
    }
}
