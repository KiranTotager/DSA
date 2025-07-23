package Practice.numbers;

import java.util.ArrayList;
import java.util.List;


//defination:
//A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
//
//Examples :
//
//Input: n = 19
//Output: True
//19 is Happy Number,
//        1^2 + 9^2 = 82
//        8^2 + 2^2 = 68
//        6^2 + 8^2 = 100
//        1^2 + 0^2 + 0^2 = 1
//As we reached to 1, 19 is a Happy Number.


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
