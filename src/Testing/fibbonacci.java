package Testing;
import java.util.*;
public class fibbonacci {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.print("0");
        }
        else{
        int a = 0;
        int b = 1;
        int next = 0;
        for (int i = 1; i < n; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        System.out.print(next);}
    }
}