package Practice;

import java.util.Arrays;

public class Strings {
    public static String repeatString(String a){
        String res="";
        for(int i=a.length()-1;i>=0;i--){
            res+=a.charAt(i);
        }
        return res;
    }
    public static String firstUppercase(String a){
        String res="";
        res+=(char)(a.charAt(0)-32);
        for(int i=1;i<a.length();i++){
            res+=a.charAt(i);
        }
        return res;
    }
    public static void main(String args[]){
        String a="india is my country";
        String[] sa=a.split(" ");
        System.out.println(Arrays.toString(sa));
        for(int i=sa.length-1;i>=0;i--){
            System.out.print(sa[i]+" ");
            System.out.print(repeatString(sa[i])+" ");
        }
        for(String s:sa){
            System.out.print(firstUppercase(s));
        }
    }
}
