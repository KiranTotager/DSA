package Practice.numbers;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr=new java.util.Random().ints(10,1,100).toArray();
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
           for(int k=0;k<arr.length-1;k++){
               if(arr[k]>arr[k+1]){
                   int temp=arr[k+1];
                   arr[k+1]=arr[k];
                   arr[k]=temp;
               }
           }
       }
        System.out.println(Arrays.toString(arr));

    }
}
