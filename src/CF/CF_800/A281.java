package CF.CF_800;

import java.util.*;
public class A281 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
        //char ch[]=ss.toCharArray();


                StringBuilder ssb=new StringBuilder(ss);
               ssb.setCharAt(0, Character.toUpperCase(ssb.charAt(0)));
                String sbs=ssb.toString();
                System.out.print(sbs);




    }
}
