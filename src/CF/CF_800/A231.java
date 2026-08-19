package CF.CF_800;

import java.util.Scanner;

public class A231 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++) {
            int pet = sc.nextInt();
            int vas = sc.nextInt();
            int tony = sc.nextInt();

            if ((pet + vas + tony) >= 2)
                count++;

        }
        System.out.print(count);

}}
