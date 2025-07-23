package Practice.numbers;

public class FactorialNumber {
    public static int factorialNumber(int a){
        if(a==0 || a==1)
            return 1;
        return a*factorialNumber(a-1);
    }
    public static void main(String[] args){
        int a=5;
        System.out.println("factorial of "+a+" is :"+factorialNumber(a));
    }
}
