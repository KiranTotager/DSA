package Practice.arrays;
import Practice.numbers.*;

import java.util.Arrays;
import java.util.Random;

public class AverageOfEven {
    public static float averageOfEven(int[] arr){
        int countEven=0;
        int sumEven=0;
        for(int a:arr){
            if(EvenNumbers.isEven(a)){
                countEven++;
                sumEven+=a;
            }
        }
        return ((float) sumEven/countEven);
    }
    public static void main(String[] args){
        int[] arr=new Random().ints(10,0,100).toArray();
        System.out.println("the average of the even numbers from "+ Arrays.toString(arr)+" is "+averageOfEven(arr));
    }
}
