package CF.CF_800;

import java.util.*;
public class A263 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int mat[][]=new int[5][5];
        int tar=1;
    int result=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                mat[i][j]=sc.nextInt();
                if(mat[i][j]==tar){
                    int row=i;
                    int col=j;

                    int f=Math.abs(row-2);
                    int g=Math.abs(col-2);
                    result=f+g;
                }
            }
        }
System.out.println(result);

    }
}
