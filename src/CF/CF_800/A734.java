package CF.CF_800;

import java.util.*;
public class A734 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ss=sc.next();
        int danik=0;
        int anton=0;
        char ch[]=ss.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]=='A'){
                anton++;

            }
            else if(ch[i]=='D'){
                danik++;
            }
        }
        if(anton>danik) System.out.println("Anton");
        else if(danik>anton) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
