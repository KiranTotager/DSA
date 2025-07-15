package Practice.numbers;


import java.sql.Time;

public class printPrime {
    private static void printPrimeTillN(int n){
        for(int i=2;i<=10000;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=!isPrime;
                    break;
                }
            }
            System.out.print(isPrime?i+"\n":"");
        }
    }
    public static void main(String args[]){
        int n=10000;
        printPrimeTillN(n);

    }
}
