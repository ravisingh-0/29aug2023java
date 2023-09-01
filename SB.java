import java.util.*;

public class SB{

    public static void uppercase(String word){
        StringBuilder s = new StringBuilder("");
        char ch = Character.toUpperCase(word.charAt(0));
        s.append(ch);

        for(int i=1; i < word.length(); i++){
            if((word.charAt(i) ==' ') && i<word.length()-1){
                s.append(word.charAt(i));
                i++;
                s.append(Character.toUpperCase(word.charAt(i)));
            }else{
                s.append(word.charAt(i));
            }
        }
        System.out.println(s);
    }

    public static String compression(String str){
        String newstr = "";
        for(int i=0; i<str.length(); i++){
            Integer count =1;
            while((i<str.length()-1) && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1){
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static void compress(String str){
        StringBuilder newstr = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count =1;
            while((i<str.length()-1) && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count>1){
                newstr.append(count.toString());
            }
        }
        System.out.println( newstr);
    }





    public static void main(String args[]){
        String word = "hi, how are? khana kha ke jana theek!";
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a'; ch<='z';ch++){

        //     sb.append(ch);
        // }

        // System.out.println(sb);
        // uppercase(word);
        String str="aaabbcc";
        // System.out.println(compression(str));
        compress(str);
    }
}