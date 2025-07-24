package Practice.arrays;

import java.util.Arrays;
import java.util.Random;

public class sumOfArrays {
    public static int sumArray(int[] arr){
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args){
        int [] arr=new Random().ints(5,0,100).toArray();
        System.out.println("the sum of "+ Arrays.toString(arr)+" is :"+sumArray(arr));
    }
}
