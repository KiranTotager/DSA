package Practice.numbers;

public class AverageOfPrimeNumbers {
    static void averageOfFirstNPrime(int n){
        int sum=2;
        int k=3;
        int temp=n-1;
        while(temp>0){
                boolean isPrime=true;
                for(int j=2;j<=Math.sqrt(k);j++){
                    if(k%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime
                ){
                    temp--;
                    sum+=k;
//                    System.out.print(k+" ");
                }
                k++;
        }
        System.out.println("the sum is "+sum+"the average of the first "+n+" prime numbers is :"+((float)sum)/n);
    }
    public static void main(String args[]){
        int n=100;
        averageOfFirstNPrime(n);
    }
}
