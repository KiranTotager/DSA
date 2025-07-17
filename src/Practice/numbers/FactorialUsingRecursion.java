package Practice.numbers;

public class FactorialUsingRecursion {
    public static int factorial(int n){
        return (n==1 || n==0)?1:n*factorial(n-1);
    }
    public static void main(String[] args){
        int n=4;
        System.out.println("the factorial of "+n+" is "+factorial(4));
    }

}
