package CF.CF_800;

import java.util.*;
public class A59 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String Ss=sc.next();

        char ch[]=Ss.toCharArray();
        int n=ch.length;
        int upper=0;
        int lower=0;

        for(int i=0;i<n;i++){
            if(Character.isUpperCase(ch[i])){
                upper++;
            }
            else {
                lower++;

            }
        }
        String sd=new String(ch);
        if(upper<lower){
            System.out.println(sd.toLowerCase());
        }
        else if(upper>lower){
            System.out.println(sd.toUpperCase());
        }
        else if(upper==lower){ System.out.println(sd.toLowerCase());
    }}
}
