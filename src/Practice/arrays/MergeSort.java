package Practice.arrays;

import java.util.Arrays;

public class MergeSort {
    public static int[] divide(int[] arr){
        if(arr.length<=1)
            return arr;
        int mid=arr.length/2;
        int[] left=new int[mid];
        int[] right=new int[arr.length-mid];
        for(int i=0;i<mid;i++)
            left[i]=arr[i];
        for(int i=mid;i<arr.length;i++)
            right[i-mid]=arr[i];
        left=divide(left);
        right=divide(right);
        return merge(left,right,arr);
    }
    public static int[] merge(int[] left,int[] right,int[] res){
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                res[k]=left[i];
                i++;
            }else{
                res[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            res[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            res[k]=right[j];
            j++;
            k++;
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={10,7,17,18,8,45,73,63};
        System.out.println(Arrays.toString(divide(arr)));
    }

}
