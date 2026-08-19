package CF.CF_800;

import java.util.*;
public class A271 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int p=0;
        //int sam=0;
       // int arr[]=new int[3];
        while(h<10000) {
            h = h + 1;
            int q = h / 1000;
            int w = (h / 100) % 10;
            int e = (h / 10) % 10;
            int r = h % 10;


            if (q != w && q != e && q != r && w != e && w != r && e != r) {
                p = h;
                break;
            }
        }
        System.out.print(p);
}}
