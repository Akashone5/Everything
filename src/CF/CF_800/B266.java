package CF.CF_800;

import java.util.*;
public class B266 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String s=sc.next();
        char ch[]=s.toCharArray();

       for(int j=0;j<t;j++){
        for(int i=0;i<n-1;i++){
            if(ch[i]=='B'&&ch[i+1]=='G'){
            var temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
          i++;
        }}}
            String ss=String.valueOf(ch);
        System.out.print(ss);
    }

}
