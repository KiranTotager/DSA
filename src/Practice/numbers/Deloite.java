package Practice.numbers;


// problem statement: given integer N return the smallest integer and greater than N which is equal too som of digits is equal to twice  sum of digits of N
public class Deloite {
    public static int sumDigit(int num){
        int res=0;
        while(num!=0){
            res+=(num%10);
            num/=10;
        }
        return res;
    }
    public static int smallestInt(int num){
        int numDoubleRes=sumDigit(num);
        for(int i=num+1;;i++){
            int res=sumDigit(i);
            if(numDoubleRes*2==res){
                return i;
            }
        }

    }
    public static void main(String[] args){
       System.out.println("the result is "+smallestInt(10));
    }

}
