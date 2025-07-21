package Practice.numbers;

import java.util.ArrayList;
import java.util.List;

public class IsNumberHappy {
    public static int sumOfSquareDigit(int num){
        int res=0;
        while(num!=0){
            res+=(int)Math.pow((num%10),2);
            num/=10;
        }
        return res;
    }
    public static boolean isNumberHappy(int num){
        List<Integer> tracknum=new ArrayList<>();
        while(true){
            int squredigitSum=sumOfSquareDigit(num);
            if(squredigitSum==1)
                return true;
            else if(tracknum.contains(squredigitSum))
                return false;
            else
            {
                tracknum.add(squredigitSum);
                num=squredigitSum;
            }
        }


    }
    public static void main(String[] args){
        int num=19;
        System.out.println(isNumberHappy(num)?num+" is happy":num+" is not happy");
    }
}
