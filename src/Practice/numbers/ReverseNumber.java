package Practice.numbers;

public class ReverseNumber {
    public static int reverseNumber(int num) {
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            res = (res * 10) + rem;
            num /= 10;
        }
        return res;
    }

    public static void main(String[] args){

        int num=100;
        System.out.println(reverseNumber(num));
    }
}
