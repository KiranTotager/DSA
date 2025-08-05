package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count=0;
        for(int i=0;i<s.size();i++){
            int sum=s.get(i);

            for(int j=i+1;j<s.size();j++){
                sum+=s.get(j);
                if(sum==d && j-i+1==m){
                    count++;
                }
            }
        }
        return count;
    }

}
public class SubArrayDivision {
    public static void main(String[] args){
        Result result=new Result();
        System.out.println(result.birthday(Arrays.asList(1,2,1,3,2),3,2));
    }
}
