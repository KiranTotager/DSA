package Practice.arrays;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    public static int linearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
//        return Arrays.stream(arr).for

    }
    public static void main(String[] args){
        int[] arr=new Random().ints(10,0,20).toArray();
        int key=18;
        System.out.println("the index of "+key+" in "+ Arrays.toString(arr)+" is "+linearSearch(arr,key));
    }

}
