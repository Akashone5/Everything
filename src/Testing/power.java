package Testing;

import java.util.*;
public class power {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            boolean p=true;
        if(i!=0&&(i&(i-1))==0)
        {
            p=false ;
        }
        System.out.println(p);
    }
}
