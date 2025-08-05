package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> factors=new ArrayList<>();
        int count=0;
        for(int i = Collections.max(a); i<=Collections.min(b); i++){
            boolean flag=true;
            for(int elem:a){
                if(i%elem!=0){
                    flag=false;
                    break;
                }
            }
            if(flag)
                factors.add(i);
        }
        for(int i=0;i<factors.size();i++){
            for(int elemb:b){
                if(elemb%factors.get(i)!=0){
                    count++;
                    break;
                }

            }
        }
        return factors.size()-count;
    }
    public static void main(String[] args){
        List<Integer> a= Arrays.asList(2,4);
        List<Integer> b= Arrays.asList(16,32,96);
        getTotalX(a,b);
    }
}
