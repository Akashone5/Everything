package CF.CF_800;

import java.util.*;
public class VISa {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int visa[]=new int[16];
        for(int i=0;i<16;i++){
            visa[i]=sc.nextInt();
        }
        for(int i=0;i<16;i++){
            if(i%2==0){
                visa[i]=visa[i]*2;
            }
        }
        int sum=0;
        int sum1=0;
        for(int i=0;i<16;i++){
            if(visa[i]>9){
                sum1+=visa[i]%10;
                sum1+=visa[i]/10;
            }
            else
                sum+=visa[i];
        }
        if((sum1+sum)%10==0){
            System.out.print("visaaaaa");
        }
        else System.out.print("invalid");
    }
}
