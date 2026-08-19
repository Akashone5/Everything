package DSA.String;
import java.util.*;
public class String_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        /*  1
        int n=s.length();
        int j=0;
     //char ch[]=s.toCharArray();
     char ch1[]=new char[n];
        for(int i=s.length()-1;i>=0;i--){
            ch1[j]=s.charAt(i);
            j++;
        }                                    //s=s.replaceAll([^a-z ......),").tolowercase()
       String sss=String.valueOf(ch1);
        System.out.print(sss);  */




//HashMap<Character,Integer> map=new HashMap<>
// map.put(num,getOrDefault(ch,0)+1);






/* palindrome string

        s=s.replaceAll(" ","");
        String ss=s;
        boolean b=true;
     int i=0;
     int j=s.length()-1;
     while(i<j){
         if(s.charAt(i)!=s.charAt(j)){
            b=false;
             break;
         }
         i++;
         j--;
     }
     if(b){
         System.out.print("yes");
     }
     else  System.out.print("no");


 */
/* vowel conso



     int v=0;
     int c=0;
     char ch[]=s.toCharArray();
     for(int i=0;i<ch.length;i++){
         if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
             v++;
         }
         else c++;
     }
     System.out.println(v+ " Vowels");
        System.out.print(c+ " consonent");
        */


        /*           frequency
        char ch[]=s.toCharArray();
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char num:ch)
            map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
     */


        /*  upper to lower vv

      char ch[]=s.toCharArray();
      for(int i=0;i<ch.length;i++){
          if(Character.isLowerCase(ch[i])){
             ch[i]=Character.toUpperCase(ch[i]);
          }
          else if(Character.isUpperCase(ch[i])){
              ch[i]=Character.toLowerCase(ch[i]);
          }
      }
      String res=new String(ch);
      System.out.print(res);
*/


/*
      HashSet<Character> seen=new HashSet<>();
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          if(ch==' '){
              sb.append(ch);
          }
         else if(seen.add(ch)){
              sb.append(ch);
          }
      }
        System.out.print(sb.toString());

*/


    }
}
