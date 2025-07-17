package Practice.Strings;

import java.util.Arrays;

public class CountWords {
    public static int countWords(String str){
        return (str.isBlank() || str==null)?0:str.trim().split(" ").length;
    }
    public static void main(String[] args){
        String str=" i am good boy ";
        System.out.println(Arrays.toString(str.trim().split(" ")));
        System.out.println("the number of words in the string is "+countWords(str));

    }
}
