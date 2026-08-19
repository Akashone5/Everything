package DSA.Collection;
import java.util.*;
public class Linkedlist {
    public static void main(String arhs[]){
        LinkedList L1=new LinkedList();
        L1.add("Akash");
        L1.add(30);
        L1.add(null);
        L1.add("Akash");
        L1.addFirst("Durga");
        L1.removeLast();
        L1.set(1,"Software");
        System.out.println(L1);
    }
}
