package Practice.numbers;

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
