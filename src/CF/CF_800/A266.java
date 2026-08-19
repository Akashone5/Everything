package CF.CF_800;

import java.util.*;
public class A266 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String srr=sc.next();
            //char ch[]=srr.toCharArray();
            int count=0;
            for(int i=0;i<n-1;i++){
                if((srr.charAt(i))==(srr.charAt(i+1))){
                    count++;
                }

            }
        System.out.print(count);

    }}

