package Practice.arrays;

import java.util.Arrays;
import java.util.Random;

public class rotateArray {
    public static void anticlockwiseRotation(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

    }
    public static void clockWiseRotation(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public static void main(String[] args){
        int n=6;
        int[] arr=new Random().ints(10,0,20).toArray();
        System.out.println("original array :"+ Arrays.toString(arr));
//        for(int i=0;i<n;i++)
//            anticlockwiseRotation(arr);
//        System.out.println("rotated array :"+ Arrays.toString(arr));
        clockWiseRotation(arr);
        System.out.println("rotated array :"+ Arrays.toString(arr));

    }

}
