package Practice.numbers;

public class PerfectTill1000 {
    public static boolean isPerfectNumber(int n){
        int factSum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                factSum+=i;
        }
        return factSum==n;
    }
    public static void main(String args[]){
        int n=10000;
       for(int i=1;i<=10000;i++){
           System.out.print(isPerfectNumber(i)?i+" is perfect number \n":"");
       }
    }
}
