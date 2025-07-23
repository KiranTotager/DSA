package Practice.numbers;

public class NeonNumber {
//    defination:a neon number is a number where the sum of digits of square of the number is equal to the number.

    public static boolean isNeoan(int num){
        int sumOfSquareDigit=0;
        int res=(int)Math.pow(num,2);
        while(res!=0){
            sumOfSquareDigit+=res%10;
            res/=10;
        }
        return num==sumOfSquareDigit;
    }
    public static void main(String[] args){
        System.out.println(isNeoan(12)?"it is neon":"it is not neon");
    }
}
