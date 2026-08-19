package Testing;
import java.util.*;
public class Bitwize {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        String a=Sc.next();
        String b=Sc.next();
        int carray=0;
        StringBuilder  sb=new StringBuilder();
        int m=a.length()-1;
        int n=b.length()-1;
        while(m>=0||n>=0){
            int sum=carray;
            if(m>=0){
                sum+=a.charAt(m)-'0';
                m--;
            }
            if(n>=0){
                sum+=b.charAt(n)-'0';
                n--;
            }
            sb.append(sum%2);
            carray=sum/2;
        }
        if(carray==1){
        sb.append('1');
    }
        System.out.println(sb.reverse());
    }
}