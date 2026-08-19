package DSA.Collection;
import java.util.ArrayList;
public class Arrraylist {
    public static void main(String args[]){
        ArrayList<Integer>ali=new ArrayList<Integer>();
        ali.add(10);
        ali.add(20);
        ali.add(30);
        ali.remove(1);
      //  ali.removeAll();
        ali.add(1,5);
       System.out.println( ali.get(2)==0);
        System.out.println(ali);

    }
}
