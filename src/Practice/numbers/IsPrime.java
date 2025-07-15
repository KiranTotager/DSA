package Practice.numbers;

public class IsPrime {
    private static int helperIsPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        return  count;
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(helperIsPrime(n)==2?"the "+n+" is prime":n+" is not prime");

    }
}
