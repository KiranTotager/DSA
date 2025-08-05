package Practice.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static int binarySearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static int binarySearchUsingRecursion(int[] arr,int key,int low,int high){
        if(low>high)
            return -1;
        int mid=(low+high)/2;
        if(arr[mid]==key)
            return mid;
        else if(arr[mid]>key)
            return binarySearchUsingRecursion(arr,key,low,mid-1);
        else
            return binarySearchUsingRecursion(arr,key,mid+1,high);

    }
    public static void main(String[] args){
        int[] arr= new Random().ints(10,0,20).toArray();
        int key=18;
        System.out.println("the indx of "+key+" in "+ Arrays.toString(arr)+" is: "+binarySearch(arr,key));
        System.out.println("the indx of "+key+" in "+ Arrays.toString(arr)+" is: "+binarySearchUsingRecursion(arr,key,0,arr.length-1));

    }
}
