package CF.CF_800;

import java.util.*;
public class A41 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
        char ch[]=ss.toCharArray();
        int i=0;
        int n=ch.length-1;
        while(i<n){
            char ch1=ch[i];
            ch[i]=ch[n];
           ch[n]=ch1;
           i++;
           n--;
        }
        String sds=new String(ch);
        if(ss.equals(sds)){
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
}
