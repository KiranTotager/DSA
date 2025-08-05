package Practice.arrays;

import java.util.Arrays;
import java.util.Random;

public class IsSorted {
    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++)
            if(arr[i]>arr[i+1])
                return false;
        return true;
    }
    public static void main(String[] args){
        int[] arr=new Random().ints(10,1,100).toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(isSorted(arr)?"array is sorted":"array is not sorted");
    }
}
