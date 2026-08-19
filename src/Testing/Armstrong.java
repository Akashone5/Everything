package Testing;
import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int st=n;
       int size=(int)Math.log10(n)+1;
        int yum=0;
        while(st>0){
            int yep=st%10;
            yum=(int)Math.pow(yep,size)+yum;
            st=st/10;
        }
        if(n==yum){
            System.out.print("Armstrong");
        }
        else System.out.print("not Armstrong");

    }
}
