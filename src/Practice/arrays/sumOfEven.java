package Practice.arrays;
import Practice.numbers.EvenNumbers;

import java.util.Arrays;
import java.util.Random;

public class sumOfEven {
    public static int sumOfEven(int[] arr){
        int res=0;
        for(int a:arr){
            if (EvenNumbers.isEven(a))
                res+=a;
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr=new Random().ints(10,0,100).toArray();
        System.out.println("the sum of "+ Arrays.toString(arr)+" is "+sumOfEven(arr));
    }
}
