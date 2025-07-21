package Practice.numbers;

class Result{
    int a,b;
    Result(int a,int b){
        this.a=a;
        this.b=b;
    }
}
public class SwapNumbers {
    public static Result reverseNumber(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        return new Result(a,b);
    }
    public static void main(String[] args){
        int a=10;
        int b=15;
        Result result=reverseNumber(a,b);
        System.out.println(result.a+" "+result.b);

    }
}
