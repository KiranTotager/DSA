package Practice.numbers;

public class fibonacciNumbers {
    public static int fib(int pos){
        if(pos==0) return 0;
        if (pos==1) return 1;
        return fib(pos-1)+fib(pos-2);
    }
    public static void main(String[] args){
        int n=6;
        System.out.println("the fibonacci number for the position "+n+" is "+fib(n));
        for(n=0;n<=20;n++){
            System.out.print(fib(n)+" ");
        }
    }
}
