package CF.CF_800;

import java.util.*;
public class A2199 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int max=sc.nextInt();
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            int a2=sc.nextInt();
            int b2=sc.nextInt();            //IS BHARWE KO KOTLIN MAI CHAHIYE YE SAWAL😒
            int alex=a1+a2;
            int bob=b1+b2;
            if((alex+max)>(bob+max)){
                System.out.print("NO");
            }
           else if((alex+max)<(bob+max)){
                System.out.print("YES");
            }
            else if(((alex+max)==(bob+max))){
                if(bob>alex){
                System.out.print("YES");
            }
            else
                    System.out.print("NO");
            }


        }
    }
}
