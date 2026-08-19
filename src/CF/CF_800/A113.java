package CF.CF_800;

import java.util.*;
public class A113 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        boolean b=false;
        char ch[]=p.toCharArray();
        for(int i=0;i<p.length();i++){
            if(ch[i]=='H'){
                b=true;
            }
            else if(ch[i]=='Q'){
b=true;
            }
           else if(ch[i]=='9'){
b=true;

            }
        }
        if(b){
        System.out.print("Yes");}
        else
            System.out.print("No");
    }
}
