package Practice.arrays;

import java.util.Arrays;
import java.util.Random;

public class OperationsOnArray {
    public static int[] insert(int index,int val,int[] arr){
        int[] res=new int[arr.length+1];
        for(int i=0,j=0;i<arr.length && j<res.length;i++,j++){
            if(j==index) {
                res[j] = val;
                i--;
            }
            else{
                res[j]=arr[i];
            }
        }
        return res;
    }

    public static int[] delete(int index,int[] arr){
        int[] res=new int[arr.length-1];
            for(int i=0,j=0;i<arr.length && j<res.length;i++,j++){
                int test=arr[i];
                if(i==index){
                    j--;
                }else{
                    res[j]=arr[i];
                }
            }

        return res;
    }

    public static int findMax(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }

    public static int findMin(int[] arr){
        return Arrays.stream(arr).min().getAsInt();
    }

    public static int findSecondMax(int[] arr){
        int max1=arr[0];
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if(arr[i]<max1 && arr[i]>max2){
                max2=arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args){
        int[] arr=new Random().ints(10,-100,100).toArray();
//        int [] arr = {10,-1,-2,-3,-4};
        System.out.println("the origininal array is           "+ Arrays.toString(arr));
        int index=4;
        int val=45;
        int[] res=insert(index,val,arr);
//        System.out.println("the array after inserting "+val+" @ "+index+" is :"+Arrays.toString(res));

        System.out.println("the array after deleting "+index+" value is :"+Arrays.toString(delete(index,arr)));

        System.out.println("the maximum element from the array is :"+findMax(arr));
//        System.out.println("the minimum element from the array is :"+findMin(arr));
        System.out.println("the second max element from the array is :"+findSecondMax(arr));

    }
}
