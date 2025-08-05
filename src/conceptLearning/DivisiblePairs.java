package conceptLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DivisiblePairs {
    public static int divisiblePairsHelper(int i, int j, int k, List<Integer> ar){
        if(i>=ar.size()-2)
            return 0;
        if(j>=ar.size())
            return divisiblePairsHelper(i+1,i+2,k,ar);
        int count=0;
        if((ar.get(i)+ar.get(j))%k==0) {
            count = 1;
        }
        return count+divisiblePairsHelper(i,j+1,k,ar);
    }
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        HashMap<Integer,Integer> frequencyCount=new HashMap<>();
        for(int ar:arr){
            frequencyCount.put(ar,frequencyCount.getOrDefault(ar, 0)+1);
        }
        List<Integer> keys=new ArrayList<>(frequencyCount.keySet());
        int maxFrequency=keys.get(0);
        for(int i=1;i<keys.size();i++){
            if(frequencyCount.get(maxFrequency)==frequencyCount.get(keys.get(i))){
                maxFrequency=Math.min(maxFrequency, keys.get(i));
            }else if(frequencyCount.get(maxFrequency)<frequencyCount.get(keys.get(i))){
                maxFrequency=keys.get(i);
            }
        }
        return maxFrequency;
    }

    public static void main(String[] args){
        System.out.println(divisiblePairsHelper(0,1,3, Arrays.asList(1, 3, 2, 6, 1, 2)));
        System.out.println(migratoryBirds(Arrays.asList(1,4,4,4,5,3)));
    }
}
