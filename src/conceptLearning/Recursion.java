package conceptLearning;

public class Recursion {
    public static int countDigit(int num,int count){
        if(num==0)
            return count;
        return countDigit(num/10,++count);
    }

}
