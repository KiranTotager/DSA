package Practice.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MergeArrays {
    public static int[] mergeArrays(int[] arr1,int[] arr2){
        int[] res=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
            }
            else {
                res[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            res[k]=arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){
            res[k]=arr2[j];
            j++;
            k++;
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr1={1,5,7};
        int[] arr2={2,3,6,8,10,12};
//        int[] arr3=Arrays.sort(new Random().ints(5,0,10).toArray());
//        int[] arr4=Arrays.sort(new Random().ints(8,0,10).toArray());
        System.out.println("the array after merging two arrays is "+ Arrays.toString(mergeArrays(arr1,arr2)));
//        System.out.println("the array after merging "+Arrays.toString(arr3)+"\n"+Arrays.toString(arr4)+" arrays is "+ Arrays.toString(mergeArrays(arr1,arr2)));
    }
}
