package Testing;

import java.util.*;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ress=0;
       int n=sc.nextInt();
       while(n>0){
           n=n&(n-1);
           ress++;
       }
       System.out.println(ress);
    }
}
