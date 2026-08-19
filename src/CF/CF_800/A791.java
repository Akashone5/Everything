package CF.CF_800;

import java.util.*;
public class A791 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int bear=sc.nextInt();
        int bob=sc.nextInt();
        int count=0;
        while(bear<=bob){
            bear=bear*3;
            bob=bob*2;
            count++;
        }
        System.out.println(count);
    }
}
