package Practice.numbers;

public class CountDigit {
    public static int countDigit(int num){
        int digit=0;

        while(num!=0){
            num=num/10;
            digit++;
        }
        return digit;
    }
    public static void main(String[] args){
        int num=1010;
        System.out.println("the number of digits in "+num+" is :"+countDigit(num));
    }
}
