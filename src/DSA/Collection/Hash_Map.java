package DSA.Collection;
import java.util.*;
public class Hash_Map {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       /* HashMap<String,Integer> map=new HashMap<>();
      String arr[]=new String[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextLine();
        }
        int idx=0;
        for( String i: arr)
            map.put(i,idx);
        idx++;
        //for(int i:map.get())
        System.out.print(map.containsKey("Akash"));*/


        // Frequencyy
        String s="aaabbbcc";
        char ch[]=s.toCharArray();
        HashMap<Character,Integer> map= new HashMap<>();
        for(char i:ch)
            map.put(i,map.getOrDefault(i,0)+1);
           // for(Map.Entry)

            // next
    }
}
