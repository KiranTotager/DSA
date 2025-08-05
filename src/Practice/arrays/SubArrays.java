package Practice.arrays;

import java.util.Arrays;
import java.util.Random;

public class SubArrays {
    public static void main(String[] args){
        int[] arr=new Random().ints(5,-20,5).toArray();
//        int[] arr={}
        int max=Integer.MIN_VALUE;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
//                    System.out.print(arr[k]+" ");
                }
                max=Math.max(sum,max);
//                System.out.print("sum is "+sum);
//                System.out.println();
            }
        }
        System.out.println("the maximum sum of sub array is"+max);
    }
}
