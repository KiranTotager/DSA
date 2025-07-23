package Practice.numbers;

public class Choclate2 {

    public static int sumDigit(int num) {
        int res = 0;
        while (num != 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }
    public static void main(String[] args){
        int num=9;
        int k=2;
        int startEnd=(int)Math.pow(10,k-1);
        int end=startEnd*10;
        for(int i=startEnd;i<startEnd*10;i++){
            if(sumDigit(i)==num){
                System.out.println(i);
                break;
            }

        }
    }
}
