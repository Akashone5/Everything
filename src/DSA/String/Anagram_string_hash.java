package DSA.String;
import java.util.*;
public class Anagram_string_hash {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        ArrayList<Integer> res=new ArrayList<>();
        if(s2.length()>s1.length()) {
            System.out.println(res);
        return;}
        HashMap <Character,Integer> map1=new HashMap <>();
        HashMap <Character,Integer> map2=new HashMap <>();
        for(int i=0;i<s2.length();i++){
            char ch1=s2.charAt(i);
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
        for(int i=0;i<s2.length();i++){
            char ch2=s1.charAt(i);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
       int str=0;
        int end=s2.length();
        if(map1.equals(map2)){
            res.add(str);
        }
        while(s1.length()>end)
        {
            char stChar=s1.charAt(str);
            char enchar=s1.charAt(end);
            int count=map2.getOrDefault(stChar,0)-1;
            if(count<=0){
                map2.remove(stChar);
            }
            else map2.put(stChar,count);
            map2.put(enchar,map2.getOrDefault(enchar,0)+1);
            str++;
            end++;
            if(map1.equals(map2)){
                res.add(str);
            }
        }
    System.out.print(res);

    }
}
