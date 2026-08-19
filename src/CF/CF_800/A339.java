package CF.CF_800;

import java.util.*;
public class A339 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String spg=new String(ch);
        String spg1=spg.replace("+","");
        int l=spg1.length();
        StringBuilder sww=new StringBuilder(spg1);
        for(int i=1;i<sww.length();i+=2) {
            if (i % 2 != 0) {
                sww.insert(i, "+");
            }
        }
        String akash=sww.toString();
System.out.println(akash);

}}
