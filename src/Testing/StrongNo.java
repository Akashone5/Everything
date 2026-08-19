package Testing;
import java.util.*;
public class StrongNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int str=n;
        int so=1;
        int summm=0;
        while(n>0){
            int temp=n%10;
            while(temp>0){
                so=so*temp;
                temp--;
            }
            summm=summm+so;
            so=1;
            n=n/10;
        }
        if(summm==str){
            System.out.print("Strong");
        }
        else System.out.print("not Strong");
    }
}
