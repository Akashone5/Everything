package CF.CF_800;

import java.util.*;
public class A236 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ss=sc.next();
        int count=1;
        char ch[]=ss.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length-1;i++){

                if(ch[i]!=ch[i+1]){
                    count++;
                }
        }
        if(count%2!=0){
            System.out.print("IGNORE HIM!");
        }
        else System.out.print("CHAT WITH HER!");
    }
}