package CF.CF_800;

import java.util.*;
public class A110 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           long j=sc.nextLong();
            int count=0;
            while(j!=0){
               long temp=j%10;
                if(temp==4||temp==7){
                    count++;
                   j= j/10;
                }else {
                    j=j/10;
                }
            }
            if(count==4||count==7){
                System.out.print("YES");
            }
            else System.out.print("NO");


    }
}
