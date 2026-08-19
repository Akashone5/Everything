package Testing;
import java.util.*;
public class PrimeNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n==2|n==3){
            System.out.print("Prime");
        }
       if(n%2==0||n%3==0){
            System.out.print(" not prime");
        }
       else{
        for (int i = 5; i*i< n;i=i+2){
            if(n%i==0){
        count++;}}
if(count>1){
System.out.println("Not prime");
}
else System.out.println("Prime");}

    }}

