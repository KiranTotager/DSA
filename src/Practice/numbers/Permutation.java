package Practice.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void recurePermutation(int[] nums, List<List<Integer>> resPermute,List<Integer> ds,boolean[] freq){
        if(ds.size()==nums.length){
            resPermute.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                ds.add(nums[i]);
                freq[i]=true;
                recurePermutation(nums,resPermute,ds,freq);
                freq[i]=false;
                ds.removeLast();
            }
        }
    }
    public static void main(String[] args){
        int[] nums={3,2,1,4,5,6};
        List<List<Integer>> resPermute=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        recurePermutation(nums,resPermute,ds,freq);
        System.out.println(Arrays.toString(freq));
//        System.out.println(resPermute.size());
        for(List<Integer> res:resPermute){
            System.out.println(res.toString());
        }
    }
}
