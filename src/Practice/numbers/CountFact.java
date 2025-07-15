package Practice.numbers;

public class CountFact {
    private static int helperCountFact(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        return  count;
    }
    public static void main(String args[]){
        int n=24;
        System.out.println("the number of factors of "+n+"  are :"+helperCountFact(n));

    }
}
