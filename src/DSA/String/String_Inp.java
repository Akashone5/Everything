package DSA.String;
import java.util.*;
public class String_Inp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
       // String s2=sc.nextLine();

      /* char arr[]= s1.toCharArray();
       int l=0;
     while(s1.charAt(l))
     //while
        System.out.print(len);*/


        /*
        char arr[]=s1.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(s1.charAt(i));
        }
        */

    /*    char arr[]=s1.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i%3==0&&i!=0){
                System.out.print(s1.charAt(i));
            }
            else System.out.print(".");
        }*/
/*
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

*/
/*
        char arr[]=s1.toCharArray();
        char c='a';
        for(int i=0;i<arr.length;i++){
            if(s1.charAt(i)==c){
                System.out.print(i);
            }

        } */

/*
        //65--90
        //97--122
        //32--96
        char arr[]=s1.toCharArray();
        for(int i=0;i<arr.length;i++){
            if (s1.charAt(i) == 'A' && s1.charAt(i) == 'Z') {
                System.out.print((char)(s1.charAt(i)+32));

            }
            if (s1.charAt(i) == 'a' && s1.charAt(i) == 'b') {
                System.out.print((char)(s1.charAt(i)-32));

            }
            }*/

/*
      int len= s1.replace(" ","").length();

       System.out.print(len);  */
        /*
int count=1;
        char arr[]=s1.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                count++;
            }
        }
        System.out.print(count);*/
/*
        String s2= sc.next();
        s1.concat(s2);
        System.out.print(s1.concat(s2));*/

    /*    String s2= sc.next();
        System.out.print(s1.compareTo(s2));
*/

        /*
        char arr[]=s1.toCharArray();
for(int i=0;i<arr.length;i++){
    System.out.println((int)arr[i]);
}  */

/*
       System.out.print( s1.isEmpty());*/

        //level 2
        /*
// vowel consonant symbols
    char arr[]=s1.toCharArray();
    int vowel=0;
    int con=0;
    int symbols=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
            vowel++;
        }
        if(arr[i]>=(char)32&&arr[i]<(char)96){
            symbols++;
        }
        else con++;
    }
    System.out.println("Vowel" +" "+vowel);
        System.out.println("Consonant" +" "+con);
        System.out.print("Symbols" +" "+symbols);*/
/*

        char arr[]=s1.toCharArray();
        int count=0;
        int m=(int)'m';
        for(int i=0;i<arr.length;i++){
            if((int)arr[i]>m||(int)arr[i]<m){
                count++;
            }
        }
        System.out.print(count);
        */
/* frequency
        int fre[]=new int[26];
        for(char i: s1.toCharArray())
            fre[i-97]++;
        for(int i=0;i<26;i++){
            if(fre[i]!=0){
                System.out.println((char)(i+97)+"="+fre[i]);
            }
        }
*/
        /*
        char arr[]=s1.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                int st=i;
            }

        }  */

        //longest comment prifix
        //205

     //   char ch[]=s1.toCharArray();


     /*
        String s="";
        for(int i=s1.length()-1;i>=0;i--){
            {
                s=s+s1.charAt(i);
            }
        }
    System.out.print(s);

*/
        char ch[]=s1.toCharArray();
       char ch1[]=new char[s1.length()];
       for(int i=ch.length-1;i>=0;i--){
           System.out.print(ch[i]+"");
       }
    }
    }


