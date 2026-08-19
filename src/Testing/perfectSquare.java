package Testing;
import java.util.*;
public class perfectSquare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&(n-1))==0){
            System.out.print("perfect Square");
        }
        else System.out.print("Not perfect");
    }
}
