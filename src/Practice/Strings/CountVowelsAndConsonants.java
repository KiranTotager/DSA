package Practice.Strings;

public class CountVowelsAndConsonants {
    public static void countVowelsAndConsonants(String s){
        s=s.toLowerCase();
        int vowels=0;
        int consonants=0;
        for(char c:s.toCharArray()){
            if("aeiou".indexOf(c)!=-1)
                vowels++;
            else
                consonants++;
        }
        System.out.println("vowels count is "+vowels+" consonants count is "+consonants);
    }
    public static void main(String[] args){
        countVowelsAndConsonants("kiran");
    }
}
